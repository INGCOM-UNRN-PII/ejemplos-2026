# Code Smells: Object-Orientation Abusers

Estos olores son aplicaciones incompletas o incorrectas de los principios de la programación orientada a objetos.

- **Switch Statements**: Uso de `switch` o `if` complejos que deberían ser reemplazados por polimorfismo.
- **Refused Bequest**: Una subclase que hereda métodos de una superclase pero no los utiliza o lanza excepciones porque no tienen sentido para ella.
- **Alternative Classes with Different Interfaces**: Dos clases que hacen lo mismo pero tienen métodos con diferentes nombres.
- **Temporary Field**: Campos de una clase que solo se utilizan bajo ciertas circunstancias o durante un algoritmo específico, permaneciendo vacíos el resto del tiempo.
