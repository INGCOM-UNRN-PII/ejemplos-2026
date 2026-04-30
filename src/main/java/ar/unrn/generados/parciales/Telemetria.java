package ar.unrn.generados.parciales;

/**
 * Clase que contiene la lógica para la normalización resiliente de datos de telemetría.
 */
public class Telemetria {

    /**
     * Normaliza un conjunto de lecturas de telemetría aplicando factores de conversión
     * y manejando de forma resiliente diversas anomalías en los datos.
     *
     * @param lecturas  Un arreglo de strings que representa los datos crudos.
     * @param factores  Un arreglo de strings con los factores de escala para la división.
     * @param capacidad El tamaño total del arreglo de salida y el número de iteraciones a realizar.
     *
     * @return Un arreglo de strings de tamaño 'capacidad' con los valores normalizados
     * o códigos de error estandarizados en caso de fallo.
     */
    public static String[] normalizarTelemetria(String[] lecturas, String[] factores, int capacidad) {
        if (capacidad < 0) {
            throw new IllegalArgumentException("La capacidad no puede ser negativa.");
        }

        String[] resultado = new String[capacidad];

        for (int i = 0; i < capacidad; i++) {
            try {
                // Se accede a los elementos. Esto puede lanzar ArrayIndexOutOfBoundsException
                String lecturaStr = lecturas[i];
                String factorStr = factores[i];

                // Evitamos lanzar y atrapar excepciones localmente para control de flujo.
                // Validamos los nulos explícitamente y pasamos a la siguiente iteración.
                if (lecturaStr == null || factorStr == null) {
                    resultado[i] = "ERR_NULO";
                } else {

                    // Se parsean los valores (puede lanzar NumberFormatException)
                    int lecturaInt = Integer.parseInt(lecturaStr);
                    int factorInt = Integer.parseInt(factorStr);

                    // Se realiza la división (puede lanzar ArithmeticException si es 0)
                    int valorNormalizado = lecturaInt / factorInt;

                    // Si todo es exitoso, se guarda el resultado como String
                    resultado[i] = String.valueOf(valorNormalizado);
                }

            } catch (NumberFormatException e) {
                resultado[i] = "ERR_FORMATO";
            } catch (ArithmeticException e) {
                resultado[i] = "ERR_DIV_CERO";
            } catch (ArrayIndexOutOfBoundsException e) {
                resultado[i] = "ERR_INDICE";
            }
        }

        return resultado;
    }
}
