package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Credito {
    private final Solicitante solicitante;
    private LocalDate fechaSolicitud;

    public Credito(Solicitante cliente) {
        this.solicitante = cliente;
    }

    public void capturarNomEmpleado() {
        System.out.print("Por favor escribe el nombre de la persona capturando los datos: ");
        Scanner scn = new Scanner(System.in); //Creación del lector de valores del input
        String nomEmpleado = scn.nextLine();  //Lee string y la guarda en la variable "nomEmpleado"
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
                case 30, 31, 32, 33, 34, 35 -> "%s es acreedor a un crédito con un monto de $4,500 (cuatro mil quinientos pesos)".formatted(solicitante.getNombre());
                case 36, 37, 38, 39, 40 -> "%s es acreedor a un crédito con un monto de $5,000 (cinco mil pesos)".formatted(solicitante.getNombre());
                case 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 -> "%s es acreedor a un crédito con un monto de $5,500 (cinco mil quinientos pesos)".formatted(solicitante.getNombre());
                case 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64 -> "%s es acreedor a un crédito con un monto de $7,000 (siete mil pesos)".formatted(solicitante.getNombre());
                default -> "Lamento informarle %s que no cuenta con la edad requerida para poder obtener un crédito".formatted(solicitante.getNombre());
            };
        } else return "Lamento informarle %s que no se le puede otorgar el crédito ya que no cuenta con los documentos necesarios".formatted(solicitante.getNombre());
    }

    //Método para calcular fechas de pagos
    public String calcularFechas() {
        fechaSolicitud = LocalDate.now();
        LocalDate primerPago = fechaSolicitud.plusMonths(3).withDayOfMonth(fechaSolicitud.getDayOfMonth());
        LocalDate segundoPago = fechaSolicitud.plusMonths(6).withDayOfMonth(fechaSolicitud.getDayOfMonth());
        LocalDate tercerPago = fechaSolicitud.plusMonths(9).withDayOfMonth(fechaSolicitud.getDayOfMonth());
        LocalDate cuartoPago = fechaSolicitud.plusMonths(12).withDayOfMonth(fechaSolicitud.getDayOfMonth());
            return "Las fechas de sus pagos son:\n" +
                    "1 Pago: " + primerPago.getDayOfMonth() + "/" + primerPago.getMonth() + "/" + primerPago.getYear() + "\n" +
                    "2 Pago: " + segundoPago.getDayOfMonth() + "/" + segundoPago.getMonth() + "/" + segundoPago.getYear() + "\n" +
                    "3 Pago: " + tercerPago.getDayOfMonth() + "/" + tercerPago.getMonth() + "/" + tercerPago.getYear() + "\n" +
                    "4 Pago: " + cuartoPago.getDayOfMonth() + "/" + cuartoPago.getMonth() + "/" + cuartoPago.getYear() + "\n" +
                    "**** IGNORA ESTE MENSAJE SI NO TIENES UN CRÉDITO OTORGADO ****";
    }

}