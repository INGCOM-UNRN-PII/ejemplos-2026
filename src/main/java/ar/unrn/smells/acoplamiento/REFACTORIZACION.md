# Refactorización: Acoplamiento

## Problemas Detectados

1. **Dependencia de Concreciones**: `ProcesadorPedido` instancia directamente `EmailService` y `SqlDatabase`. Esto
   impide el testeo unitario y hace imposible cambiar el motor de base de datos o el servicio de correo sin modificar el
   procesador.
2. **Intimidad Inapropiada**: La clase `Motor` manipula directamente los campos públicos de `Auto`. Esto viola el
   encapsulamiento.

## Refactorizaciones Sugeridas

- **Inversión de Dependencias (DIP)**: Introducir interfaces para los servicios (e.g., `ServicioNotificacion`,
  `RepositorioDatos`) e inyectarlas en el constructor.
- **Encapsulamiento (Tell, Don't Ask)**: Mover la lógica de chequeo de temperatura al objeto `Auto` (ej:
  `auto.asegurarRefrigeracion()`) para que el motor no tenga que conocer sus detalles internos.
