# Remove Flag Argument

## 1. Qué es
Reemplaza un parámetro booleano o bandera de control por funciones con nombres distintos que expresen cada intención.

### Ejemplo
**Antes**
```java
void reservar(Cliente cliente, boolean premium) {
    if (premium) {
        aplicarBeneficiosPremium(cliente);
    }
    confirmar(cliente);
}
```

**Después**
```java
void reservarPremium(Cliente cliente) { ... }
void reservarComun(Cliente cliente) { ... }
```

## 2. Cuándo aplica
- Cuando la bandera cambia el comportamiento de la función.
- Cuando el llamado resulta ambiguo desde afuera, por ejemplo `procesar(x, true)`.

### Ejemplo
```java
calcularTarifa(viaje, true);
```

## 3. Cómo aplicar
1. Identificar los caminos de comportamiento controlados por la bandera.
2. Crear una función explícita por cada intención.
3. Reemplazar llamadas y eliminar el parámetro bandera.

### Ejemplo
**Antes**
```java
void enviar(Mensaje mensaje, boolean urgente) { ... }
```

**Después**
```java
void enviarUrgente(Mensaje mensaje) { ... }
void enviarNormal(Mensaje mensaje) { ... }
```

## 4. Cuándo no aplicar
- Cuando el booleano es un dato del dominio y no una orden de flujo.
- Cuando la variación es mínima y no cambia la intención pública.

### Ejemplo
```java
void registrarVisita(String url, boolean fueExitosa) // el booleano describe el resultado
```
