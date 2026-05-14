# Refactorizacion hacia State

## Situacion inicial

El despliegue cambia su comportamiento segun estados transitorios y terminales expresados con strings y condicionales largas.

## Objetivo

Distribuir reglas y transiciones en objetos de estado explicitos.

## Pasos para el vivo

1. Detectar comportamiento dependiente de estado.
2. Modelar cada estado con una clase propia.
3. Delegar acciones y transiciones en el estado actual.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Comportamiento**
