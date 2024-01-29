/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private boolean sexo;
    private String foto;
    private String colegio;
    private String universidad;
    private String trabactual;
    private String referente;

    public Persona(String nombre, String apellido, boolean sexo, String foto, String colegio, String universidad, String trabactual, String referente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.foto = foto;
        this.colegio = colegio;
        this.universidad = universidad;
        this.trabactual = trabactual;
        this.referente = referente;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getTrabactual() {
        return trabactual;
    }

    public void setTrabactual(String trabactual) {
        this.trabactual = trabactual;
    }

    public String getReferente() {
        return referente;
    }

    public void setReferente(String referente) {
        this.referente = referente;
    }
    
    
}
