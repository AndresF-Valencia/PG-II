package co.edu.uniquindio.poo;

public class ConfiguracionSistema {
    private static ConfiguracionSistema instacia;
    private String resolucion;
    private int anchoDeBanda;
    private Boolean modoAhorro;

    private ConfiguracionSistema() {
        this.resolucion= "420p";
        this.anchoDeBanda = 12;
        this.modoAhorro = false;
    }
    public static ConfiguracionSistema getInstancia() {
        if (instacia == null) {
            instacia = new ConfiguracionSistema();
        }
        return instacia;
    }
    public void setConfiguracion(String resolucion, int anchoDeBanda, boolean modoAhorro) {
        this.resolucion = resolucion;
        this.anchoDeBanda = anchoDeBanda;
        this.modoAhorro = modoAhorro;
    }
    public String getConfiguracion() {
        return "Resolución: " + resolucion + ", Ancho de Banda: " + anchoDeBanda + " Mbps, Modo Ahorro: " + modoAhorro;
    }

}
