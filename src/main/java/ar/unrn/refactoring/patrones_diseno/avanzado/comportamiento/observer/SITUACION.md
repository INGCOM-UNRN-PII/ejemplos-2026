# Refactorizacion hacia Observer

## Situacion inicial

Un componente central conoce explicitamente a muchos consumidores y cada nuevo suscriptor obliga a tocar el emisor.

## Objetivo

Permitir suscripcion dinamica y desacoplar emisores de observadores.

## Pasos para el vivo

1. Detectar notificaciones directas y acoplamiento del emisor.
2. Crear una abstraccion de observador.
3. Permitir registro y baja dinamica de interesados.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Comportamiento**
