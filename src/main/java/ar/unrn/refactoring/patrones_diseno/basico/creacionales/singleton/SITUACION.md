# Refactorizacion hacia Singleton

## Situacion inicial

La aplicacion crea nuevas instancias de una clase que deberia representar un unico punto compartido de configuracion.

## Objetivo

Centralizar el acceso a una sola instancia y evitar duplicacion de estado global.

## Pasos para el vivo

1. Detectar donde se crean varias instancias del mismo gestor.
2. Ocultar la creacion directa.
3. Exponer un punto de acceso unico a la instancia compartida.

## Dificultad

- Nivel: **Basico**
- Familia GoF: **Creacionales**
