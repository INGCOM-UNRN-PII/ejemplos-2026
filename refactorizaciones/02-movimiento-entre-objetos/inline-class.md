# Inline Class

## 1. Qué es
Integra una clase en otra cuando la clase separada ya no tiene responsabilidad propia o quedó demasiado pequeña para justificarse.

### Ejemplo
**Antes**
```java
class Telefono {
    String numero;
}
class Persona {
    Telefono telefono;
}
```

**Después**
```java
class Persona {
    String telefono;
}
```

## 2. Cuándo aplica
- Cuando una clase solo contiene datos triviales y delega todo.
- Cuando separar la clase agrega más indirection que valor.

### Ejemplo
```java
class Coordenadas {
    int x;
    int y;
}
class Cursor {
    Coordenadas posicion;
}
```

## 3. Cómo aplicar
1. Mover los campos y métodos relevantes a la clase principal.
2. Actualizar referencias de clientes y constructores.
3. Eliminar la clase absorbida cuando ya no tenga uso.

### Ejemplo
**Antes**
```java
class Cuenta {
    LimiteCredito limite;
}
```

**Después**
```java
class Cuenta {
    BigDecimal limiteCredito;
}
```

## 4. Cuándo no aplicar
- Cuando la clase encapsula reglas, validaciones o invariantes propios.
- Cuando la separación mejora el lenguaje del dominio.

### Ejemplo
```java
class Email {
    Email(String valor) { validar(valor); }
    String dominio() { return valor.split("@")[1]; }
}
```
