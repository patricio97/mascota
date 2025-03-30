package com.mascota.mascota.model;

public class UsuarioMascota {
    //perfil mascota
    private int id;
    private String nombreUsu;
    private String nombreMasc;
    // perfil conductor
    private int idconductor;
    private String nombreConductor;



    public UsuarioMascota(int id, String nombreUsu, String nombreMasc, int idconductor, String nombreConductor){
        this.id = id;
        this.nombreUsu = nombreUsu;
        this.nombreMasc = nombreMasc;
        this.idconductor = idconductor;
        this.nombreConductor = nombreConductor;
    }

    public int getId(){
        return id;
    }
    
    public String getnombreUsu(){
        return nombreUsu;
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