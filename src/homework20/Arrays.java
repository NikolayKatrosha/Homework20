package homework20;

import java.util.Random;

public class Arrays {

    public static void main(String[] args) {



        //Два изначальных массива
        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];
        System.out.println("Array1: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 99);
                array2[i][j] = (int) (Math.random() * 99);
            }

        }
        for (int i = 0; i < array1.length; i++, System.out.println()) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("Array2: ");
        for (int i = 0; i < array2.length; i++, System.out.println()) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
        }

        //Сложение массивов
        int[][] addArrays = new int[3][3];
        for (int i = 0; i < addArrays.length; i++) {
            for (int j = 0; j < addArrays[i].length; j++) {
                addArrays[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println();
        System.out.println("Addition: ");
        for (int i = 0; i < addArrays.length; i++, System.out.println()) {
            for (int j = 0; j < addArrays[i].length; j++) {

                System.out.print(addArrays[i][j] + " ");
            }
        }


// Умножение массивов
        int[][] multiplyArray = new int[3][3];
        for (int i = 0; i < multiplyArray.length; i++) {
            for (int j = 0; j < multiplyArray[i].length; j++) {
                multiplyArray[i][j] = array1[i][j] * array2[i][j];
            }
        }
        System.out.println();
        System.out.println("Multiply: ");
        for (int i = 0; i < multiplyArray.length; i++, System.out.println()) {
            for (int j = 0; j < multiplyArray[i].length; j++) {

                System.out.print(multiplyArray[i][j] + " ");
            }
        }
    }



        public static int[][] randomArray () {
            int[][] array = new int[3][3];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 99);

                }
            }/*
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/
            return array;
        }
        public static int[][] multiply () {
            int[][] arrays = new int[3][3];
            for (int i = 0; i < arrays.length; i++) {
                for (int j = 0; j < arrays[i].length; j++) {
                    arrays[i][j] = randomArray()[i][j] * randomArray()[i][j];
                }
            }
            for (int i = 0; i < arrays.length; i++) {
                for (int j = 0; j < arrays[i].length; j++) {
                    System.out.print(arrays[i][j] + " ");

                }
                System.out.println();
            }
            return arrays;
        }
    }


