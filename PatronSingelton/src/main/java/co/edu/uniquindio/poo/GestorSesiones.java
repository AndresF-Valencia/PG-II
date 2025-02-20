package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class GestorSesiones {
    private LinkedList<SesionReproduccion> sesiones;

    public GestorSesiones() {
        this.sesiones = new LinkedList<>();
    }

    public void crearSesion(String usuario) {
        SesionReproduccion sesion = new SesionReproduccion(usuario);
        sesiones.add(sesion);
        sesion.iniciar();
    }

    public void listarSesiones() {
        System.out.print("Sesiones activas: [");
        for (int i = 0; i < sesiones.size(); i++) {
            System.out.print(sesiones.get(i).usuario);
            if (i < sesiones.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

