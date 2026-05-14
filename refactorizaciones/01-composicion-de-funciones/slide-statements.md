# Slide Statements

## 1. Qué es
Reubica sentencias para agrupar las que trabajan juntas y acercar cada variable al lugar donde se usa.

### Ejemplo
**Antes**
```java
int total = 0;
log.info("iniciando");
for (Item item : items) {
    total += item.cantidad();
}
```

**Después**
```java
log.info("iniciando");
int total = 0;
for (Item item : items) {
    total += item.cantidad();
}
```

## 2. Cuándo aplica
- Cuando variables, validaciones o cálculos quedaron separados de su contexto.
- Cuando reordenar mejora lectura sin cambiar comportamiento.

### Ejemplo
```java
String email = usuario.email();
validarSesion();
enviar(email);
```

## 3. Cómo aplicar
1. Detectar sentencias relacionadas que hoy están separadas.
2. Moverlas juntas preservando dependencias y orden observable.
3. Aprovechar para preparar otras refactorizaciones como extract o split.

### Ejemplo
**Antes**
```java
BigDecimal subtotal = total(items);
registrarAuditoria();
BigDecimal impuestos = impuestos(subtotal);
```

**Después**
```java
registrarAuditoria();
BigDecimal subtotal = total(items);
BigDecimal impuestos = impuestos(subtotal);
```

## 4. Cuándo no aplicar
- Cuando el orden actual comunica un ciclo de vida importante.
- Cuando mover sentencias cambia efectos secundarios, performance o sincronización.

### Ejemplo
```java
abrirConexion();
leerDatos();
cerrarConexion();
```
