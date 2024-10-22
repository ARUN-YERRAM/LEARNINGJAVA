import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

public class exp3 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: exp3 <HDFS file path>");
            System.exit(1);
        }
        String Path = args[0];
        Configuration conf = new Configuration();
        
        // Setting up the HDFS path and creating FileSystem object
        FileSystem fs = FileSystem.get(URI.create(Path),conf);
        Path filePath = new Path(hdfsFilePath);

        // Check if the file exists
        if (!fs.exists(filePath)) {
            System.out.println("File does not exist: " + hdfsFilePath);
            System.exit(1);
        }

        // Reading the file from HDFS
        BufferedReader br = new BufferedReader(new InputStreamReader(fs.open(filePath)));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fs.close();
    }
}


// cd workspace 
// hadoop jar JARFILRNAME CLASSNAME SRCPATH DESPATH
co