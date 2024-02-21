// heredar de una clase se utiliza la palabra extends
public class AutoDeportivo extends Vehiculo{
    private String nombreAtributo;
    public AutoDeportivo(String nombre) {
        this.nombreAtributo = nombre;
    }
    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    private boolean turbo;

    public void nombre() {
        System.out.println(nombreAtributo);
    }

    public void arrancar() {
        System.out.println("Arranco en el suelo...");
    }
}
