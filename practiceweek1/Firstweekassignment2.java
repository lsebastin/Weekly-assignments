package practiceweek1;

public class Firstweekassignment2 {
    public static void main(String[] args) {

        int range = 25;
        int a = 0;
        int b = 1;
        System.out.print(a + ", " + b);
        
        int c = a + b;

        while (c <= range) {
            System.out.print(", " + c);

            a = b;
            b = c;
            c = a + b;
        }
    }
}
