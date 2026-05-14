# Replace Superclass with Delegate

## 1. Qué es
Elimina una herencia inadecuada haciendo que la clase mantenga una instancia del antiguo padre y delegue lo necesario.

### Ejemplo
**Antes**
```java
class Stack extends ArrayList<String> {
    void push(String value) { add(value); }
    String pop() { return remove(size() - 1); }
}
```

**Después**
```java
class Stack {
    private final List<String> elementos = new ArrayList<>();
    void push(String value) { elementos.add(value); }
    String pop() { return elementos.remove(elementos.size() - 1); }
}
```

## 2. Cuándo aplica
- Cuando la relación "es-un" no se sostiene, pero querés reutilizar implementación.
- Cuando heredar expone una API demasiado grande o incorrecta.

### Ejemplo
```java
class Scroll extends Panel {
    // pero conceptualmente no es un panel completo
}
```

## 3. Cómo aplicar
1. Detectar qué parte de la implementación heredada realmente necesitás.
2. Crear un campo delegado con esa funcionalidad.
3. Reemplazar accesos a `super` por delegación explícita y romper la herencia.

### Ejemplo
**Antes**
```java
class ReservaCacheada extends HashMap<String, Reserva> {
}
```

**Después**
```java
class ReservaCacheada {
    private final Map<String, Reserva> reservas = new HashMap<>();
}
```

## 4. Cuándo no aplicar
- Cuando la superclase modela correctamente una abstracción general.
- Cuando perder el subtipo rompería contratos polimórficos necesarios.

### Ejemplo
```java
class TarjetaCredito extends MedioPago {
    @Override void pagar(Dinero monto) { ... }
}
```
