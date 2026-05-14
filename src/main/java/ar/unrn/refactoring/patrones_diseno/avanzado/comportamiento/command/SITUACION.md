# Refactorizacion hacia Command

## Situacion inicial

La interfaz decide con switch que accion ejecutar frente a cada orden del usuario.

## Objetivo

Encapsular cada accion como un objeto invocable e independiente.

## Pasos para el vivo

1. Detectar acciones disparadas por strings, botones o menu.
2. Crear un comando por accion.
3. Separar emisor, invocacion y receptor.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Comportamiento**
