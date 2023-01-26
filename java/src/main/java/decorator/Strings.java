package decorator;

import java.util.ArrayList;
import java.util.List;

public class Strings extends Printer {
    private List<String> strings = new ArrayList<>();

    public Strings(){}

    public void addStrings(String str) {
        strings.add(str);
    }

    @Override
    public int getLinesCount() {
        return strings.size();
    }

    @Override
    public int getMaxLength() {
        int maxWidth = 0;
        for (String str : strings) {
            int width = str.length();
            if(width> maxWidth) maxWidth = width;
        }

        return maxWidth;
    }

    @Override
    public int getLength(int index) {
        var str = strings.get(index);
        return str.length();
    }

    @Override
    public String getString(int index) {
        return strings.get(index);
    }
}
