package org.example.implementacion;

import org.example.interfaces.IGeneradorReporte;

public class IMAGENGenerator implements IGeneradorReporte {


    @Override
    public void crear() {
        System.out.println("Generando reporte en IMAGEN...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo IMAGEN en Multifuncional XEROX...");
    }

    @Override
    public void firmar() {
        System.out.println("Firmando reporte en IMAGEN...");
    }

    @Override
    public void comprimir() {
        System.out.println("Comprimiendo  reporte IMAGEN en un archivo RAR");
    }
}
