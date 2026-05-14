# Hide Delegate

## 1. Qué es
Oculta un colaborador interno detrás de métodos de la clase anfitriona para evitar cadenas de navegación largas y acoplamiento innecesario.

### Ejemplo
**Antes**
```java
class Persona {
    Departamento departamento() { return departamento; }
}
String gerente = persona.departamento().gerente().nombre();
```

**Después**
```java
class Persona {
    String nombreGerente() { return departamento.gerente().nombre(); }
}
String gerente = persona.nombreGerente();
```

## 2. Cuándo aplica
- Cuando varios clientes conocen demasiado la estructura interna de otra clase.
- Cuando cambiar el delegado obliga a tocar muchos llamados encadenados.

### Ejemplo
```java
String ciudad = pedido.cliente().direccion().ciudad();
String codigoPostal = pedido.cliente().direccion().codigoPostal();
```

## 3. Cómo aplicar
1. Identificar la cadena de navegación repetida.
2. Agregar en la clase anfitriona un método que exponga solo lo necesario.
3. Reemplazar los llamados externos y mantener oculto el delegado.

### Ejemplo
**Antes**
```java
String gerente = empleado.departamento().gerente().nombre();
```

**Después**
```java
class Empleado {
    String gerente() { return departamento.gerente().nombre(); }
}
String gerente = empleado.gerente();
```

## 4. Cuándo no aplicar
- Cuando el colaborador forma parte explícita del modelo público.
- Cuando terminarías creando demasiados métodos pasarela sin aportar claridad.

### Ejemplo
```java
Departamento depto = persona.departamento();
reporte.mostrarMiembros(depto.miembros());
reporte.mostrarPresupuesto(depto.presupuesto());
```
