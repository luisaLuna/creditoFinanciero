package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Solicitante {
    private String nombre, sexo, domicilio, curp;
    private boolean comprobanteDomicilio, identificacionOficial;
    private LocalDate fechaNac;
    private int edad;


    //Métodos para capturar los datos del solicitante del crédito
    public String capturarNombre(){
        Scanner scn = new Scanner(System.in); //Creación del lector de valores del input
        System.out.print("Por favor escribe los datos del solicitante del crédito. \n"); //Mensaje al usuario para que introduzca los datos
        System.out.print("Nombre completo: "); //Mensaje al usuario para que introduzca los datos
        return nombre = scn.nextLine(); //Se guarda lo que se introdujo en la variable "nombre" y ésta se retorna
    }

    public void capturarFechaNac(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Por favor ingresa la fecha de nacimiento con el formato Año-Mes-Día, ejemplo: 1999-08-16 \n Fecha de Nacimiento: ");
        String res = scn.nextLine();
         fechaNac = LocalDate.parse(res);
    }

    public String capturarSexo(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Sexo: ");
        return sexo = scn.nextLine();
    }

    public String capturarDomicilio(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Domicilio: ");
        return domicilio = scn.nextLine();
    }

    public String capturarCurp(){
        Scanner scn = new Scanner(System.in);
        System.out.print("¿Cuenta con CURP? Si la respuesta es SI, por favor ingreselo a continuación\n");
        System.out.print("Curp: ");
        return curp = scn.nextLine();
    }

    public boolean capturarComprobanteDomicilio(){
        Scanner scn = new Scanner(System.in); //Creación del lector de valores del input
        System.out.print("¿Cuenta con comprobante de domicilio? \n  Por favor escribe la letra S o N: ");
        String res = scn.nextLine(); //Guarda lo que el usuario ingreso en la variable res
        String resLower = res.toLowerCase(); //Convierte el string a minusculas
        comprobanteDomicilio = resLower.contains("s"); //Guardará true si usuario cuenta con la identificación, de lo contrario será false
        return comprobanteDomicilio; //Retorna true o false
    }

    public boolean capturarIdentificacionOficial(){
        Scanner scn = new Scanner(System.in);
        System.out.print("¿Cuenta con identificación Oficial? \n  Por favor escribe la letra S o N: ");
        String res = scn.nextLine();
        String resLower = res.toLowerCase();
        identificacionOficial = resLower.contains("s");
        return identificacionOficial;
    }

    //Método para calcular edad usando el API LocalDate
    public void calcularEdad() {
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
       edad = periodo.getYears();
    }
    public int getEdad() {
        return edad;
    }
}