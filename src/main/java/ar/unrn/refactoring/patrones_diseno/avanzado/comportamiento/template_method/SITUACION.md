# Refactorizacion hacia Template Method

## Situacion inicial

Varias reconciliaciones complejas repiten la misma secuencia de pasos con variantes puntuales por fuente y destino.

## Objetivo

Definir un esqueleto estable del algoritmo y dejar los pasos variables a especializaciones.

## Pasos para el vivo

1. Detectar secuencias repetidas con estructura fija.
2. Subir la secuencia a una clase base.
3. Dejar hooks o pasos abstractos para la variacion.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Comportamiento**
