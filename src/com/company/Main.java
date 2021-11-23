package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Solicitante solicitante = new Solicitante();
        Credito credito = new Credito(solicitante);
        credito.capturarNomEmpleado();
        solicitante.capturarNombre();
        solicitante.capturarFechaNac();
        solicitante.capturarSexo();
        solicitante.capturarDomicilio();
        solicitante.capturarCurp();
        solicitante.calcularEdad();
        System.out.println(credito.calcularCredito());
        System.out.println(credito.calcularFechas());
    }
}
