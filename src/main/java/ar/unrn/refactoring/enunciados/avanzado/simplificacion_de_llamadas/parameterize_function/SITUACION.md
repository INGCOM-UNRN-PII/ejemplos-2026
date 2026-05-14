# Parameterize Function - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Parameterize Function**.

## Situacion inicial

- Clases involucradas: `CalculadoraCopago`.
- Olor o problema principal: Existen funciones casi iguales que solo cambian por un valor fijo.
- Objetivo del cambio: Unificar la logica variando ese valor por parametro.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Parameterize Function**.
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
