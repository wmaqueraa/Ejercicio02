package org.example;

import org.example.implementacion.EXCELGenerator;
import org.example.implementacion.PDFGenerator;
import org.example.interfaces.IGeneradorReporte;
import org.example.servicios.ReporteService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IGeneradorReporte pdf = new PDFGenerator();
        ReporteService servicioPdf = new ReporteService(pdf);

        IGeneradorReporte excel = new EXCELGenerator();
        ReporteService servicioExcel = new ReporteService(excel);
        servicioExcel.generar();
    }
}