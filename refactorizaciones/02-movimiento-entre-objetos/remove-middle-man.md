# Remove Middle Man

## 1. Qué es
Elimina una clase o método intermediario que solo reenvía llamadas a otro objeto sin agregar valor real.

### Ejemplo
**Antes**
```java
class Persona {
    Departamento departamento() { return departamento; }
    Gerente gerente() { return departamento.gerente(); }
}
```

**Después**
```java
Gerente gerente = persona.departamento().gerente();
```

## 2. Cuándo aplica
- Cuando la clase anfitriona solo delega y no protege ninguna abstracción útil.
- Cuando los clientes necesitan más operaciones del delegado que del anfitrión.

### Ejemplo
```java
pedido.cliente().direccion().ciudad();
pedido.cliente().direccion().codigoPostal();
```

## 3. Cómo aplicar
1. Detectar reenvíos triviales que no agregan reglas.
2. Permitir que los clientes hablen con el delegado directamente.
3. Eliminar los métodos intermediarios sobrantes.

### Ejemplo
**Antes**
```java
class Orden {
    Pago pago() { return pago; }
    BigDecimal montoPagado() { return pago.monto(); }
}
```

**Después**
```java
BigDecimal monto = orden.pago().monto();
```

## 4. Cuándo no aplicar
- Cuando el intermediario oculta volatilidad o cambios frecuentes del delegado.
- Cuando ahí viven validaciones, permisos o invariantes de negocio.

### Ejemplo
```java
class Cuenta {
    void debitar(BigDecimal monto) {
        auditoria.registrar(monto);
        saldo = saldo.subtract(monto);
    }
}
```
