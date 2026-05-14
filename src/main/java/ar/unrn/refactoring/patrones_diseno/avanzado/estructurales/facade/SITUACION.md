# Refactorizacion hacia Facade

## Situacion inicial

Dar de alta un tenant requiere coordinar autentificacion, almacenamiento, colas, observabilidad y facturacion desde varios puntos de la aplicacion.

## Objetivo

Exponer una entrada unica y mas simple para un subsistema complejo.

## Pasos para el vivo

1. Detectar secuencias complejas repetidas entre subsistemas.
2. Crear una fachada orientada al caso de uso.
3. Ocultar la orquestacion interna a los clientes.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Estructurales**
