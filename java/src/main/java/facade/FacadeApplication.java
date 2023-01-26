package facade;

public class FacadeApplication {
    /**
     * 어떤 기능을 처리하기 위해 여러 객체들 사이의 복잡한 메서드 사용을 감춰서 단순화 시켜주는 패턴
     *
     * 라이브러리를 만든다면 Facade 부분만 api 를 제공하면 된다.
     */

    public static void main(String[] args) {
        Facade facade = new Facade();
        String name = "john";

        facade.run(name);
    }

//    public static void main(String[] args) {
//        var dbms = new DBMS();
//        var cache = new Cache();
//
//        String name = "john";
//
//        var row = cache.get(name);
//        if (row == null) {
//            row = dbms.query(name);
//            if (row != null) {
//                cache.put(row);
//            }
//        }
//
//        if (row != null) {
//            var msg = new Message(row);
//            msg.print();
//        } else {
//            System.out.println(name +" is not exists.");
//        }
//    }
}
