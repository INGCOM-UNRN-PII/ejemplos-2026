# Refactorizacion hacia Strategy

## Situacion inicial

Un objeto cambia una parte del algoritmo segun un tipo, pero la variacion podria seleccionarse en tiempo de ejecucion.

## Objetivo

Extraer la variacion a estrategias intercambiables.

## Pasos para el vivo

1. Detectar el switch que elige una forma de calcular.
2. Crear una interfaz para el algoritmo variable.
3. Delegar el calculo a la estrategia seleccionada.

## Dificultad

- Nivel: **Intermedio**
- Familia GoF: **Comportamiento**
