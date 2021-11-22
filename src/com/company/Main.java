package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Credito credito = new Credito("Crédito para personas de 30 años:" , 4500);
        System.out.println(credito.capturarNomEmpleado());
         Solicitante solicitante = new Solicitante();
         solicitante.capturarFechaNac();
         solicitante.calcularEdad();
        System.out.println(credito.calcularCredito());
    }
}
