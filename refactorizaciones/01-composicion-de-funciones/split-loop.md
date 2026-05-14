# Split Loop

## 1. Qué es
Divide un loop que hace varias cosas distintas en varios loops, uno por responsabilidad.

### Ejemplo
**Antes**
```java
int total = 0;
int pendientes = 0;
for (Pedido pedido : pedidos) {
    total += pedido.total().intValue();
    if (pedido.estaPendiente()) pendientes++;
}
```

**Después**
```java
int total = 0;
for (Pedido pedido : pedidos) {
    total += pedido.total().intValue();
}
int pendientes = 0;
for (Pedido pedido : pedidos) {
    if (pedido.estaPendiente()) pendientes++;
}
```

## 2. Cuándo aplica
- Cuando un loop mezcla cálculos independientes.
- Cuando separar responsabilidades mejora comprensión y habilita más refactorizaciones.

### Ejemplo
```java
for (Alumno alumno : alumnos) {
    acumularNotas(alumno);
    enviarAlertaSiFalta(alumno);
}
```

## 3. Cómo aplicar
1. Listar cada responsabilidad que hoy convive en el mismo loop.
2. Crear un loop por responsabilidad preservando el orden necesario.
3. Nombrar o extraer cada pasada si ayuda a la intención.

### Ejemplo
**Antes**
```java
for (Factura factura : facturas) {
    totalizar(factura);
    validarVencimiento(factura);
}
```

**Después**
```java
for (Factura factura : facturas) {
    totalizar(factura);
}
for (Factura factura : facturas) {
    validarVencimiento(factura);
}
```

## 4. Cuándo no aplicar
- Cuando el costo de recorrer dos veces es crítico y medido.
- Cuando ambas tareas dependen unas de otras en cada iteración.

### Ejemplo
```java
for (Nodo nodo : nodos) {
    if (nodo.siguiente() == null) enlazarFin(nodo);
}
```
