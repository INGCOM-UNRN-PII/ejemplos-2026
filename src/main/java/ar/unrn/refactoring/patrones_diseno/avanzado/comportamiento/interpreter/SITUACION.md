# Refactorizacion hacia Interpreter

## Situacion inicial

El sistema interpreta mini expresiones de negocio con parsing manual y reglas incrustadas en una sola clase.

## Objetivo

Modelar la gramatica del dominio como objetos interpretables.

## Pasos para el vivo

1. Definir la gramatica minima a soportar.
2. Representar cada regla como expresion.
3. Evaluar la expresion sobre un contexto comun.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Comportamiento**
