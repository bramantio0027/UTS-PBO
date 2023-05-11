package pengguna;

public class Mhs {
    private String username;
    private String password;
    private String nama;
    private String nim;
    private int smt;

    public Mhs(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setSmt(int smt) {
        this.smt = smt;
    }
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public int getSmt() {
        return smt;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;

    }
}
