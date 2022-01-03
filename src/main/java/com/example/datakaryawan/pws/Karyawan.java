/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.datakaryawan.pws;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "karyawan")
@NamedQueries({
    @NamedQuery(name = "Karyawan.findAll", query = "SELECT k FROM Karyawan k"),
    @NamedQuery(name = "Karyawan.findByNik", query = "SELECT k FROM Karyawan k WHERE k.nik = :nik"),
    @NamedQuery(name = "Karyawan.findByNama", query = "SELECT k FROM Karyawan k WHERE k.nama = :nama"),
    @NamedQuery(name = "Karyawan.findByJenisKelamin", query = "SELECT k FROM Karyawan k WHERE k.jenisKelamin = :jenisKelamin"),
    @NamedQuery(name = "Karyawan.findByAlamat", query = "SELECT k FROM Karyawan k WHERE k.alamat = :alamat"),
    @NamedQuery(name = "Karyawan.findByDivisi", query = "SELECT k FROM Karyawan k WHERE k.divisi = :divisi")})
public class Karyawan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nik")
    private Integer nik;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "divisi")
    private String divisi;

    public Karyawan() {
    }

    public Karyawan(Integer nik) {
        this.nik = nik;
    }

    public Karyawan(Integer nik, String nama, String jenisKelamin, String alamat, String divisi) {
        this.nik = nik;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.divisi = divisi;
    }

    public Integer getNik() {
        return nik;
    }

    public void setNik(Integer nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nik != null ? nik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Karyawan)) {
            return false;
        }
        Karyawan other = (Karyawan) object;
        if ((this.nik == null && other.nik != null) || (this.nik != null && !this.nik.equals(other.nik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.datakaryawan.pws.Karyawan[ nik=" + nik + " ]";
    }
    
}
