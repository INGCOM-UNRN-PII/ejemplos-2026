# Replace Type Code with Subclasses

## 1. Qué es
Sustituye un campo de tipo que controla comportamiento por subclases concretas que encapsulan cada variante.

### Ejemplo
**Antes**
```java
class Empleado {
    static final int FIJO = 1;
    static final int TEMPORAL = 2;
    int tipo;
}
```

**Después**
```java
abstract class Empleado { }
class EmpleadoFijo extends Empleado { }
class EmpleadoTemporal extends Empleado { }
```

## 2. Cuándo aplica
- Cuando el código de tipo gobierna comportamiento y genera switches repetidos.
- Cuando la variante es estable durante la vida del objeto.

### Ejemplo
```java
if (empleado.tipo == Empleado.FIJO) { ... }
if (empleado.tipo == Empleado.TEMPORAL) { ... }
```

## 3. Cómo aplicar
1. Identificar el type code y sus ramas de comportamiento.
2. Crear una subclase por variante relevante.
3. Mover datos y comportamiento específicos a cada subtipo.

### Ejemplo
**Antes**
```java
BigDecimal salario() {
    return tipo == FIJO ? base : horas * tarifa;
}
```

**Después**
```java
class EmpleadoFijo extends Empleado {
    BigDecimal salario() { return base; }
}
class EmpleadoTemporal extends Empleado {
    BigDecimal salario() { return horas.multiply(tarifa); }
}
```

## 4. Cuándo no aplicar
- Cuando el tipo cambia frecuentemente en runtime y sería costoso recrear objetos.
- Cuando el code solo describe datos y no controla comportamiento.

### Ejemplo
```java
class Pedido {
    String canal; // WEB, APP, MOSTRADOR solo para reporting
}
```
