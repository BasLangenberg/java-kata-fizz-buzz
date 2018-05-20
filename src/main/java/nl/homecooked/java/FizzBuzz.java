package nl.homecooked.java;

public class FizzBuzz
{
    private int number;
    private boolean fizz;
    private boolean buzz;
    private String returnString;

    public FizzBuzz(int input){
        this.number = input;

        if (this.number % 3 == 0){
            this.fizz = true;
        }

        if (this.number % 5 == 0) {
            this.buzz = true;
        }
    }

    public String getResult() {
        emptyReturnString();

        if (fizz) {
            this.returnString += "Fizz";
        }

        if (buzz) {
            this.returnString += "Buzz";
        }

        if(!fizz && !buzz) {
            this.returnString += Integer.toString(number);
        }

        return returnString;
    }

    private void emptyReturnString() {
        this.returnString = "";
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
