# Refactorizacion hacia Strategy

## Situacion inicial

El planificador cambia algoritmos de enrutamiento segun SLA, costo y carga, pero toda la variacion vive en una sola clase.

## Objetivo

Extraer los algoritmos de decision a estrategias intercambiables.

## Pasos para el vivo

1. Detectar algoritmos seleccionados por condicionales.
2. Definir una interfaz de estrategia.
3. Permitir intercambio en tiempo de ejecucion sin tocar el cliente.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Comportamiento**
