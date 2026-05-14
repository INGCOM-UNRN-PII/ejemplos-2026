# Replace Temp with Query - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Temp with Query**.

## Situacion inicial

- Clases involucradas: `CasoInternacion`.
- Olor o problema principal: Un temporal representa un concepto reutilizable del dominio y se usa varias veces en el metodo.
- Objetivo del cambio: Convertir el calculo en una consulta con nombre.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Temp with Query**.
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
