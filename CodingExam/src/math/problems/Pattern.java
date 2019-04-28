package math.problems;

import java.util.ArrayList;

public class Pattern {

    public static void main(String[] args){
        int n = 100;
        System.out.println(findPattern(n));
    }

    public static ArrayList findPattern( int n) {
        int count = 1;
        int j = 0;

        ArrayList<Integer> b = new ArrayList<>();

        int[] array1 = new int[40];

        while (n > 0) {
            for (int i = 0; i < 10; i++) {
                b.add(n);
                array1[j] = n;
                n -= count;
                j++;
            }
            count++;
        }
        return b;
    }
}


