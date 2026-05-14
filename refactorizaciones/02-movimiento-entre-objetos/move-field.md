# Move Field

## 1. Qué es
Mueve un campo a la clase que realmente lo usa o lo conoce mejor para mejorar cohesión y reducir acoplamiento.

### Ejemplo
**Antes**
```java
class Cliente {
    TipoCliente tipo;
    BigDecimal tasaDescuento;
}
```

**Después**
```java
class TipoCliente {
    BigDecimal tasaDescuento;
}
class Cliente {
    TipoCliente tipo;
}
```

## 2. Cuándo aplica
- Cuando la mayoría de los métodos que usan el campo vive en otra clase.
- Cuando el campo describe mejor a un colaborador que al objeto actual.

### Ejemplo
```java
BigDecimal descuento(Cliente cliente) {
    return cliente.tasaDescuento.multiply(cliente.totalCompra());
}
```

## 3. Cómo aplicar
1. Elegir la clase dueña del dato según uso y significado.
2. Mover el campo y ajustar accesos con métodos de apoyo si hace falta.
3. Actualizar constructores, consultas y validaciones relacionadas.

### Ejemplo
**Antes**
```java
class Pedido {
    String moneda;
    Pais pais;
}
```

**Después**
```java
class Pais {
    String moneda;
}
class Pedido {
    Pais pais;
}
```

## 4. Cuándo no aplicar
- Cuando el campo forma parte central de la identidad del objeto actual.
- Cuando moverlo fuerza dependencias circulares o acceso incómodo.

### Ejemplo
```java
class Persona {
    String nombre;
    LocalDate fechaNacimiento;
}
```
