# Refactorizacion hacia Flyweight

## Situacion inicial

El sistema crea demasiados objetos pesados repetidos para representar estados intrinsecos compartibles.

## Objetivo

Separar estado intrinseco de estado extrinseco para reutilizar objetos compartidos.

## Pasos para el vivo

1. Detectar objetos repetidos con gran porcion de estado comun.
2. Extraer el estado compartible a un flyweight.
3. Reutilizar instancias a traves de una fabrica.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Estructurales**
