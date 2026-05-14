# Replace Conditional with Polymorphism

## 1. Qué es
Sustituye una condicional basada en tipos o variantes por implementaciones polimórficas en subclases o estrategias.

### Ejemplo
**Antes**
```java
int velocidad(Ave ave) {
    switch (ave.tipo()) {
        case EUROPEA:
            return ave.base();
        case AFRICANA:
            return ave.base() - ave.carga();
        case NORUEGA_AZUL:
            return ave.estaClavada() ? 0 : ave.base();
        default:
            throw new IllegalArgumentException("Tipo desconocido");
    }
}
```

**Después**
```java
abstract class Ave { abstract int velocidad(); }
class Africana extends Ave { int velocidad() { return base() - carga(); } }
```

## 2. Cuándo aplica
- Cuando el switch por tipo aparece repetidamente.
- Cuando cada variante tiene comportamiento propio y estable.

### Ejemplo
```java
if (empleado.tipo() == TEMPORAL) { ... }
if (empleado.tipo() == FIJO) { ... }
```

## 3. Cómo aplicar
1. Identificar la condición que selecciona comportamiento por variante.
2. Crear subclases o estrategias por cada caso.
3. Mover la lógica de cada rama a su implementación polimórfica.

### Ejemplo
**Antes**
```java
BigDecimal comision(Vendedor vendedor) {
    return vendedor.esSenior() ? tasaAlta() : tasaBaja();
}
```

**Después**
```java
interface PoliticaComision { BigDecimal calcular(Vendedor vendedor); }
```

## 4. Cuándo no aplicar
- Cuando la condicional es pequeña, estable y aparece una sola vez.
- Cuando la variante cambia dinámicamente y conviene modelarla como dato.

### Ejemplo
```java
if (paginaActual == 1) {
    mostrarBotonAnterior(false);
}
```
