# Substitute Algorithm

## 1. Qué es
Reemplaza un algoritmo por otro más claro, correcto o eficiente manteniendo el mismo propósito observable.

### Ejemplo
**Antes**
```java
for (int i = 0; i < lista.size(); i++) {
    for (int j = i + 1; j < lista.size(); j++) {
        if (lista.get(i).compareTo(lista.get(j)) > 0) {
            Collections.swap(lista, i, j);
        }
    }
}
```

**Después**
```java
lista.sort(Comparator.naturalOrder());
```

## 2. Cuándo aplica
- Cuando el algoritmo actual es difícil de entender o mantener.
- Cuando existe una alternativa más expresiva o mejor validada.

### Ejemplo
```java
int hash = 7;
for (char c : texto.toCharArray()) {
    hash = hash * 31 + c;
}
```

## 3. Cómo aplicar
1. Asegurar tests o ejemplos que describan el comportamiento esperado.
2. Implementar el nuevo algoritmo en paralelo o detrás de la misma interfaz.
3. Sustituir el anterior y simplificar el código remanente.

### Ejemplo
**Antes**
```java
boolean contiene(List<String> lista, String valor) {
    for (String actual : lista) {
        if (actual.equals(valor)) return true;
    }
    return false;
}
```

**Después**
```java
boolean contiene(List<String> lista, String valor) {
    return lista.contains(valor);
}
```

## 4. Cuándo no aplicar
- Cuando el algoritmo actual encapsula reglas de negocio específicas que la alternativa no preserva.
- Cuando cambiarlo sin pruebas puede alterar resultados borde o rendimiento esperado.

### Ejemplo
```java
BigDecimal interesCompuesto(BigDecimal capital, int meses) {
    // fórmula de negocio regulada
}
```
