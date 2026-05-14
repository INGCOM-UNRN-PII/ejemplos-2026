# Replace Magic Literal

## 1. Qué es
Reemplaza un literal crudo por una constante, enumeración u objeto con nombre para explicar su significado.

### Ejemplo
**Antes**
```java
if (diasDeMora > 30) {
    bloquearCuenta();
}
```

**Después**
```java
private static final int MAX_DIAS_MORA = 30;
if (diasDeMora > MAX_DIAS_MORA) {
    bloquearCuenta();
}
```

## 2. Cuándo aplica
- Cuando un número, texto o código aparece sin contexto y obliga a adivinar su sentido.
- Cuando el literal se repite y debería tener un único punto de cambio.

### Ejemplo
```java
if (estado.equals("A")) {
    habilitar();
}
```

## 3. Cómo aplicar
1. Nombrar qué representa el literal en el dominio.
2. Crear una constante, enum o value object apropiado.
3. Reemplazar las ocurrencias relevantes por el nombre explícito.

### Ejemplo
**Antes**
```java
return peso * 9.81;
```

**Después**
```java
private static final double GRAVEDAD_TIERRA = 9.81;
return peso * GRAVEDAD_TIERRA;
```

## 4. Cuándo no aplicar
- Cuando el literal es universalmente obvio en su contexto, como 0 o 1 en un conteo trivial.
- Cuando envolverlo en una constante haría el código más ceremonioso que claro.

### Ejemplo
```java
for (int i = 0; i < items.size(); i++) {
    procesar(items.get(i));
}
```
