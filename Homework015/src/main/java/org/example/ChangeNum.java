package org.example;

//import java.util.Random;
//
//public class ChangeNum {
//    public static int [] bigMass(int size,int min,int max) {
//        int[] array = new int[size];
//        Random random = new Random();
//        for (int i = 0; i < array.length ; i++) {
//            array[i] = random.nextInt(min,max + 1);
//        }
//        return array;
//    }
//    public static void showArray(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static int[] findMass(int[] array){
//        for (int i = 0; i < array.length; i +=2) {
//            array[i]=0;
//        }
//        return array;
//    }
//}

//================================================================
import java.util.Random;

public class ChangeNum {
    public static int [] bigMass(int size,int min,int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(min,max + 1);
        }
        return array;
    }
    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void increasMass(int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i]<=array[i-1]) {
                System.out.println("Массив не возрастающий");
                return;
            }
        }
        System.out.println("Массив возрастающий");
    }

}



