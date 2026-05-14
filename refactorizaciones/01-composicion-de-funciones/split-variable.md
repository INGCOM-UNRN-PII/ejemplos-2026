# Split Variable

## 1. Qué es
Divide una variable que se reutiliza para propósitos distintos en varias variables con una sola responsabilidad cada una.

### Ejemplo
**Antes**
```java
BigDecimal valor = pedido.subtotal();
valor = valor.subtract(pedido.descuento());
valor = valor.add(pedido.impuestos());
```

**Después**
```java
BigDecimal subtotal = pedido.subtotal();
BigDecimal neto = subtotal.subtract(pedido.descuento());
BigDecimal total = neto.add(pedido.impuestos());
```

## 2. Cuándo aplica
- Cuando una variable cambia de significado durante el método.
- Cuando un solo nombre obliga a reconstruir mentalmente en qué etapa está el valor.

### Ejemplo
```java
int resultado = inicio;
resultado += avance;
resultado = resultado / cantidad;
```

## 3. Cómo aplicar
1. Detectar reasignaciones donde el valor pasa a representar otra cosa.
2. Crear una variable por etapa o concepto.
3. Actualizar nombres para reflejar el significado real de cada una.

### Ejemplo
**Antes**
```java
LocalDate fecha = inicio;
fecha = fecha.plusDays(30);
fecha = ajustarSiFeriado(fecha);
```

**Después**
```java
LocalDate fechaBase = inicio;
LocalDate fechaTentativa = fechaBase.plusDays(30);
LocalDate fechaVencimiento = ajustarSiFeriado(fechaTentativa);
```

## 4. Cuándo no aplicar
- Cuando la variable realmente representa el mismo acumulador a lo largo de todo el método.
- Cuando crear más nombres haría ruido sin aclarar nada.

### Ejemplo
```java
int suma = 0;
for (int n : numeros) suma += n;
```
