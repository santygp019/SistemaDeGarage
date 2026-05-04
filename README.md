# Sistema de Gestión de Garage - Programación Avanzada

## 📋 Descripción del Proyecto

Sistema de gestión de estacionamiento desarrollado en **Java** como Parcial 1 de la materia **Programación Avanzada** (Leonardo Da Vinci - Escuela Superior de Arte Multimedial, 2026).

El sistema permite administrar el ingreso, permanencia y egreso de vehículos (Motos, Autos y Camiones) en un garage, controlando espacios disponibles, calculando costos y generando reportes.

## ✨ Funcionalidades Principales

- **Registro de Garage**: Inicialización con capacidad máxima de espacios.
- **Ingreso de Vehículos**: Soporta tres tipos (Moto, Auto, Camión) con diferentes espacios y tarifas.
- **Control de Espacio**: Validación en tiempo real de disponibilidad.
- **Egreso de Vehículos**: Cálculo automático del costo estimado.
- **Listado y Reportes**: Vehículos estacionados, estado del garage y recaudación estimada.
- **Manejo de Errores**: Excepciones personalizadas y validaciones robustas.

## 🏗️ Decisiones de Diseño (Fundamentos)

### 1. **Programación Orientada a Objetos**
- **Herencia**: Clase abstracta `Vehiculo` como base para `Moto`, `Auto` y `Camión`.
- **Polimorfismo**: Cada subclase implementa su propio `calcularCosto()` y `getEspacioOcupado()`.
- **Interfaces**: 
  - `Calculable`: Para el cálculo de costos.
  - `Mostrable`: Para mostrar información de vehículos.

### 2. **Manejo de Excepciones**
Se crearon excepciones personalizadas:
- `GarageLlenoException`
- `PatenteDuplicadaException`
- `VehiculoNoEncontradoException`
- `HorasInvalidasException`

Esto permite un manejo más semántico y claro de los errores de negocio.

### 3. **Colecciones**
- Uso de `ArrayList<Vehiculo>` para almacenar los vehículos (polimorfismo en acción).
- Búsqueda por patente mediante iteración.

### 4. **Principios Aplicados**
- **Encapsulación**: Atributos privados con getters/setters.
- **Responsabilidad Única**: `Garage` gestionan la lógica del estacionamiento, las clases de vehículos su propio comportamiento.
- **Abstracción**: La clase `Vehiculo` define el contrato que deben cumplir todas las subclases.

### 5. **Validaciones**
- Patentes únicas
- Horas estimadas > 0
- Campos obligatorios no vacíos
- Tipos de datos correctos
- Espacio disponible antes de ingresar

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**: Java
- **Build Tool**: Maven
- **Paradigma**: OOP + Interfaces + Excepciones
- **Control de Versiones**: Git + GitHub

## 📁 Estructura del Proyecto
