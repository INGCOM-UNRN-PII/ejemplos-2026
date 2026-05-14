# Replace Loop with Pipeline

## 1. Qué es
Sustituye un bucle imperativo por una tubería explícita de etapas de procesamiento. En esta guía, la tubería se muestra con objetos encadenados para no depender de `Stream` ni de programación funcional.

### Ejemplo
**Antes**
```java
BigDecimal total = BigDecimal.ZERO;
for (Pedido pedido : pedidos) {
    if (pedido.activo()) {
        total = total.add(pedido.total());
    }
}
```

**Después**
```java
BigDecimal total = new PipelineDePedidos(pedidos)
    .soloActivos()
    .extraerTotales()
    .sumar();
```

## 2. Cuándo aplica
- Cuando el loop transforma una colección con etapas claras de selección, transformación o acumulación.
- Cuando una tubería de pasos deja más visible la intención que el control manual del bucle.

### Ejemplo
```java
List<String> emails = new ArrayList<>();
for (Usuario usuario : usuarios) {
    if (usuario.activo()) emails.add(usuario.email());
}
```

## 3. Cómo aplicar
1. Separar mentalmente las etapas del loop: origen, selección, transformación y acumulación.
2. Representar cada etapa con una operación explícita de la tubería.
3. Reemplazar variables acumuladoras y control manual por esa secuencia de pasos.

### Ejemplo
**Antes**
```java
List<String> nombres = new ArrayList<>();
for (Producto producto : productos) {
    nombres.add(producto.nombre());
}
```

**Después**
```java
List<String> nombres = new PipelineDeProductos(productos)
    .extraerNombres()
    .comoLista();
```

## 4. Cuándo no aplicar
- Cuando el loop tiene cortes complejos, mutaciones cruzadas o manejo fino del índice.
- Cuando la tubería resultante queda menos clara que el bucle original.

### Ejemplo
```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] == objetivo) return true;
    }
}
```
