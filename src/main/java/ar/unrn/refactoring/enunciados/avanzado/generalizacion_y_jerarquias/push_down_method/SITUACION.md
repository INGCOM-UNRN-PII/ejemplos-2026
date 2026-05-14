# Push Down Method - nivel avanzado

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Push Down Method**.

## Situacion inicial

- Clases involucradas: `Paciente`, `PacienteConCobertura`, `PacienteParticular`.
- Olor o problema principal: Un metodo aparece en la superclase aunque solo tiene sentido en algunos hijos.
- Objetivo del cambio: Moverlo a las subclases relevantes.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Push Down Method**.
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
