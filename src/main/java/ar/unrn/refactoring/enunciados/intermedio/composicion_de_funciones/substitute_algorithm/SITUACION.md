# Substitute Algorithm - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Substitute Algorithm**.

## Situacion inicial

- Clases involucradas: `BuscadorHabitacion`.
- Olor o problema principal: El algoritmo actual funciona, pero es mas dificil de leer o mantener de lo necesario.
- Objetivo del cambio: Reemplazarlo por una version mas clara sin cambiar el proposito observable.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Substitute Algorithm**.
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
