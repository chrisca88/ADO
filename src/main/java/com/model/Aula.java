package main.java.com.model;


public class Aula {

    private int numero;
    private int capacidadMaxima;

    /**
     * Default constructor
     */
    public Aula(int numero, int capacidadMaxima) {
        this.numero = numero;
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "numero=" + numero +
                ", capacidadMaxima=" + capacidadMaxima +
                '}';
    }
}