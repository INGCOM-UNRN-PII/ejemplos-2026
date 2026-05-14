# Replace Parameter with Query - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Parameter with Query**.

## Situacion inicial

- Clases involucradas: `CalculadoraReserva`, `Reserva`, `Huesped`.
- Olor o problema principal: El metodo recibe un dato que puede obtener directamente del objeto principal.
- Objetivo del cambio: Eliminar el parametro redundante y consultar el dato donde corresponde.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Parameter with Query**.
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
