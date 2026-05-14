# Move Statements into Function - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Move Statements into Function**.

## Situacion inicial

- Clases involucradas: `CajaPedido`, `CalculadoraPedido`, `Pedido`.
- Olor o problema principal: Varios llamadores repiten las mismas sentencias de preparacion antes de invocar un metodo.
- Objetivo del cambio: Mover la preparacion comun al metodo que realmente la necesita.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Move Statements into Function**.
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
