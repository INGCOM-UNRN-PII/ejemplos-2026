# Introduce Assertion

## 1. Qué es
Expresa una suposición interna del programa con una aserción para dejar claro qué condición debe ser verdadera en ese punto.

### Ejemplo
**Antes**
```java
double velocidad(Tramo tramo) {
    return tramo.distancia() / tramo.horas();
}
```

**Después**
```java
double velocidad(Tramo tramo) {
    assert tramo.horas() > 0 : "El tramo debe tener duración positiva";
    return tramo.distancia() / tramo.horas();
}
```

## 2. Cuándo aplica
- Cuando el código depende de una invariante que debería cumplirse siempre.
- Cuando querés documentar un supuesto interno sin mezclarlo con validación de usuario.

### Ejemplo
```java
void cerrarCaja(Caja caja) {
    assert caja.estaAbierta();
    caja.cerrar();
}
```

## 3. Cómo aplicar
1. Ubicar el supuesto que hoy está implícito.
2. Agregar una aserción cerca del punto donde la condición importa.
3. Mantener separadas las aserciones internas de la validación externa.

### Ejemplo
**Antes**
```java
void procesar(Usuario usuario) {
    enviarEmail(usuario.email());
}
```

**Después**
```java
void procesar(Usuario usuario) {
    assert usuario.email() != null : "Email obligatorio en este flujo";
    enviarEmail(usuario.email());
}
```

## 4. Cuándo no aplicar
- Cuando la condición puede fallar por entrada externa esperable.
- Cuando necesitás manejar el error con un mensaje o recuperación de negocio.

### Ejemplo
```java
if (email == null || email.isBlank()) {
    throw new IllegalArgumentException("Email inválido");
}
```
