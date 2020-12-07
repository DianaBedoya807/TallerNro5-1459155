package com.capacitacion.excepciones.excepciones;

import java.io.FileNotFoundException;

public class Excepciones extends Exception {
    String causa;
    String tipoFalla;

    public Excepciones(Exception tipoFalla, String causa) {
        super(tipoFalla);
        this.causa = causa;
    }
}
