package org.example.implementacion;

import org.example.interfaces.IGeneradorReporte;

public class WORDGenerator implements IGeneradorReporte {
    @Override
    public void crear() {
        System.out.println("Generando reporte en WORD...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo WORD en Multifuncional XEROX...");
    }

    @Override
    public void firmar() {
        System.out.println("Firmando reporte en WORD...");
    }

    @Override
    public void comprimir() {
        System.out.println("Comprimiendo  reporte WORD en un archivo RAR");
    }
}
