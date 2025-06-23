package week3.day1;

public class JavaConnection implements DatabaseConnection {
	
    @Override
    public void connect() {
        System.out.println("Connected to the database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from the database.");
    }

    @Override
    public void executeUpdate() {
        System.out.println("Executing update query...");
    }

    public static void main(String[] args) {
    	
        JavaConnection db = new JavaConnection();
        db.connect();
        db.executeUpdate();
        db.disconnect();
    }
}
