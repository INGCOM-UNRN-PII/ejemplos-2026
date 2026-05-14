# Move Statements to Callers - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Move Statements to Callers**.

## Situacion inicial

- Clases involucradas: `GeneradorResumen`, `Pedido`.
- Olor o problema principal: Un metodo mezcla su responsabilidad central con trabajo accesorio que no todos los llamadores desean.
- Objetivo del cambio: Empujar el trabajo accesorio a los llamadores correctos.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Move Statements to Callers**.
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
