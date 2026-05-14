# Push Down Field - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Push Down Field**.

## Situacion inicial

- Clases involucradas: `Empleado`, `Cadete`, `Analista`.
- Olor o problema principal: Un campo vive en la superclase pero solo algunas subclases lo necesitan.
- Objetivo del cambio: Bajar el dato a los tipos que realmente lo usan.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Push Down Field**.
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
