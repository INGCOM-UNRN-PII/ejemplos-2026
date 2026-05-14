# Replace Control Flag with Break

## 1. Qué es
Sustituye una bandera manual de control dentro de un bucle por `break`, `continue` o `return` para hacer explícita la salida.

### Ejemplo
**Antes**
```java
boolean encontrado = false;
for (Item item : items) {
    if (!encontrado && item.esObjetivo()) {
        encontrado = true;
    }
}
```

**Después**
```java
for (Item item : items) {
    if (item.esObjetivo()) {
        break;
    }
}
```

## 2. Cuándo aplica
- Cuando una variable solo existe para cortar el loop.
- Cuando la intención real es salir apenas ocurre una condición.

### Ejemplo
```java
boolean error = false;
for (Linea linea : lineas) {
    if (linea.invalida()) error = true;
}
```

## 3. Cómo aplicar
1. Detectar la bandera cuyo único fin es controlar el flujo.
2. Reemplazarla por la sentencia de salida apropiada.
3. Eliminar condiciones redundantes que quedaron alrededor del loop.

### Ejemplo
**Antes**
```java
boolean hayNegativo = false;
for (int n : numeros) {
    if (n < 0) hayNegativo = true;
}
```

**Después**
```java
for (int n : numeros) {
    if (n < 0) {
        break;
    }
}
```

## 4. Cuándo no aplicar
- Cuando la bandera guarda un estado de negocio que se usa luego.
- Cuando el flujo necesita más que una simple salida del bucle.

### Ejemplo
```java
boolean huboErrores = validarArchivo(archivo);
if (huboErrores) notificar();
```
