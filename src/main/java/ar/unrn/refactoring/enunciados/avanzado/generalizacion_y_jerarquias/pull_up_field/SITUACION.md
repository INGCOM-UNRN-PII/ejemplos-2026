# Pull Up Field - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Pull Up Field**.

## Situacion inicial

- Clases involucradas: `FichaBase`, `PacienteAmbulatorio`, `PacienteInternado`.
- Olor o problema principal: Dos subclases tienen el mismo campo con igual significado.
- Objetivo del cambio: Declarar el dato comun en el ancestro adecuado.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Pull Up Field**.
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
