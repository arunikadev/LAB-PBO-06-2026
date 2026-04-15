package soal2;

public class Main {
    public static void main(String[] args) {
        UserAccount user = new UserAccount("USR-001", "123456");
        // 
        
        user.updatePassword("123456", "654321"); // Password lama salah
        System.out.println(user.password);

        
    }
    
}
