package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Number {
    private List<Digit> digitList = new ArrayList<>();

    public Number(int num) {
        String strNum = Integer.toString(num);
        int len = strNum.length();

        DigitFactory digitFactory = new DigitFactory();
        for (int i = 0; i < len; i++) {
            int n = Character.getNumericValue(strNum.charAt(i));
            Digit digit = digitFactory.getDigit(n);
            digitList.add(digit);
        }
    }

    public void print(int x, int y) {
        int cntDigits = digitList.size();
        for (int i = 0; i < cntDigits; i++) {
            Digit digit = digitList.get(i);
            digit.print(x + (i * 8), y);
        }
    }
}
