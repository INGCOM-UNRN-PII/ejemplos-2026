# Replace Control Flag with Break - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Control Flag with Break**.

## Situacion inicial

- Clases involucradas: `BuscadorPaciente`.
- Olor o problema principal: Una bandera local solo existe para controlar la salida de un loop.
- Objetivo del cambio: Usar una salida explicita del flujo en lugar de una variable auxiliar.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Control Flag with Break**.
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
