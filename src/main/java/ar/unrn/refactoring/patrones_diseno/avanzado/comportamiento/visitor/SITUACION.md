# Refactorizacion hacia Visitor

## Situacion inicial

Una operacion nueva recorre una jerarquia y usa instanceof para tratar cada tipo de elemento.

## Objetivo

Separar las operaciones de la estructura de objetos visitada.

## Pasos para el vivo

1. Detectar comportamiento externo que depende del tipo concreto.
2. Crear un visitante con una operacion por tipo.
3. Delegar la aceptacion al objeto visitado.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Comportamiento**
