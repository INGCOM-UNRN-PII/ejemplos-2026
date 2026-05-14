# Refactorizacion hacia Adapter

## Situacion inicial

Una clase necesita colaborar con una API existente cuya interfaz no coincide con la que espera el dominio actual.

## Objetivo

Introducir una traduccion estable entre la interfaz esperada y la interfaz heredada.

## Pasos para el vivo

1. Definir la interfaz objetivo del dominio.
2. Encapsular la API incompatible.
3. Traducir la llamada sin contaminar al cliente.

## Dificultad

- Nivel: **Basico**
- Familia GoF: **Estructurales**
