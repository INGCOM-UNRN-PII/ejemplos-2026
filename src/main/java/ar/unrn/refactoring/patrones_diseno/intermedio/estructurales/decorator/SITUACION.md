# Refactorizacion hacia Decorator

## Situacion inicial

Una clase acumula banderas para agregar comportamientos opcionales alrededor de una misma responsabilidad base.

## Objetivo

Agregar responsabilidades opcionales por composicion y no por condicionales.

## Pasos para el vivo

1. Detectar comportamiento base mas extras opcionales.
2. Encapsular cada agregado como envoltorio.
3. Componer decoradores segun la necesidad del cliente.

## Dificultad

- Nivel: **Intermedio**
- Familia GoF: **Estructurales**
