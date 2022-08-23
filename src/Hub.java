package src;

public class Hub {


    public static void main(String[] args){
        String[] wordArray = pw.loadArray();
        int[] randArray = pw.randNums(1);
        System.out.println(randArray[0]);
        System.out.println(wordArray[randArray[0]]);
    }

}