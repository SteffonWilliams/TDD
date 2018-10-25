
public class FizzBuzz {


    public String testThree(int i) {
        if (i % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(i);
    }





    public String testFive(int i) {
        if ( i % 5 == 0){
            return "Buzz";

        }
        return String.valueOf(i);

    }




    public String testThreeFive(int i) {
        if (i % 15 == 0){
            return "FizzBuzz";

        }
        return String.valueOf(i);

    }





    public String testNeither(int x) {
        return String.valueOf(x);
    }


    public String fizzBuzzChecker(int x) {
        if (x % 15 == 0) {
            return "FizzBuzz";
        }
        else if (x % 3 == 0) {
            return "Fizz";

        }
        else if (x % 5 == 0){
            return "Buzz";
        }
        else {
            return String.valueOf(x);
        }
    }

    }




    
