# Refactorizacion hacia Memento

## Situacion inicial

El objeto gestiona su historial copiando manualmente campos en variables auxiliares externas.

## Objetivo

Capturar y restaurar estado sin exponer detalles internos del objeto.

## Pasos para el vivo

1. Identificar snapshots manuales del estado.
2. Encapsular el estado guardado en un memento.
3. Separar originator y cuidador del historial.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Comportamiento**
