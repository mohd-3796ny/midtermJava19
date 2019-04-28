package algorithm;

import math.problems.*;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class UnitTestSorting {


    public static class UnitTestingMath {
        public static void main( String[] args ){
            //Apply Unit testing into each classes and methods in this package.

            //unit testing for FindLowestDifference
            try {
                int[][] array1 = new int[][]{{6 ,9 ,2 ,5 ,1 ,0 ,4}};
                int[] array2 = {0 ,1 ,2 ,4 ,5 ,6 ,9};
                Assert.assertEquals ( FindLowestDifference.findSmallestDifference ( array1 ,array2 ,3 ,3 ) ,2 );
                System.out.println ( "Unit testing passed for FindLowestDifference" );
            } catch (AssertionError as) {
                System.out.println ( "Unit testing failed for FindLowestDifference" );
            }

            //Factorial math problem's Unit Testing
            try {
                Assert.assertEquals ( Factorial.factRecursion ( 5 ) ,120 );
                System.out.println ( "Unit testing passed for factorial" );
            } catch (AssertionError ar) {
                System.out.println ( "Unit testing failed for factorial" );
            }

            // unit testing for lowest number
            try {
                int array[] = new int[]{5 ,679 ,54 ,32 ,65};
                Assert.assertEquals ( LowestNumber.lowest ( array ) ,5 );
                System.out.println ( "Unit testing passed for LowestNumber" );
            } catch (AssertionError as) {
                System.out.println ( "Unit testing failed for LowestNumber" );
            }

            try {//Unit testing for missing number
                int[] array = new int[]{1 ,2 ,4 ,5};
                int n = 4;
                Assert.assertEquals ( FindMissingNumber.pickMissingNum ( array ,n ) ,3 );
                System.out.println ( "Unit testing passed for FindMissingNumber" );
            } catch (AssertionError as) {
                System.out.println ( "Unit testing failed for FindMissingNumber" );
            }

            //Unit testing for pattern
            try {
                int n = 3;
                ArrayList<Integer> expectedArray = new ArrayList<> ( Arrays.asList ( 10 ,9 ,8 ) );
                Assert.assertEquals ( Pattern.findPattern ( n ) ,expectedArray );
                System.out.println ( "Unit testing passed for Pattern" );
            } catch (AssertionError as) {
                System.out.println ( "Unit testing failed for Pattern" );
            }

        }
    }

}