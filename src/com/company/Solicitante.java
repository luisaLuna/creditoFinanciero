package com.company;

import java.time.LocalDate;
import java.time.Period;

public class Solicitante {
    private String nombre, sexo, domicilio, curp;
    private boolean comprobanteDomicilio, identificacionOficial;
    private LocalDate fechaNac;

    public Solicitante(String nombre, String sexo, String domicilio, String curp, boolean comprobanteDomicilio, boolean identificacionOficial, LocalDate fechaNac) {
        this.nombre = nombre;
        this.sexo =  sexo;
        this.domicilio =  domicilio;
        this.curp  =  curp;
        this.comprobanteDomicilio = comprobanteDomicilio;
        this.identificacionOficial = identificacionOficial;
        this.fechaNac = fechaNac;
    }

    public int calcularEdad() {
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        return periodo.getYears();
    }

}
