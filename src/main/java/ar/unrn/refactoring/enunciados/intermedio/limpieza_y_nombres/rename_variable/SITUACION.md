# Rename Variable - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Rename Variable**.

## Situacion inicial

- Clases involucradas: `CalculadoraReserva`.
- Olor o problema principal: Una variable local no comunica que representa dentro del calculo.
- Objetivo del cambio: Elegir un nombre que explique su rol en el metodo.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Rename Variable**.
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
