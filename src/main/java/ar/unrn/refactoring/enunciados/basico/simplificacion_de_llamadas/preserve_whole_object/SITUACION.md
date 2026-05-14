# Preserve Whole Object - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Preserve Whole Object**.

## Situacion inicial

- Clases involucradas: `ValidadorPedido`, `RangoCompra`.
- Olor o problema principal: El llamador desarma un objeto para pasar varios valores que pertenecen al mismo concepto.
- Objetivo del cambio: Pasar el objeto completo en lugar de sus partes.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Preserve Whole Object**.
3. Reorganiza el codigo manteniendo el comportamiento observable.

## Nivel de dificultad

- Nivel: **Basico**
- Caracter del caso: Casos cortos, con una o dos clases y una sola decision principal de refactorizacion.
- Expectativa: Resuelve el ejercicio sin agregar capas nuevas si no son necesarias.

## Lo que se espera

- Identifica un unico punto principal de cambio.
- Aplica la refactorizacion sin reescribir todo el ejercicio.
- Manten el codigo resultante facil de leer.

## Pista docente

Busca el olor mas visible y resuelve primero el caso central.
