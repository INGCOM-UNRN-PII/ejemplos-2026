# Remove Setting Method

## 1. Qué es
Elimina un setter cuando un valor debe quedar fijo al construir el objeto y la mutación posterior rompe sus invariantes.

### Ejemplo
**Antes**
```java
class Pedido {
    void setFechaCreacion(LocalDate fecha) { this.fechaCreacion = fecha; }
}
```

**Después**
```java
class Pedido {
    Pedido(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
```

## 2. Cuándo aplica
- Cuando el campo es obligatorio y no debería cambiar después de crear el objeto.
- Cuando querés hacer al objeto más inmutable y consistente.

### Ejemplo
```java
Pedido pedido = new Pedido();
pedido.setNumero("A-001");
```

## 3. Cómo aplicar
1. Mover el valor obligatorio al constructor o fábrica.
2. Actualizar llamadores para proveer el dato al crear el objeto.
3. Eliminar el setter y reforzar la invariancia.

### Ejemplo
**Antes**
```java
Usuario usuario = new Usuario();
usuario.setEmail("ana@acme.com");
```

**Después**
```java
Usuario usuario = new Usuario("ana@acme.com");
```

## 4. Cuándo no aplicar
- Cuando el estado debe cambiar legítimamente durante el ciclo de vida.
- Cuando un framework obliga a construir el objeto vacío y completar luego.

### Ejemplo
```java
class Tarea {
    void setEstado(Estado nuevoEstado) { this.estado = nuevoEstado; }
}
```
