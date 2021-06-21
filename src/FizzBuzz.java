public class FizzBuzz {
    public static void main(String[] args) {
        runFizzBuzz(30);
    }

    private static void runFizzBuzz(int num) {
        if(num%3 == 0 && num%5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(num % 5 == 0){
            System.out.println("Buz");
        }
        else if(num % 3 == 0){
            System.out.println("Fizz");
        }
        else{
            System.out.println(num);
        }
    }


}
