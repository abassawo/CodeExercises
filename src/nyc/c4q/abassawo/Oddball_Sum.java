package nyc.c4q.abassawo;

import java.util.ArrayList;

/**
 * Created by c4q-Abass on 7/31/15.
 */
public class Oddball_Sum {
    private static int sum = 0;

    public static void main(String[] args) {
        int[] set = {2};
        sum = sumOdds(getOdds(set));
        System.out.println("sum of sums = " + sum);
    }

    public static ArrayList getOdds(int[] set){
        ArrayList<Integer> newSet = new ArrayList<Integer>();
        for(int x : set){
            if (x % 2 != 0 ){
                newSet.add(x);
            }
        }
        return newSet;
    }

    public static int sumOdds(ArrayList<Integer> odds){
        int oddsum = 0;
        if(odds.isEmpty()){
            return -1;
        } else {
            for (int i = 0; i < odds.size(); i++) {
                oddsum += odds.get(i);
            }
        }
        return oddsum;
    }
}
