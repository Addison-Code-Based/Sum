package sum;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumMod(111112));
        System.out.println(sum(111112));
        System.out.println(sumStream(111112));
    }

    public static int sumMod(int input){
        int sum = 0;
        while (input > 0) {
            sum += input % 10;
            input = input / 10;
        }
        return sum;
    }

    public static int sum(int input) {
        String number = String.valueOf(input);
        char[] digits = number.toCharArray();
        //String[] digits2 = number.split("(?<=.)");

        int sum = 0;
        for (char digit: digits) {
           sum += Character.getNumericValue(digit);
        }

        return sum;
    }
    public static int sumStream(int input) {
        int[] ints = String.valueOf(input).chars().map(Character::getNumericValue).toArray();
        int sum = 0;
        for (int digit: ints) {
            sum += digit;
        }
        return sum;
    }
}