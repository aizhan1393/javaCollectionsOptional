import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class OptionalTask {

    public static void main(String args[]) {

        //1 task
        File inputFile = new File("C:\\Users\\77751\\Documents\\epam\\stage-1\\ifIWereABoy.txt");
        File outputFile = new File("C:\\Users\\77751\\Documents\\epam\\stage-1\\ifIWereABoy-output.txt");
        try {
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            ArrayList<String> list = new ArrayList<String>();

            String line = reader.readLine();
            while(line != null){
                list.add(line);
                line = reader.readLine();
            }
            inputStream.close();

            for(int i = list.size() - 1; i >= 0; i--){
                outputStream.write(list.get(i).getBytes());
            }
            outputStream.close();


            //6 task

            Collections.sort(list);

            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
