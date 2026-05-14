# Replace Constructor with Factory - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Constructor with Factory**.

## Situacion inicial

- Clases involucradas: `Internacion`.
- Olor o problema principal: El constructor usa parametros opacos y no deja clara la variante creada.
- Objetivo del cambio: Introducir fabricas con nombres de intencion.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Constructor with Factory**.
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
