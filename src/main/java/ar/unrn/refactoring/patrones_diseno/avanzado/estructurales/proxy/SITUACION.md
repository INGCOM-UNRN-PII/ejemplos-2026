# Refactorizacion hacia Proxy

## Situacion inicial

El acceso a expedientes remotos requiere permisos, trazabilidad y carga diferida, pero todo esta mezclado en el cliente.

## Objetivo

Interponer un representante que controle acceso, carga y politicas del recurso real.

## Pasos para el vivo

1. Detectar responsabilidades accesorias alrededor del acceso real.
2. Crear una interfaz comun para proxy y recurso.
3. Hacer que el cliente dependa del representante.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Estructurales**
