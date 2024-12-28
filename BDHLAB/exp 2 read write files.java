package exp2;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class bdh2 {

	public static void main(String[] args) throws IOException {
		String path = args[0];
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(URI.create(path), conf);
		// to create a directory on HDFS
		fs.mkdirs(new Path(path));
		// copy a file from localFilesystem to HDFS
		String hdfs = args[1];
		fs.copyFromLocalFile(new Path(path), new Path(hdfs));
		//Applying cat command to display the content of a file
		InputStream in = null;
		try
		{
			in = fs.open(new Path(path));
			IOUtils.copyBytes(in, System.out, 4096, false);
		}
		finally
		{
			IOUtils.closeStream(in);
		}
		
	}

}
/*commands:
cd workspace/
hadoop jar jar_name.jar class_name /directory_name
or
hadoop jar jar_name.jar package_name.class_name /directory_name
hdfs dfs -ls /
ls
nano text_file_name.txt (enter some text)
ls
cat text_file_name.txt
hadoop jar jar_name.jar class_name text_file_name.txt /directory_name
hdfs dfs -ls /directory_name
hadoop jar jar_name.jar class_name /directory_name/text_file_name.txt 
 */
