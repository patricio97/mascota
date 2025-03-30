package com.mascota.mascota.model;

public class UsuarioMascota {
    //perfil mascota
    private int id;
    private String username;
    private String nombreMasc;
    // perfil conductor
    private int idconductor;
    private String nombreConductor;



    public UsuarioMascota(int id, String username, String nombreMasc, int idconductor, String nombreConductor){
        this.id = id;
        this.username = username;
        this.nombreMasc = nombreMasc;
        this.idconductor = idconductor;
        this.nombreConductor = nombreConductor;
    }

    public int getId(){
        return id;
    }
    
    public String getusername(){
        return username;
    }

    public String getnombreMasc(){
        return nombreMasc;
    }

    public int getidconductor() {
        return idconductor;
    }

    public String getnombreConductor() {
        return nombreConductor;
    }


}