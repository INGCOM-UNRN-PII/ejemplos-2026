# Code Smells: Dispensables

Un "dispensable" es algo inútil e innecesario cuya ausencia haría el código más limpio, eficiente y fácil de entender.

- **Comments**: Comentarios que explican el "qué" o "cómo" en lugar del "por qué", o que simplemente repiten lo que el
  código ya dice.
- **Duplicate Code**: El mismo código (o muy similar) aparece en más de un lugar.
- **Data Class**: Una clase que solo contiene campos y métodos de acceso (getters/setters), sin lógica de negocio.
- **Dead Code**: Código que nunca se utiliza (variables, métodos, clases).
- **Lazy Class**: Una clase que no hace lo suficiente para justificar su existencia.
- **Speculative Generality**: Abstracciones, interfaces o parámetros creados "por si acaso" se necesitan en el futuro,
  pero que no tienen uso actual.
