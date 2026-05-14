# Replace Query with Parameter - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Query with Parameter**.

## Situacion inicial

- Clases involucradas: `ConversorTarifas`, `ServicioTemporada`.
- Olor o problema principal: El metodo consulta internamente un dato que el llamador ya conoce o podria calcular una sola vez.
- Objetivo del cambio: Hacer explicita la dependencia mediante un parametro.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Query with Parameter**.
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
