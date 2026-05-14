# Move Statements into Function - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Move Statements into Function**.

## Situacion inicial

- Clases involucradas: `CoordinadorReservas`, `CalculadoraReserva`, `Reserva`.
- Olor o problema principal: Varios llamadores repiten las mismas sentencias de preparacion antes de invocar un metodo.
- Objetivo del cambio: Mover la preparacion comun al metodo que realmente la necesita.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Move Statements into Function**.
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
