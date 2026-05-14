# Inline Function - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Inline Function**.

## Situacion inicial

- Clases involucradas: `CalculadoraDescuento`, `Pedido`.
- Olor o problema principal: Hay un metodo envoltorio que solo delega en otro metodo privado sin agregar una abstraccion util.
- Objetivo del cambio: Eliminar la abstraccion innecesaria y dejar la logica directa.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Inline Function**.
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
