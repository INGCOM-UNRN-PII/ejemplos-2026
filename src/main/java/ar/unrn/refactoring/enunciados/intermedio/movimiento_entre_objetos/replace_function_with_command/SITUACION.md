# Replace Function with Command - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Function with Command**.

## Situacion inicial

- Clases involucradas: `CalculadoraHospedaje`, `Reserva`.
- Olor o problema principal: Una funcion concentra demasiados pasos y podria beneficiarse de un objeto con estado propio.
- Objetivo del cambio: Transformar la operacion en un comando explicito.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Function with Command**.
3. Reorganiza el codigo manteniendo el comportamiento observable.

## Nivel de dificultad

- Nivel: **Intermedio**
- Caracter del caso: Casos con mas de un punto de uso o con una pequeña colaboracion entre clases.
- Expectativa: Conserva nombres de dominio y evita romper las responsabilidades existentes.

## Lo que se espera

- Considera que hay mas de un lugar afectado por el cambio.
- Evita duplicar logica mientras simplificas el diseno.
- Cuida la colaboracion entre las clases dadas.

## Pista docente

Revisa llamadas repetidas, datos compartidos y metodos que saben demasiado.
