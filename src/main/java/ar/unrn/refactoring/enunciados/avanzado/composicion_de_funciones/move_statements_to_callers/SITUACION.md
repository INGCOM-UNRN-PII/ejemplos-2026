# Move Statements to Callers - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Move Statements to Callers**.

## Situacion inicial

- Clases involucradas: `ArmadorHistoriaClinica`, `Paciente`.
- Olor o problema principal: Un metodo mezcla su responsabilidad central con trabajo accesorio que no todos los llamadores desean.
- Objetivo del cambio: Empujar el trabajo accesorio a los llamadores correctos.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Move Statements to Callers**.
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
