# Replace Derived Variable with Query - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Derived Variable with Query**.

## Situacion inicial

- Clases involucradas: `CuentaPaciente`, `Prestacion`.
- Olor o problema principal: Se mantiene un valor derivado en un campo que debe sincronizarse manualmente.
- Objetivo del cambio: Calcular el valor a partir de los datos fuente cuando se necesite.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Derived Variable with Query**.
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
