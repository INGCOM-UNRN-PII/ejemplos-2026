# Replace Primitive with Object

## 1. Qué es
Sustituye un valor primitivo por un objeto pequeño cuando ese dato tiene reglas, validaciones o comportamiento propio.

### Ejemplo
**Antes**
```java
class Usuario {
    String email;
}
```

**Después**
```java
class Usuario {
    Email email;
}
```

## 2. Cuándo aplica
- Cuando el primitivo necesita validación, formato o comportamiento repetido.
- Cuando varios lugares del sistema hablan del mismo concepto con reglas compartidas.

### Ejemplo
```java
String telefono;
String cuit;
String codigoPostal;
```

## 3. Cómo aplicar
1. Encontrar el primitivo con semántica de dominio.
2. Crear un objeto inmutable con sus invariantes y comportamiento.
3. Reemplazar el primitivo en firmas, campos y validaciones.

### Ejemplo
**Antes**
```java
BigDecimal monto;
```

**Después**
```java
Dinero monto;
```

## 4. Cuándo no aplicar
- Cuando el valor es verdaderamente simple y no tiene reglas propias.
- Cuando el objeto sería un mero contenedor sin comportamiento.

### Ejemplo
```java
class Punto {
    int x;
    int y;
}
```
