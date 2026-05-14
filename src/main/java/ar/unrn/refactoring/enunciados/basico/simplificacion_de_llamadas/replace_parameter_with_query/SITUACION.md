# Replace Parameter with Query - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Parameter with Query**.

## Situacion inicial

- Clases involucradas: `CalculadoraPedido`, `Pedido`, `Cliente`.
- Olor o problema principal: El metodo recibe un dato que puede obtener directamente del objeto principal.
- Objetivo del cambio: Eliminar el parametro redundante y consultar el dato donde corresponde.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Parameter with Query**.
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
