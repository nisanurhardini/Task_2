/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author nisanurhardini
 */
public class Mahasiswa {
    private String NIM;
    private String nama;
    private String status;
    private char[] nilai;
    private int i;

    public Mahasiswa(){
    this.status = "Tidak Lulus";
    this.i = 0;
    this.nilai = new char[10];
}

    public Mahasiswa(String NIM, String nama){
        this.NIM = NIM;
        this.nama = nama;
        this.status = "Tidak Lulus";
        this.i = 0;
        this.nilai = new char[10];
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public char getNilai(int i) {
        char nil = this.nilai[i];
        return nil;
    }

    public void setNilai(char[] nilai) {
        this.nilai = nilai;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void addNilai(char nilai){
        if (i < 10) {
            this.nilai[i] = nilai;
            i++;
        }
    }

    public String toString() {
        String mhs = NIM+", "+nama+", "+status+" = ";
        for (int j = 0; j < i; j++) {
            mhs = mhs + nilai[j] + ", ";
        }
        return mhs;
    }

    public char cekNilai (Mahasiswa m){
        char x = 0;
        for (char l = 'A'; l < 'E'; l++){
            for (int k = 0; k < i; k++) {
                if (nilai[k] == l){
                    for (int n = 0; n < m.i; n++){
                        if (m.nilai[n] == l){
                            return l;
                        }
                    }
                }
            }
        }
        return x;
    }
}
