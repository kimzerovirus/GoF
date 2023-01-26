package interpreter;

public class InterpreterApplication {
    /**
     * 인터프리터
     * 스크립트 해석에 사용하는 패턴
     */
    public static void main(String[] args) {
        String script = "BEGIN FRONT LOOP 3 LOOP BACK RIGHT END BACK END LOOP 3 LEFT END BACK RIGHT END BACK END";
//        Context context = new Context(script);
//
//        while (true) {
//            String keyword = context.getCurrentKeyword();
//            if(keyword == null) break;
//
//            System.out.println(keyword);
//            context.readNextKeyword();
//        }

        System.out.println(script);
        var context = new Context(script);
        var expression = new BeginExpression();

        if (expression.parse(context)) {
            System.out.println(expression);
            expression.run();
        }
    }
}
