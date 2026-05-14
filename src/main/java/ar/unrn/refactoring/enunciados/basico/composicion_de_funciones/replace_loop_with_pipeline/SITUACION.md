# Replace Loop with Pipeline - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Loop with Pipeline**.

## Situacion inicial

- Clases involucradas: `InformeVentas`, `PipelinePedidos`, `Pedido`.
- Olor o problema principal: Un bucle hace etapas claras de seleccion y acumulacion que podrian expresarse como una tuberia de pasos.
- Objetivo del cambio: Separar las etapas del proceso y hacer explicita la intencion del recorrido.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Loop with Pipeline**.
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
