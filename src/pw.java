import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Scanner;

//for generating passwords
public class pw {

    public void rewriteEFFLL(){

        File file = new File("EFFLongWordList.txt");
        String path = file.getPath();

        try {
            File myObj = new File ("EFFLongWordListSimplest.txt");
            if (myObj.createNewFile()){
                System.out.println("File successfully created: " + myObj.getName());
            } else {
                System.out.println("File already exists?!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: ");
            e.printStackTrace();
        }

        try {
            int[] array = new int[7776]; //for holding all long words
            int parityMarker = 0;
            Scanner sc = new Scanner(file);
            System.out.println("Scanner is using delimiter: " + sc.delimiter());

            try {
                FileWriter fw = new FileWriter(file);

                while(sc.hasNext()){
                    parityMarker++;
                    if (parityMarker % 2 == 0){
                        fw.append(sc.next());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public int[] randNums (int input) {
        int[] array = new int[0];

        SecureRandom random = new SecureRandom();

        if (input > 0){
            //TODO: use random to generate random numbers
            //then use java file IO to get random entries from EFF long word list
        } else {
            array[0] = -1;
        }
        return array;

    }

}