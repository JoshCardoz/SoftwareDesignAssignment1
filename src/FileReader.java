import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    static ArrayList<String> dataArr = new ArrayList<>();

    public static Double readFile(String fruit) {
        try {
            String filePath = "src/prices.txt";

            File file = new File(filePath);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                dataArr.add(data);
            }

            reader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Could not read file");
        }

        for (String line : dataArr) {
            String[] parts = line.split(":");

            String key = parts[0].trim();
            Double value = Double.parseDouble(parts[1].trim());

            if (key.equals(fruit)){
                return value;
            }
        }


        return 0.0;
    }

}
