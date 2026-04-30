# Code Smells: Bloaters

Los "Bloaters" son códigos, métodos y clases que han aumentado a proporciones tan gigantescas que es difícil trabajar con ellos.

- **Long Method**: Un método que contiene demasiadas líneas de código.
- **Large Class**: Una clase que tiene demasiados campos, métodos y responsabilidades.
- **Primitive Obsession**: Uso excesivo de tipos primitivos para representar conceptos del dominio (ej: usar `String` para un Email en lugar de una clase `Email`).
- **Long Parameter List**: Métodos con más de 3 o 4 parámetros.
- **Data Clumps**: Grupos de datos que siempre aparecen juntos (como parámetros o campos). Deberían convertirse en su propia clase.
