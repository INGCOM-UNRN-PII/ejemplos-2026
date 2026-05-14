# Replace Nested Conditional with Guard Clauses - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Nested Conditional with Guard Clauses**.

## Situacion inicial

- Clases involucradas: `ProcesadorPago`.
- Olor o problema principal: El flujo principal queda enterrado en varios niveles de if anidados.
- Objetivo del cambio: Hacer visibles los casos de salida rapida al comienzo del metodo.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Nested Conditional with Guard Clauses**.
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
