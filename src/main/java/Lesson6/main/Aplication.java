package Lesson6.main;

import Lesson6.service.Calculator;
import Lesson6.service.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Aplication {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        System.out.print("Введите длину массива: ");
        int numberArr = Integer.parseInt(reader.readLine());
        System.out.print("Введите диапазон рандомных чисел: ");
        int numberRand = Integer.parseInt(reader.readLine());
        double [] array = new double[numberArr];
        double [] array1 = new double[numberArr];
        double [] array2 = new double[numberArr];
        for (int i = 0; i < numberArr; i++){
            array[i] = random.nextInt(numberRand);
            array1[i] = random.nextInt(numberRand) + 1;
        }
        Service.infoArray(array);
        Service.infoArray(array1);
        System.out.println("---РАСЧЕТ СУММЫ ЭЛЕМЕНТОВ ПЕРВЫХ ДВУХ МАССИВОВ---");
        array2 = getResultArrayBySum(array, array1);
        Service.infoArray(array2);
        System.out.println("---РАСЧЕТ ВЫЧИТАНИЯ ЭЛЕМЕНТОВ ПЕРВЫХ ДВУХ МАССИВОВ---");
        array2 = getResultArrayBySubtraction(array, array1);
        Service.infoArray(array2);
        System.out.println("---РАСЧЕТ УМНОЖЕНИЯ ЭЛЕМЕНТОВ ПЕРВЫХ ДВУХ МАССИВОВ---");
        array2 = getResultArrayByMultiplication(array, array1);
        Service.infoArray(array2);
        System.out.println("---РАСЧЕТ ДЕЛЕНИЯ ЭЛЕМЕНТОВ ПЕРВЫХ ДВУХ МАССИВОВ---");
        array2 = getResultArrayByDivision(array, array1);
        Service.infoArray(array2);
        System.out.println("---КВАДРАТ КАЖДОГО ЧИСЛА ВТОРОГО МАССИВА---");
        array2 = getResultArrayBySquare(array1);
        Service.infoArray(array2);
        System.out.println("---КОРЕНЬ КВАДРАТНЫЙ ЧИСЕЛ ВТОРОГО МАССИВА---");
        array2 = getResultArrayBySquareRoot(array1);
        Service.infoArray(array2);
    }

    private static double[] getResultArrayBySum(double[] arr, double[] arr1){
        double[] result = new double[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Calculator.sum(arr[i], arr1[i]);
        }
        return result;
    }

    private static double[] getResultArrayBySubtraction(double[] arr, double[] arr1){
        double[] result = new double[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Calculator.subtraction(arr[i], arr1[i]);
        }
        return result;
    }

    private static double[] getResultArrayByMultiplication(double[] arr, double[] arr1){
        double[] result = new double[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Calculator.multiplication(arr[i], arr1[i]);
        }
        return result;
    }

    private static double[] getResultArrayByDivision(double[] arr, double[] arr1){
        double[] result = new double[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Calculator.division(arr[i], arr1[i]);
        }
        return result;
    }

    private static double[] getResultArrayBySquare(double[] arr){
        double[] result = new double[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Calculator.square(arr[i]);
        }
        return result;
    }

    private static double[] getResultArrayBySquareRoot(double[] arr){
        double[] result = new double[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Calculator.squareRoot(arr[i]);
        }
        return result;
    }
}
