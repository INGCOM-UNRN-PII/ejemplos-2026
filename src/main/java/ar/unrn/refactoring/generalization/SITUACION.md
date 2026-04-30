# Refactorización: Pull Up Method

## Situación Inicial
Dos subclases (`Auto` y `Moto`) tienen un método idéntico `imprimirNombre()`. Esto genera duplicación de código y dificultades de mantenimiento.

## Objetivo
Mover el método a la superclase común (`Vehiculo`) para eliminar la duplicación.

## Pasos para el "Vivo"
1. Identificar el método idéntico en las subclases.
2. Mover el método a la superclase.
3. Eliminar el método de las subclases.
