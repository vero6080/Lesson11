public class Fibonacci {
    
    static int counter = 0;

    public static void main(String[] args) {
        int num = 40;
        System.out.println("The " + num + "th fibonacci number is " + fib(num));
        System.out.println("The " + num + "th fibonacci number is " + fib2(num));
        System.out.println("Fib1 was called " + counter + " times");
    }
    
    public static int fib(int num){
        counter++;
        if (num==1 || num==2)
            return 1;
        else
            return fib(num-1) + fib(num-2);
    }
    
    public static int fib2(int num){
        if (num==1 || num==2)
            return 1;
        int num1=1, num2=1, counter = 2;
        while(true){
            int fibnum = num1 + num2;
            counter++;
            if (counter==num) return fibnum;
            num1 = num2;
            num2 = fibnum;
        }
    }
    
}
