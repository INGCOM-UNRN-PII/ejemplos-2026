# Demostración en vivo: Integración de 5 Patrones (Smart Home)

En esta demostración de "Live Coding" integraremos cinco patrones de diseño (**Mediator, Observer, Iterator, Visitor y
Decorator**) en un único dominio cohesivo: un **Sistema de Casa Inteligente (Smart Home)**.

## El Contexto del Sistema

1. **Mediator**: Un `SmartHomeHub` centraliza la comunicación. Los dispositivos (luces, termostatos) no hablan entre sí,
   hablan con el Hub.
2. **Observer**: El Hub notifica a las aplicaciones móviles (`MobileApp`) cuando ocurre un evento importante en la casa.
3. **Iterator**: El Hub mantiene una lista de dispositivos y proporciona un iterador para recorrerlos sin exponer su
   estructura interna.
4. **Visitor**: Queremos calcular el consumo energético o hacer un diagnóstico de los dispositivos sin modificar sus
   clases. Usaremos un `EnergyVisitor` que visita cada dispositivo.
5. **Decorator**: Si el consumo de energía es muy alto, el sistema envía una alerta. Usaremos decoradores para añadir
   canales de notificación (Email, SMS) a una alerta básica.

---

## Guía paso a paso para la demostración (Script del presentador)

### Paso 1: Mediator y Observer (La comunicación y notificación)

Explica que los dispositivos no deben acoplarse. El `SmartHomeHub` es el **Mediator**. A su vez, el Hub actúa como
Sujeto en el patrón **Observer** para notificar a los usuarios.

*En `SmartHomeHub.java`, implementa el Mediator y Observer:*

```java
    // Implementación Mediator
@Override
public void registrarDispositivo(SmartDevice dispositivo) {
    dispositivos.add(dispositivo);
    dispositivo.setMediator(this);
}

@Override
public void notificarEvento(SmartDevice origen, String evento) {
    System.out.println("[Hub] Evento recibido de " + origen.getClass().getSimpleName() + ": " + evento);
    notificarObservadores("El dispositivo generó el evento: " + evento);
}

// Implementación Observer (Sujeto)
public void agregarObservador(HomeObserver observador) {
    observadores.add(observador);
}

private void notificarObservadores(String mensaje) {
    for (HomeObserver obs : observadores) {
        obs.update(mensaje);
    }
}
```

### Paso 2: Iterator (Recorriendo los dispositivos)

En lugar de exponer la lista `List<SmartDevice>`, el Hub provee un iterador.
*Añade esto en `SmartHomeHub.java`:*

```java
    // Implementación Iterator
public Iterator<SmartDevice> crearIterador() {
    return dispositivos.iterator(); // Usamos el iterador nativo de Java por simplicidad
}
```

### Paso 3: Visitor (Cálculo de Energía)

Queremos calcular el consumo. En lugar de ensuciar las clases de dispositivos, creamos un `EnergyVisitor`.
*En `EnergyVisitor.java`:*

```java
    private int consumoTotal = 0;

@Override
public void visit(SmartLight light) {
    int consumo = light.isEncendida() ? 10 : 0;
    System.out.println("Visitando luz. Consumo: " + consumo + "W");
    consumoTotal += consumo;
}

@Override
public void visit(SmartThermostat thermostat) {
    int consumo = thermostat.getTemperatura() > 20 ? 1500 : 500;
    System.out.println("Visitando termostato. Consumo: " + consumo + "W");
    consumoTotal += consumo;
}

public int getConsumoTotal() {
    return consumoTotal;
}
```

*En `SmartLight.java` y `SmartThermostat.java`, implementa el método `accept`:*

```java

@Override
public void accept(DeviceVisitor visitor) {
    visitor.visit(this); // El "Double Dispatch"
}
```

### Paso 4: Decorator (Alertas Dinámicas)

Si el consumo es mayor a 1000W, enviaremos una alerta. Queremos poder sumar Email y SMS dinámicamente.
*En `EmailAlertDecorator.java`:*

```java

@Override
public void send(String message) {
    super.send(message); // Llama a la alerta base
    System.out.println("✉️ Enviando EMAIL con alerta: " + message);
}
```

### Paso 5: Uniendo todo en el Main

*En `MainIntegracion.java`, orquesta la demostración:*

```java
        SmartHomeHub hub = new SmartHomeHub();
        hub.

agregarObservador(new MobileApp("App de Juan"));

SmartLight luz = new SmartLight();
SmartThermostat termostato = new SmartThermostat();
        
        hub.

registrarDispositivo(luz);
        hub.

registrarDispositivo(termostato);

// Dispara Mediator y Observer
        luz.

encender();
        termostato.

setTemperatura(24);

// Usa Iterator y Visitor
EnergyVisitor visitor = new EnergyVisitor();
Iterator<SmartDevice> iterador = hub.crearIterador();
        
        while(iterador.

hasNext()){
SmartDevice device = iterador.next();
            device.

accept(visitor);
        }

                System.out.

println("\nConsumo total de la casa: "+visitor.getConsumoTotal() +"W");

        // Usa Decorator si el consumo es alto
        if(visitor.

getConsumoTotal() >1000){
HomeAlert alerta = new BasicAlert();
alerta =new

SmsAlertDecorator(alerta);

alerta =new

EmailAlertDecorator(alerta);
            
            alerta.

send("¡ALTO CONSUMO ENERGÉTICO DETECTADO!");
        }
```

### Conclusión para los alumnos

Este ejemplo demuestra cómo los patrones no compiten entre sí, sino que **colaboran**. El Mediator coordina, el Observer
notifica hacia afuera, el Iterator abstrae la colección, el Visitor añade lógica sin modificar las entidades, y el
Decorator enriquece funcionalidades en tiempo de ejecución.