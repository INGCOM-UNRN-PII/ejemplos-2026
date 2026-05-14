# Refactorizacion hacia Abstract Factory

## Situacion inicial

La interfaz crea familias de objetos relacionados usando condicionales dispersas para cada variante.

## Objetivo

Agrupar la creacion de familias compatibles en una fabrica abstracta.

## Pasos para el vivo

1. Detectar productos que siempre cambian juntos.
2. Crear una fabrica por familia compatible.
3. Reemplazar los new dispersos por la fabrica elegida.

## Dificultad

- Nivel: **Intermedio**
- Familia GoF: **Creacionales**
