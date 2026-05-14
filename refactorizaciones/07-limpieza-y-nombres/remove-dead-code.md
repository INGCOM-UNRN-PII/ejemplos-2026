# Remove Dead Code

## 1. Qué es
Elimina código que ya no participa del comportamiento real del sistema: ramas inalcanzables, métodos sin uso, clases obsoletas o campos ignorados.

### Ejemplo
**Antes**
```java
private void recalcularVersionAnterior() {
    // ya no es llamado por nadie
}
```

**Después**
```java
// método eliminado
```

## 2. Cuándo aplica
- Cuando el código no tiene referencias activas ni forma parte del contrato público usado.
- Cuando mantenerlo solo agrega ruido y dudas sobre cuál es el camino vigente.

### Ejemplo
```java
if (false) {
    enviarFax();
}
```

## 3. Cómo aplicar
1. Identificar referencias reales y confirmar que el código no se ejecuta.
2. Borrar primero los llamados y luego la implementación muerta.
3. Eliminar también tests, configuración o documentación obsoleta asociada.

### Ejemplo
**Antes**
```java
private BigDecimal impuestoViejo(BigDecimal total) {
    return total.multiply(BigDecimal.valueOf(0.18));
}
```

**Después**
```java
// impuestoViejo eliminado porque la regla actual usa IVA unificado
```

## 4. Cuándo no aplicar
- Cuando el código es invocado por reflexión, configuración externa o APIs públicas aún consumidas.
- Cuando solo sospechás que está muerto pero no tenés evidencia suficiente.

### Ejemplo
```java
Class.forName("ar.unrn.PluginLegacy").getDeclaredConstructor().newInstance();
```
