# Refactorizacion hacia Composite

## Situacion inicial

El planificador distingue entre tareas simples y lotes de tareas con instanceof y recorridos manuales recursivos.

## Objetivo

Tratar tareas individuales y grupos de tareas con una misma interfaz.

## Pasos para el vivo

1. Detectar logica separada para hojas y compuestos.
2. Crear una abstraccion comun.
3. Mover la recursion al compuesto.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Estructurales**
