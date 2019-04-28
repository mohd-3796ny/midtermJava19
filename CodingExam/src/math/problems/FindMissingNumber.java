package math.problems;


    public class FindMissingNumber {

    public static void main(String[] args) {

        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        int missingNum = pickMissingNum(array,9);
        System.out.println("The Missing Number is: "+missingNum);
    }

        public static int pickMissingNum( int a[] ,int n )
    {
        int total;
        total  = (n+1)*(n+2)/2;
        for ( int i = 0; i< n; i++)
            total = total-a[i];
        return total;
    }

}




