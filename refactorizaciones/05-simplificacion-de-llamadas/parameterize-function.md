# Parameterize Function

## 1. Qué es
Unifica funciones muy similares sustituyendo la parte variable por un parámetro explícito.

### Ejemplo
**Antes**
```java
BigDecimal descuentoEstudiante(BigDecimal total) { return total.multiply(BigDecimal.valueOf(0.10)); }
BigDecimal descuentoJubilado(BigDecimal total) { return total.multiply(BigDecimal.valueOf(0.15)); }
```

**Después**
```java
BigDecimal descuento(BigDecimal total, BigDecimal porcentaje) {
    return total.multiply(porcentaje);
}
```

## 2. Cuándo aplica
- Cuando dos funciones difieren solo en un literal o una regla pequeña.
- Cuando un parámetro expresa claramente la variación permitida.

### Ejemplo
```java
precioMayorista(total);
precioMinorista(total);
```

## 3. Cómo aplicar
1. Detectar qué parte de la implementación cambia entre funciones.
2. Convertir esa variación en parámetro con nombre claro.
3. Reemplazar las funciones duplicadas por una versión parametrizada.

### Ejemplo
**Antes**
```java
String etiquetaUrgente() { return "URGENTE"; }
String etiquetaNormal() { return "NORMAL"; }
```

**Después**
```java
String etiqueta(String tipo) { return tipo.toUpperCase(); }
```

## 4. Cuándo no aplicar
- Cuando las variantes representan conceptos de negocio distintos.
- Cuando el parámetro introduce combinaciones inválidas o difíciles de entender.

### Ejemplo
```java
calcularPrecio(producto, true, false, "A", 7);
```
