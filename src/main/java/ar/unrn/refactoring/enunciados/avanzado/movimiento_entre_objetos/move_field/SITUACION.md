# Move Field - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Move Field**.

## Situacion inicial

- Clases involucradas: `Internacion`, `Cobertura`.
- Olor o problema principal: Un campo parece pertenecer mas a otra clase que al objeto actual.
- Objetivo del cambio: Mover el dato a la clase con mejor cohesion semantica.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Move Field**.
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
