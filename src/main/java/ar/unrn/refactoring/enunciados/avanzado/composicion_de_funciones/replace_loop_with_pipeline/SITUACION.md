# Replace Loop with Pipeline - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Loop with Pipeline**.

## Situacion inicial

- Clases involucradas: `InformeGuardia`, `PipelineAtenciones`, `Atencion`.
- Olor o problema principal: Un bucle hace etapas claras de seleccion y acumulacion que podrian expresarse como una tuberia de pasos.
- Objetivo del cambio: Separar las etapas del proceso y hacer explicita la intencion del recorrido.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Loop with Pipeline**.
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
