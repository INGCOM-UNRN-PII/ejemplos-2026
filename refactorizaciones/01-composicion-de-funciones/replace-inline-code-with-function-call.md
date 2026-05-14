# Replace Inline Code with Function Call

## 1. Qué es
Reemplaza código duplicado o conceptualmente importante escrito en línea por una llamada a función con nombre.

### Ejemplo
**Antes**
```java
String telefonoLimpio = telefono.replace("-", "").replace(" ", "");
```

**Después**
```java
String telefonoLimpio = normalizarTelefono(telefono);
```

## 2. Cuándo aplica
- Cuando una secuencia de sentencias se repite en varios lugares.
- Cuando un nombre puede explicar mejor la intención que el detalle inline.

### Ejemplo
```java
if (monto.compareTo(BigDecimal.ZERO) > 0 && monto.compareTo(limite) <= 0) { ... }
```

## 3. Cómo aplicar
1. Encontrar el bloque inline repetido o conceptualmente relevante.
2. Extraerlo a una función con nombre del dominio.
3. Reemplazar las copias por la nueva llamada.

### Ejemplo
**Antes**
```java
String slug = titulo.toLowerCase().replace(" ", "-");
```

**Después**
```java
String slug = generarSlug(titulo);
```

## 4. Cuándo no aplicar
- Cuando el bloque es trivial y aparece una sola vez.
- Cuando extraerlo obliga a pasar demasiados datos solo para evitar una línea.

### Ejemplo
```java
int siguiente = indice + 1;
```
