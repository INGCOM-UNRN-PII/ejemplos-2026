# Replace Error Code with Exception - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Error Code with Exception**.

## Situacion inicial

- Clases involucradas: `CuentaCliente`.
- Olor o problema principal: La operacion comunica fallas con codigos numericos o valores sentinela.
- Objetivo del cambio: Expresar los errores como fallas excepcionales del dominio.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Error Code with Exception**.
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
