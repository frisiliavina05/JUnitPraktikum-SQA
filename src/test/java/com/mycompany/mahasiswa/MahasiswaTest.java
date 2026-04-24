/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mahasiswa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */

public class MahasiswaTest {

    // Test nilai LULUS

    @Test
    void testNilaiLulus100() {
        Mahasiswa m = new Mahasiswa("Rina", 100);
        assertTrue(m.isLulus());
    }

    @Test
    void testNilaiLulus65() {
        Mahasiswa m = new Mahasiswa("Rini", 65);
        assertTrue(m.isLulus());
    }

    @Test
    void tesNilaitLulus60() {
        Mahasiswa m = new Mahasiswa("Tina", 60);
        assertTrue(m.isLulus());
    }

    // Test nilai TIDAK LULUS

    @Test
    void testNilaiTidakLulus59() {
        Mahasiswa m = new Mahasiswa("Siska", 59);
        assertFalse(m.isLulus());
    }

    @Test
    void testNilaiTidakLulus40() {
        Mahasiswa m = new Mahasiswa("Joko", 40);
        assertFalse(m.isLulus());
    }

    @Test
    void testNilaiTidakLulus0() {
        Mahasiswa m = new Mahasiswa("Lina", 0);
        assertFalse(m.isLulus());
    }
}
