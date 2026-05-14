# Replace Inline Code with Function Call - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Inline Code with Function Call**.

## Situacion inicial

- Clases involucradas: `RegistroPacientes`.
- Olor o problema principal: El mismo bloque de codigo aparece copiado en mas de un lugar.
- Objetivo del cambio: Extraer la operacion a una funcion con nombre claro.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Inline Code with Function Call**.
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
