# Replace Superclass with Delegate - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Superclass with Delegate**.

## Situacion inicial

- Clases involucradas: `PilaReservas`.
- Olor o problema principal: Una clase hereda de otra principalmente para reutilizar implementacion.
- Objetivo del cambio: Romper la herencia y delegar solo lo necesario.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Superclass with Delegate**.
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
