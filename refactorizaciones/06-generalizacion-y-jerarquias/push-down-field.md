# Push Down Field

## 1. Qué es
Baja un campo a las subclases que realmente lo usan cuando ese dato no pertenece a toda la jerarquía.

### Ejemplo
**Antes**
```java
class Empleado {
    String licenciaConducir;
}
class Vendedor extends Empleado { }
class Analista extends Empleado { }
```

**Después**
```java
class Empleado { }
class Vendedor extends Empleado {
    String licenciaConducir;
}
```

## 2. Cuándo aplica
- Cuando un campo solo tiene sentido en algunos subtipos.
- Cuando la superclase quedó inflada con datos especializados.

### Ejemplo
```java
class Cuenta {
    BigDecimal limiteCombustible;
}
class CuentaFlota extends Cuenta { }
class CuentaAhorro extends Cuenta { }
```

## 3. Cómo aplicar
1. Determinar qué subclases realmente necesitan el campo.
2. Mover la declaración y la inicialización a esas subclases.
3. Eliminar dependencias de la superclase sobre el dato especializado.

### Ejemplo
**Antes**
```java
class Vehiculo {
    int autonomiaBateria;
}
```

**Después**
```java
class AutoElectrico extends Vehiculo {
    int autonomiaBateria;
}
```

## 4. Cuándo no aplicar
- Cuando el campo podría volver a ser común en toda la jerarquía.
- Cuando el dato participa de contratos públicos del padre.

### Ejemplo
```java
class Persona {
    String nombre;
}
class Docente extends Persona { }
class Alumno extends Persona { }
```
