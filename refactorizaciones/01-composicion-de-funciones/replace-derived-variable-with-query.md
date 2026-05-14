# Replace Derived Variable with Query

## 1. Qué es
Elimina una variable derivada almacenada y la calcula mediante una consulta cada vez que se necesita.

### Ejemplo
**Antes**
```java
class Pedido {
    BigDecimal total;
    void agregar(Item item) { items.add(item); total = total.add(item.subtotal()); }
}
```

**Después**
```java
class Pedido {
    BigDecimal total() {
        BigDecimal total = BigDecimal.ZERO;
        for (Item item : items) {
            total = total.add(item.subtotal());
        }
        return total;
    }
}
```

## 2. Cuándo aplica
- Cuando el valor puede derivarse siempre de otros datos confiables.
- Cuando mantener sincronizada la variable derivada produce bugs.

### Ejemplo
```java
class Carrito {
    int cantidadItems; // debería coincidir con items.size()
}
```

## 3. Cómo aplicar
1. Encontrar el dato base del que sale el valor derivado.
2. Crear una query que lo compute bajo demanda.
3. Eliminar actualizaciones manuales del campo derivado.

### Ejemplo
**Antes**
```java
class Factura {
    BigDecimal saldo;
    void pagar(BigDecimal monto) { saldo = total.subtract(pagosAcumulados); }
}
```

**Después**
```java
class Factura {
    BigDecimal saldo() { return total.subtract(pagosAcumulados()); }
}
```

## 4. Cuándo no aplicar
- Cuando el cálculo es costoso y necesitás cacheo explícito.
- Cuando el valor derivado es una instantánea histórica, no una vista actual.

### Ejemplo
```java
class ReporteDiario {
    LocalDate fechaGeneracion;
    BigDecimal totalDelDia; // congelado al cierre
}
```
