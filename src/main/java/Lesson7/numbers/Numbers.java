package Lesson7.numbers;

public class Numbers {
    public int a;
    public int b;

    public Numbers() {
    }

    public Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void num(int a, int b){
        if (a<b){
            System.out.print(a + " ");
            num(a+1, b);
        }
        if (a==b){
            System.out.print(b);
            return;
        }
        if (a>b){
            num(a, b+1);
            System.out.print(" " + b);
        }
        if (a==b){
            System.out.print(a);
            return;
        }
    }
}
