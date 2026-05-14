# Replace Query with Parameter

## 1. Qué es
Pasa un valor como parámetro en lugar de consultarlo dentro de la función cuando el llamador ya lo conoce o debe controlarlo.

### Ejemplo
**Antes**
```java
BigDecimal precioFinal(Pedido pedido) {
    return pedido.total().multiply(servicioImpuestos.tasaActual());
}
```

**Después**
```java
BigDecimal precioFinal(Pedido pedido, BigDecimal tasaImpuestos) {
    return pedido.total().multiply(tasaImpuestos);
}
```

## 2. Cuándo aplica
- Cuando la función consulta algo que el llamador ya obtuvo.
- Cuando querés evitar dependencias ocultas o consultas duplicadas.

### Ejemplo
```java
for (Pedido pedido : pedidos) {
    totalizar(pedido); // cada llamada vuelve a pedir la misma cotización
}
```

## 3. Cómo aplicar
1. Identificar la query interna que puede venir desde afuera.
2. Agregar el parámetro explícito a la firma.
3. Hacer que el llamador calcule u obtenga el valor una vez y lo pase.

### Ejemplo
**Antes**
```java
BigDecimal convertir(Dinero monto) {
    return monto.en(servicioCambio.cotizacion());
}
```

**Después**
```java
BigDecimal convertir(Dinero monto, BigDecimal cotizacion) {
    return monto.en(cotizacion);
}
```

## 4. Cuándo no aplicar
- Cuando la query pertenece naturalmente a la responsabilidad interna del método.
- Cuando el parámetro obligaría a propagar detalles por demasiadas capas.

### Ejemplo
```java
String nombreVisible(Usuario usuario, Locale locale) // locale ya vive en el contexto de UI
```
