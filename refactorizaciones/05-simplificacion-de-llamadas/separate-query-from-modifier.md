# Separate Query from Modifier

## 1. Qué es
Separa una operación que modifica estado y además devuelve información para respetar la distinción entre consultar y cambiar.

### Ejemplo
**Antes**
```java
int totalYLimpiar() {
    int total = items.size();
    items.clear();
    return total;
}
```

**Después**
```java
int total() { return items.size(); }
void limpiar() { items.clear(); }
```

## 2. Cuándo aplica
- Cuando un método devuelve un dato y al mismo tiempo produce un efecto secundario.
- Cuando el nombre del método no puede dejar claras ambas responsabilidades.

### Ejemplo
```java
Usuario proximoYMarcarLeido() { ... }
```

## 3. Cómo aplicar
1. Identificar la parte que consulta y la parte que modifica.
2. Crear un método puro para la consulta y otro para el cambio.
3. Actualizar llamadores para invocarlos explícitamente en el orden requerido.

### Ejemplo
**Antes**
```java
String enviarYObtenerId(Mensaje mensaje) { ... }
```

**Después**
```java
void enviar(Mensaje mensaje) { ... }
String idDe(Mensaje mensaje) { ... }
```

## 4. Cuándo no aplicar
- Cuando la operación es atómica y el valor retornado forma parte del mismo comando inseparable.
- Cuando separar rompería consistencia sin un protocolo claro.

### Ejemplo
```java
UUID guardar(Entidad entidad) {
    repositorio.save(entidad);
    return entidad.id();
}
```
