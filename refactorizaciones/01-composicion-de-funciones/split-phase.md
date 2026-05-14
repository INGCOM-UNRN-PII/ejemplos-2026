# Split Phase

## 1. Qué es
Separa un proceso en fases bien delimitadas, donde la salida de una fase se vuelve la entrada de la siguiente.

### Ejemplo
**Antes**
```java
String procesarPedido(String texto) {
    // parsea, valida y calcula en el mismo método
}
```

**Después**
```java
PedidoInput input = parsear(texto);
PedidoValido valido = validar(input);
return calcular(valido);
```

## 2. Cuándo aplica
- Cuando un método mezcla parsing, validación, enriquecimiento y cálculo final.
- Cuando cada etapa podría entenderse o testearse mejor por separado.

### Ejemplo
```java
String respuesta = ejecutarLineaDeComando(args);
```

## 3. Cómo aplicar
1. Identificar etapas conceptualmente distintas dentro del flujo.
2. Definir estructuras de datos intermedias que documenten cada fase.
3. Encadenar funciones simples, una por fase.

### Ejemplo
**Antes**
```java
Factura generar(String csv) { ... }
```

**Después**
```java
RegistrosCSV registros = parsear(csv);
FacturasPendientes pendientes = consolidar(registros);
Factura factura = emitir(pendientes);
```

## 4. Cuándo no aplicar
- Cuando el flujo es corto y una separación adicional solo fragmenta de más.
- Cuando no existe una frontera clara entre etapas.

### Ejemplo
```java
int suma = a + b;
```
