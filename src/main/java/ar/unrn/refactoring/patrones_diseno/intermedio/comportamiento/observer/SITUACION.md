# Refactorizacion hacia Observer

## Situacion inicial

Un objeto conoce explicitamente a todos los receptores de cambios y los invoca de forma directa.

## Objetivo

Desacoplar emisores y receptores de eventos mediante suscripcion.

## Pasos para el vivo

1. Detectar notificaciones directas a varios colaboradores.
2. Crear un contrato de observacion.
3. Permitir alta y baja dinamica de interesados.

## Dificultad

- Nivel: **Intermedio**
- Familia GoF: **Comportamiento**
