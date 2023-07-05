package ru.netology.stats;

public class StatsService {

    public static long calculateSum(int[] array){
        long result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
            //if(array[i] > array[result]) {result = i;}
        }

        return result;
    }

    public static long calculateAverage(int[] array){
        return calculateSum(array) / array.length;
    }

    public static int getIndexMaxSales(int[] array){
        int result = array.length - 1;

        for (int i = array.length - 2; i > -1 ; i--) {
            if (array[i] > array[result]){
                result = i;
            }

        }

        return result;
    }

    public static int getIndexMinSales(int[] array){
        int result = array.length - 1;

        for (int i = array.length - 2; i > -1 ; i--) {
            if (array[i] < array[result]){
                result = i;
            }

        }

        return result;
    }

    public static int indexBelowAverage(int[] array){
        int result = 0;
        long averageAmountSales = calculateSum(array) / array.length;

        for (int i = 0; i < array.length; i++) {
            if (averageAmountSales > array[i]){
                result++;
            }
        }

        return result;
    }

    public static int indexHigherAverage(int[] array){
        int result = 0;
        long averageAmountSales = calculateSum(array) / array.length;

        for (int i = 0; i < array.length; i++) {
            if (averageAmountSales < array[i]){
                result++;
            }
        }

        return result;
    }


//
//    public static int indexAverage(int[] array, boolean isMax){
//        int result = 0;
//        long averageAmountSales = calculateSum(array) / array.length;
//
//        for (int i = 0; i < array.length; i++) {
//            if (isMax) {
//                if (averageAmountSales < array[i]) {
//                    result++;
//                }
//            }
//            else {
//                if (averageAmountSales > array[i]){
//                    result++;
//                }
//            }
//        }
//
//        return result;
//    }
}
