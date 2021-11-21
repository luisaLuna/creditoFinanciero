package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Credito credito = new Credito("Crédito para personas de 30 años:" , 4500);
        System.out.println(credito.capturarNomEmpleado());
        LocalDate fechaNac = LocalDate.of(1984, 1, 27);
        Solicitante solicitante = new Solicitante("Juan Perez", "Masculino", "Ciudad de México", "JUANPE27011984", true, true, fechaNac);
        System.out.println(solicitante.calcularEdad());
    }
}
