# Refactorizacion hacia Factory Method

## Situacion inicial

Un proceso complejo crea distintos analizadores concretos a partir del tipo de documento y la decision queda incrustada en el flujo.

## Objetivo

Delegar la seleccion del producto a un metodo de fabrica extensible.

## Pasos para el vivo

1. Aislar la decision de construccion.
2. Crear un punto de extension para nuevos analizadores.
3. Separar procesamiento y seleccion del producto.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Creacionales**
