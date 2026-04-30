package ar.unrn.solid.ocp;

/**
 * VIOLACIÓN OCP: Si queremos agregar una nueva forma (Triángulo), 
 * debemos modificar esta clase agregando otro 'if' o 'switch'.
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

class RectanguloMal { public double ancho, alto; }
class CirculoMal { public double radio; }
