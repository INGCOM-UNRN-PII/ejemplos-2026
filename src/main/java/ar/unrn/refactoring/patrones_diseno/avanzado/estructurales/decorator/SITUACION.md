# Refactorizacion hacia Decorator

## Situacion inicial

Las variantes de alerta combinan auditoria, reintentos, cifrado y multiples canales con flags y herencia rigida.

## Objetivo

Agregar responsabilidades opcionales por composicion dinamica.

## Pasos para el vivo

1. Identificar una operacion base mas agregados combinables.
2. Encapsular cada agregado en un decorador.
3. Componer responsabilidades sin multiplicar subclases.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Estructurales**
