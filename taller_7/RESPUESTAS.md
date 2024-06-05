## Parte 1

### Ejercicio 1

| `n`                            | OUT\[n\](x) |
| ------------------------------ | ----------- |
| `x = 0`                        | Z           |
| `x = K // con K distinto de 0` | NZ          |

### Ejercicio 2

<!-- x = y -->

| IN\[n\](y) | OUT\[n\](x) |
| ---------- | ----------- |
| ⊥          | ⊥           |
| Z          | Z           |
| NZ         | NZ          |
| MZ         | MZ          |

### Ejercicio 3

<!-- (x = y + z) -->

| IN\[n\](y) | IN\[n\](z) | OUT\[n\](x) |
| ---------- | ---------- | ----------- |
| ⊥          | ⊥          | ⊥           |
| Z          | ⊥          | ⊥           |
| NZ         | ⊥          | ⊥           |
| MZ         | ⊥          | ⊥           |
| ⊥          | Z          | ⊥           |
| Z          | Z          | Z           |
| NZ         | Z          | NZ          |
| MZ         | Z          | MZ          |
| ⊥          | NZ         | ⊥           |
| Z          | NZ         | NZ          |
| NZ         | NZ         | MZ          |
| MZ         | NZ         | MZ          |
| ⊥          | MZ         | ⊥           |
| Z          | MZ         | MZ          |
| NZ         | MZ         | MZ          |
| MZ         | MZ         | MZ          |

### Ejercicio 4

<!--  (x = y - z) -->

| IN\[n\](y) | IN\[n\](z) | OUT\[n\](x) |
| ---------- | ---------- | ----------- |
| ⊥          | ⊥          | ⊥           |
| Z          | ⊥          | ⊥           |
| NZ         | ⊥          | ⊥           |
| MZ         | ⊥          | ⊥           |
| ⊥          | Z          | ⊥           |
| Z          | Z          | Z           |
| NZ         | Z          | NZ          |
| MZ         | Z          | MZ          |
| ⊥          | NZ         | ⊥           |
| Z          | NZ         | NZ          |
| NZ         | NZ         | MZ          |
| MZ         | NZ         | MZ          |
| ⊥          | MZ         | ⊥           |
| Z          | MZ         | MZ          |
| NZ         | MZ         | MZ          |
| MZ         | MZ         | MZ          |

### Ejercicio 5

<!-- (x = y * z) -->

<!-- REVISAR: ⊥ * Z -->

| IN\[n\](y) | IN\[n\](z) | OUT\[n\](x) |
| ---------- | ---------- | ----------- |
| ⊥          | ⊥          | ⊥           |
| Z          | ⊥          | Z           |
| NZ         | ⊥          | ⊥           |
| MZ         | ⊥          | ⊥           |
| ⊥          | Z          | Z           |
| Z          | Z          | Z           |
| NZ         | Z          | Z           |
| MZ         | Z          | Z           |
| ⊥          | NZ         | ⊥           |
| Z          | NZ         | Z           |
| NZ         | NZ         | NZ          |
| MZ         | NZ         | MZ          |
| ⊥          | MZ         | ⊥           |
| Z          | MZ         | Z           |
| NZ         | MZ         | MZ          |
| MZ         | MZ         | MZ          |

### Ejercicio 6

<!-- (x = y / z) -->

| IN\[n\](y) | IN\[n\](z) | OUT\[n\](x) |
| ---------- | ---------- | ----------- |
| ⊥          | ⊥          | ⊥           |
| Z          | ⊥          | ⊥           |
| NZ         | ⊥          | ⊥           |
| MZ         | ⊥          | ⊥           |
| ⊥          | Z          | ⊥           |
| Z          | Z          | ⊥           |
| NZ         | Z          | ⊥           |
| MZ         | Z          | ⊥           |
| ⊥          | NZ         | ⊥           |
| Z          | NZ         | Z           |
| NZ         | NZ         | NZ          |
| MZ         | NZ         | MZ          |
| ⊥          | MZ         | ⊥           |
| Z          | MZ         | ⊥           |
| NZ         | MZ         | ⊥           |
| MZ         | MZ         | ⊥           |

### Ejercicio 7

| n   | IN\[n\](x) | IN\[n\](y) | OUT\[n\](x) | OUT\[n\](y) |
| --- | ---------- | ---------- | ----------- | ----------- |
| 1   | ⊥          | MZ         | ⊥           | MZ          |
| 2   | MZ         | MZ         | MZ          | MZ          |
| 3   | MZ         | MZ         | MZ          | NZ          |
| 4   | MZ         | MZ         | MZ          | MZ          |
| 5   | MZ         | MZ         | MZ          | MZ          |
| 6   | MZ         | MZ         | MZ          | MZ          |
| 7   | MZ         | MZ         | MZ          | MZ          |
