# Preserve Whole Object

## 1. Qué es
Pasa el objeto completo a una función en lugar de enviar varios datos extraídos de él cuando esos datos pertenecen al mismo concepto.

### Ejemplo
**Antes**
```java
boolean dentroDeRango(int minimo, int maximo) {
    return temperaturaActual >= minimo && temperaturaActual <= maximo;
}

if (dentroDeRango(rango.minimo(), rango.maximo())) { }
```

**Después**
```java
boolean dentroDeRango(Rango rango) {
    return temperaturaActual >= rango.minimo() && temperaturaActual <= rango.maximo();
}
```

## 2. Cuándo aplica
- Cuando varios parámetros salen del mismo objeto fuente.
- Cuando pasar el objeto mejora la legibilidad y evita extracción repetida.

### Ejemplo
```java
calcularEnvio(direccion.calle(), direccion.ciudad(), direccion.codigoPostal());
```

## 3. Cómo aplicar
1. Identificar parámetros que vienen juntos del mismo origen.
2. Cambiar la firma para aceptar el objeto completo.
3. Eliminar las extracciones repetidas en los llamadores.

### Ejemplo
**Antes**
```java
revisarLimites(cuenta.saldo(), cuenta.descubierto());
```

**Después**
```java
revisarLimites(cuenta);
```

## 4. Cuándo no aplicar
- Cuando la función no debería depender de todo el objeto por encapsulamiento.
- Cuando pasar el objeto introduce una dependencia innecesaria entre módulos.

### Ejemplo
```java
void exportarCSV(Usuario usuario) // solo necesita usuario.id()
```
