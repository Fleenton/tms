package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LessonTwoDop {
    public static void main(String[] args) throws IOException {
        //Task 1
        int population = 10000000;
        int fertility = 14;
        int mortality = 8;
        int firstYearFertility = 0;
        int populationInTenYears = 0;
        for (int i=0; i<10; i++) {
            firstYearFertility = (fertility-mortality) * population / 1000;
            populationInTenYears = population+=firstYearFertility;
        }
        //System.out.print("Численность населения через 10 лет: " + populationInTenYears);

        //Task 2
        int population1 = 10000000;
        int fertility1 = 14;
        int mortality1 = 8;
        int tenYearFertility1 = 0;
        int populationInTenYears1 = 0;

        int sumFertility = 0;
        int sumMortality = 0;

        for (int i = 10; i != 0; i--) {
            sumFertility += fertility1;
            if (fertility1 != 7) {
                fertility1--;
            }
            sumMortality += mortality1;
            if (mortality1 != 6) {
                mortality1--;
            }
        }

        tenYearFertility1 = population1 / 1000 * (sumFertility - sumMortality);
        populationInTenYears1 = population + tenYearFertility1;

        //System.out.print("Численность населения через 10 лет: " + populationInTenYears1);

        //Task 5
        int a = 0;
        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                a=i*j;
               System.out.print(a + "\t");
            }
            //System.out.println();
        }

        //Task 3
        /*BufferedReader Lesson8.reader = new BufferedReader(new InputStreamReader(System.in));
        double contribution = Integer.parseInt(Lesson8.reader.readLine());
        int month = Integer.parseInt(Lesson8.reader.readLine());
        double sum = 0.0;

        for (int i = month; i > 0; i--){
            sum += contribution;
            contribution *= 1.07;
        }
        System.out.println(contribution);*/

        //Task 4
        /*BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        double contribution1 = Integer.parseInt(reader1.readLine());
        int month1 = Integer.parseInt(reader1.readLine());
        double sum1 = 0.0;
        while (month1>0) {
            sum1 += contribution1;
            contribution1 *= 1.07;
            month1--;
            System.out.println(contribution1);
        }*/
    }
}
