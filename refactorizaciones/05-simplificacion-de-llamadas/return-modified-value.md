# Return Modified Value

## 1. Qué es
Hace que una función devuelva el valor u objeto que acaba de modificar para simplificar el uso inmediato del resultado actualizado.

### Ejemplo
**Antes**
```java
void aplicarDescuento(Pedido pedido) {
    pedido.aplicar(BigDecimal.valueOf(0.10));
}

aplicarDescuento(pedido);
return pedido.total();
```

**Después**
```java
Pedido aplicarDescuento(Pedido pedido) {
    pedido.aplicar(BigDecimal.valueOf(0.10));
    return pedido;
}

return aplicarDescuento(pedido).total();
```

## 2. Cuándo aplica
- Cuando el llamador siempre usa inmediatamente el objeto ya modificado.
- Cuando devolverlo reduce pasos ceremoniosos sin ocultar la mutación.

### Ejemplo
```java
actualizar(usuario);
return usuario.version();
```

## 3. Cómo aplicar
1. Detectar una función que modifica algo y cuyo llamador vuelve a pedir ese mismo valor.
2. Hacer que la función retorne el objeto o valor actualizado.
3. Encadenar el uso del retorno donde aporte claridad.

### Ejemplo
**Antes**
```java
void marcarEnviado(Email email) { email.enviar(); }
marcarEnviado(email);
log.info(email.estado());
```

**Después**
```java
Email marcarEnviado(Email email) {
    email.enviar();
    return email;
}
log.info(marcarEnviado(email).estado());
```

## 4. Cuándo no aplicar
- Cuando devolver el objeto modificado hace parecer que la operación es pura.
- Cuando el método ya debería separarse entre consulta y modificación.

### Ejemplo
```java
void debitar(Cuenta cuenta, Dinero monto) {
    cuenta.debitar(monto);
}
```
