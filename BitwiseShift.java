public class BitwiseShift{
    public static void main(String[] args) {
        int num=3;
        System.out.println("Input Number = "+num+"\nMultiplying once by 2 using left shift");
        System.out.println("num= num << 1");
        num=num << 1;
        System.out.println(num);
        System.out.println("Dividing once by 2 using right shift");
        System.out.println("num= num >> 1 ");
        num= num >> 1;
        System.out.println(num);

    }
}