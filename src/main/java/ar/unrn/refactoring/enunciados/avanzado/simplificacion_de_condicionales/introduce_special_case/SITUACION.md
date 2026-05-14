# Introduce Special Case - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Introduce Special Case**.

## Situacion inicial

- Clases involucradas: `RepositorioPacientes`, `Paciente`.
- Olor o problema principal: El caso ausente o especial se maneja con null o con ramas repetidas.
- Objetivo del cambio: Modelar ese caso con un objeto o comportamiento especifico.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Introduce Special Case**.
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
