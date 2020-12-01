import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvReader {
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:/IntelliJ/CSV_file/contries.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] country = line.split(splitBy);    // use comma as separator
                System.out.println("Country [id = " + country[0] + ", code = " + country[1] + ", name = " + country[2] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//parsing a CSV file into Scanner class constructor
//        Scanner sc = new Scanner(new File("D:/IntelliJ/CSV_file/contries.csv"));
//        sc.useDelimiter(",");   //sets the delimiter pattern
//        while (sc.hasNext())  //returns a boolean value
//        {
//            System.out.print(sc.next());  //find and returns the next complete token from this scanner
//        }
//        sc.close();  //closes the scanner
//    }
}
