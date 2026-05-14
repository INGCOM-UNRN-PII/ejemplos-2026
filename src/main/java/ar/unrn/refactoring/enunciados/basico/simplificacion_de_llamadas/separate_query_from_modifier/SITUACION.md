# Separate Query from Modifier - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Separate Query from Modifier**.

## Situacion inicial

- Clases involucradas: `ColaPedidos`.
- Olor o problema principal: Una operacion consulta y modifica estado al mismo tiempo.
- Objetivo del cambio: Separar lectura y efecto para clarificar la intencion.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Separate Query from Modifier**.
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
