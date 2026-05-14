# Replace Command with Function

## 1. Qué es
Sustituye un objeto comando por una función cuando el objeto no mantiene estado útil ni necesita ciclo de vida propio.

### Ejemplo
**Antes**
```java
var calculador = new CalculadorDePrecio(pedido);
calculador.ejecutar();
return calculador.resultado();
```

**Después**
```java
return calcularPrecio(pedido);
```

## 2. Cuándo aplica
- Cuando el comando solo encapsula una operación pura o lineal.
- Cuando crear el objeto intermedio agrega ruido en cada uso.

### Ejemplo
```java
new ValidadorDeEmail(email).ejecutar();
```

## 3. Cómo aplicar
1. Mover la lógica del comando a una función o método estático/instancia.
2. Reemplazar la creación del objeto por una llamada directa.
3. Eliminar el comando si ya no tiene otras responsabilidades.

### Ejemplo
**Antes**
```java
var exportador = new ExportadorCSV(reporte);
exportador.ejecutar();
byte[] bytes = exportador.resultado();
```

**Después**
```java
byte[] bytes = exportarCSV(reporte);
```

## 4. Cuándo no aplicar
- Cuando el comando necesita ser encolado, reintentado o deshecho.
- Cuando el objeto mantiene estado acumulado entre pasos.

### Ejemplo
```java
class PagoCommand {
    void ejecutar();
    void deshacer();
}
```
