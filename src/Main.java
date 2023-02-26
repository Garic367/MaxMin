import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = (int) (-2*Math.pow(10,9));
        int min = (int) (+2*Math.pow(10,9));

        for (int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a > max)
                max = a;

            if (a < min)
                min = a;
        }
        System.out.println("Min: "+min+ "\n" +"Max: "+max);
    }
}