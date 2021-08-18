package Lesson2;

public class LessonTwo {
    public static void main(String[] args) {
        //Task1
        double a = 10.0;
        double d = 0.0;
        for (int i=0; i<7; i++){
            d += a;
            a *= 1.1;
        }
        //System.out.println(d);

        //Task2
        int amoebaTime = 3;
        for (int amoeba = 1; amoeba<=24; amoeba+=3){
            amoebaTime = amoebaTime*2;
        }
        //System.out.println(amoebaTime);

        //Task3
        int sum = 0;
        for (int i = 0; i<257; i*=2){
            sum += i;
        }
        System.out.println(sum);

        //Task6
        for (int i=0; i<=100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        //Task7
        int sum1 = 0;
        for (int i=0; i<100; i++){
            if (i % 2 !=0){
                sum1 += i;
            }
        }
        //System.out.println(sum1);

        //Task 5
        double cen = 2.54;
        //System.out.println(cen);
        for (double inch = 1.0; inch<20; inch++){
            cen = cen + 2.54;
            System.out.println(cen);
        }

        //Task 4
        int x = 5;
        int y = 0;
        for (int i=0; i<7; i++){
            y = y + x;
        }
        //System.out.println(y);

        //Task 8
        for (int i=0; i<4; i++){
            for (int j=0; j<=i; j++){
               // System.out.print("*");
            }
            //System.out.println();
        }
        //System.out.println();
        for (int i=0; i<4; i++){
            for (int j=i; j<4; j++){
               // System.out.print("*");
            }
           // System.out.println();
        }
    }
}
