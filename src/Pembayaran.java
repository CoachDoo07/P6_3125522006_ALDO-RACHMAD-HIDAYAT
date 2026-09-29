public class Pembayaran {
    private String idPembayaran;
    private String tanggalBayar;
    private double jumlahBayar;
    private Penyewa penyewa; // Association: pembayaran dilakukan oleh penyewa
 
    public Pembayaran(String idPembayaran, String tanggalBayar, double jumlahBayar, Penyewa penyewa) {
        this.idPembayaran = idPembayaran;
        this.tanggalBayar = tanggalBayar;
        setJumlahBayar(jumlahBayar);
        this.penyewa = penyewa;
    }
 
    public String getIdPembayaran() {
        return idPembayaran;
    }
 
    public String getTanggalBayar() {
        return tanggalBayar;
    }
 
    public double getJumlahBayar() {
        return jumlahBayar;
    }
 
    public Penyewa getPenyewa() {
        return penyewa;
    }
 
    public void setJumlahBayar(double jumlahBayar) {
        if (jumlahBayar > 0) {
            this.jumlahBayar = jumlahBayar;
        } else {
            System.out.println("Jumlah bayar tidak valid (harus lebih dari 0)");
        }
    }
 
    public void prosesPembayaran() {
        penyewa.getTagihan().setStatusLunas(true);
        System.out.println("Pembayaran diproses untuk " + penyewa.getNama() +
                " - Tagihan " + penyewa.getTagihan().getIdTagihan() + " kini Lunas");
    }
 
    public void tampilkanData() {
        System.out.println("=== Data Pembayaran ===");
        System.out.println("ID Pembayaran  : " + idPembayaran);
        System.out.println("Penyewa        : " + penyewa.getNama());
        System.out.println("Tanggal Bayar  : " + tanggalBayar);
        System.out.println("Jumlah Bayar   : " + jumlahBayar);
        System.out.println("-----------------------");
    }
}