package start;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Vitalii on 12.05.2017.
 */
public class CSVParser {

    private String csvFile;
    private BufferedReader br = null;
    private String line = "";
    private String cvsSplitBy = ",";

    public void setCsvFile(String csvFile){
        this.csvFile = csvFile;
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
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

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
