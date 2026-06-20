package com.example.git.model;

public class perritos {
    private String nombre;
    private int edad;
    private String raza;

    public perritos(String nombre, int edad, String raza) {
        setNombre(nombre);
        setEdad(edad);
        setRaza(raza);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
