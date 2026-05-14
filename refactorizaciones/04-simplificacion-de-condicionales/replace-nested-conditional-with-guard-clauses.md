# Replace Nested Conditional with Guard Clauses

## 1. Qué es
Aplana condicionales anidadas usando retornos tempranos para los casos especiales y dejando el camino principal sin indentación excesiva.

### Ejemplo
**Antes**
```java
BigDecimal calcularPago(Empleado empleado) {
    if (empleado != null) {
        if (empleado.activo()) {
            return empleado.salario();
        }
    }
    return BigDecimal.ZERO;
}
```

**Después**
```java
BigDecimal calcularPago(Empleado empleado) {
    if (empleado == null) return BigDecimal.ZERO;
    if (!empleado.activo()) return BigDecimal.ZERO;
    return empleado.salario();
}
```

## 2. Cuándo aplica
- Cuando los casos excepcionales tapan el flujo principal con indentación.
- Cuando cada validación puede resolverse rápido y salir.

### Ejemplo
```java
if (pedido != null) {
    if (!pedido.cancelado()) {
        if (pedido.tieneItems()) {
            procesar(pedido);
        }
    }
}
```

## 3. Cómo aplicar
1. Identificar casos borde que cortan la ejecución.
2. Moverlos al inicio como guard clauses con retorno temprano.
3. Dejar abajo el camino feliz sin anidación innecesaria.

### Ejemplo
**Antes**
```java
if (usuario != null) {
    if (usuario.verificado()) {
        enviar(usuario);
    }
}
```

**Después**
```java
if (usuario == null) return;
if (!usuario.verificado()) return;
enviar(usuario);
```

## 4. Cuándo no aplicar
- Cuando la estructura anidada expresa una decisión compuesta que se lee mejor junta.
- Cuando múltiples retornos perjudican invariantes de salida o recursos manuales.

### Ejemplo
```java
if (monto > 0) {
    if (monto < minimo) {
        advertir();
    } else {
        aprobar();
    }
}
```
