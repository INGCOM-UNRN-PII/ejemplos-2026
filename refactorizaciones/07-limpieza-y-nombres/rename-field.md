# Rename Field

## 1. Qué es
Cambia el nombre de un campo para que describa su significado real y reduzca ambigüedad.

### Ejemplo
**Antes**
```java
class Persona {
    LocalDate fchNac;
}
```

**Después**
```java
class Persona {
    LocalDate fechaNacimiento;
}
```

## 2. Cuándo aplica
- Cuando el nombre es críptico, engañoso o desactualizado.
- Cuando el campo se usa bien pero se entiende mal.

### Ejemplo
```java
class Pedido {
    BigDecimal valor; // ¿subtotal, total, neto?
}
```

## 3. Cómo aplicar
1. Elegir un nombre que refleje intención y unidad semántica.
2. Usar rename automático para actualizar todas las referencias.
3. Ajustar serialización o compatibilidad si el campo es parte de un contrato externo.

### Ejemplo
**Antes**
```java
class Factura {
    BigDecimal imp;
}
```

**Después**
```java
class Factura {
    BigDecimal importeTotal;
}
```

## 4. Cuándo no aplicar
- Cuando el campo es parte de un contrato externo que no podés cambiar sin migración.
- Cuando el nuevo nombre solo cambia estilo pero no claridad.

### Ejemplo
```java
record Evento(String id) { }
```
