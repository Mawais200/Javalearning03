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
       // Break and Continues Statment
       for(int i=1; i<=10; i++){
        if(i==4){
            break;
        }
       }
    }
}