# Refactorizacion hacia Iterator

## Situacion inicial

Una clase expone demasiado de su estructura interna para que otros recorran sus elementos.

## Objetivo

Separar la forma de recorrer de la estructura que almacena los datos.

## Pasos para el vivo

1. Detectar acceso externo al array o al indice interno.
2. Definir una forma uniforme de recorrer.
3. Ocultar la representacion concreta de la coleccion.

## Dificultad

- Nivel: **Basico**
- Familia GoF: **Comportamiento**
