# Pull Up Constructor Body - nivel basico

## Enunciado

Dadas las clases de `Escenario.java`, aplica **Pull Up Constructor Body**.

## Situacion inicial

- Clases involucradas: `PersonaBase`, `Cliente`, `Proveedor`.
- Olor o problema principal: Las subclases repiten la misma inicializacion en sus constructores.
- Objetivo del cambio: Subir la parte comun al constructor de la superclase.

## Consigna

1. Analiza las clases dadas.
2. Identifica donde aplicar la refactorizacion **Pull Up Constructor Body**.
3. Reorganiza el codigo manteniendo el comportamiento observable.

## Nivel de dificultad

- Nivel: **Basico**
- Caracter del caso: Casos cortos, con una o dos clases y una sola decision principal de refactorizacion.
- Expectativa: Resuelve el ejercicio sin agregar capas nuevas si no son necesarias.

## Lo que se espera

- Identifica un unico punto principal de cambio.
- Aplica la refactorizacion sin reescribir todo el ejercicio.
- Manten el codigo resultante facil de leer.

## Pista docente

Busca el olor mas visible y resuelve primero el caso central.
