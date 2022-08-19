import java.security.SecureRandom;

//for generating passwords
public class pw {
    public static void main(String[] args){
        final int wordListLength = 7776; //only 7776 words in the list

        //intialize an array of appropriate length
        int[] array = new int[wordListLength];

        //TODO load the simple EFFL word list into an array

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