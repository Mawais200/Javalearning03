import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // run while loop to print  1 to 10 digits
       int counter =1;
       while(counter<=10){
        System.out.println(counter);
        counter++;

       }
       // print reverse of number
       int number= 34566;
       while(number>0){
        int lastdigit = number %10;
        System.out.print(lastdigit);
        number=number/10;
       }
       // Break  Statment
       for(int i=1; i<=10; i++){
        if(i==4){
            System.out.println(i);
            break;
        }
        System.out.println("i am out of loop ");
       }
       // Continues Statment
       for(int i=1; i<=10; i++){
        if(i==4){
            System.out.println(i);
            continue;
        }
        System.out.println("i am out of loop ");
       }
       //check if a number is prime or not

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number to check wheather it is prime or not");
       int n = sc.nextInt();
       if (n ==2){
        System.out.println("the enter number is prime");
       }else{
        boolean isPrime =true;
       for (int i =2; i<n-1;i++){
        if(n%i==0){
            isPrime=false;
        }

       }
       if(isPrime== true){
        System.out.println("this number is prime");

       }
       else{
        System.out.println("this number is not a prime");
       }
       }
       
    }

}