package company;

public class Programador extends Empleado {
    Integer lineasDeCodigoPorHora;
    String lenguajeDominante;

    public Programador() {}

    // Constructor de la clase Programador
    public Programador(String nombre, String cedula, Integer edad, Boolean casado, Double salario, Integer lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, cedula, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    // Método toString() para mostrar los datos del programador
    @Override
    public String toString(){
        return super.toString() +
                "Lineas de codigo por hora: " + this.lineasDeCodigoPorHora + "\n" +
                "Lenguaje dominante: " + this.lenguajeDominante;
    }

    // Métodos getter y setter para los atributos adicionales de la clase Programador
    public Integer getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(Integer lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
}