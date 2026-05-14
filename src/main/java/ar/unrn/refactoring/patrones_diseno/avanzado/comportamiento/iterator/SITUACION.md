# Refactorizacion hacia Iterator

## Situacion inicial

La estructura expone sus listas internas y obliga a los clientes a conocer detalles del recorrido y del orden de exploracion.

## Objetivo

Separar el recorrido de una estructura compleja de la estructura que lo soporta.

## Pasos para el vivo

1. Detectar exposicion de colecciones internas.
2. Definir una forma de iteracion controlada.
3. Encapsular la estrategia de recorrido dentro del iterador.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Comportamiento**
