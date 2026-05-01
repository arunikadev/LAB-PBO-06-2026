public class LiveCoding {
    private String password;
    protected String username;
    String status = "aktif";

    public LiveCoding(String username, String password) {
        this.username = username;
        this.password = password;
        this.status = "aktif";
    }
    public String getUsername() {
        return username;
    }

    public void ubahPassword(String oldPassword, String newPassword) {
        if (!this.password.equals(oldPassword)) {
            System.out.println(" Password lama salah!");
        } else if (newPassword.length() != 6) {
            System.out.println("Password baru harus 6 digit!");
        } else {
            this.password = newPassword;
            System.out.println(" Password berhasil diubah!");
        }
    }
    private void logActivity(String message) {
        System.out.println("Log: " + message);
    }
}

public void main(String[] args) {
    LiveCoding user = new LiveCoding("user123", "pass123");
    
    System.out.println(user.password);
}