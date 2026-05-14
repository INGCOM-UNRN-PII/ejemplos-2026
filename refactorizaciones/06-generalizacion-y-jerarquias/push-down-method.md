# Push Down Method

## 1. Qué es
Mueve un método desde la superclase hacia las subclases que realmente necesitan ese comportamiento.

### Ejemplo
**Antes**
```java
class Empleado {
    BigDecimal calcularComision() { return BigDecimal.ZERO; }
}
```

**Después**
```java
class Empleado { }
class Vendedor extends Empleado {
    BigDecimal calcularComision() { return ventas.multiply(BigDecimal.valueOf(0.05)); }
}
```

## 2. Cuándo aplica
- Cuando el método solo es relevante en algunos subtipos.
- Cuando la implementación del padre es artificial o vacía.

### Ejemplo
```java
class Cuenta {
    void activarMillas() { }
}
class CuentaVuelo extends Cuenta { }
class CuentaDebito extends Cuenta { }
```

## 3. Cómo aplicar
1. Identificar qué subclases usan o redefinen el método.
2. Mover la lógica a esos subtipos.
3. Eliminar del padre la operación que ya no es general.

### Ejemplo
**Antes**
```java
class Documento {
    String timbreFiscal() { return "N/A"; }
}
```

**Después**
```java
class Factura extends Documento {
    String timbreFiscal() { return codigoFiscal; }
}
```

## 4. Cuándo no aplicar
- Cuando el método define parte del protocolo común de la jerarquía.
- Cuando moverlo rompe el polimorfismo esperado por los clientes.

### Ejemplo
```java
abstract class Figura {
    abstract double area();
}
```
