# Replace Constructor with Factory

## 1. Qué es
Reemplaza llamadas directas a constructores por una fábrica con nombre expresivo que aclara la intención de creación.

### Ejemplo
**Antes**
```java
Empleado empleado = new Empleado("TEMPORAL", documento);
```

**Después**
```java
Empleado empleado = Empleado.temporal(documento);
```

## 2. Cuándo aplica
- Cuando el constructor necesita nombre para explicar qué variante crea.
- Cuando la creación puede devolver subtipos, cachear o validar antes de instanciar.

### Ejemplo
```java
new Color(255, 0, 0);
```

## 3. Cómo aplicar
1. Crear un método de fábrica con nombre del dominio.
2. Mover allí la lógica de selección o preparación necesaria.
3. Hacer que los clientes usen la fábrica en lugar del constructor público.

### Ejemplo
**Antes**
```java
var pedido = new Pedido("RETIRA_EN_SUCURSAL", cliente);
```

**Después**
```java
var pedido = Pedido.paraRetiroEnSucursal(cliente);
```

## 4. Cuándo no aplicar
- Cuando el constructor ya es claro y no hay variación de creación.
- Cuando sumar una fábrica solo agrega una capa extra sin beneficio.

### Ejemplo
```java
Punto punto = new Punto(3, 4);
```
