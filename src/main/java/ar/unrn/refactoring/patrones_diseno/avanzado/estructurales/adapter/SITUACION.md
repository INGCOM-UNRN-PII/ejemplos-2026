# Refactorizacion hacia Adapter

## Situacion inicial

El motor debe integrar varios proveedores externos con contratos incompatibles sin exponer esos detalles al dominio financiero.

## Objetivo

Traducir interfaces heterogeneas a un contrato comun del dominio.

## Pasos para el vivo

1. Definir la interfaz objetivo del dominio.
2. Encapsular cada API externa incompatible.
3. Traducir datos y semantica dentro del adaptador.

## Dificultad

- Nivel: **Avanzado**
- Familia GoF: **Estructurales**
