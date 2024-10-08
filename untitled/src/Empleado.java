import javax.swing.JTextArea;

public abstract class Empleado {
    private int id;
    private String nombre;
    private int edad;
    private String sexo;
    private String fechaContratacion;
    private Departamento departamento;

    public Empleado(int id, String nombre, int edad, String sexo, String fechaContratacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaContratacion = fechaContratacion;
    }

    public void asignarDepartamento(Departamento departamento) {
        this.departamento = departamento;
        departamento.agregarEmpleado(this);
    }

    public abstract void mostrarDetalles();

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    protected abstract void mostrarDetalles(JTextArea displayArea);

    protected abstract String getId();

    protected abstract void setNombre(String nuevoNombre);

    // Otros getters y setters

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}