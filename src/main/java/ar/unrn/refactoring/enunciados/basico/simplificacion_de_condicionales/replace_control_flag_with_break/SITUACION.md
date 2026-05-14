# Replace Control Flag with Break - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Control Flag with Break**.

## Situacion inicial

- Clases involucradas: `BuscadorPedido`.
- Olor o problema principal: Una bandera local solo existe para controlar la salida de un loop.
- Objetivo del cambio: Usar una salida explicita del flujo en lugar de una variable auxiliar.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Control Flag with Break**.
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
