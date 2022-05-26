public class RomanToInt {
  public static int romanToInt(String s) {
        int sum = 0;
        for (int i = s.length()-1; i>=0; i--) {
            int val = value(s.charAt(i));
            if (i != s.length()-1 && val < value(s.charAt(i+1))) {
                sum -= val;
            } else {
                sum += val;
            }
        }
        return sum;
    }

    private int value(char numeral) {
        return switch (numeral) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalStateException("Unexpected value: " + numeral);
        };
    }
}
