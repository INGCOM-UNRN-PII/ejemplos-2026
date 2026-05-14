# Move Statements to Callers

## 1. Qué es
Empuja sentencias fuera de una función cuando no forman parte universal de su responsabilidad y solo algunos llamadores las necesitan.

### Ejemplo
**Antes**
```java
String resumen(Pedido pedido) {
    imprimirEncabezado();
    return pedido.numero() + " - " + pedido.total();
}
```

**Después**
```java
imprimirEncabezado();
String resumen = resumen(pedido);

String resumen(Pedido pedido) {
    return pedido.numero() + " - " + pedido.total();
}
```

## 2. Cuándo aplica
- Cuando la función hace trabajo accesorio que no todos los llamadores desean.
- Cuando el comportamiento central queda más reutilizable sin esas sentencias.

### Ejemplo
```java
String html = renderizar(producto); // web necesita layout
String texto = renderizar(producto); // email no necesita layout
```

## 3. Cómo aplicar
1. Identificar sentencias que no pertenecen al núcleo de la función.
2. Moverlas a los llamadores que realmente las requieren.
3. Dejar la función enfocada en una sola responsabilidad.

### Ejemplo
**Antes**
```java
BigDecimal totalConLog(Pedido pedido) {
    log.info("Calculando");
    return total(pedido);
}
```

**Después**
```java
log.info("Calculando");
BigDecimal total = total(pedido);
```

## 4. Cuándo no aplicar
- Cuando todos los llamadores sí necesitan ese trabajo.
- Cuando moverlo duplica lógica idéntica en muchos puntos.

### Ejemplo
```java
void guardar(Entidad entidad) {
    validar(entidad);
    repositorio.save(entidad);
}
```
