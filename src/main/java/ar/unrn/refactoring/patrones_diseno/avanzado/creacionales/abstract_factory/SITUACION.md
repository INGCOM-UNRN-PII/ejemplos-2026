# Refactorizacion hacia Abstract Factory

## Situacion inicial

Un centro de monitoreo crea dashboards, alarmas y logs especializados para distintas plataformas combinando varias decisiones dispersas.

## Objetivo

Crear familias consistentes de objetos relacionados desde una fabrica abstracta.

## Pasos para el vivo

1. Detectar productos que cambian en conjunto.
2. Agruparlos en una fabrica por plataforma.
3. Hacer que el cliente dependa de la fabrica y no de clases concretas.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Creacionales**
