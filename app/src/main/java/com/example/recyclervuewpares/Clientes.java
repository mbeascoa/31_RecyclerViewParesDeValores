package com.example.recyclervuewpares;


public class Clientes {

    private String mNombre;
    private String mAge;


    public Clientes() {
    }
    public Clientes(String mNombre, String mAge) {
        this.mNombre = mNombre;
        this.mAge = mAge;
    }

    public String getNombre() {
        return this.mNombre;
    }

    public void setNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    public String getAge() {
        return this.mAge;
    }

    public void setAge(String mAge) {
        this.mAge = mAge;
    }
}