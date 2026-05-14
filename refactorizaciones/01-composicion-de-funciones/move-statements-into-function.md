# Move Statements into Function

## 1. Qué es
Lleva a una función las sentencias que todos sus llamadores repiten alrededor de la invocación.

### Ejemplo
**Antes**
```java
validarPedido(pedido);
BigDecimal total = calcularTotal(pedido);
```

**Después**
```java
BigDecimal total = calcularTotal(pedido);

BigDecimal calcularTotal(Pedido pedido) {
    validarPedido(pedido);
    BigDecimal total = BigDecimal.ZERO;
    for (Item item : pedido.items()) {
        total = total.add(item.subtotal());
    }
    return total;
}
```

## 2. Cuándo aplica
- Cuando todos los llamados repiten la misma preparación o postprocesamiento.
- Cuando esa repetición forma parte natural del contrato de la función.

### Ejemplo
```java
normalizar(email);
enviar(email);

normalizar(email);
registrar(email);
```

## 3. Cómo aplicar
1. Encontrar las sentencias repetidas en todos los sitios de llamada.
2. Moverlas al inicio o al final de la función adecuada.
3. Reemplazar la repetición de los llamadores por una sola invocación.

### Ejemplo
**Antes**
```java
normalizar(email);
enviar(email);
```

**Después**
```java
void enviar(String email) {
    String limpio = normalizar(email);
    mailer.send(limpio);
}
```

## 4. Cuándo no aplicar
- Cuando solo algunos llamadores necesitan esas sentencias.
- Cuando moverlas hace menos explícito un paso importante del flujo.

### Ejemplo
```java
registrarMetrica();
renderizarPantalla();
// Otros llamadores usan renderizarPantalla() sin métrica.
```
