package flyweight;

public class DigitFactory {
    private Digit[] pool = new Digit[]{
            null, null, null, null, null, null, null, null, null, null
    };

    public Digit getDigit(int n) {
        if (pool[n] != null) {
            return pool[n];
        }else{
            var filename = String.format("/data/%d.txt", n);
            var digit = new Digit(filename);
            pool[n] = digit;
            return digit;
        }
    }
}
