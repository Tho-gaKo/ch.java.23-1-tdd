

public class FizzBuzz {

    public static void main(String[] args) {

    }

    public static String fizzBuzz(int number) {
        String result;

        if (number % 3 == 0 && number % 5 == 0) {
            result = "Fizz Buzz";
        } else if (number % 3 == 0){
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";

        }else {
            return String.valueOf(number);
        }

        return result;
    }
}
