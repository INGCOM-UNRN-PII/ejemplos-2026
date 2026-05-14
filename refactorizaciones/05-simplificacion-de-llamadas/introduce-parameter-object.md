# Introduce Parameter Object

## 1. Qué es
Agrupa parámetros que viajan juntos en un objeto con nombre propio para reducir listas largas y darles significado de dominio.

### Ejemplo
**Antes**
```java
Reserva crearReserva(LocalDate inicio, LocalDate fin, int adultos, int menores)
```

**Después**
```java
Reserva crearReserva(Periodo periodo, Ocupacion ocupacion)
```

## 2. Cuándo aplica
- Cuando el mismo grupo de parámetros aparece repetido en varias llamadas.
- Cuando los parámetros representan un concepto reconocible del dominio.

### Ejemplo
```java
calcularTarifa(inicio, fin, adultos, menores);
validarDisponibilidad(inicio, fin, adultos, menores);
```

## 3. Cómo aplicar
1. Detectar el conjunto de parámetros que siempre viaja junto.
2. Crear un objeto inmutable que represente ese concepto.
3. Sustituir la firma de las funciones y mover validaciones al nuevo objeto.

### Ejemplo
**Antes**
```java
Factura emitir(String calle, String ciudad, String codigoPostal)
```

**Después**
```java
Factura emitir(Direccion direccion)
```

## 4. Cuándo no aplicar
- Cuando los parámetros no tienen relación semántica entre sí.
- Cuando solo estarías creando un contenedor anémico sin comportamiento ni nombre útil.

### Ejemplo
```java
void registrar(String nombre, int edad, boolean enviarEmail)
```
