import java.io.IOException;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;

class WCMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> {
	static IntWritable One = new IntWritable(1);
	Text word = new Text();
	
	@Override
	public void map(LongWritable key, Text value,
			OutputCollector<Text, IntWritable> arg2, Reporter arg3)
			throws IOException {
		String line = value.toString();
		StringTokenizer token = new StringTokenizer(line);
		while(token.hasMoreTokens())
		{
			word.set(token.nextToken());
			arg2.collect(word, One);
		}
	}
}

class WCReducer extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable>{
	
	@Override
	public void reduce(Text key, Iterator<IntWritable> value,
			OutputCollector<Text, IntWritable> collect, Reporter arg3)
			throws IOException {
		int sum=0;
		while(value.hasNext())
		{
			sum=sum+value.next().get();
		}
		collect.collect(key, new IntWritable(sum));
	}
	
}

public class jeevan {
	
	public static void main(String[] args) throws IOException {
		JobConf conf = new JobConf(jeevan.class);
		
		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(IntWritable.class);
		
		conf.setInputFormat(TextInputFormat.class);
		conf.setOutputFormat(TextOutputFormat.class);
		
		conf.setMapperClass(WCMapper.class);
		conf.setReducerClass(WCReducer.class);
		
		FileInputFormat.setInputPaths(conf, new Path(args[0]));
		FileOutputFormat.setOutputPath(conf, new Path(args[1]));
		
		JobClient.runJob(conf);	
	}
}


/* commands:
nano text_file_name.txt (enter some text)
cat text_file_name.txt
hdfs dfs -mkdir /directory_name
hdfs dfs -put text_file_name.txt /directory_name
hdfs dfs -ls /directory_name
cd workspace/
hadoop jar jar_file_name.jar package_name.class_name /input_directory_name/input_file_name /output_directory_name
or
hadoop jar jar_file_name.jar class_name /input_directory_name/input_file_name /output_directory_name
hdfs dfs -ls /output_directory_name
hdfs dfs -cat /output_directory_name/part-00000
*/	