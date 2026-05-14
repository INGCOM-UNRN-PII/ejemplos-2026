# Introduce Special Case - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Introduce Special Case**.

## Situacion inicial

- Clases involucradas: `RepositorioHuespedes`, `Huesped`.
- Olor o problema principal: El caso ausente o especial se maneja con null o con ramas repetidas.
- Objetivo del cambio: Modelar ese caso con un objeto o comportamiento especifico.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Introduce Special Case**.
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
