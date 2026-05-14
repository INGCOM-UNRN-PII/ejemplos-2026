# Replace Parameter with Query - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Replace Parameter with Query**.

## Situacion inicial

- Clases involucradas: `CalculadoraInternacion`, `CuentaClinica`, `Paciente`.
- Olor o problema principal: El metodo recibe un dato que puede obtener directamente del objeto principal.
- Objetivo del cambio: Eliminar el parametro redundante y consultar el dato donde corresponde.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Replace Parameter with Query**.
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
