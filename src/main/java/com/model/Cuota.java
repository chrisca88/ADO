package main.java.com.model;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Cuota {

    private int numero;
    private float monto;

    /**
     * Default constructor
     */
    public Cuota(int numero, float monto) {
        this.numero = numero;
        this.monto = monto;
    }


    @Override
    public String toString() {
        return
                "$ " + monto;
    }
}