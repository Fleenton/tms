package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class LessonThree {
    public static void main(String[] args) throws IOException {
        //Task 1
        int [] array = new int [10];
        for (int i=1; i<=array.length; i++){
            array[i-1] = i*2;
            //System.out.println(array[i-1]);
        }
        //System.out.println();
        for (int i=0; i<array.length; i++){
            //System.out.print(array[i] + " ");
        }

        //Task 2
        int [] arr = new int[50];
        for (int i=0; i<arr.length;i++){
            arr[i] = 2*i+1;
            //System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i=arr.length-1; i>=0; i--){
            //System.out.print(arr[i] + " ");
        }

        //Task 3
        Random random = new Random();
        int [] array1 = new int[15];
        int count = 0;
        for (int i=0; i<array1.length; i++){
            array1[i] = random.nextInt(99);
            //System.out.println(array1[i]);
            if (array1[i]%2==0){
                count++;
            }
        }
        //System.out.println("Количество четных числе в данном массиве = " + count);

        //Task 4
        Random random1 = new Random();
        int [] arr1 = new int[20];
        for (int i=0; i<arr1.length; i++){
            arr1[i] = random1.nextInt(20);
        }
        //System.out.print(Arrays.toString(arr1));
        //System.out.println();
        for (int i=0; i<arr1.length; i++){
            if (i%2!=0){
                arr1[i] = 0;
            }
        }
        //System.out.print(Arrays.toString(arr1));

        //Task 5
        /*Random random2 = new Random();
        int [] arrays = new int[5];
        int [] arrays1 = new int[5];
        double count1 = 0;
        double count2 = 0;
        for (int i=0; i<arrays.length; i++){
            arrays[i] = random2.nextInt(15);
            System.out.print(arrays[i] + " ");
            count1 = (count1+arrays[i])/ arrays.length;
        }
        System.out.print("Среднее арифметическое первого массива = " + count1);
        System.out.println();
        for (int j=0; j<arrays1.length; j++){
            arrays1[j] = random2.nextInt(15);
            System.out.print(arrays1[j] + " ");
            count2 = (count2 + arrays1[j])/ arrays1.length;
        }
        System.out.print("Среднее арифметическое второго массива = " + count2);
        System.out.println();
        if (count1>count2){
            System.out.println("Среднее арифметическое первого массива больше чем второго");
        }
        else if (count1<count2){
            System.out.println("Среднее арифметическое второго массива больше чем первого");
        }
        else if (count1 == count2){
            System.out.println("Среднее арифметическое массивов равны");
        }*/

        //Task 7
        Random random3 = new Random();
        int [] massiv = new int[12];
        int maxIn = 0;
        int max = 0;
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random3.nextInt(15);
            max = Arrays.stream(massiv).max().getAsInt();
            //System.out.print(massiv[i] + " ");
            if (massiv[i]>=massiv[maxIn]){
                maxIn = i;
            }
        }
        //System.out.println();
        //System.out.println("Наибольший элемент массива - " + max + " его последний индекс вхождения - " + maxIn);

        //Task 6
        Random random4 = new Random();
        int [] massiv2 = new int[4];
        int number = 0;
        int result = 0;
        int counter = 0;
        for (int i=0; i<massiv2.length; i++) {
            massiv2[i] = random4.nextInt(10);
            //System.out.print(massiv2[i] + " ");
            if (number<=massiv2[i]){
                number = massiv2[i];
                result++;
            }
        }
        //System.out.println();
        if (result == massiv2.length){
            //System.out.println("Массив строгий");
        }
        else {
            //System.out.println("Массив не строгий");
        }

        //Task 8
        /*Random rand = new Random();
        int [] mas = new int[10];
        int [] mas1 = new int[10];
        double [] mas2 = new double[10];
        for (int i=0; i<=9; i++) {
            mas[i] = rand.nextInt(9);
            mas1[i] = rand.nextInt(9);
            while (mas[i] == 0 || mas1[i] == 0){
                mas[i] = rand.nextInt(9) + 1;
                mas1[i] = rand.nextInt(9) + 1;
            }
            mas2[i] = (double) mas[i]/mas1[i];
        }
        System.out.print(Arrays.toString(mas));
        System.out.println();
        System.out.print(Arrays.toString(mas1));
        System.out.println();
        System.out.print(Arrays.toString(mas2));
        System.out.println();

        for(int i=0 ;i<=9;i++) {
            if(mas2[i]%1==0 && mas[i]!=0 ) {
                counter++;
            }
        }
        System.out.print("Количество целых элементов в третьем массиве = " + counter);*/

        //Task 9
        /*BufferedReader Lesson8.reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(Lesson8.reader.readLine());
        int [] mass = new int[x];
        Random ran = new Random();
        int counter1 = 0;
        int left = 0;
        int right = 0;
        for (int i=0; i<mass.length; i++){
            if (x<0 || x == 0){
                System.out.println("Ошибка.");
                break;
            }
            mass[i] = ran.nextInt(15);
            System.out.print(mass[i] + " ");
        }
        for (int i=0; i<mass.length; i++) {
            if (counter1 < mass.length / 2) {
                left += mass[counter1];
                counter1++;
            }
        }
        for (int i=0; i<mass.length; i++) {
            if (counter1 < mass.length) {
                right += mass[counter1];
                counter1++;
            }
        }
        System.out.println();
        System.out.println("Сумма левой стороны массива = " + left);
        System.out.println("Сумма правой стороны массива = " + right);
        if (left>right){
            System.out.println("Сумма левой стороны массива больше чем сума првой");
        }
        else if (left<right){
            System.out.println("Сумма правой стороны массива больше чем сума левой");
        }
        else if (left == right){
            System.out.println("Суммы сторон массива равны");
        }*/

        //Task 10
        /*BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        int n = Integer.parseInt(read.readLine());
        int [] ma = new int[n];
        int coun = 0;
        for (int i=0; i<ma.length; i++){
            if (n<=3){
                System.out.println("Ошибка");
                break;
            }
            ma[i] = r.nextInt(n);
            if (ma[i]%2==0 && ma[i]!=0){
                coun++;
            }
        }
        System.out.print(Arrays.toString(ma));
        System.out.println();
        int [] massivchik = new int[coun];
        int index = 0;
        for (int i=0; i<ma.length; i++){
            if (ma[i]%2==0 && ma[i]!=0){
                massivchik[index]=ma[i];
                index++;
            }
        }
        System.out.print(Arrays.toString(massivchik));*/
    }
}
