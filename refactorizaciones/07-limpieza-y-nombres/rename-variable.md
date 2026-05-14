# Rename Variable

## 1. Qué es
Renombra variables locales o parámetros para que revelen qué representan en lugar de cómo se calculan.

### Ejemplo
**Antes**
```java
int d = diasEntre(hoy, vencimiento);
```

**Después**
```java
int diasDeRetraso = diasEntre(hoy, vencimiento);
```

## 2. Cuándo aplica
- Cuando el nombre obliga a leer toda la expresión para entenderlo.
- Cuando el rol de la variable cambió y el nombre quedó viejo.

### Ejemplo
```java
var x = pedido.total().subtract(pedido.descuento());
```

## 3. Cómo aplicar
1. Elegir un nombre que explique el propósito de la variable.
2. Renombrar todas las referencias en el mismo alcance.
3. Aprovechar para detectar si la variable además merece una extracción o eliminación.

### Ejemplo
**Antes**
```java
String s = usuario.nombre() + " " + usuario.apellido();
```

**Después**
```java
String nombreCompleto = usuario.nombre() + " " + usuario.apellido();
```

## 4. Cuándo no aplicar
- Cuando el nuevo nombre agrega longitud pero no información.
- Cuando la variable existe solo en un contexto tan pequeño que ya es obvia.

### Ejemplo
```java
for (int i = 0; i < items.size(); i++) {
    procesar(items.get(i));
}
```
