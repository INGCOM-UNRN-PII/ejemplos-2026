# Replace Temp with Query

## 1. Qué es
Reemplaza una variable temporal por una query o método de consulta cuando el valor expresa un cálculo reutilizable.

### Ejemplo
**Antes**
```java
double base = cantidad() * precioUnitario();
if (base > 1000) {
    return base * 0.95;
}
return base;
```

**Después**
```java
if (base() > 1000) {
    return base() * 0.95;
}
return base();
```

## 2. Cuándo aplica
- Cuando la expresión temporal representa un concepto del dominio.
- Cuando querés habilitar futuras extracciones o refactorizaciones sobre esa consulta.

### Ejemplo
```java
BigDecimal subtotal = pedido.total().subtract(pedido.descuento());
if (subtotal.compareTo(BigDecimal.ZERO) < 0) { ... }
```

## 3. Cómo aplicar
1. Identificar el temporal calculado a partir de estado del objeto.
2. Extraer una query sin efectos colaterales que compute ese valor.
3. Reemplazar las referencias al temporal por la query.

### Ejemplo
**Antes**
```java
int puntos = victorias * 3 + empates;
return puntos >= 30;
```

**Después**
```java
boolean clasifica() {
    return puntos() >= 30;
}
int puntos() {
    return victorias * 3 + empates;
}
```

## 4. Cuándo no aplicar
- Cuando la expresión es costosa y repetirla empeora rendimiento real.
- Cuando el temporal ayuda a depurar una secuencia compleja dentro de un método.

### Ejemplo
```java
byte[] contenido = archivoGrande.leerTodo();
procesar(contenido);
```
