import java.util.Scanner;

public class function{
    public static int Sum(int a,int b){
        int sum=a+b;
       return sum;
        

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int sum = Sum(a, b);
        System.out.println("sum of a and b is:" +sum);

        
    }
}