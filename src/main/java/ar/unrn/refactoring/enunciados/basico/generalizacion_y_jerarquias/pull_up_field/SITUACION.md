# Pull Up Field - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Pull Up Field**.

## Situacion inicial

- Clases involucradas: `PersonaBase`, `Cliente`, `Proveedor`.
- Olor o problema principal: Dos subclases tienen el mismo campo con igual significado.
- Objetivo del cambio: Declarar el dato comun en el ancestro adecuado.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Pull Up Field**.
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
