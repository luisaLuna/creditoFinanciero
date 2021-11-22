package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Solicitante solicitante = new Solicitante();
        Credito credito = new Credito("Crédito para personas de 30 años:", solicitante);
        System.out.println(credito.capturarNomEmpleado());
         solicitante.capturarFechaNac();
         solicitante.calcularEdad();
        System.out.println(credito.calcularCredito());
    }
}
