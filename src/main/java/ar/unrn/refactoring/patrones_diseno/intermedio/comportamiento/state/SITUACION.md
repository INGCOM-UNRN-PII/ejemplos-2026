# Refactorizacion hacia State

## Situacion inicial

Una clase cambia su comportamiento segun un estado representado con strings o enums y muchos condicionales.

## Objetivo

Mover las reglas de cada estado a objetos que representen ese estado.

## Pasos para el vivo

1. Identificar comportamiento dependiente del estado.
2. Crear un contrato comun para los estados.
3. Delegar en el estado actual y permitir transiciones explicitas.

## Dificultad

- Nivel: **Intermedio**
- Familia GoF: **Comportamiento**
