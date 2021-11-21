package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Credito {
    private String nomEmpleado, productoFinanciero;
    private int monto;
    private LocalDate fechaSolicitud, fechasPagos;

    public Credito(String productoFinanciero, int monto) {
        this.productoFinanciero = productoFinanciero;
        this.monto = monto;
    }

    public String capturarNomEmpleado() {
        System.out.print("Por favor escribe el nombre de la persona capturando los datos: ");
        Scanner scn = new Scanner(System.in); //System.in is a standard input stream
       return nomEmpleado = scn.nextLine(); //reads string
    }



}