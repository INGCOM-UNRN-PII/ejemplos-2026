# Replace Query with Parameter - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Query with Parameter**.

## Situacion inicial

- Clases involucradas: `ConversorCobertura`, `ServicioAranceles`.
- Olor o problema principal: El metodo consulta internamente un dato que el llamador ya conoce o podria calcular una sola vez.
- Objetivo del cambio: Hacer explicita la dependencia mediante un parametro.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Query with Parameter**.
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
