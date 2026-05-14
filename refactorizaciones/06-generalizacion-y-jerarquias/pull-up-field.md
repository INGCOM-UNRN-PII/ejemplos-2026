# Pull Up Field

## 1. Qué es
Mueve a la superclase un campo duplicado en varias subclases cuando representa el mismo dato y con el mismo significado.

### Ejemplo
**Antes**
```java
class Gato extends Animal { String nombre; }
class Perro extends Animal { String nombre; }
```

**Después**
```java
class Animal {
    String nombre;
}
```

## 2. Cuándo aplica
- Cuando varias subclases repiten el mismo campo.
- Cuando el dato describe a toda la familia, no a un subtipo particular.

### Ejemplo
```java
class FacturaA extends Comprobante { BigDecimal total; }
class FacturaB extends Comprobante { BigDecimal total; }
```

## 3. Cómo aplicar
1. Confirmar que el campo tenga el mismo significado en todas las subclases.
2. Mover la declaración al padre y ajustar constructores o accesores.
3. Eliminar duplicados y centralizar validaciones comunes.

### Ejemplo
**Antes**
```java
class Docente extends Persona { String email; }
class Alumno extends Persona { String email; }
```

**Después**
```java
class Persona { String email; }
```

## 4. Cuándo no aplicar
- Cuando el mismo nombre oculta significados distintos.
- Cuando algunas subclases no deberían cargar con ese dato.

### Ejemplo
```java
class Auto extends Vehiculo { int capacidad; } // pasajeros
class Disco extends Soporte { int capacidad; } // gigabytes
```
