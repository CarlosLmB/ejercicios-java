/**
 * Este programa demuestra el uso de una variable booleana
 * para verificar si un estudiante está aprobado basado en su calificación.
 */

public class EjercicioCuatro {
  public static void main(String[] args) {
      double calificacion = 5.5;
      boolean aprobado;

      aprobado = (calificacion >= 6.0);

      System.out.println("Aprobado: " + aprobado + " (Calificación: " + calificacion + ")");
  }
}
