package AppPackage;
//Kelompok Queue
public class List {
    // atribut data
    public Node nodeAwal;
    public Node nodeAkhir;
    public List() {
        nodeAwal = nodeAkhir = null;
    }

    // procedure menyisipkan data di awal SLL
    public void sisipDiAwal(int no, String nama, String alamat) {
        if (kosong()) {
            nodeAwal = nodeAkhir = new Node(no, nama, alamat);
        } else {
            nodeAwal = new Node(no, nama, alamat, nodeAwal);
        }
    }
    // procedure menyisipkan data di akhir SLL
    public void sisipDiAkhir(int no, String nama, String alamat) {
        if (kosong()) {
            nodeAwal = nodeAkhir = new Node(no, nama, alamat);
        } else {
            nodeAkhir = nodeAkhir.next = new Node(no, nama, alamat);
        }
    }
    // function menghapus data dari depan
    public void hapusDrDepan() {
        if (!kosong()) {
            if (nodeAwal == nodeAkhir) {
                nodeAwal = nodeAkhir = null;
            } else {
                nodeAwal = nodeAwal.next;
            }
        }
    }
    // function pengecekan apakah SLL kosong
    public boolean kosong() {
        return nodeAwal == null;
    }
    
    public Object[] ambilData(int index) {
        int idx = 0;
        Object[] hasil = new Object[3];
        Node kini = nodeAwal;
        while (kini != null) {
            hasil[0] = kini.nmrAntrian;
            hasil[1] = kini.nama;
            hasil[2] = kini.alamat;
            
            if(idx==index) {
                break;
            }
            else {
                hasil[0] = null;
                hasil[1] = null;
                hasil[2] = null;
            }
            idx++;
            kini = kini.next;
        }
        return hasil;
    }
    void cetak() {
        if (kosong()) {
            System.out.printf(" Antrian kosong \n");
            return;
        }
        System.out.printf("Urutan Antrian : ");
        Node kini = nodeAwal;
        while (kini != null) {
            System.out.printf("%d, %s, %s", kini.nmrAntrian, kini.nama, kini.alamat);
            kini = kini.next;
        System.out.println("");
        }
       
    }
}
