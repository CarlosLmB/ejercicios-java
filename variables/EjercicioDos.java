/**
 * Este programa calcula el total de minutos equivalentes a una cantidad dada
 * de semanas, días, horas y minutos.
 * 
 * Utiliza constantes para las conversiones:
 * - 7 días por semana
 * - 24 horas por día
 * - 60 minutos por hora
 * 
 * Ejemplo de uso:
 * Si ingresas 2 semanas, 3 días, 5 horas y 30 minutos,
 * el programa calculará: 
 * (2*7*24*60) + (3*24*60) + (5*60) + 30 = 24,810 minutos totales.
 */

 public class EjercicioDos {
  public static final int DIAS_EN_UNA_SEMANA = 7;
  public static final int HORAS_EN_UN_DIA = 24;
  public static final int MINUTOS_EN_UNA_HORA = 60;

  public static void main(String[] args) {
    int semanas = 2;
    int dias = 3;
    int horas = 5;
    int minutos = 30;

    int totalMinutos = calcularTotalMinutos(semanas, dias, horas, minutos);
    System.out.println("Total de minutos: " + totalMinutos);
  }

  public static int calcularTotalMinutos(int semanas, int dias, int horas, int minutos) {
    return (semanas * DIAS_EN_UNA_SEMANA * HORAS_EN_UN_DIA * MINUTOS_EN_UNA_HORA) +
           (dias * HORAS_EN_UN_DIA * MINUTOS_EN_UNA_HORA) +
           (horas * MINUTOS_EN_UNA_HORA) +
           minutos;
  }
  
}
