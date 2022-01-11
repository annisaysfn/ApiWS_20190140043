/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.datakaryawan.pws;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@CrossOrigin
@RestController
@RequestMapping("/datakaryawan")

public class KaryawanController {
@Autowired
private KaryawanRepo karyawan;

@GetMapping("/karyawan")
public List<Karyawan> getAllKaryawan(){
    return karyawan.findAll();
}

@GetMapping ("/karyawan/{idproduct}")
public Karyawan getKaryawanById(@PathVariable String idproduct){
    return karyawan.findById(idproduct).get();
}

@PostMapping ("/karyawan")
public Karyawan saveKaryawanDetails(@RequestBody Karyawan krywn){
    return karyawan.save(krywn);
}

@PutMapping("/karyawan")
public Karyawan updateKaryawan(@RequestBody Karyawan krywn){
    return karyawan.save(krywn);
}

@DeleteMapping("/karyawan/{idproduct}")
public ResponseEntity<HttpStatus> deleteKaryawanById(@PathVariable String idproduct){
    karyawan.deleteById(idproduct);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
}
