import java.io.*;
import java.security.SecureRandom;

//for generating passwords
public class pw {
    public static String[] loadArray() {
//        System.out.println(new File(".").getAbsolutePath());

        final int wordListLength = (7776); //only 7776 words in the list
        //want to start list with 1 for random number generation

        //initialize an array of appropriate length
        String[] array = new String[wordListLength];

        try {//read in the long word list
            FileReader file = new FileReader("SimplestEFFLongWordList.txt");
            BufferedReader reader = new BufferedReader(file);

            //load the words into an array
            for(int i = 0; i < wordListLength; i++){
                try {
                    array[i] = reader.readLine();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Array is currently: " + array.length + " in length");
        System.out.println("1st entry should be abacus, is: " + array[0]);
        System.out.println("last entry should be zoom, is: " + array[7775]);

        return array;
    }

    public static int[] randNums (int input) {
        int[] array = new int[input];

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