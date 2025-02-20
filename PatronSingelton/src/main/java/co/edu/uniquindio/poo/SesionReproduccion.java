package co.edu.uniquindio.poo;

public class SesionReproduccion{
    public String usuario;
    private ConfiguracionSistema configuracion;

    public SesionReproduccion(String usuario) {
        this.usuario = usuario;
        this.configuracion = ConfiguracionSistema.getInstancia();
    }

    public void iniciar() {
        System.out.println("Sesión de " + usuario + " iniciada con configuración: " + configuracion.getConfiguracion());
    }
}
