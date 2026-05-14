# Replace Derived Variable with Query - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Derived Variable with Query**.

## Situacion inicial

- Clases involucradas: `Reserva`, `NocheReserva`.
- Olor o problema principal: Se mantiene un valor derivado en un campo que debe sincronizarse manualmente.
- Objetivo del cambio: Calcular el valor a partir de los datos fuente cuando se necesite.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Derived Variable with Query**.
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
