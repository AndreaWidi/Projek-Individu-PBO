public class Penumpang implements BayarBus {

    protected int id; // 🔹 Tambah ID
    protected String nama;
    protected int umur;
    protected boolean hamil;
    protected int saldo;
    protected Kategori kategori;

    public Penumpang(int id, String nama, int umur, boolean hamil) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.hamil = hamil;
        this.saldo = 10000;
        this.kategori = Kategori.BIASA;
    }

    public int getID() { return id; }
    public String getNama() { return nama; }
    public int getUmur() { return umur; }
    public boolean getHamil() { return hamil; }
    public int getSaldo() { return saldo; }
    public Kategori getKategori() { return kategori; }

    public void tambahSaldo(int jumlah) { saldo += jumlah; }

    @Override
    public void bayar(int ongkos) throws SaldoTidakCukupException {
        if (saldo < ongkos) {
            throw new SaldoTidakCukupException("Saldo tidak cukup!");
        }
        saldo -= ongkos;
    }

    @Override
    public String toString() {
        return "[Biasa] ID:" + id + " - " + nama + 
               " (Umur " + umur + ", Saldo " + saldo + ")";
    }
}
