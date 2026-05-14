# Ley de Demeter

Este paquete reune ejemplos simples sobre la **Ley de Demeter**:

> un objeto deberia hablar solo con sus colaboradores directos y no navegar cadenas largas de objetos.

## Que muestran los ejemplos

1. **Pedido y direccion de entrega**
   - `PedidoConCadenaMensajes`: viola Demeter con cadenas como `cliente.direccion().codigoPostal().valor()`.
   - `PedidoConDelegacion`: delega en `Cliente` y evita conocer la estructura interna.
2. **Control de stock y deposito**
   - `ControlStockConCadenaMensajes`: consulta detalles internos del deposito desde afuera.
   - `ControlStockConDelegacion`: le pide al `Producto` la informacion que necesita.

## Ideas clave

- Evitar **message chains**.
- Favorecer **Tell, Don't Ask**.
- Mover comportamiento al objeto que posee los datos.

## Ejecucion

```bash
./gradlew run --args="ar.unrn.demeter.DemeterApp"
```
