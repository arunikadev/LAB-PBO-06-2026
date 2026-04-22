package nomor2;
public class Main {
    public static void main(String[] args) {
        UserAccount user = new UserAccount( "patricius",  "Abc123",  "Aktif");

        System.out.println("Username: " + user.getUsername());
        System.out.println("Status: " + user.getStatus());
        System.out.println("");
        
        user.setPassword("111111", "654321");
        user.setPassword("Abc123", "654321");

    }
}
