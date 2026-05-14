# Refactorizacion hacia Bridge

## Situacion inicial

El sistema combina criticidad, audiencia y canal de entrega, generando demasiadas combinaciones concretas y reglas cruzadas.

## Objetivo

Separar la abstraccion de alerta de los mecanismos de entrega.

## Pasos para el vivo

1. Detectar dimensiones de variacion independientes.
2. Separar la jerarquia principal de la implementacion variable.
3. Permitir combinar ambas dimensiones sin explosion de clases.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Estructurales**
