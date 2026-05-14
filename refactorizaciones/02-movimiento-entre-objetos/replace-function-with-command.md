# Replace Function with Command

## 1. Qué es
Convierte una función en un objeto comando cuando la operación necesita estado propio, pasos intermedios o extensibilidad.

### Ejemplo
**Antes**
```java
byte[] generarReporte(Ventas ventas, Formato formato) { ... }
```

**Después**
```java
class GeneradorReporte {
    GeneradorReporte(Ventas ventas, Formato formato) { ... }
    byte[] ejecutar() { ... }
}
```

## 2. Cuándo aplica
- Cuando la lógica requiere acumular estado durante la ejecución.
- Cuando querés parametrizar, instrumentar o reutilizar la operación como objeto.

### Ejemplo
```java
String respuesta = procesarImportacion(archivo, usuario, opciones);
```

## 3. Cómo aplicar
1. Identificar datos, pasos y resultados que hoy están comprimidos en una sola función.
2. Crear un comando con esos datos como estado explícito.
3. Mover la ejecución a un método como `ejecutar()` y actualizar llamadores.

### Ejemplo
**Antes**
```java
Resultado migrar(List<Registro> registros) { ... }
```

**Después**
```java
class MigracionRegistros {
    Resultado ejecutar() { ... }
}
```

## 4. Cuándo no aplicar
- Cuando la función es simple, pura y clara.
- Cuando el objeto comando no tendría identidad ni utilidad adicional.

### Ejemplo
```java
int sumar(int a, int b) { return a + b; }
```
