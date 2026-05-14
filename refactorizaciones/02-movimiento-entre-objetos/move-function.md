# Move Function

## 1. Qué es
Traslada una función a la clase donde está la mayor parte de los datos o de la lógica que necesita.

### Ejemplo
**Antes**
```java
class Cuenta {
    TipoCuenta tipo;
    BigDecimal cargoPorDescubierto() {
        return tipo.esPremium() ? BigDecimal.TEN : BigDecimal.valueOf(30);
    }
}
```

**Después**
```java
class TipoCuenta {
    BigDecimal cargoPorDescubierto() {
        return esPremium() ? BigDecimal.TEN : BigDecimal.valueOf(30);
    }
}
```

## 2. Cuándo aplica
- Cuando la función consulta más a otra clase que a su propia clase.
- Cuando el cambio de reglas debería quedar cerca del dato relevante.

### Ejemplo
```java
BigDecimal precioFinal(Pedido pedido) {
    return pedido.plan().precioBase().add(pedido.plan().impuestos());
}
```

## 3. Cómo aplicar
1. Detectar qué objeto posee los datos usados por la función.
2. Mover la implementación y dejar delegación temporal si conviene.
3. Actualizar llamados hasta que el nuevo hogar sea el único punto de acceso.

### Ejemplo
**Antes**
```java
class Pedido {
    Cliente cliente;
    boolean esDeRiesgo() { return cliente.score() < 500; }
}
```

**Después**
```java
class Cliente {
    boolean esDeRiesgo() { return score() < 500; }
}
```

## 4. Cuándo no aplicar
- Cuando la función coordina varias clases y actúa como orquestadora.
- Cuando moverla haría más difícil descubrir el comportamiento público.

### Ejemplo
```java
class CheckoutService {
    void finalizar(Pedido pedido, Pago pago, Stock stock) { }
}
```
