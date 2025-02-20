package co.edu.uniquindio.poo;

public class ServidorStreaming {
    private String nombre;
    private ConfiguracionSistema configuracion;

    public ServidorStreaming(String nombre) {
        this.nombre = nombre;
        this.configuracion = ConfiguracionSistema.getInstancia();
    }

    public void ajustarCalidad() {
        System.out.println("[" + nombre + "] Ajustando calidad a " + configuracion.getConfiguracion());
    }
}
