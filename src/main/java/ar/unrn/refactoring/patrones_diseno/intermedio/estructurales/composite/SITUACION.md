# Refactorizacion hacia Composite

## Situacion inicial

El cliente trata distinto a elementos simples y agrupados, propagando if por tipo de nodo.

## Objetivo

Tratar de manera uniforme objetos individuales y compuestos.

## Pasos para el vivo

1. Detectar operaciones repetidas para hojas y grupos.
2. Definir una interfaz comun.
3. Delegar la composicion al objeto compuesto.

## Dificultad

- Nivel: **Intermedio**
- Familia GoF: **Estructurales**
