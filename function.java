import java.util.Scanner;

public class function{
    // for a sum of a and b
    public static int Sum(int a,int b)//parameters
    {
        int sum=a+b;
       return sum;
        

    }
    // For a swap of a and  b
    public static void Swap(int a,int b)//parameters
    {
          int temp = a;
          a=b;
          b=temp;
          System.out.println(+a);
          System.out.println(+b);
        

    }
    public static int factorial(int n){
        int f=1;
        for (int i =1;i<=n; i++){
           f= f*i;
           System.out.println(f);
        }
        return f;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int sum = Sum(a, b);//arguments
        System.out.println("sum of a and b is:" +sum);
        //swap value call function
        Swap(5,7);
        // factorail call function
        factorial(4);



        
    }
}