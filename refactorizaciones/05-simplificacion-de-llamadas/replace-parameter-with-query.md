# Replace Parameter with Query

## 1. Qué es
Elimina un parámetro cuando su valor puede obtenerse de forma confiable dentro del propio objeto o contexto receptor.

### Ejemplo
**Antes**
```java
BigDecimal totalConDescuento(Pedido pedido, TipoCliente tipo) {
    return pedido.total().multiply(tipo.factor());
}
```

**Después**
```java
BigDecimal totalConDescuento(Pedido pedido) {
    return pedido.total().multiply(pedido.cliente().tipo().factor());
}
```

## 2. Cuándo aplica
- Cuando el llamador siempre pasa un valor derivado del mismo objeto.
- Cuando el parámetro duplica información ya disponible en el receptor.

### Ejemplo
```java
calcularMora(cuenta, cuenta.fechaVencimiento());
```

## 3. Cómo aplicar
1. Verificar que el valor pueda consultarse desde el objeto correcto.
2. Mover la obtención del dato a la función.
3. Eliminar el parámetro redundante y simplificar llamados.

### Ejemplo
**Antes**
```java
boolean esMoroso(Cliente cliente, int deuda) {
    return deuda > 0 && cliente.activo();
}
```

**Después**
```java
boolean esMoroso(Cliente cliente) {
    return cliente.deuda() > 0 && cliente.activo();
}
```

## 4. Cuándo no aplicar
- Cuando la query introduce dependencia oculta o vuelve más difícil testear.
- Cuando el llamador ya calculó el valor por una razón de costo o consistencia.

### Ejemplo
```java
BigDecimal calcularPrecioConTipo(Pedido pedido, TipoCambio tipoCambioExterno)
```
