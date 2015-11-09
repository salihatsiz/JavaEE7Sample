/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.teias.egitim.adresdefteri.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author salih
 */
@Entity
public class Adres implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TCKN",length = 11,unique = true,nullable = false)
    @NotNull @Size(min = 11,max = 11)
    private String tckn;
    
    @Column(name = "AD")
    @NotNull
    private String ad;
    
    @Column(name = "SOYAD")
    @NotNull
    private String soyad;
    
    @Column(name = "MOBIL")
    @NotNull
    private String mobil;
    
    @Column(name = "TEL")
    @NotNull
    private String tel;
    
    @Column(name = "EMAIL")
    @NotNull
    private String email;
    
    @Column(name = "ADRES")
    @NotNull
    private String adres;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTckn() {
        return tckn;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getMobil() {
        return mobil;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getAdres() {
        return adres;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adres)) {
            return false;
        }
        Adres other = (Adres) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.gov.teias.egitim.adresdefteri.entities.Adres[ id=" + id + " ]";
    }
    
}
