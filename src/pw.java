import java.security.SecureRandom;

//for generating passwords
public class pw {

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