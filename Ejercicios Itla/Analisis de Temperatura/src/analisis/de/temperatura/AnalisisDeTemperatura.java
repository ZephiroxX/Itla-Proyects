
package analisis.de.temperatura;

public class AnalisisDeTemperatura {
    public static void main(String[] args) {
        // Temperaturas de la semana (en Celsius)
        double[] temperaturas = {22.5, 24.0, 21.8, 23.5, 25.2, 26.0, 23.8};
        String[] dias = {"Lun", "Mar", "Mie", "Jue", "Vie", "Sab", "Dom"};

        // Calcular estadisticas
        double suma = 0;
        double maxima = temperaturas[0];
        double minima = temperaturas[0];
        int diaMaxima = 0;
        int diaMinima = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];
            if (temperaturas[i] > maxima) {
                maxima = temperaturas[i];
                diaMaxima = i;
            }
            if (temperaturas[i] < minima) {
                minima = temperaturas[i];
                diaMinima = i;
            }
        }

        double promedio = suma / temperaturas.length;

        System.out.println("=== ANALISIS SEMANAL DE TEMPERATURAS ===\n");

        // Mostrar temperaturas diarias
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("%s: %.1f°C", dias[i], temperaturas[i]);
            if (temperaturas[i] > promedio) {
                System.out.print(" (sobre promedio)");
            } else if (temperaturas[i] < promedio) {
                System.out.print(" (bajo promedio)");
            }
            System.out.println();
        }

        System.out.println("\n--- ESTADÍSTICAS ---");
        System.out.printf("Temperatura promedio: %.1f°C%n", promedio);
        System.out.printf("Temperatura maxima: %.1f°C (%s)%n", maxima, dias[diaMaxima]);
        System.out.printf("Temperatura minima: %.1f°C (%s)%n", minima, dias[diaMinima]);
    }
}