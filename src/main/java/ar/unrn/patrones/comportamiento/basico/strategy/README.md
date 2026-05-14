# Patrón Strategy (Nivel básico)

Este ejemplo muestra la versión más corta del patrón **Strategy**: una `Calculadora` que no decide por sí misma si debe
sumar o multiplicar.

## Idea central

- `OperacionStrategy` define el contrato común.
- `SumaStrategy` y `MultiplicacionStrategy` encapsulan algoritmos distintos.
- `Calculadora` delega la operación a la estrategia activa.

## Qué discutir en clase

1. Cómo desaparece el `if` o `switch` que elegiría la operación.
2. Cómo el contexto cambia de comportamiento sin cambiar de clase.
3. Cómo agregar una nueva operación sin modificar `Calculadora`.

## Ejecución

Ejecutar `MainStrategy.java`.
