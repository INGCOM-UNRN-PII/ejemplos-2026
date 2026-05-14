# Introduce Assertion - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Introduce Assertion**.

## Situacion inicial

- Clases involucradas: `CalculadoraEstadia`, `BloqueReserva`.
- Olor o problema principal: El metodo depende de una precondicion interna que hoy esta implicita.
- Objetivo del cambio: Expresar el supuesto de forma explicita dentro del codigo.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Introduce Assertion**.
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
