# Calculadora Java

Proyecto de aprendizaje: una calculadora que evoluciona por versiones, desde una
aplicación de consola hasta una interfaz gráfica de escritorio con Swing (MVC).

## Versión actual: v1.1.0

Calculadora de consola con las cuatro operaciones básicas:

- Suma
- Resta
- Multiplicación
- División

Incluye manejo de excepciones: controla la entrada inválida y la división entre cero.

## Requisitos

- JDK 21 o superior
- Git (para clonar el repositorio)

## Cómo ejecutar

### Desde IntelliJ IDEA

1. Abrir la carpeta del proyecto.
2. Ejecutar la clase `Main`.

### Desde la terminal

```bash
javac -d out src/Main.java
java -cp out Main
```

## Estructura

```
calculadora/
├── src/
│   └── Main.java
├── .gitignore
├── CHANGELOG.md
└── README.md
```

## Versiones

| Versión | Descripción |
|---------|-------------|
| v1.0.0  | Consola, 4 operaciones básicas |
| v1.1.0  | Manejo de excepciones |
| v1.2.0  | Métodos (próximamente) |
| v1.3.0  | POO (próximamente) |
| v2.0.0  | Interfaz gráfica con Swing y MVC (próximamente) |

Cada versión está marcada con un tag en Git. Para ver el código exacto de una
versión, elige el tag correspondiente en GitHub.