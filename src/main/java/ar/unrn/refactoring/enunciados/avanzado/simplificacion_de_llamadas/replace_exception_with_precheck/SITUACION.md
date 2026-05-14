# Replace Exception with Precheck - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Exception with Precheck**.

## Situacion inicial

- Clases involucradas: `ProcesadorAlta`, `Cama`.
- Olor o problema principal: Una excepcion se usa para controlar un caso esperable del flujo normal.
- Objetivo del cambio: Preguntar antes si la operacion puede ejecutarse.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Exception with Precheck**.
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
