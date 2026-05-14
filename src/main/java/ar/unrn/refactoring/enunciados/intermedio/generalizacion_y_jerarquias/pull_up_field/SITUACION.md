# Pull Up Field - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Pull Up Field**.

## Situacion inicial

- Clases involucradas: `ReservaBase`, `ReservaCorta`, `ReservaLarga`.
- Olor o problema principal: Dos subclases tienen el mismo campo con igual significado.
- Objetivo del cambio: Declarar el dato comun en el ancestro adecuado.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Pull Up Field**.
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
