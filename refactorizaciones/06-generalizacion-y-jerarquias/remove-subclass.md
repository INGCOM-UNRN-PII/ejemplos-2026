# Remove Subclass

## 1. Qué es
Elimina una subclase cuando ya no aporta comportamiento o datos propios y solo complica la jerarquía.

### Ejemplo
**Antes**
```java
class ClienteVipSinBeneficios extends Cliente {
}
```

**Después**
```java
class Cliente {
}
```

## 2. Cuándo aplica
- Cuando el subtipo no tiene diferencias relevantes con la clase base.
- Cuando la especialización quedó vacía después de otras refactorizaciones.

### Ejemplo
```java
class ReporteMensual extends Reporte {
}
```

## 3. Cómo aplicar
1. Mover cualquier detalle residual a la clase base o a un delegado.
2. Actualizar los sitios que instancian o tipan la subclase.
3. Eliminar la subclase vacía.

### Ejemplo
**Antes**
```java
Procesador procesador = new ProcesadorRapido();
```

**Después**
```java
Procesador procesador = new Procesador();
```

## 4. Cuándo no aplicar
- Cuando el subtipo expresa una diferencia de dominio estable.
- Cuando los clientes dependen de polimorfismo real y no de duplicación accidental.

### Ejemplo
```java
class CuentaCorriente extends Cuenta {
    @Override BigDecimal descubiertoPermitido() { return BigDecimal.valueOf(50000); }
}
```
