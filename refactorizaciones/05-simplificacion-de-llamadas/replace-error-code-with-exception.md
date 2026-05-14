# Replace Error Code with Exception

## 1. Qué es
Sustituye códigos de error por excepciones cuando una operación no puede completarse y el flujo normal se vuelve más claro sin chequear valores sentinela.

### Ejemplo
**Antes**
```java
int retirar(BigDecimal monto) {
    if (saldo.compareTo(monto) < 0) return -1;
    saldo = saldo.subtract(monto);
    return 0;
}
```

**Después**
```java
void retirar(BigDecimal monto) {
    if (saldo.compareTo(monto) < 0) throw new SaldoInsuficienteException();
    saldo = saldo.subtract(monto);
}
```

## 2. Cuándo aplica
- Cuando el error es excepcional y ensucia cada llamador con comparaciones manuales.
- Cuando el código sentinela no comunica suficiente contexto.

### Ejemplo
```java
if (procesador.procesar() == -7) {
    log.error("falló");
}
```

## 3. Cómo aplicar
1. Identificar códigos especiales usados para representar fallas.
2. Crear excepciones específicas del dominio o de la operación.
3. Reemplazar comparaciones por manejo explícito de excepciones donde corresponda.

### Ejemplo
**Antes**
```java
String cargar(String ruta) {
    if (!existe(ruta)) return "ERROR";
    return leer(ruta);
}
```

**Después**
```java
String cargar(String ruta) {
    if (!existe(ruta)) throw new ArchivoInexistenteException(ruta);
    return leer(ruta);
}
```

## 4. Cuándo no aplicar
- Cuando el caso fallido es esperado y frecuente, y conviene un resultado explícito.
- Cuando el contrato externo ya usa un tipo resultado más adecuado que excepciones.

### Ejemplo
```java
ResultadoBusquedaUsuario buscarPorEmail(String email)
```
