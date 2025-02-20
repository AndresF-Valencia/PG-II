package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        config.setConfiguracion("720p", 3, true);

        ServidorStreaming servidor1 = new ServidorStreaming("Servidor 1");
        servidor1.ajustarCalidad();

        GestorSesiones gestor = new GestorSesiones();
        gestor.crearSesion("Usuario 1");
        gestor.crearSesion("Usuario 2");
        gestor.listarSesiones();

        // Cambiando configuración en tiempo real
        ConfiguracionSistema tiempoReal = ConfiguracionSistema.getInstancia();
        tiempoReal.setConfiguracion("480p", 2, true);
        System.out.println("\nConfiguración actualizada\n");
        servidor1.ajustarCalidad();
        gestor.crearSesion("Usuario 3");
    }
}