public class Pengguna {
    private String id;
    private String nama;
 
    public Pengguna(String id, String nama) {
        System.out.println("Constructor Pengguna dijalankan");
        this.id = id;
        this.nama = nama;
    }
 
    public String getId() {
        return id;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void tampilkanInfo() {
        System.out.println("ID   : " + id);
        System.out.println("Nama : " + nama);
    }
 
    // Method ini akan di-override berbeda-beda oleh setiap subclass
    public void tampilkanPeran() {
        System.out.println("Pengguna sistem SiKos");
    }
}