# Separate Query from Modifier - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Separate Query from Modifier**.

## Situacion inicial

- Clases involucradas: `ColaPacientes`.
- Olor o problema principal: Una operacion consulta y modifica estado al mismo tiempo.
- Objetivo del cambio: Separar lectura y efecto para clarificar la intencion.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Separate Query from Modifier**.
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
