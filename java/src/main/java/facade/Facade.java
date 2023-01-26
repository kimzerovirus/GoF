package facade;

public class Facade {
    private DBMS dbms = new DBMS();
    private Cache cache = new Cache();

    public void run(String name) {
        Row row = cache.get(name);
        if (row == null) {
            row = dbms.query(name);
            if (row != null) {
                cache.put(row);
            }
        }

        if (row != null) {
            var msg = new Message(row);
            msg.print();
        } else {
            System.out.println(name +" is not exists.");
        }
    }
}
