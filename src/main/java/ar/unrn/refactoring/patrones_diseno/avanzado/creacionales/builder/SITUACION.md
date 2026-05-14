# Refactorizacion hacia Builder

## Situacion inicial

La construccion de un pipeline analitico requiere muchos pasos opcionales, validaciones y orden de armado.

## Objetivo

Separar la construccion paso a paso de la representacion final del pipeline.

## Pasos para el vivo

1. Identificar variaciones y pasos opcionales.
2. Mover el armado a un builder fluido.
3. Preservar restricciones de construccion de forma explicita.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Creacionales**
