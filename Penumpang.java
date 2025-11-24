public class Penumpang implements BayarBus {

    protected int id; // 🔹 Tambah ID
    protected String nama;
    protected int umur;
    protected boolean hamil;
    protected int saldo;
    protected Kategori kategori;

    public Penumpang(int id, String nama, int umur, boolean hamil) {
