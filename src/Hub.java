public class Hub {


    public static void main(String[] args){
        pw p = new pw();
        //TODO access pw by class ref instead of instance ref?
        String[] wordArray = p.loadArray();
        int[] randArray = p.randNums(1);
    }

}