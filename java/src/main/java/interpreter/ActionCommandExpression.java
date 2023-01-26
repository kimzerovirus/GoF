package interpreter;

public class ActionCommandExpression extends CommandExpression {
    public ActionCommandExpression(String keyword) {
        super(keyword);
    }

    @Override
    public boolean parse(Context context) {
        if (!checkValidKeyword(keyword)) return false;
        if(context.readNextKeyword() == null) return false;
        return true;
    }

    @Override
    public boolean run() {
        System.out.println("cmd: " + keyword);
        return true;
    }

    public static boolean checkValidKeyword(String keyword) {
        return keyword.equals("FRONT") || keyword.equals("BACK") || keyword.equals("LEFT") || keyword.equals("RIGHT");
    }


    @Override
    public String toString() {
        return keyword;
    }
}
