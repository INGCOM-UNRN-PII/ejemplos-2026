# Refactorizacion hacia Facade

## Situacion inicial

La capa de aplicacion coordina varios subsistemas en cada caso de uso y conoce demasiados detalles operativos.

## Objetivo

Ofrecer un punto de entrada simple para una secuencia compleja de colaboraciones.

## Pasos para el vivo

1. Detectar la secuencia repetida entre subsistemas.
2. Crear una fachada con una operacion mas simple.
3. Hacer que los clientes dependan de la fachada y no del detalle interno.

## Dificultad

- Nivel: **Basico**
- Familia GoF: **Estructurales**
