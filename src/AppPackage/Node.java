package AppPackage;
//Kelompok Queue
public class Node {
    // atribut data
    Object data;
    int nmrAntrian;
    String nama;
    String alamat;
    Node next;
    // constructor node
    Node(int nomor, String nama, String alamat) {
        this(nomor, nama, alamat, null);
    }
    // constructor node
    Node(int nomor, String nama, String alamat, Node node) {
        this.nmrAntrian = nomor;
        this.nama = nama;
        this.alamat = alamat;
        next = node;
    }
    // function getter data
    Object getObject() {
        return data;
    }
    // function getter pointer next
    Node getNext() {
        return next;
    }
}    
