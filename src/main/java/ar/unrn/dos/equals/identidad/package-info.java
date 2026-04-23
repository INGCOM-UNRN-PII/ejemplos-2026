/**
 * Ejemplos categorizados que demuestran problemas comunes al violar
 * el contrato de equals y hashCode en Java.
 * 
 * <h2>Contenido del paquete:</h2>
 * 
 * <h3>Violaciones del contrato de equals:</h3>
 * <ul>
 *   <li>{@link ar.unrn.cuatro.EqualsViolaReflexividad} - Demuestra la violación de la propiedad reflexiva: x.equals(x) debe ser true</li>
 *   <li>{@link ar.unrn.cuatro.EqualsViolaSimetria} - Demuestra la violación de la propiedad simétrica: x.equals(y) ⟺ y.equals(x)</li>
 *   <li>{@link ar.unrn.cuatro.EqualsViolaTransitividad} - Demuestra la violación de la propiedad transitiva: x=y ∧ y=z ⟹ x=z</li>
 *   <li>{@link ar.unrn.cuatro.EqualsViolaConsistencia} - Demuestra la violación de consistencia: múltiples invocaciones deben dar el mismo resultado</li>
 *   <li>{@link ar.unrn.cuatro.EqualsViolaNullComparison} - Demuestra problemas al comparar con null: x.equals(null) debe ser false</li>
 * </ul>
 * 
 * <h3>Violaciones del contrato de hashCode:</h3>
 * <ul>
 *   <li>{@link ar.unrn.cuatro.HashCodeInconsistenteConEquals} - Demuestra problemas cuando equals y hashCode no son consistentes</li>
 *   <li>{@link ar.unrn.cuatro.HashCodeCambiaDespuesDeAgregar} - Demuestra problemas de mutabilidad en colecciones basadas en hash</li>
 * </ul>
 * 
 * <h2>Reglas del contrato de equals:</h2>
 * <ol>
 *   <li><b>Reflexiva:</b> x.equals(x) debe ser true</li>
 *   <li><b>Simétrica:</b> x.equals(y) retorna true si y solo si y.equals(x) retorna true</li>
 *   <li><b>Transitiva:</b> Si x.equals(y) y y.equals(z), entonces x.equals(z)</li>
 *   <li><b>Consistente:</b> Múltiples invocaciones retornan el mismo resultado si no cambia la información</li>
 *   <li><b>Null-safe:</b> x.equals(null) debe retornar false (nunca lanzar excepción)</li>
 * </ol>
 * 
 * <h2>Reglas del contrato de hashCode:</h2>
 * <ol>
 *   <li>Si x.equals(y) es true, entonces x.hashCode() == y.hashCode()</li>
 *   <li>El hashCode debe ser consistente: múltiples invocaciones deben retornar el mismo valor</li>
 *   <li>No es obligatorio que x.hashCode() != y.hashCode() cuando !x.equals(y), pero mejora el rendimiento</li>
 * </ol>
 * 
 * <h2>Recomendaciones:</h2>
 * <ul>
 *   <li>Usar objetos <b>inmutables</b> como claves en HashMap o elementos en HashSet</li>
 *   <li>Siempre sobreescribir hashCode cuando se sobreescribe equals</li>
 *   <li>Usar los mismos campos en equals y hashCode</li>
 *   <li>Verificar null explícitamente al inicio de equals</li>
 *   <li>Preferir getClass() sobre instanceof para verificar tipo exacto</li>
 *   <li>No usar campos mutables en equals/hashCode de objetos que irán en colecciones hash</li>
 * </ul>
 * 
 * @see java.lang.Object#equals(Object)
 * @see java.lang.Object#hashCode()
 * @see java.util.HashMap
 * @see java.util.HashSet
 */
package ar.unrn.dos.equals.identidad;
