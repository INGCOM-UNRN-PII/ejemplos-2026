# Introduce Parameter Object - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Introduce Parameter Object**.

## Situacion inicial

- Clases involucradas: `BuscadorEstadias`.
- Olor o problema principal: La firma del metodo recibe varios parametros que viajan juntos.
- Objetivo del cambio: Agruparlos en un solo objeto con nombre de dominio.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Introduce Parameter Object**.
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
