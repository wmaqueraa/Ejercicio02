package org.example.implementacion;

import org.example.interfaces.IGeneradorReporte;

public class EXCELGenerator implements IGeneradorReporte {

    @Override
    public void crear() {
        System.out.println("Generando reporte en EXCEL...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo EXCEL en Multifuncional XEROX...");
    }

    @Override
    public void firmar() {
        System.out.println("Firmando reporte en EXCEL...");
    }

    @Override
    public void comprimir() {
        System.out.println("Comprimiendo  reporte EXCEL en un archivo RAR");
    }
}
