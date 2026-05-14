# Remove Middle Man - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Remove Middle Man**.

## Situacion inicial

- Clases involucradas: `Pedido`, `Pago`.
- Olor o problema principal: Una clase solo reenvia llamadas a otra sin agregar valor propio.
- Objetivo del cambio: Eliminar la intermediacion innecesaria.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Remove Middle Man**.
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
