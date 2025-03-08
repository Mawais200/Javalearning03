import java.util.Scanner;

public class function{
    public static int Sum(int a,int b)//parameters
    {
        int sum=a+b;
       return sum;
        

    }
    public static void Swap(int a,int b)//parameters
    {
          int temp = a;
          a=b;
          b=temp;
          System.out.println(+a);
          System.out.println(+b);
        

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int sum = Sum(a, b);//arguments
        System.out.println("sum of a and b is:" +sum);
        
        Swap(5,7);



        
    }
}