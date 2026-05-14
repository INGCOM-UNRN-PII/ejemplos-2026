# Replace Function with Command - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Function with Command**.

## Situacion inicial

- Clases involucradas: `CalculadoraInternacion`, `CasoClinico`.
- Olor o problema principal: Una funcion concentra demasiados pasos y podria beneficiarse de un objeto con estado propio.
- Objetivo del cambio: Transformar la operacion en un comando explicito.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Function with Command**.
3. Reorganiza el codigo manteniendo el comportamiento observable.

## Nivel de dificultad

- Nivel: **Avanzado**
- Caracter del caso: Casos con varias clases, contratos implicitos o mas de una consecuencia posible del cambio.
- Expectativa: Mantiene el comportamiento observable y cuida la frontera publica del diseno.

## Lo que se espera

- Evalua impacto sobre varias clases y sobre el contrato publico.
- Preserva reglas de negocio implicitas al redistribuir responsabilidades.
- Haz el cambio principal sin introducir complejidad accidental.

## Pista docente

Presta atencion a responsabilidades cruzadas, compatibilidad y nombres del dominio.
