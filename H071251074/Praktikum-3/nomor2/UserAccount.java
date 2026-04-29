package nomor2;

public class UserAccount {
    private String password;
    protected String username;
    String status;

    public UserAccount(String username, String password, String status) {
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public String getUsername() {
        return this.username;
    }

    public String getStatus() {
        return this.status;
    }

    public void setPassword(String oldpass, String newpass) {
        if (this.password != oldpass) {
            System.out.println("Gagal: Password lama salah!");
            logTransaksi("Password Gagal diubah");
        } else if (newpass.length() != 6) {
            System.out.println("Gagal: Password harus 6 digit!");
            logTransaksi("Password Gagal diubah");
        } else {
            this.password = newpass;
            logTransaksi("Password Berhasil Diubah");
        }
    }

    private void logTransaksi(String pesan) {
        System.out.println("Catatan: " + pesan);
    }
}
