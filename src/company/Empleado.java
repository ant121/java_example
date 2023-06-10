package company;

public class Empleado {
    String nombre;
    String cedula;
    Integer edad;
    Boolean casado;
    Double salario;

    public Empleado() {}

    // Constructor de la clase Empleado
    public Empleado(String nombre, String cedula, Integer edad, Boolean casado, Double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    // Método toString() para mostrar los datos del empleado
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\n" +
                "Cedula: " + this.cedula + "\n" +
                "Edad: " + this.edad + "\n" +
                "Casado: " + this.casado + "\n" +
                "Salario: " + this.salario + "\n" +
                "Nivel: " + this.obtenerNivel() + "\n";
    }

    // Método para obtener el nivel del empleado basado en su edad
    public String obtenerNivel() {
        if (this.edad <=21 ){
            return "Principiante";
        } else if (this.edad >=22 && this.edad <=35) {
            return "Intermedio";
        } else {
            return "Senior";
        }
    }

    // Método para aumentar el salario del empleado en un porcentaje dado
    public void aumentarSalario(Integer porcentaje) {
        this.salario = this.salario + (this.salario * porcentaje / 100);
    }

    // Métodos getter y setter para los atributos de la clase Empleado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        // Validar que la edad esté dentro del rango permitido
        if(edad < 18 || edad > 45) throw new IllegalArgumentException("La edad debe estar en el rango de 18 a 45");

        this.edad = edad;
    }

    public Boolean getCasado() {
        return casado;
    }

    public void setCasado(Boolean casado) {
        this.casado = casado;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}