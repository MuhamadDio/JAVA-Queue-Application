package AppPackage;
//Kelompok Queue
public class Queue {
    // atribut data
    private final List listAntrian;
    public int idxAkhir;
    // constructor Queue
    public Queue() {
        listAntrian = new List();
        idxAkhir = 0;
    }
    // procedure menyisipkan data pada queue
    public void enqueue(int no, String nama, String alamat, int priority) {
        if (priority == 0) {
            listAntrian.sisipDiAkhir(no, nama, alamat);
            idxAkhir++;
        } else {
            listAntrian.sisipDiAwal(no, nama, alamat);
            idxAkhir++;
        }
    }
    // function mengambil data pada queue
    public void dequeue() {
        idxAkhir--;
        listAntrian.hapusDrDepan();
    }
    // function pengecekan apakah queue kosong
    public boolean kosong() {
        return listAntrian.kosong();
    }
    
    public Object[] getByIndex(int index) {
        return listAntrian.ambilData(index);
    }
    // procedure mencetak data pada queue
    public void cetak() {
        listAntrian.cetak();
    }

    void cetak(String no, String nama, String alamat, boolean kondisi) {
        listAntrian.cetak();
        //System.out.print(no+". "+nama+","+alamat+"\n");
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}