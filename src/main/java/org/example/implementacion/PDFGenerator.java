package org.example.implementacion;

import org.example.interfaces.IGeneradorReporte;

public class PDFGenerator implements IGeneradorReporte {
    @Override
    public void crear() {
        System.out.println("Generando reporte en PDF...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo PDF en Multifuncional XEROX...");
    }

    @Override
    public void firmar() {
        System.out.println("Firmando reporte en PDF...");
    }

    @Override
    public void comprimir() {
        System.out.println("Comprimiendo  reporte PDF en un archivo RAR");
    }
}
