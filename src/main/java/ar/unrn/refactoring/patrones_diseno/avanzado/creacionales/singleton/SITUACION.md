# Refactorizacion hacia Singleton

## Situacion inicial

Distintos modulos crean administradores de shard propios y terminan duplicando cache, conexiones y reglas de consistencia.

## Objetivo

Centralizar el acceso a un unico coordinador compartido del recurso global.

## Pasos para el vivo

1. Detectar creacion dispersa de instancias equivalentes.
2. Restringir la construccion directa.
3. Exponer un unico punto de acceso compartido.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Creacionales**
