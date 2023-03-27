import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums = new int[10];
        ArrayList<Integer> listOfNums = new ArrayList<>();
        System.out.println(listOfNums);
        System.out.println(listOfNums.size());
        listOfNums.add(45);
        listOfNums.add(37);
        listOfNums.add(842);
        System.out.println(listOfNums);
        System.out.println(listOfNums.size());
        listOfNums.remove(1);       //must be a legal value
        System.out.println(listOfNums);
        System.out.println(listOfNums.get(0));
        for(int i = 0; i<27; i++){
            listOfNums.add((int)(Math.random()*12-5));
        } System.out.println(listOfNums);
        System.out.println(listOfNums.set(5,72));
        System.out.println(listOfNums);
        Collections.sort(listOfNums);
        System.out.println(listOfNums);
        for(Integer item:listOfNums){
            System.out.println(item);
        }

        System.out.println("Practice begins");
        ArrayList<String> sam;
        sam = new ArrayList<String>();
        sam.add("ben");
        sam.add(0, "wil");
        sam.set(1,"cat");
        sam.add(1,"dog");
        sam.add("pig");
        System.out.println(sam.set(1,"up"));
        sam.remove(1);
        sam.add("one");
        sam.add(0,"five");
        sam.remove(1);
        System.out.println("new");
        sam.add(0,"chair");
        for(int i = 0; i < sam.size(); i++)
            System.out.print(sam.get(i) + " ");
        sam.remove(sam.size()-1);
        System.out.println(sam);
        for(int i = 0; i<4; i+=2)
            sam.add(i, "fun");
        System.out.println(sam);

        System.out.println("TEST BEGINS");
        ArrayList<Integer> rayList;
        public int numCount(ArrayList<Integer> rayList, int num){
            num = 0;
            if (rayList.contains(num)){
                num =
            }

        }

    }
}