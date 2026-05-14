# Guía jerárquica de refactorizaciones

Esta carpeta quedó reorganizada como una **guía jerárquica**: primero por grupo conceptual y luego por cada refactorización individual.

> **Criterio de clasificación:** la taxonomía prioriza legibilidad pedagógica. Algunas refactorizaciones podrían encajar en más de un grupo, pero acá quedaron ubicadas donde resultan más fáciles de encontrar.

## Índice general

1. [01 - Composición de funciones](./01-composicion-de-funciones/README.md) — ordenar lógica interna, temporales, loops, fases y algoritmos. **13 refactorizaciones**
2. [02 - Movimiento entre objetos](./02-movimiento-entre-objetos/README.md) — mover comportamiento o datos entre clases y revisar delegación. **7 refactorizaciones**
3. [03 - Organización de datos](./03-organizacion-de-datos/README.md) — mejorar modelado, literales y tipos del dominio. **3 refactorizaciones**
4. [04 - Simplificación de condicionales](./04-simplificacion-de-condicionales/README.md) — reducir ramas, explicitar supuestos y reemplazar condicionales por modelos más claros. **5 refactorizaciones**
5. [05 - Simplificación de llamadas](./05-simplificacion-de-llamadas/README.md) — mejorar firmas, parámetros, creación de objetos y manejo de errores. **12 refactorizaciones**
6. [06 - Generalización y jerarquías](./06-generalizacion-y-jerarquias/README.md) — reordenar herencia, especialización y delegación. **8 refactorizaciones**
7. [07 - Limpieza y nombres](./07-limpieza-y-nombres/README.md) — eliminar ruido y mejorar intención semántica. **3 refactorizaciones**

## Ruta sugerida de lectura

1. Empezar por **Composición de funciones**.
2. Seguir con **Simplificación de llamadas** y **Simplificación de condicionales**.
3. Después revisar **Movimiento entre objetos** y **Organización de datos**.
4. Dejar **Generalización y jerarquías** para cuando ya exista una base OO más estable.

