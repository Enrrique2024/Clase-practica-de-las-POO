abstract class Empleado {
    
    //Declaramos a privado para que solo tenga acceso el admin 
    private String nombre;
    private String numeroIdentificacion; 

    //Constructor
    public Empleado(String nombre, String numeroIdentificacion){
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;

        //Getters
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    // método abstracto 
    public abstract double calcularSalario();
}
