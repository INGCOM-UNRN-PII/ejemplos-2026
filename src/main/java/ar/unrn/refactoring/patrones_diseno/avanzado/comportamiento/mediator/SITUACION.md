# Refactorizacion hacia Mediator

## Situacion inicial

Varios objetos de la interfaz se conocen entre si y se actualizan mutuamente de forma acoplada.

## Objetivo

Centralizar la coordinacion entre colegas en un mediador.

## Pasos para el vivo

1. Detectar dependencias cruzadas entre componentes.
2. Extraer la logica de coordinacion a un mediador.
3. Hacer que cada colega solo conozca al mediador.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Comportamiento**
