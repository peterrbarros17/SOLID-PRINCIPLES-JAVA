interface Database{
    void connect();
}

// high-level classes should depend on abstractions, not specific implementations
class MySQLDatabase implements Database{
    public void connect(){
        System.out.println("Connecting to MySQL");
    }
}
class Application{
    private final Database database;

    public Application(Database database){
        this.database = database;
    }

    public void start(){
        database.connect();
    }
}

public class DIP {
    public static void main(String[] args) {
        new Application(() ->{
            System.out.println("DataBase");
        } ).start();
    }
}
