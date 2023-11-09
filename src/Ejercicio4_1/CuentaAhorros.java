package Ejercicio4_1;

public class CuentaAhorros {
    private boolean activa;
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo,tasa);
        if (saldo < 10000)
            activa = false;
        else
            activa = true;
    }
    public void retirar(float cantidad) {
        if (activa)
    }
    public void consignar(float cantidad) {
        if (activa)
    }
    public void extractoMensual() {
        if (númeroRetiros > 4) {
            comisiónMensual += (númeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        if ( saldo < 10000 )
            activa = false;
    }
    /**
     * Método que muestra en pantalla los datos de una cuenta de
     ahorros
     */
    public void imprimir() {
        System.out.println(“Saldo = $ “ + saldo);
        System.out.println(“Comisión mensual = $ “ +
                comisiónMensual);
        System.out.println(“Número de transacciones = “ +
                (númeroConsignaciones + númeroRetiros));
        System.out.println();
    }
}
Clase: CuentaCorriente
/**
 * Esta clase denominada CuentaCorriente mod
}
