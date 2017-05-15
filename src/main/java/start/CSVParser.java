package start;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Vitalii on 12.05.2017.
 */
public class CSVParser {

    private String csvFile;
    private BufferedReader br = null;
    private String line = "";
    private String cvsSplitBy = ",";
    private String[] massCSV;

    public void setCsvFile(String csvFile){
        this.csvFile = csvFile;
    }

    @Override
    public String toString() {
        return "CSVParser{" +
                "massCSV=" + Arrays.toString(massCSV) +
                '}';
    }

    public String[] getMassCSV() {
        return massCSV;
    }

    public BufferedReader getBr() {
        return br;
    }

    public boolean OnSave(){
        return true;
    }

    public void Parse(){

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                massCSV = line.split(cvsSplitBy);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
