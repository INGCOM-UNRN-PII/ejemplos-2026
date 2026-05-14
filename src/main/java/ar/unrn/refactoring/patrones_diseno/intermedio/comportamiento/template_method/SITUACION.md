# Refactorizacion hacia Template Method

## Situacion inicial

Existen algoritmos muy parecidos en distintas clases, con la misma secuencia y pequenas variaciones.

## Objetivo

Definir el esqueleto del algoritmo una sola vez y dejar los pasos variables a subclases.

## Pasos para el vivo

1. Comparar algoritmos parecidos entre clases.
2. Extraer la secuencia fija a una superclase.
3. Dejar hooks o pasos abstractos para la variacion.

## Dificultad

- Nivel: **Intermedio**
- Familia GoF: **Comportamiento**
