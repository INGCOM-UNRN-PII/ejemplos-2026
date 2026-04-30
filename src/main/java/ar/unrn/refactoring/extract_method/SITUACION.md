# Refactorización: Extract Method

## Situación Inicial

Tenemos un método `imprimirDetalle()` que hace demasiadas cosas:

1. Imprime una cabecera.
2. Calcula el total iterando sobre elementos.
3. Imprime los detalles de cada elemento.
4. Imprime el pie de página.

## Objetivo

Extraer las partes lógicas en métodos privados con nombres semánticos para mejorar la legibilidad y facilitar el
mantenimiento.

## Pasos para el "Vivo"

1. Identificar el bloque que imprime la cabecera y extraerlo a `imprimirCabecera()`.
2. Identificar la lógica de cálculo y extracción a `calcularTotal()`.
3. Identificar la impresión de detalles y extraerla a `imprimirDetalles()`.
