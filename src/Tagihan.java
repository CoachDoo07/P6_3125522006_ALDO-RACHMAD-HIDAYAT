public class Tagihan {
    private String idTagihan;
    private String jatuhTempo;
    private boolean statusLunas;
 
    public Tagihan(String idTagihan, String jatuhTempo) {
        this.idTagihan = idTagihan;
        this.jatuhTempo = jatuhTempo;
        this.statusLunas = false;
    }
 
    public String getIdTagihan() {
        return idTagihan;
    }
 
    public String getJatuhTempo() {
        return jatuhTempo;
    }
 
    public void setStatusLunas(boolean statusLunas) {
        this.statusLunas = statusLunas;
    }
 
    public boolean cekStatus() {
        return statusLunas;
    }
 
    public void tampilkanData() {
        System.out.println("=== Data Tagihan ===");
        System.out.println("ID Tagihan  : " + idTagihan);
        System.out.println("Jatuh Tempo : " + jatuhTempo);
        System.out.println("Status      : " + (statusLunas ? "Lunas" : "Belum Lunas"));
        System.out.println("--------------------");
    }
}