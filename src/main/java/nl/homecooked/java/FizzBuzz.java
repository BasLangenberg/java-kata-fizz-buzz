package nl.homecooked.java;

public class FizzBuzz
{
    private int number;
    private boolean fizz;
    private boolean buzz;
    private String returnString;

    public FizzBuzz(int input){
        this.number = input;
        this.returnString = "";

        this.fizz = getFizz();
        this.buzz = getBuzz();
    }

    public String getResult() {
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

    public Boolean getFizz() {
        if (this.number % 3 == 0){
            return true;
        }

        return false;
    }

    public Boolean getBuzz() {
        if (this.number % 5 == 0){
            return true;
        }

        return false;
    }

}
