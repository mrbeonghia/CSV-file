import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvReader {
    private static final String COMMA = ",";

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:/IntelliJ/CSV_file/contries.csv"));

            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                printContry(parseCsvLine(line));
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<String>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static void printContry(List<String> country) {
        System.out.println(
                "Country [id = "
                        + country.get(0)
                        + ", code = " + country.get(1)
                        + " , name = " + country.get(2)
                        + "]");
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
