# Demostración en vivo: Patrón Flyweight (Bosque de Árboles)

En esta demostración implementaremos **en vivo** (Live Coding) el patrón Flyweight para optimizar la memoria al
renderizar un bosque con miles de árboles.

## Contexto inicial

Estamos desarrollando un juego donde necesitamos renderizar miles de árboles en pantalla.
Un árbol tiene:

1. Posición X (cambia por árbol)
2. Posición Y (cambia por árbol)
3. Color (se repite mucho)
4. Textura (pesa mucho en memoria y se repite mucho)
5. Nombre del tipo de árbol (se repite mucho)

Actualmente tenemos la clase `Arbol`. Si creamos 1 millón de árboles, nos quedaremos sin memoria (`OutOfMemoryError`)
porque estamos instanciando la textura y el color repetidas veces.

El objetivo es codificar paso a paso la extracción del **Estado Intrínseco** (compartido) y la creación de la **Fábrica
Flyweight**.

---

## Guía paso a paso para la demostración (Script del presentador)

### Paso 1: Mostrar el problema (Sin Flyweight)

Muestra a los alumnos que la clase `Arbol` tendría todos los atributos. Explica que la "textura" y "color" consumen
demasiada RAM si se duplican por cada árbol plantado.

### Paso 2: Extraer el estado Intrínseco (`TipoArbol`)

*Crea la clase `TipoArbol` (el Flyweight) y escribe en vivo:*

```java
package ar.unrn.patrones.estructurales.flyweight;

// El "Flyweight" que contiene el estado compartido (intrínseco)
public class TipoArbol {
    private String nombre;
    private String color;
    private String textura; // Simula un objeto pesado

    public TipoArbol(String nombre, String color, String textura) {
        this.nombre = nombre;
        this.color = color;
        this.textura = textura;
    }

    public void dibujar(int x, int y) {
        System.out.println("Dibujando árbol [" + nombre + "] en (" + x + ", " + y + ") con textura: " + textura);
    }
}
```

**Explicación:** Este objeto es inmutable y será compartido por miles de árboles. Recibe las coordenadas `x` e `y` (
estado extrínseco) por parámetro en el método `dibujar`.

### Paso 3: Crear el Objeto de Contexto (`Arbol`)

*Modifica la clase `Arbol` para que solo contenga el estado extrínseco y una referencia al Flyweight:*

```java
package ar.unrn.patrones.estructurales.flyweight;

// El "Contexto" que contiene el estado único (extrínseco)
public class Arbol {
    private int x;
    private int y;
    private TipoArbol tipo;

    public Arbol(int x, int y, TipoArbol tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void dibujar() {
        tipo.dibujar(x, y);
    }
}
```

**Explicación:** El árbol ahora es súper ligero. Solo guarda dos enteros y un puntero.

### Paso 4: Crear la Fábrica (`ArbolFactory`)

*Crea la clase `ArbolFactory` y escribe en vivo:*

```java
package ar.unrn.patrones.estructurales.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    // La caché de Flyweights
    private static Map<String, TipoArbol> tiposDeArboles = new HashMap<>();

    public static TipoArbol getTipoArbol(String nombre, String color, String textura) {
        TipoArbol tipo = tiposDeArboles.get(nombre);
        
        if (tipo == null) {
            System.out.println(">>> Creando nuevo TipoArbol pesado: " + nombre);
            tipo = new TipoArbol(nombre, color, textura);
            tiposDeArboles.put(nombre, tipo);
        }
        
        return tipo;
    }
}
```

**Explicación:** Esta es la pieza clave. Antes de crear un nuevo objeto pesado, buscamos en el mapa. Si ya existe,
devolvemos la referencia compartida.

### Paso 5: El Cliente (`Bosque`)

*Crea la clase `Bosque` y el `MainFlyweight`:*

```java
package ar.unrn.patrones.estructurales.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Bosque {
    private List<Arbol> arboles = new ArrayList<>();

    public void plantarArbol(int x, int y, String nombre, String color, String textura) {
        TipoArbol tipo = ArbolFactory.getTipoArbol(nombre, color, textura);
        Arbol arbol = new Arbol(x, y, tipo);
        arboles.add(arbol);
    }

    public void dibujar() {
        for (Arbol arbol : arboles) {
            arbol.dibujar();
        }
    }
}
```

*Y en el Main:*

```java
package ar.unrn.patrones.estructurales.flyweight;

public class MainFlyweight {
    public static void main(String[] args) {
        Bosque bosque = new Bosque();

        // Plantamos muchos árboles del mismo tipo
        bosque.plantarArbol(10, 20, "Roble", "Verde Oscuro", "TexturaRobleHD");
        bosque.plantarArbol(15, 25, "Roble", "Verde Oscuro", "TexturaRobleHD");
        bosque.plantarArbol(30, 40, "Pino", "Verde Claro", "TexturaPinoHD");
        bosque.plantarArbol(35, 45, "Roble", "Verde Oscuro", "TexturaRobleHD");

        System.out.println("\nDibujando el bosque:");
        bosque.dibujar();
    }
}
```

### Conclusión para los alumnos

Al ejecutar el main, mostrar cómo el texto `>>> Creando nuevo TipoArbol pesado...` solo aparece **UNA vez** por cada
tipo de árbol ("Roble" y "Pino"), a pesar de haber plantado tres Robles. ¡Hemos salvado gigabytes de RAM!