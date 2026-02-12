package org.example.servicios;

import org.example.interfaces.IGeneradorReporte;

public class ReporteService {

    private IGeneradorReporte generador;

    // Inyección por constructor
    public ReporteService(IGeneradorReporte generador) {
        this.generador = generador;
    }

    public void generar() {
        generador.crear();
    }
}
