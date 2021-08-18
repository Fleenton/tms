package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class LessonThreeDop {
    public static void main(String[] args) {
        //Task 1
        int [] array = new int[20];
        int krat = 1;
        for (int i=1; i<array.length; i++){
            array[i] = i;
            if (array[i]%3==0){
                krat = krat * array[i];
            }
        }
        //System.out.println(krat);

        //Task 2
        Random random = new Random();
        int [] array1 = new int[10];
        int number = 0;
        int count = 0;
        double arith = 0.0;
        for (int i=0; i<array1.length; i++){
            array1[i] = random.nextInt(15);
            if (i%2!=0){
                number += array1[i];
                count++;
            }
            arith = (double) number/count;
        }
        //System.out.println(Arrays.toString(array1));
        //System.out.println("Сумма чисел с нечетным индексом = " + number);
        //System.out.println("Среднее арифметическое чисел с нечетным индексом = " + arith);

        //Task 4
        Random r = new Random();
        int [] array2 = new int[10];
        int count1 = 0;
        int min = 0;
        for (int i=0; i<array2.length; i++){
            array2[i] = r.nextInt(15);
            if (array2[i]%2!=0){
                count1++;
            }
        }
        //System.out.print(Arrays.toString(array2));
        //System.out.println();
        int [] array3 = new int[count1];
        int number1 = 0;
        for (int i=0; i<array2.length; i++){
            if (array2[i]%2!=0){
                array3[number1]=array2[i];
                number1++;
            }
        }
        min = Arrays.stream(array3).min().getAsInt();
        //System.out.println("Минимальное нечетное число в массиве = " + min);

        //Task 6
        Random random1 = new Random();
        int[] arr = new int[10];
        int count2 = 10;
        int count3 = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random1.nextInt(20);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == i)
                    continue;

                if (arr[i] == arr[j]) {
                    count3++;
                    count2--;
                }
            }
        }

        //System.out.println(Arrays.toString(arr));
        //System.out.println("Количество различных элементов в массиве = " + count2);
        //System.out.println("Количество равных элементов в масииве =" + count3);

        //Task 8
        Random random2 = new Random();
        int [] arrays = new int[10];
        int max = 0;
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random2.nextInt(20);
        }
        Arrays.sort(arrays);
        max = arrays[8];
        //System.out.println(Arrays.toString(arrays));
        //System.out.println("Второе по величене значение в массиве = " + max);

        //Task 9
        Random random3 = new Random();
        int [] arr1 = new int[10];
        int count4 = 0;
        int min1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random3.nextInt(20);
            if (i%2==0 && i!=0){
                count4++;
            }
        }
        int [] arr2 = new int[count4];
        int number2 = 0;
        for (int i=0; i<arr1.length; i++){
            if (i%2==0 && i!=0){
                arr2[number2]=arr1[i];
                number2++;
            }
        }
        //System.out.println(Arrays.toString(arr1));
        //System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        min1 = arr2[0];
        //System.out.println("Наименьший элемент среди элементов с четными индексами = " + min1);

        //Task 10
        Random random4 = new Random();
        int [] arrays1 = new int[10];
        int number3 = 0;
        int number4 = 0;
        int max1 = 0;
        for (int i = 0; i < arrays1.length; i++) {
            arrays1[i] = random2.nextInt(20);
        }
        max1 = Arrays.stream(arrays1).max().getAsInt();
        Arrays.sort(arrays1);
        //System.out.println(Arrays.toString(arrays1));
        //System.out.println("Максимальное число в массиве = " + max1);
        number3 = arrays1[9];
        number4 = arrays1[0];
        arrays1[0] = number3;
        arrays1[9] = number4;
        //System.out.println(Arrays.toString(arrays1));
    }
}
