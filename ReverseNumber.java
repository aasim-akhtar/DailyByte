// javac ReverseNumber.java
// java ReverseNumber

import java.util.Scanner;

public class ReverseNumber {

    static int num; 
    static int digits;
//mandatory to declare num and digits as static because in main we are passing them as args and if they're not static, they'll not be available in main function. 
    ReverseNumber(){
        Scanner inputObj= new Scanner(System.in);
        System.out.println("Please input any number: ");
        num=inputObj.nextInt();
        digits=0;
    }

    private int getDigits(int num) {
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
    private int reverseNumber(int num) {
        int rev=0;
        while(num!=0){
            rev=rev+num%10;
            num=num/10;
            rev=rev*10;
        }    
    return (rev/10);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        ReverseNumber obj = new ReverseNumber();
        System.out.println(obj.getDigits(num));
        System.out.println(obj.reverseNumber(num));

    }
}