package exp5;


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

class SalaryMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable>{
	private Text department = new Text();
	private IntWritable salary = new IntWritable();
	@Override
	public void map(LongWritable key, Text value,
			OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		String line= value.toString();
		StringTokenizer token = new StringTokenizer(line);
		if(token.countTokens() == 3){
			token.nextToken();
			String dept = token.nextToken();
			int sal = Integer.parseInt(token.nextToken());
			department.set(dept);
			salary.set(sal);
			output.collect(department, salary);
		}
		
	}
}
class SalaryReducer extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable>{

	@Override
	public void reduce(Text key, Iterator<IntWritable> values,
			OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		int sum = 0;
		while(values.hasNext())
		{
			sum += values.next().get();
		}
		output.collect(key, new IntWritable(sum));
		// TODO Auto-generated method stub
		
	}
	
}

public class bdh {

		public static void main(String[] args) throws IOException {
			JobConf conf = new JobConf(bdh.class);
			conf.setJobName("Sum of salaries by department");
			
			conf.setOutputKeyClass(Text.class);
			conf.setOutputValueClass(IntWritable.class);
			
			conf.setInputFormat(TextInputFormat.class);
			conf.setOutputFormat(TextOutputFormat.class);
			
			conf.setMapperClass(SalaryMapper.class);
			conf.setReducerClass(SalaryReducer.class);
			
			FileInputFormat.setInputPaths(conf, new Path(args[0]));
			FileOutputFormat.setOutputPath(conf, new Path(args[1]));
			
			JobClient.runJob(conf);	
		}

	}


/*commands:
cd workspace/
nano text_file_name.txt (enter some text)
ls
hdfs dfs -ls /
hdfs dfs -copyFromLocal /home/cloudera/text_file_name.txt /input_directory_name
hdfs dfs -ls /input_directory_name
hadoop jar jar_name.jar package_name.class_name /input_directory_name/text_file_name.txt /output_directory_name
hdfs dfs -cat /output_directory_name/part-00000
 */


