# Replace Derived Variable with Query - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Derived Variable with Query**.

## Situacion inicial

- Clases involucradas: `Pedido`, `LineaPedido`.
- Olor o problema principal: Se mantiene un valor derivado en un campo que debe sincronizarse manualmente.
- Objetivo del cambio: Calcular el valor a partir de los datos fuente cuando se necesite.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Derived Variable with Query**.
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
