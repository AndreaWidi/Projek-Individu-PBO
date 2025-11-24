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
