package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.OptionalLong;
import java.util.Random;

public class Numbers<Display,MongoDB,conclusion,execution> {
    private static int[] num;
    private static int[] num1;
    private static Object List;


//          Show all the different kind of sorting algorithm by applying into (num array).* Display the execution time for each sorting.Example in below.
//          SOAPBinding.Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
//          At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.*
//

    public static void main( String[] args ) throws Exception{

        //To minimize the CPU processing time we took an integer array of 10 indices
        num = new int[10];
        storeRandomNumbers ( num );
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB ("/Users/mohdfaruque/Desktop/MidtermJava19/CodingExam/src/algorithm/Numbers.java" );
        Sort algo;
        algo = new Sort ( );


       int[] num;
        num= new int[]{'n'};

        //Selection Sor

        long selectionSortExecutionTime = algo.executionTime;

        System.out.println ( "Total Execution Time of "+num+" numbers in Selection Sort take: "+selectionSortExecutionTime+" milli sec" );
        connectToSqlDB.insertDataFromArrayToSqlTable ( num ,"selection_sort" ,"SortingNumbers" );
        List<String> numbers1 = connectToSqlDB.readDataBase ( "selection_sort" ,"SortingNumbers" );
        printValue ( numbers1 );

        int n = 0
                ;
        randomize ( num ,n );

        //Insertion Sort

        long insertionSortExecutionTime = algo.executionTime;
        System.out.println ( "Total Execution Time of "+num+" numbers in Insertion Sort take: "+insertionSortExecutionTime+" milli sec" );
        connectToSqlDB.insertDataFromArrayToSqlTable ( num ,"insertion_sort" ,"SortingNumbers" );
        List<String> numbers2 = connectToSqlDB.readDataBase ( "insertion_sort" ,"SortingNumbers" );
        printValue ( numbers2 );
        randomize ( num ,n );

        //Bubble Sort

        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println ( "Total Execution Time of "+num+" numbers in Bubble Sort take: "+bubbleSortExecutionTime+" milli sec" );
        connectToSqlDB.insertDataFromArrayToSqlTable ( num ,"bubble_sort" ,"SortingNumbers" );
        List<String> numbers3 = connectToSqlDB.readDataBase ( "bubble_sort" ,"SortingNumbers" );
        printValue ( numbers3 );
        randomize ( num ,n );

        long bucketSortExecutionTime = algo.executionTime;
        System.out.println ( "Total Execution Time of "+num+" numbers in Bucket Sort take: "+bucketSortExecutionTime+" milli sec" );
        connectToSqlDB.insertDataFromArrayToSqlTable ( num ,"bucket_sort" ,"SortingNumbers" );
        List<String> numbers4 = connectToSqlDB.readDataBase ( "bucket_sort" ,"SortingNumbers" );
        printValue ( numbers4 );
        randomize ( num ,n );

        //Heap Sort

        long heapSortExecutionTime = algo.executionTime;
        System.out.println ( "Total Execution Time of "+num+" numbers in Heap Sort take: "+heapSortExecutionTime+" milli sec" );
        connectToSqlDB.insertDataFromArrayToSqlTable ( num ,"heap_sort" ,"SortingNumbers" );
        List<String> numbers5 = connectToSqlDB.readDataBase ( "heap_sort" ,"SortingNumbers" );
        printValue ( numbers5 );
        randomize ( num ,n );

        //Merge Sort

        long mergeSortExecutionTime = algo.executionTime;
        System.out.println ( "Total Execution Time of "+num+" numbers in Merge Sort take: "+mergeSortExecutionTime+" milli sec" );
        connectToSqlDB.insertDataFromArrayToSqlTable ( num ,"merge_sort" ,"SortingNumbers" );
        List<String> numbers6 = connectToSqlDB.readDataBase ( "merge_sort" ,"SortingNumbers" );
        printValue ( numbers6 );
        randomize ( num ,n );

        //Quick Sort;
        long quickSortExecutionTime = algo.executionTime;
        num1 = num;
        System.out.println ( "Total Execution Time of "+num1+" numbers in Quick Sort take: "+quickSortExecutionTime+" milli sec" );
        connectToSqlDB.insertDataFromArrayToSqlTable ( num ,"quick_sort" ,"SortingNumbers" );
        List<String> numbers7 = connectToSqlDB.readDataBase ( "quick_sort" ,"SortingNumbers" );
        printValue ( numbers7 );
        randomize ( num ,n );

        //Shell Sort
        randomize(num ,n);
        Sort shellSortExecutionTime;

       OptionalLong.of ( shellSortExecutionTime  = null,
        System.out.println ( "Total Execution Time of "+num+" numbers in Shell Sort take: "+shellSortExecutionTime+" milli sec" );
        connectToSqlDB.insertDataFromArrayToSqlTable ( num ,"shell_sort" ,"SortingNumbers" );
        List<String> numbers8 = connectToSqlDB.readDataBase ( "shell_sort" ,"SortingNumbers" );
        printValue ( numbers8 );


        //By following above, Continue for rest of the Sorting Algorithm....


        //Come to conclusion about which Sorting Algo is better in given data set.
        System.out.println ( "For given data set Selection Sort is the worst, Quick Sort is better" );

    }

    private static void ShellSort(){
    }

    private static void printValue( List<String> numbers7 ){

    }

    public static void storeRandomNumbers( int[] num ){
        Random rand = new Random ( );
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt ( 1000000 );
        }
    }

    public static void randomize( int[] arr ,int n ){
        Random r = new Random ( );
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n-1; i > 0; i--) {
            int j = r.nextInt ( i );

        }

        int st = 0;
        for (int st: arr ){
                System.out.println ( st );
            }
        }

        private static class Sort {
            public long executionTime;

            public void shellSort(){

            }

            public void quickSort( int num ,int i ,int i1 ){

            }

            public void mergeSort( int num ,int i ,int i1 ){


            }

            public void heapSort( int num ){


            }

            public void shellSort( int num ){

            }

            public int bucketSort( int num ,int max_value ){


                return num;
            }

            public void max_value( int num ){


            }
        }

}






