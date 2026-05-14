# Pull Up Method

## 1. Qué es
Sube a la superclase un método duplicado cuando la implementación es esencialmente la misma en varias subclases.

### Ejemplo
**Antes**
```java
class Gato extends Animal { String descripcion() { return nombre + " - " + edad; } }
class Perro extends Animal { String descripcion() { return nombre + " - " + edad; } }
```

**Después**
```java
class Animal {
    String descripcion() { return nombre + " - " + edad; }
}
```

## 2. Cuándo aplica
- Cuando varias subclases implementan el mismo algoritmo.
- Cuando el método expresa comportamiento común del tipo general.

### Ejemplo
```java
class Transferencia extends Pago { String referencia() { return id + fecha; } }
class Tarjeta extends Pago { String referencia() { return id + fecha; } }
```

## 3. Cómo aplicar
1. Comparar las implementaciones y aislar la parte realmente común.
2. Mover el método al padre o extraer hooks para las variaciones.
3. Borrar las duplicaciones de las subclases.

### Ejemplo
**Antes**
```java
class Pdf extends Reporte { String titulo() { return "Reporte " + fecha; } }
class Csv extends Reporte { String titulo() { return "Reporte " + fecha; } }
```

**Después**
```java
class Reporte {
    String titulo() { return "Reporte " + fecha; }
}
```

## 4. Cuándo no aplicar
- Cuando las implementaciones se parecen pero tienen variaciones importantes.
- Cuando forzar la generalización llevaría a condiciones o hooks artificiales.

### Ejemplo
```java
class Ave extends Animal { int velocidad() { return base - carga(); } }
class Tiburon extends Animal { int velocidad() { return base + empuje(); } }
```
