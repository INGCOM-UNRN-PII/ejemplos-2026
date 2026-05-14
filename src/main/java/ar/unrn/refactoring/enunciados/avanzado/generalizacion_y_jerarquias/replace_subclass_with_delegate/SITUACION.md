# Replace Subclass with Delegate - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Subclass with Delegate**.

## Situacion inicial

- Clases involucradas: `CuentaClinica`, `CuentaConPlan`.
- Olor o problema principal: La herencia se usa solo para cambiar un detalle de comportamiento.
- Objetivo del cambio: Sustituir esa variacion por composicion o delegacion.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Subclass with Delegate**.
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
