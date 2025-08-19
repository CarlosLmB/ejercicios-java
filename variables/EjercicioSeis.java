public class EjercicioSeis {
  public static void main(String[] args) {
      int[] notas = new int[5];
      notas[0] = 85;
      notas[1] = 90;
      notas[2] = 78;
      notas[3] = 92;
      notas[4] = 88;

      System.out.println("Notas de los estudiante:");
      for (int i = 0; i < notas.length; i++) {
          System.out.println("Estudiante " + (i + 1) + ": " + notas[i]);
      }
  }
}
