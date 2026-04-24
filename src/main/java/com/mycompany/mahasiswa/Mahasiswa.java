/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mahasiswa;

/**
 *
 * @author HP
 */
public class Mahasiswa {

    private String nama;
    private int nilai;

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    // Method untuk cek kelulusan
    public boolean isLulus() {
        return nilai >= 60;
    }
}
