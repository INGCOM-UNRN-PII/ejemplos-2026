# Replace Exception with Precheck - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Exception with Precheck**.

## Situacion inicial

- Clases involucradas: `ProcesadorPago`, `Stock`.
- Olor o problema principal: Una excepcion se usa para controlar un caso esperable del flujo normal.
- Objetivo del cambio: Preguntar antes si la operacion puede ejecutarse.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Exception with Precheck**.
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
