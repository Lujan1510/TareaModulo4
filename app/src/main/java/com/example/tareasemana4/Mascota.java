package com.example.tareasemana4;

public class Mascota {
    private int foto;
    private String nombreMascota;
    private String likes;

    public Mascota(int foto, String nombreMascota, String likes) {
        this.foto = foto;
        this.nombreMascota = nombreMascota;
        this.likes = likes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
