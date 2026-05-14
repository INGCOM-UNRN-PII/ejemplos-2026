# Replace Exception with Precheck

## 1. Qué es
Evita usar excepciones para controlar flujo normal realizando una verificación previa barata y explícita.

### Ejemplo
**Antes**
```java
try {
    stock.reservar(cantidad);
} catch (SinStockException e) {
    return false;
}
```

**Después**
```java
if (!stock.hayDisponible(cantidad)) {
    return false;
}
stock.reservar(cantidad);
```

## 2. Cuándo aplica
- Cuando la condición de falla puede conocerse antes de ejecutar la operación.
- Cuando el caso es habitual y no merece el costo cognitivo de una excepción.

### Ejemplo
```java
try {
    LocalDate.parse(texto);
} catch (DateTimeParseException e) {
    mostrarError();
}
```

## 3. Cómo aplicar
1. Identificar excepciones usadas como rama esperable.
2. Introducir una consulta previa que indique si la operación es válida.
3. Mantener la excepción para fallas inesperadas o carreras si todavía pueden ocurrir.

### Ejemplo
**Antes**
```java
try {
    cuenta.debitar(monto);
    return true;
} catch (SaldoInsuficienteException e) {
    return false;
}
```

**Después**
```java
if (!cuenta.puedeDebitar(monto)) {
    return false;
}
cuenta.debitar(monto);
return true;
```

## 4. Cuándo no aplicar
- Cuando la falla sigue siendo excepcional o imposible de predecir con seguridad.
- Cuando la verificación previa duplicaría una lógica costosa o propensa a carreras.

### Ejemplo
```java
try {
    socket.getOutputStream().write(bytes);
} catch (IOException e) {
    reconectar();
}
```
