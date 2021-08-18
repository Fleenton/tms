package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class LessonThreeDop1 {
    public static void main(String[] args) throws IOException {
        //Task 1
        /*BufferedReader Lesson8.reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int n = Integer.parseInt(Lesson8.reader.readLine());
        int [][] array = new int[n][n];
        int number = 0;
        int sum = 0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                array[i][j] = random.nextInt(50)+1;
                if (i == j){
                    number = array[i][j];
                    sum +=number;
                }
            }
        }
        for (int[] x: array){
            for (int s: x){
                System.out.print(s + "\t");
            }
            System.out.println();
        }
        System.out.println("Сумма чисел на главной диагонале = " + sum);*/

        //Task 2
        /*BufferedReader Lesson8.reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int n = Integer.parseInt(Lesson8.reader.readLine());
        int [][] array = new int[n][n];
        int count = 0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                array[i][j] = random.nextInt(50)+1;
                System.out.print(array[i][j] + "\t");
                if (array[i][j]%2!=0 && array[i][j]!=0){
                    count++;
                }
            }
            System.out.println();
        }
        int [] arrays = new int[count];
        int number = 0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (array[i][j]%2!=0 && array[i][j]!=0){
                    arrays[number] = array[i][j];
                    number++;
                }
            }
        }
        System.out.println(Arrays.toString(arrays));*/

        //Task 3
        /*BufferedReader Lesson8.reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int n = Integer.parseInt(Lesson8.reader.readLine());
        int [][] array = new int[n][n];
        int number = 0;
        int number1 = 0;
        int multi = 1;
        int multi1 = 1;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                array[i][j] = random.nextInt(50)+1;
                if (i == j){
                    number = array[i][j];
                    multi *= number;
                }
                if (i+j+1 == n){
                    number1 = array[i][j];
                    multi1 *= number1;
                }
            }
        }
        for (int[] x: array){
            for (int s: x){
                System.out.print(s + "\t");
            }
            System.out.println();
        }
        System.out.println("Произведение чисел на главной диагонале = " + multi);
        System.out.println("Произведение чисел на побочной диагонале = " + multi1);
        if (multi < multi1){
            System.out.println("Произведение чисел на главной диагонале меньше чем на побочной");
        }
        else if (multi > multi1){
            System.out.println("Произведение чисел на главной диагонале больше чем на побочной");
        }
        else if (multi == multi1){
            System.out.println("Произведение чисел на диагоналях равны");
        }*/

        //Task 4
        /*BufferedReader Lesson8.reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int n = Integer.parseInt(Lesson8.reader.readLine());
        int [][] array = new int[n][n];
        int number = 0;
        int sum = 0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                array[i][j] = random.nextInt(50)+1;
                if (i+j+1<n){
                    number = array[i][j];
                    if (number%2==0){
                        sum+=number;
                    }
                }
            }
        }
        for (int[] x: array){
            for (int s: x){
                System.out.print(s + "\t");
            }
            System.out.println();
        }
        System.out.println("Сумма четных чисел над побочной диагональю = " + sum);*/

        //Task 5
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int n = Integer.parseInt(reader.readLine());
        int [][] array = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                array[i][j] = random.nextInt(50)+1;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                int s = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = s;
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
