# Replace Nested Conditional with Guard Clauses - nivel intermedio

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Nested Conditional with Guard Clauses**.

## Situacion inicial

- Clases involucradas: `ProcesadorCheckIn`.
- Olor o problema principal: El flujo principal queda enterrado en varios niveles de if anidados.
- Objetivo del cambio: Hacer visibles los casos de salida rapida al comienzo del metodo.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Nested Conditional with Guard Clauses**.
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
