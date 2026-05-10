# Sistema de Entregas con Drones Autónomos

## Descripción del Proyecto
Este sistema de logística inteligente utiliza drones autónomos para realizar entregas en ciudades inteligentes. El proyecto aplica los principios fundamentales de la **Programación Orientada a Objetos (POO)** en Java para gestionar diferentes tipos de drones, cada uno con reglas de operación, capacidades de carga y costos específicos.

Desarrollado para la **Escuela de Formación de Tecnólogos (ESFOT)** de la **Escuela Politécnica Nacional (EPN)**.

## Características Principales
- **Jerarquía de Clases:** Implementación de una clase abstracta padre (`Dron`) y tres clases especializadas (`DronLiviano`, `DronCarga`, `DronEmergencia`).
- **Encapsulamiento:** Atributos privados y protegidos con acceso mediante métodos Getters y Setters con validaciones integradas.
- **Polimorfismo:** Ejecución de métodos sobrescritos (`@Override`) para el cálculo de costos y validación de datos a través de referencias de la clase padre.
- **Flujo Secuencial:** Interacción con el usuario mediante consola (Scanner) siguiendo un flujo lineal sin menús de opciones, tal como lo requiere el estándar de la prueba.

## Estructura de Clases y Límites

| Tipo de Dron | Peso Máximo | Horas Máximas | Costo Base |
| :--- | :--- | :--- | :--- |
| **Dron Liviano** | 5 kg | 2 horas | $3.00 |
| **Dron Carga** | 30 kg | 5 horas | $6.00 |
| **Dron Emergencia** | 10 kg | 3 horas | $8.00 |

## Reglas de Cálculo de Costo
- **Liviano:** `costoBase + (distancia * 0.80) + (peso * 0.50)`
- **Carga:** `costoBase + (distancia * 1.20) + (peso * costoPorkg)`
- **Emergencia:** `costoBase + (distancia * 1.50) + (peso * 0.90) + recargoUrgencia`

## Requisitos del Sistema
- Java JDK 8 o superior.
- Terminal o IDE (IntelliJ IDEA, NetBeans, Eclipse).

## Instrucciones de Ejecución
1. Compile todas las clases: `javac *.java`
2. Ejecute la clase principal: `java Main`
3. Siga las instrucciones en consola para el ingreso de datos.

## Autores
- **Estudiante:** Francisco Paul Lanche Flores
- **Institución:** Escuela Politécnica Nacional (EPN)
- **Profesores:** Mgs. Sergio Granizo - Yadira Franco
- **Fecha:** Mayo 2026
