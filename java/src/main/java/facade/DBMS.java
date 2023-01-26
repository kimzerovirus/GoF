package facade;

import java.util.HashMap;

public class DBMS {
    private HashMap<String, Row> db = new HashMap<>();

    public DBMS() {
        db.put("jane", new Row("Jane", "2002-02-02", "jane@email.com"));
        db.put("tom", new Row("tom", "2012-02-02", "tom@email.com"));
        db.put("john", new Row("john", "2022-02-02", "john@email.com"));
    }

    public void put(String key, Row value) {
        db.put(key, value);
    }

    public Row query(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return db.get(name.toLowerCase());
    }


}
