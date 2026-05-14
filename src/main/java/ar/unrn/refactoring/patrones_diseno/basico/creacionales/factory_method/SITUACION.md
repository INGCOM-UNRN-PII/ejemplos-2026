# Refactorizacion hacia Factory Method

## Situacion inicial

Una clase decide con condicionales que objeto concreto crear cada vez que necesita exportar un reporte.

## Objetivo

Delegar la creacion a un metodo de fabrica y separar la seleccion del producto del uso.

## Pasos para el vivo

1. Identificar la condicion que decide la clase concreta.
2. Extraer la creacion a un metodo de fabrica.
3. Permitir variaciones sin cambiar el flujo principal.

## Dificultad

- Nivel: **Basico**
- Familia GoF: **Creacionales**
