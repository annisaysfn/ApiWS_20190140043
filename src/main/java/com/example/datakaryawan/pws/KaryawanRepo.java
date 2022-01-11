/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.datakaryawan.pws;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user
 */
public interface KaryawanRepo extends JpaRepository<Karyawan,String> {
    
}
