# Replace Primitive with Object - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Primitive with Object**.

## Situacion inicial

- Clases involucradas: `Huesped`.
- Olor o problema principal: Un primitivo del dominio necesita reglas o validaciones que hoy estan dispersas.
- Objetivo del cambio: Encapsular el valor en un objeto con significado propio.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Primitive with Object**.
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
