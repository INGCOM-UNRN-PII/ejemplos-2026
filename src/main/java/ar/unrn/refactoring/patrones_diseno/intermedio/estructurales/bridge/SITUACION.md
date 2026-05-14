# Refactorizacion hacia Bridge

## Situacion inicial

El sistema combina dos dimensiones de variacion que generan una explosion de clases o condicionales.

## Objetivo

Separar la abstraccion principal de la implementacion que puede variar de manera independiente.

## Pasos para el vivo

1. Identificar las dos dimensiones que hoy estan acopladas.
2. Separar abstraccion e implementacion.
3. Permitir combinaciones sin multiplicar subclases.

## Dificultad

- Nivel: **Intermedio**
- Familia GoF: **Estructurales**
