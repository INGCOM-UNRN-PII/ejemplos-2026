# Inline Variable

## 1. Qué es
Reemplaza una variable temporal por la expresión original cuando la variable no agrega nombre, separación conceptual ni reutilización.

### Ejemplo
**Antes**
```java
double base = precio() * cantidad();
return base - descuento();
```

**Después**
```java
return precio() * cantidad() - descuento();
```

## 2. Cuándo aplica
- Cuando la variable se usa una sola vez.
- Cuando el nombre repite literalmente la expresión.

### Ejemplo
```java
boolean valido = usuario != null;
return valido;
```

## 3. Cómo aplicar
1. Verificar que la expresión sea simple y segura de repetir.
2. Reemplazar la referencia por la expresión.
3. Eliminar la variable temporal sobrante.

### Ejemplo
**Antes**
```java
String nombreCompleto = persona.nombre() + " " + persona.apellido();
imprimir(nombreCompleto);
```

**Después**
```java
imprimir(persona.nombre() + " " + persona.apellido());
```

## 4. Cuándo no aplicar
- Cuando el temporal documenta una idea importante.
- Cuando la expresión es costosa, compleja o útil para depurar.

### Ejemplo
```java
BigDecimal subtotalSinImpuestos = precioBase()
    .subtract(descuentos())
    .add(recargos());
```
