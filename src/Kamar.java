public class Kamar {
    private String nomorKamar;
    private String tipeKamar;
    private boolean statusTersedia;
 
    public Kamar(String nomorKamar, String tipeKamar, boolean statusTersedia) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.statusTersedia = statusTersedia;
    }
 
    public String getNomorKamar() {
        return nomorKamar;
    }
 
    public String getTipeKamar() {
        return tipeKamar;
    }
 
    public boolean isStatusTersedia() {
        return statusTersedia;
    }
 
    public void setTipeKamar(String tipeKamar) {
        if (tipeKamar != null &&
                (tipeKamar.equalsIgnoreCase("Single") || tipeKamar.equalsIgnoreCase("Double"))) {
            this.tipeKamar = tipeKamar;
        } else {
            System.out.println("Tipe kamar tidak valid (harus Single atau Double)");
        }
    }
 
    public void setStatusTersedia(boolean statusTersedia) {
        this.statusTersedia = statusTersedia;
    }
 
    public void tampilkanData() {
        System.out.println("=== Data Kamar ===");
        System.out.println("Nomor Kamar : " + nomorKamar);
        System.out.println("Tipe Kamar  : " + tipeKamar);
        System.out.println("Status      : " + (statusTersedia ? "Tersedia" : "Terisi"));
        System.out.println("------------------");
    }
}