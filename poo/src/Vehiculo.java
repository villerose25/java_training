public class Vehiculo {

    // Atributos
    // cadena de caracteres, y es una clase.
    private String color;
    private String tipoDeCoche;
    private String tipoDeTransmision;
    private String modelo;
    private int anio;
    private String vin;
    private String tipoMotor;
    private byte velocidadMaxima;

    // Constructor
    // parametros
    public Vehiculo() {
        System.out.println("Constructor general");
    }

    public Vehiculo(String vin) {
        System.out.println("Constructor con vin");
        this.vin = vin;
    }

    public Vehiculo(String vin, String color) {
        System.out.println("Constructor con vin y color");
        this.vin = vin;
        this.color = color;
    }

    public String getTipoDeCoche() {
        return tipoDeCoche;
    }

    public void setTipoDeCoche(String tipoDeCoche) {
        this.tipoDeCoche = tipoDeCoche;
    }

    public String getTipoDeTransmision() {
        return tipoDeTransmision;
    }

    public void setTipoDeTransmision(String tipoDeTransmision) {
        this.tipoDeTransmision = tipoDeTransmision;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVin(int algo) {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public byte getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(byte velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

   // getters y setters:  Get y Set
    // Métodos para obtener y establecer información
    // get= obtener/leer
    public String getColor() { // dame el color del coche
        return color;
    }

    public void setColor(String color) { // guarda el color del coche
        this.color = color;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

   public void avanzar() {
       System.out.println("Estoy avanzando...");
   }

   public void frenar() {
       System.out.println("Frenando...");
   }

   public void girar() {
       System.out.println("Gira");
   }

   public void arrancar(String nombreCoche) {
       System.out.println(nombreCoche + " Arrancando...");
   }

   public void nombre(String tipo) {
        if(tipo == "Auto Deportivo") {
            System.out.println("Es un auto deportivo");
        } else {
            System.out.println("Es solo un auto");
        }
   }
}
