# Inline Function

## 1. Qué es
Reemplaza una llamada a función por su cuerpo cuando la abstracción no agrega nombre útil ni intención adicional.

### Ejemplo
**Antes**
```java
int descuento(int total) {
    return descuentoBasico(total);
}
int descuentoBasico(int total) {
    return total < 10000 ? 0 : 500;
}
```

**Después**
```java
int descuento(int total) {
    return total < 10000 ? 0 : 500;
}
```

## 2. Cuándo aplica
- Cuando la función envuelve otra expresión trivial.
- Cuando el nombre no explica más que el propio código.

### Ejemplo
```java
boolean activo(Usuario usuario) {
    return esActivo(usuario);
}
```

## 3. Cómo aplicar
1. Confirmar que la función no aporta una abstracción estable.
2. Sustituir cada llamado por el cuerpo equivalente.
3. Eliminar la función inlined y simplificar el flujo.

### Ejemplo
**Antes**
```java
if (esMayorDeEdad(persona)) {
    aprobar();
}
```

**Después**
```java
if (persona.edad() >= 18) {
    aprobar();
}
```

## 4. Cuándo no aplicar
- Cuando el nombre comunica una intención de negocio valiosa.
- Cuando la lógica es reutilizada o está a punto de crecer.

### Ejemplo
```java
if (cliente.puedeRecibirDescuentoDeBienvenida()) {
    aplicarDescuento();
}
```
