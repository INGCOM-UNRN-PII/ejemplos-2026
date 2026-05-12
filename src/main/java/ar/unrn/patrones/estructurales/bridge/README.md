# Patrón Bridge (Estructural)

El patrón **Bridge** (Puente) permite desacoplar una abstracción de su implementación, de manera que ambas puedan variar
independientemente. Se utiliza cuando una clase tiene dos (o más) dimensiones de cambio independientes.

## El Problema: Explosión de Clases

Imagina que estamos construyendo un sistema de notificaciones.
Tenemos diferentes tipos de notificaciones: **Normal** y **Urgente**.
Y tenemos diferentes plataformas de envío: **Email** y **SMS**.

Si usamos herencia simple, tendríamos que crear una clase para cada combinación:

- `EmailNormal`
- `EmailUrgente`
- `SMSNormal`
- `SMSUrgente`

¿Qué pasa si agregamos un nuevo tipo de notificación (ej. `Informativa`) y una nueva plataforma (`NotificacionPush`)?
La cantidad de clases crece exponencialmente (3 tipos x 3 plataformas = 9 clases).

## La Solución (Bridge)

El patrón Bridge nos dice que reemplacemos la herencia por **composición**. Dividimos el problema en dos jerarquías
separadas:

1. **La Abstracción:** El tipo de Notificación (`Normal`, `Urgente`).
2. **La Implementación:** El medio de envío (`Email`, `SMS`).

La abstracción tendrá una referencia a la implementación y le delegará el trabajo real.

---

## Guía del Ejemplo

En esta carpeta encontrarás el código ya estructurado aplicando Bridge:

### 1. La Jerarquía de Implementación (Medios de Envío)

- `MessageSender`: Interfaz que define cómo se envía un mensaje.
- `EmailSender` y `SmsSender`: Clases concretas que implementan el envío.

### 2. La Jerarquía de Abstracción (Tipos de Notificación)

- `Notification`: Clase abstracta que mantiene una referencia a `MessageSender`. Define la operación base `send()`.
- `NormalNotification` y `UrgentNotification`: Extienden `Notification` y le agregan detalles específicos (como el
  formato del mensaje) antes de delegar el envío real al `MessageSender`.

### ¿Cómo probarlo?

Abre `MainBridge.java` y ejecuta el programa.
Podrás ver cómo creamos combinaciones de `Notificación + MedioDeEnvío` en tiempo de ejecución, sin necesidad de tener
una clase específica para cada combinación. Si el día de mañana agregamos `PushSender`, funcionará automáticamente con
todos los tipos de notificación existentes.