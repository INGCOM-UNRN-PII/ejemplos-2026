# Code Smells: Couplers

Estos olores contribuyen a un acoplamiento excesivo entre clases o muestran qué sucede si el acoplamiento se reemplaza
por una delegación excesiva.

- **Feature Envy**: Un método que parece más interesado en los datos de otra clase que en los de su propia clase.
- **Inappropriate Intimacy**: Una clase que utiliza campos y métodos internos de otra clase de forma excesiva.
- **Incomplete Library Class**: Cuando una librería no proporciona la funcionalidad necesaria y terminamos implementando
  métodos que deberían estar en la librería.
- **Message Chains**: Una serie de llamadas sucesivas como `a.getB().getC().doSomething()`. Viola la Ley de Demeter.
- **Middle Man**: Una clase que solo delega el trabajo a otra clase sin realizar ninguna lógica adicional significativa.
