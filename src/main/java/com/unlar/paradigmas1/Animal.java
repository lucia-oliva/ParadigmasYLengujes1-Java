package com.unlar.paradigmas1;

public class Animal {
 
   
    protected String raza;
    protected int peso;
    protected String dueño;
    protected String nombre;

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
    public Integer getPeso() {
        return peso;
    }
    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño= dueño;
    }

    
    public Animal(String nombre, String raza, int peso, String dueño) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.dueño = dueño;
    }

    public void mostrarDatos(){
        System.out.println("\nNombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Peso " + peso + " kilos");
        System.out.println("Nombre del dueño: " + dueño);
    }

}
