# Split Phase - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Split Phase**.

## Situacion inicial

- Clases involucradas: `ProcesadorPedidos`.
- Olor o problema principal: Un metodo mezcla parsing, validacion y calculo final en una sola fase.
- Objetivo del cambio: Dividir el proceso en etapas con entradas y salidas mas claras.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Split Phase**.
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
