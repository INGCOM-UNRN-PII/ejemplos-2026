# Pull Up Constructor Body

## 1. Qué es
Sube al constructor de la superclase la parte común de varios constructores de subclases para evitar duplicación.

### Ejemplo
**Antes**
```java
class Empleado extends Persona {
    Empleado(String nombre) {
        this.nombre = nombre;
        this.activo = true;
    }
}
class Proveedor extends Persona {
    Proveedor(String nombre) {
        this.nombre = nombre;
        this.activo = true;
    }
}
```

**Después**
```java
class Persona {
    Persona(String nombre) {
        this.nombre = nombre;
        this.activo = true;
    }
}
```

## 2. Cuándo aplica
- Cuando varias subclases inicializan el mismo estado de la misma manera.
- Cuando esa inicialización pertenece naturalmente a la abstracción padre.

### Ejemplo
```java
class Tarjeta extends MedioPago { Tarjeta() { this.moneda = "ARS"; } }
class Transferencia extends MedioPago { Transferencia() { this.moneda = "ARS"; } }
```

## 3. Cómo aplicar
1. Extraer las sentencias compartidas de los constructores.
2. Crear o ampliar un constructor en la superclase.
3. Hacer que las subclases deleguen en super(...).

### Ejemplo
**Antes**
```java
class Gato extends Animal {
    Gato(String nombre) {
        this.nombre = nombre;
    }
}
```

**Después**
```java
class Animal {
    Animal(String nombre) {
        this.nombre = nombre;
    }
}
class Gato extends Animal {
    Gato(String nombre) { super(nombre); }
}
```

## 4. Cuándo no aplicar
- Cuando la inicialización común depende de detalles exclusivos de cada subclase.
- Cuando subirla obliga a la superclase a conocer demasiado sobre hijos concretos.

### Ejemplo
```java
class Auto extends Vehiculo { Auto() { this.ruedas = 4; } }
class Moto extends Vehiculo { Moto() { this.ruedas = 2; } }
```
