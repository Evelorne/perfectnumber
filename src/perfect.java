import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        int n;
        int a = 0;
        int b= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();



        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                b += i;
            }
        }
            if (b == n) {
                    System.out.println("Your number is perfect.");
                } else {
                    System.out.println("Your number is not perfect.");

                }



    }
    }

