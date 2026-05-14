# Split Loop - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Split Loop**.

## Situacion inicial

- Clases involucradas: `InformePedidos`, `Pedido`, `Resumen`.
- Olor o problema principal: Un solo loop mezcla responsabilidades que no dependen unas de otras.
- Objetivo del cambio: Separar el recorrido en pasos mas claros, uno por responsabilidad.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Split Loop**.
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
