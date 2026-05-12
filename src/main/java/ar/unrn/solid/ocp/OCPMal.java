package ar.unrn.solid.ocp;

/**
 * Representa una variante deliberadamente defectuosa que sirve para exponer el problema de diseno que el paquete esta discutiendo.
 * El paquete esta orientado a explicar el principio abierto/cerrado: agregar comportamiento no deberia exigir reescribir la logica existente.
 */
class GeneradorAreaMal {
    public double calcular(Object forma) {
        if (forma instanceof RectanguloMal) {
            RectanguloMal r = (RectanguloMal) forma;
            return r.ancho * r.alto;
        } else if (forma instanceof CirculoMal) {
            CirculoMal c = (CirculoMal) forma;
            return Math.PI * c.radio * c.radio;
        }
        return 0;
    }
}

/**
 * Representa una variante deliberadamente defectuosa que sirve para exponer el problema de diseno que el paquete esta discutiendo.
 * El paquete esta orientado a explicar el principio abierto/cerrado: agregar comportamiento no deberia exigir reescribir la logica existente.
 */
class RectanguloMal {
    public double ancho, alto;
}

/**
 * Representa una variante deliberadamente defectuosa que sirve para exponer el problema de diseno que el paquete esta discutiendo.
 * El paquete esta orientado a explicar el principio abierto/cerrado: agregar comportamiento no deberia exigir reescribir la logica existente.
 */
class CirculoMal {
    public double radio;
}
