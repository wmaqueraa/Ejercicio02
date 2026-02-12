package org.example.implementacion;

import org.example.interfaces.IGeneradorReporte;

public class PDFGenerator implements IGeneradorReporte {
    @Override
    public void crear() {
        System.out.println("Generando reporte en PDF...");
    }
}
