# Refactorizacion hacia Proxy

## Situacion inicial

El cliente accede directo a un recurso costoso o sensible, mezclando acceso, permisos y uso del recurso real.

## Objetivo

Interponer un objeto que controle acceso, carga o proteccion del recurso.

## Pasos para el vivo

1. Identificar el recurso real y las validaciones repetidas.
2. Crear un representante con la misma interfaz.
3. Delegar en el objeto real solo cuando corresponda.

## Dificultad

- Nivel: **Basico**
- Familia GoF: **Estructurales**
