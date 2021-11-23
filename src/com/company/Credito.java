package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Credito {
    private final Solicitante solicitante;
    private String nomEmpleado, productoFinanciero;
    private LocalDate fechaSolicitud, fechasPagos;

    public Credito(String productoFinanciero, Solicitante cliente) {
        this.productoFinanciero = productoFinanciero;
        this.solicitante = cliente;
    }

    public String capturarNomEmpleado() {
        System.out.print("Por favor escribe el nombre de la persona capturando los datos: ");
        Scanner scn = new Scanner(System.in); //System.in is a standard input stream
       return nomEmpleado = scn.nextLine(); //reads string
    }

    //Métodos para verificar si cuenta con los documentos completos
    public boolean verificarCurp() {
        return !solicitante.getCurp().isEmpty(); //Lógica para comprobar si tiene CURP
    }
    public boolean verificarDocu() {
        //Lógica para comprobar si tiene todos los documentos completos
        return solicitante.capturarComprobanteDomicilio() && solicitante.capturarIdentificacionOficial() && verificarCurp();
    }

    //Métodos para asignar la cantidad del crédito dependiendo de la edad
    public String calcularCredito() {
        if (verificarDocu()) {
            return switch (solicitante.getEdad()) {
                case 30, 31, 32, 33, 34, 35 -> "$4,500 (cuatro mil quinientos pesos)";
                case 36, 37, 38, 39, 40 -> "$5,000 (cinco mil pesos)";
                case 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 -> "$5,500 (cinco mil quinientos pesos)";
                default -> "Lamento informarle %s que no cuenta con la edad requerida para poder obtener un crédito".formatted(solicitante.getNombre());
            };
        } else return "Lamento informarle %s que no se le puede otorgar el crédito ya que no cuenta con los documentos necesarios".formatted(solicitante.getNombre());
    }

}