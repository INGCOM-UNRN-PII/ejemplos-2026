# Return Modified Value - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Return Modified Value**.

## Situacion inicial

- Clases involucradas: `AplicadorDescuento`, `Pedido`.
- Olor o problema principal: Un metodo modifica un objeto y luego el llamador necesita volver a pedir el valor actualizado.
- Objetivo del cambio: Permitir que el resultado modificado vuelva de manera directa.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Return Modified Value**.
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
