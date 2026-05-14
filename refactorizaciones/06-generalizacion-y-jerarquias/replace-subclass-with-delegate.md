# Replace Subclass with Delegate

## 1. Qué es
Reemplaza una subclase por composición cuando la variación se implementa mejor delegando en un objeto que heredando.

### Ejemplo
**Antes**
```java
class PedidoUrgente extends Pedido {
    @Override int diasEntrega() { return 1; }
}
```

**Después**
```java
class Pedido {
    PoliticaEntrega politicaEntrega;
    int diasEntrega() { return politicaEntrega.diasEntrega(); }
}
```

## 2. Cuándo aplica
- Cuando la herencia solo existe para cambiar una parte del comportamiento.
- Cuando la variante debería combinarse o cambiarse sin tocar la jerarquía.

### Ejemplo
```java
class UsuarioAdmin extends Usuario {
    @Override Set<Permiso> permisos() { return TODOS; }
}
```

## 3. Cómo aplicar
1. Identificar el comportamiento variable hoy puesto en la subclase.
2. Extraerlo a un delegado o estrategia.
3. Hacer que la clase principal componga ese delegado y eliminar la subclase.

### Ejemplo
**Antes**
```java
class PrecioPromocional extends Precio {
    @Override BigDecimal total() { return base().multiply(BigDecimal.valueOf(0.8)); }
}
```

**Después**
```java
class Precio {
    ReglaPrecio regla;
    BigDecimal total() { return regla.total(base()); }
}
```

## 4. Cuándo no aplicar
- Cuando la subclase es un subtipo real y estable del dominio.
- Cuando el polimorfismo por herencia ya es claro y suficiente.

### Ejemplo
```java
class CuentaCorriente extends Cuenta {
    @Override BigDecimal descubiertoPermitido() { return BigDecimal.valueOf(50000); }
}
```
