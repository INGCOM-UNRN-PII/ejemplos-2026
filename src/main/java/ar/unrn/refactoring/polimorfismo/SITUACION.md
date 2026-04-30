# Refactorización: Replace Conditional with Polymorphism

## Situación Inicial
Tenemos una clase `Empleado` con un código de tipo (ENGINEER, SALESMAN, MANAGER) y un método `calcularSalario()` que usa un `switch`. Cada vez que agregamos un tipo de empleado, debemos modificar el `switch`.

## Objetivo
Mover la lógica del `switch` a subclases de `Empleado` para que cada una sepa cómo calcular su propio salario.

## Pasos para el "Vivo"
1. Crear una clase abstracta o interfaz `TipoEmpleado`.
2. Crear subclases para cada tipo.
3. Mover el cuerpo de cada caso del `switch` al método `calcularSalario()` de la subclase correspondiente.
4. Reemplazar el `switch` por una llamada polimórfica: `tipo.calcularSalario(this)`.
