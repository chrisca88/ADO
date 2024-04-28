package main.java.com.model;


public class MercadoPago implements IMetodoDePago {

    /**
     * Default constructor
     */
    public MercadoPago() {
    }

    /**
     * @param cuota
     */
    public void pagarCuota(Cuota cuota) {
        System.out.println("Se abono: "+cuota+" de la cuota mensual");

    }

}