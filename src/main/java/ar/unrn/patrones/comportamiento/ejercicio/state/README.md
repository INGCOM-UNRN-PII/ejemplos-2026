# Demostración en vivo: Patrón State (Máquina Expendedora)

En esta demostración implementaremos **en vivo** (Live Coding) el patrón State para simular el comportamiento de una
máquina expendedora de bebidas. Mostraremos cómo la máquina reacciona diferente a las mismas acciones del usuario,
dependiendo del estado en el que se encuentre.

## Contexto inicial

La clase `MaquinaExpendedora` (nuestro Contexto) vende una bebida que cuesta **$10**.
Actualmente tenemos la estructura básica: la interfaz `EstadoMaquina` y las clases que representan los estados (
`SinMonedaState`, `ConMonedaState` y `AgotadoState`), pero sus métodos están vacíos (con `TODOs`).

El objetivo es codificarlos paso a paso junto con los alumnos para entender cómo se delega la lógica y se realizan las
transiciones.

---

## Guía paso a paso para la demostración (Script del presentador)

### Paso 1: Revisión del Contexto y la Interfaz

1. **Mostrar `EstadoMaquina.java`**: Explicar que esta interfaz define las acciones que dependen del estado (insertar
   moneda, expulsar, solicitar bebida).
2. **Mostrar `MaquinaExpendedora.java`**: Explicar cómo mantiene una referencia a `estadoActual` y delega las acciones
   del usuario directamente a dicho estado (`estadoActual.insertarMoneda()`, etc.).
3. Destacar cómo el constructor inicializa los 3 estados posibles y define el estado inicial dependiendo del stock.

### Paso 2: Implementando `SinMonedaState`

*Abre la clase `SinMonedaState` y escribe el código en vivo:*

```java

@Override
public void insertarMoneda(int cantidad) {
    if (cantidad >= maquina.getPrecioBebida()) {
        System.out.println("Moneda de $" + cantidad + " aceptada.");
        // Transición de estado:
        maquina.setEstado(maquina.getConMonedaState());
    } else {
        System.out.println("Moneda rechazada. El precio es $" + maquina.getPrecioBebida());
    }
}

@Override
public void expulsarMoneda() {
    System.out.println("No has insertado ninguna moneda.");
}

@Override
public void solicitarBebida() {
    System.out.println("Primero debes insertar una moneda.");
}
```

**Explicación:** Hacer énfasis en cómo el estado actualiza el estado del contexto a través de `maquina.setEstado()`.

### Paso 3: Implementando `ConMonedaState`

*Abre la clase `ConMonedaState` y escribe el código en vivo:*

```java

@Override
public void insertarMoneda(int cantidad) {
    System.out.println("Ya has insertado una moneda. Espera tu bebida.");
}

@Override
public void expulsarMoneda() {
    System.out.println("Devolviendo moneda...");
    // Transición de estado:
    maquina.setEstado(maquina.getSinMonedaState());
}

@Override
public void solicitarBebida() {
    System.out.println("Entregando bebida...");
    maquina.reducirStock();

    // Verificamos si queda stock para determinar el próximo estado
    if (maquina.getStock() > 0) {
        maquina.setEstado(maquina.getSinMonedaState());
    } else {
        System.out.println("¡Oops! Fue la última bebida.");
        maquina.setEstado(maquina.getAgotadoState());
    }
}
```

**Explicación:** Destacar que aquí ocurre el núcleo del negocio. La acción de solicitar la bebida desencadena la
reducción del stock y una transición de estado condicionada a dicho stock.

### Paso 4: Implementando `AgotadoState`

*Abre la clase `AgotadoState` y escribe el código en vivo:*

```java

@Override
public void insertarMoneda(int cantidad) {
    System.out.println("Máquina sin stock. Devolviendo moneda de $" + cantidad);
}

@Override
public void expulsarMoneda() {
    System.out.println("No has insertado moneda para expulsar.");
}

@Override
public void solicitarBebida() {
    System.out.println("Lo sentimos, no hay stock.");
}
```

**Explicación:** Aquí el estado absorbe los intentos del usuario protegiendo la lógica del negocio sin necesidad de un
`if (stock == 0)` en cada método.

### Paso 5: Ejecución y comprobación

1. Ejecutar el archivo `MainState.java`.
2. Repasar la salida por consola paso a paso.
3. **Conclusión para los alumnos**: Demostrar cómo el comportamiento de las acciones cambia de forma transparente a
   medida que la máquina transiciona entre los estados, evitando los enormes e inmanejables bloques de `if-else` o
   `switch` que se usarían en una aproximación procedural.
