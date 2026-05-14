# Refactorizacion hacia Builder

## Situacion inicial

La construccion de un objeto requiere muchos parametros opcionales y se vuelve confusa al invocarla.

## Objetivo

Separar la construccion paso a paso de la representacion final.

## Pasos para el vivo

1. Detectar un constructor telescopico o demasiados setters.
2. Mover las decisiones de armado a un builder.
3. Mantener la construccion legible y explicita.

## Dificultad

- Nivel: **Basico**
- Familia GoF: **Creacionales**
