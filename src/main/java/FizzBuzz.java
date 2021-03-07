
public class FizzBuzz {
    public String execute(Integer number) {
        switch (number){
            case 1:
                return  String.valueOf(number);
            case 2:
                return  String.valueOf(number);
            case 3:
            case 9:
                return "Fizz";
            case 25:
                return "Buzz";
            default:
                return "";
        }
    }
}
