# Return Modified Value - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Return Modified Value**.

## Situacion inicial

- Clases involucradas: `AplicadorUpgrade`, `Reserva`.
- Olor o problema principal: Un metodo modifica un objeto y luego el llamador necesita volver a pedir el valor actualizado.
- Objetivo del cambio: Permitir que el resultado modificado vuelva de manera directa.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Return Modified Value**.
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
