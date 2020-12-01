import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvWriter {
    // Các dấu phân cách
    private static final String COMMA = ",";
    private static final String NEW_LINE = "\n";

    public static void main(String[] args) {

        String fileName = "D:/IntelliJ/CSV_file/contries.csv";
        writeCsvFile(fileName);
    }

        public static void writeCsvFile(String fileName){
        Country country1 = new Country(1,"AU","Australia");
        Country country2 = new Country(2,"US","United States");
        Country country3 = new Country(3,"VN","Vietnam");
        Country country4 = new Country(4,"JP","Japan");

        List<Country> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            for(Country country : countries){
                fileWriter.append(String.valueOf(country.getId()));
                fileWriter.append(COMMA);
                fileWriter.append(country.getCode());
                fileWriter.append(COMMA);
                fileWriter.append(country.getName());
                fileWriter.append(NEW_LINE);
            }
            System.out.println("Csv file was created successfully !!!");
        }
        catch (Exception e){
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }

}
