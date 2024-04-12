package modelo;

import java.util.ArrayList;

public class Sector {
    private int numero;
    private Empleado encargado;
    private int capacidad;
    private double latitud;
    private double longitud;
    private ArrayList<Animal> animales;
    private TipoSector tipo;

    public Sector(int numero, Empleado encargado, int capacidad, double latitud, double longitud, TipoSector tipo) {
        this.numero = numero;
        this.encargado = encargado;
        this.capacidad = capacidad;
        this.latitud = latitud;
        this.longitud = longitud;
        this.animales = new ArrayList<>();
        this.tipo = tipo;
    }

    public Sector() {}
    
    // Metodos
    public void agregarAnimales(Animal animales[]) {
        for(Animal animal: animales){
            this.animales.add(animal);
        }  
    }
    
    public void agregarAnimal(Animal animal){
        this.animales.add(animal);
    }
    
    // Setters ///////////////////////////////////
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    public void setAnimales(ArrayList animales) {
        this.animales = animales;
    }
    
    public void setTipo(TipoSector tipo){
        this.tipo = tipo;
    }
    
    // Getters
    public int getNumero() {
        return numero;
    }
    
    public Empleado getEncargado() {
        return encargado;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }
    
    public ArrayList getAnimales() {
        return animales;
    }
    
    public TipoSector getTipo(){
        return tipo;
    }
}
