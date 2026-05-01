package soal2;

public class UserAccount {
    String password;
    protected String username;  
    String status;

    public UserAccount(String username, String password) {
        if (password.length() != 6) {
            System.out.println("Gagal membuat akun: PIN harus tepat 6 karakter.");
            this.status = "nonaktif";
            return;
        }
        this.username = username;
        this.password = password;
        this.status = "aktif";
    }

    public String getUsername() {
        return username;
    }

    public String setPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public void updatePassword(String oldPassword, String newPassword) {
        if (!"aktif".equals(this.status)) {
            System.out.println("Akun tidak aktif. Tidak dapat mengubah password.");
            return;
        }
        if (oldPassword != this.password) {
            System.out.println("Password lama salah. Password tidak berhasil diubah.");
            catatLog("Password salah.");

        } else if (String.valueOf(newPassword).length() != 6) {
            System.out.println("Password baru harus tepat 6 karakter.");
             catatLog("Password baru tidak 6 karakter.");
        } else {
            this.password = newPassword;
            System.out.println("Password berhasil diubah.");
            catatLog("Password berhasil diubah");
        }
    }

    private void catatLog(String pesan) {
        System.out.println("[LOG] " + pesan);
    }
}

