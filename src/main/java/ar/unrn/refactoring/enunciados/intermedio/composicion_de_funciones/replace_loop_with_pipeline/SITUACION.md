# Replace Loop with Pipeline - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Loop with Pipeline**.

## Situacion inicial

- Clases involucradas: `InformeReservas`, `PipelineReservas`, `Reserva`.
- Olor o problema principal: Un bucle hace etapas claras de seleccion y acumulacion que podrian expresarse como una tuberia de pasos.
- Objetivo del cambio: Separar las etapas del proceso y hacer explicita la intencion del recorrido.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Loop with Pipeline**.
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
