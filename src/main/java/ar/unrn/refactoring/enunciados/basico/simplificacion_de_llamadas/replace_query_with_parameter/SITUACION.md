# Replace Query with Parameter - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Query with Parameter**.

## Situacion inicial

- Clases involucradas: `ConversorPrecios`, `ServicioCambio`.
- Olor o problema principal: El metodo consulta internamente un dato que el llamador ya conoce o podria calcular una sola vez.
- Objetivo del cambio: Hacer explicita la dependencia mediante un parametro.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Query with Parameter**.
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
