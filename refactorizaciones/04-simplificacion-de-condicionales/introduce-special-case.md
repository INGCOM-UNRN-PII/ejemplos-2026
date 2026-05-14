# Introduce Special Case

## 1. Qué es
Reemplaza verificaciones repetidas de un caso especial por un objeto o comportamiento específico que lo modele explícitamente.

### Ejemplo
**Antes**
```java
Cliente cliente = buscar(id);
if (cliente == null) {
    return "Consumidor final";
}
return cliente.nombre();
```

**Después**
```java
Cliente cliente = buscar(id);
return cliente.nombre();

class ClienteDesconocido extends Cliente {
    @Override String nombre() { return "Consumidor final"; }
}
```

## 2. Cuándo aplica
- Cuando aparecen muchos null, valores sentinela o ramas especiales dispersas.
- Cuando el caso especial tiene comportamiento estable y repetido.

### Ejemplo
```java
if (suscripcion == null) return BigDecimal.ZERO;
if (suscripcion == null) return "plan gratis";
```

## 3. Cómo aplicar
1. Identificar el caso especial repetido.
2. Crear un objeto o estrategia que represente ese caso.
3. Hacer que los clientes trabajen con el objeto especial en lugar de preguntar por él.

### Ejemplo
**Antes**
```java
if (pago == null) {
    registrarPagoPendiente();
} else {
    registrarPago(pago);
}
```

**Después**
```java
registrarPago(pago);

class PagoPendiente extends Pago {
    @Override boolean estaPendiente() { return true; }
}
```

## 4. Cuándo no aplicar
- Cuando el caso especial representa un error que debe surfacerse.
- Cuando solo existe una ocurrencia aislada y no hay repetición.

### Ejemplo
```java
if (socket == null) {
    throw new IllegalStateException("Conexión no inicializada");
}
```
