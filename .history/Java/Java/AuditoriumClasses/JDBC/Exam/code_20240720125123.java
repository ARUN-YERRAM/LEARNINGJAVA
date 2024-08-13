package Java.Java.AuditoriumClasses.JDBC.Exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.util.Comparator;

public class code {
    private static final int id,releaseYear;
    private static final String username;
    private static final String password;
    private static final String csvFilePath;
    public static void main(String [] args){

        File f = new File("movies.csv");
        FileReader fr = new FIleReader(f);

        BufferedReader br = new BufferedReader(fr);
        // String s = 
        MovieService obj = new MovieService();
        obj.sort_based_on_releaseYear();
        System.out.println();

        FileOutputStream fos = new FileOutputStream(new File("sorted_movies_ratingwise.bin"));
		ObjectOutputStream os = new ObjectOutputStream(fos);


        // Employe e1 = new Employee(101, "Fred", "Water");
		// Employee e2 = new Employee(102, "Alice", "Accounts");
		// FileOutputStream fos = new FileOutputStream(new File("Emp.bin"));
		// ObjectOutputStream os = new ObjectOutputStream(fos);
        // while(){
        ArrayList <Integer> arr = new ArrayList<>();

        // }



    }
}

// read data from csv file
// Parse data to create movie objects
// sort the objects based on release year using comparator
// Serialize the sorted movie objects to a binary fi le
// Repeat sort abd serialize by rating using another custom comparator......


class sort_based_on_releaseYear implements Comparator<Integer>{
    @Override
    public int compare(Integer I1,Integer I2){
        if()
    }
}





class MovieService{
    public processMovieData(){

    }
}