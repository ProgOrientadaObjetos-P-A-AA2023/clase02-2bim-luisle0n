
package paquete4;

public class Ejecutor1 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre,
                apellido, identificacion, edad);
        
        estDistancia.establecerCostoAsignatura(50.5);
        estDistancia.establecerNumeroAsginaturas(5);
        estDistancia.calcularMatriculaDistancia();
        
        System.out.println(estDistancia);
    }
}
