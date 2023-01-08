package gramaticas;

public class Tripleta {

    private String accion;
    private String parametro1;
    private String parametro2;

    public Tripleta(String accion, String parametro1, String parametro2) {
        this.accion = accion;
        this.parametro1 = parametro1;
        this.parametro2 = parametro2;
    }

    public Tripleta(String accion, String parametro1) {
        this.accion = accion;
        this.parametro1 = parametro1;
        this.parametro2 = "";
    }

    public Tripleta(String accion) {
        this.accion = accion;
        this.parametro1 = "";
        this.parametro2 = "";
    }

    public String getAccion() {
        return accion;
    }

    public String getParametro1() {
        return parametro1;
    }

    public String getParametro2() {
        return parametro2;
    }
}
