# Refactorizacion hacia Chain of Responsibility

## Situacion inicial

Una unica clase decide con condicionales quien debe atender cada solicitud y concentra toda la escalacion.

## Objetivo

Distribuir la decision entre manejadores encadenados.

## Pasos para el vivo

1. Identificar criterios de derivacion.
2. Crear manejadores con responsabilidad parcial.
3. Encadenarlos en orden de resolucion.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Comportamiento**
