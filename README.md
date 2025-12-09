# Sistema de Gestión de Juguetería

Sistema de gestión de productos para una juguetería desarrollado en Java con interfaz gráfica Swing y conexión a base de datos MySQL.

## 📋 Descripción

Esta aplicación permite gestionar productos de una juguetería mediante una interfaz gráfica intuitiva. Los usuarios pueden agregar nuevos productos (con nombre, categoría y precio) y consultar todos los productos almacenados en la base de datos.

## 🏗️ Estructura del Proyecto

```
jugueteria/
├── Jugueteria/
│   ├── src/
│   │   ├── Main.java              # Punto de entrada de la aplicación
│   │   ├── Juguete.java           # Clase abstracta base
│   │   ├── Producto.java          # Clase que extiende Juguete
│   │   ├── FormularioJuguete.java # Interfaz gráfica principal
│   │   ├── ConexionBD.java        # Gestión de conexión a BD
│   │   └── Rutina.java            # Clase de ejemplo/prueba
│   ├── producto.sql               # Script SQL para crear la base de datos
│   └── build.xml                  # Archivo de construcción Ant
└── README.md
```

## 🛠️ Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal
- **Java Swing**: Interfaz gráfica de usuario
- **MySQL/MariaDB**: Base de datos relacional
- **JDBC**: Conector Java para base de datos
- **Apache Ant**: Sistema de construcción

## 📦 Requisitos Previos

- Java JDK 8 o superior
- MySQL o MariaDB instalado y ejecutándose
- MySQL Connector/J (driver JDBC para MySQL)
- Apache Ant (opcional, para compilación)

## ⚙️ Configuración

### 1. Base de Datos

1. Crea una base de datos MySQL llamada `jugueteria`:
```sql
CREATE DATABASE jugueteria;
```

2. Importa el script SQL incluido en el proyecto:
```bash
mysql -u usuario -p jugueteria < Jugueteria/producto.sql
```

O ejecuta el contenido del archivo `producto.sql` en tu cliente MySQL.

### 2. Variables de Entorno

Configura las siguientes variables de entorno con tus credenciales de base de datos:

**Windows (PowerShell):**
```powershell
$env:DB_URL = "jdbc:mysql://localhost:3306/jugueteria"
$env:DB_USER = "tu_usuario"
$env:DB_PASS = "tu_contraseña"
```

**Windows (CMD):**
```cmd
set DB_URL=jdbc:mysql://localhost:3306/jugueteria
set DB_USER=tu_usuario
set DB_PASS=tu_contraseña
```

**Linux/Mac:**
```bash
export DB_URL="jdbc:mysql://localhost:3306/jugueteria"
export DB_USER="tu_usuario"
export DB_PASS="tu_contraseña"
```

### 3. Dependencias

Asegúrate de tener el driver JDBC de MySQL en el classpath. Puedes descargarlo desde:
- [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)

Si usas NetBeans o un IDE similar, agrega el JAR del conector MySQL a las bibliotecas del proyecto.

## 🚀 Compilación y Ejecución

### Opción 1: Usando NetBeans

1. Abre el proyecto en NetBeans
2. Configura las variables de entorno
3. Ejecuta la clase `Main.java`

### Opción 2: Compilación Manual

```bash
# Compilar
javac -cp "ruta/al/mysql-connector.jar:." Jugueteria/src/*.java

# Ejecutar
java -cp "ruta/al/mysql-connector.jar:." Main
```

### Opción 3: Usando Ant

```bash
ant compile
ant run
```

## 📖 Uso de la Aplicación

1. **Iniciar la aplicación**: Ejecuta la clase `Main.java` o el archivo JAR compilado.

2. **Agregar un producto**:
   - Ingresa el nombre del producto en el campo "Nombre"
   - Ingresa la categoría en el campo "Categoría"
   - Ingresa el precio en el campo "Precio"
   - Haz clic en el botón "Agregar"
   - Verás un mensaje de confirmación si el producto se agregó correctamente

3. **Consultar productos**:
   - Haz clic en el botón "Consultar"
   - Todos los productos almacenados se mostrarán en el área de texto inferior

## 🏛️ Arquitectura

### Clases Principales

- **`Juguete`**: Clase abstracta que define la estructura base de un juguete con `nombre` y `categoria`.
- **`Producto`**: Clase concreta que extiende `Juguete` y añade el atributo `precio`.
- **`FormularioJuguete`**: Interfaz gráfica que permite interactuar con la base de datos.
- **`ConexionBD`**: Clase utilitaria que gestiona la conexión a la base de datos MySQL.

### Base de Datos

La tabla `producto` tiene la siguiente estructura:
- `id`: INT (clave primaria, auto-incremental)
- `nombre`: VARCHAR(100)
- `categoria`: VARCHAR(100)
- `precio`: DOUBLE

## 👤 Autor

**Fabia**

## 📝 Notas

- Asegúrate de que el servidor MySQL esté ejecutándose antes de iniciar la aplicación.
- Las credenciales de la base de datos se obtienen de variables de entorno por seguridad.
- El proyecto utiliza el patrón de diseño de herencia con la clase abstracta `Juguete`.

## 🔧 Solución de Problemas

### Error de conexión a la base de datos
- Verifica que MySQL esté ejecutándose
- Confirma que las variables de entorno estén configuradas correctamente
- Asegúrate de que la base de datos `jugueteria` exista

### Driver no encontrado
- Verifica que el MySQL Connector/J esté en el classpath
- Descarga e incluye el JAR del conector MySQL en tu proyecto

### Error al agregar producto
- Verifica que los campos no estén vacíos
- Asegúrate de que el precio sea un número válido

