# Documentación de RegistrInc
## Documentación Técnica
### Estructura y Contenido
#### Definición del Software
RegistrInc es un software que tiene como propósito mejorar la eficacia y eficiencia del registro de estudiantes de determinada institución o incluso podría ser modificado para agregar o quitar información según se lo desee, esto mediante una sencilla interfaz gráfica de usuario que permitirá ingresar, borrar y eliminar información de forma rápida y sencilla.

#### Requerimientos y Herramientas utilizadas
RegistrInc es un software creado en el lenguaje de programación Java mediante el software NetBeans, por lo que para su modificación o manipulación será requerido un IDE que soporte Java (como por ejemplo el mismo NetBeans o Eclipse) así como por supuesto y recomendablemente la última versión del JRE Y JDK de Java.
El Software utiliza las librerías: 
+ Absolute Layout (para la GUI)
+ JDBC (Java Database Connectivity.  Es una API que permite la ejecución de operaciones sobre bases de datos desde el lenguaje de programación Java)
+ Importar librería java.sql en las clases DAO

Por último se utiliza una base de datos creada con SQL por lo que la máquina que aloje el software deberá tenerlo en su sistema así como una base de datos y una tabla de la siguiente forma:

![db](https://i.ibb.co/RBzH4DX/db.png)

A pesar de que estos son los parámetros por defecto, estos pueden ser modificados cambiando las variables de la entidad y de la parte DAO del software.
#### Estructura del Software
El software fue programada utilizando el patrón arquitectónico DAO (Data Access Object) el cual permite separar la lógica de acceso a datos de los Objetos de negocios, de forma que el DAO encapsula toda la lógica de acceso de datos al resto de la aplicación. Y por supuesto la POO (Programación Orientada a Objetos) que tanto caracteriza a Java.

![DAO](https://i.ibb.co/CVk2jJ4/DAO.png)

Como se puede apreciar las clases "AlumnosDAO" y "Conexion" están en un paquete diferente, ya que conformar la parte lógica del patrón DAO que se utiliza en el software.
#### Paquetes
##### DAO
El paquete DAO posee las clases "Alumnos DAO" y "Conexion"

![conexion](https://i.ibb.co/PxMwhLb/conexion.png)

La clase conexión posee la función con el mismo nombre que realiza la conexión y prepara al software para hacer consultas a la base de datos mediante la librería "jdbc" y la librería sql en java en la función "Conexion".
La función "ResultSet" guarda un dato de tipo string sql en una variable ResultSet que contendrá la información con las query realizadas. Mientras que "insertQuery" realizará lo mismo pero ejecutando un update en la base de datos para la actualización de las tablas.

![sql](https://i.ibb.co/svXxzk8/sql.png)

La clase Alumnos DAO realiza los insert, select y delete de la información que se insertará y consultará mediante el programa y los agrega a un ArrayList. La función "getAlumnos" hará un select de toda la información en la tabla y lo guardará en un ArrayList, mientras que con "getAlumnosID" los buscará mediante el ID ingresado y "getAlumnosApell" los buscará mediante la variable apellido ingresada. Y finalmente la función "deleteAlumnosID" realizará un DELETE WHERE en la tabla según la ID ingresada y borrará la información de dicho estudiante.
##### Entidad
Posee sólo la clase Alumno que contiene las variables acerca de la información que se manejará con el software.
##### Imagenes
Posee las imagenes utilizadas en el software, como por ejemplo el fondo utilizado para interfaz gráfica
##### Proyectobasededatos
Este paquete posee la interfaz gráfica del programa la cual no fue creada por código escrito a mano, sino utilizando la función de arrastrar y soltar que posee NetBeans, posee también clase Main cuya función es llamar a la interfaz gráfica para que se inicie el uso del programa.

![tabla](https://i.ibb.co/RgvkZXg/tabla.png)

La clase "consulta" ejecutará la función "cargarTabla" la cuál mostrará un tabla que se llenará con los ArrayList llenados mediante las funciones escritas en el DAO.

## Recomendaciones
**Si se quiere modificar el tipo de información que se manipulará mediante el software:**
1. Modificar la clase *Alumnos* en el paquete *"entidad"*.
2. Modificar la clase *AlumnosDAO* en el paquete *"dao"*.
3. Modificar la tabla en la base de datos.
4. Modificar la GUI de ser necesario.

**Si se quiere agregar mas entidades como por ejemplo "docentes" para que su información sea tratada por el programa:**
1. Agregar la clase de la entidad en el paquete *"entidad"*
2. Crear la Tabla en la base de datos con la información a utilizar. 
3. Crear una clase en el paquete *"dao"* que utilice las mismas funciones que *AlumnosDAO* pero con la información y variables de la nueva entidad.
4. Modificar la GUI.

**NO eliminar funciones de la clase *AlumnosDAO* y *conexion* pues poseen las funciones necesarias para realizar las operaciones CRUD, solo agregar mas funciones o modificarlas de ser necesario.**

## Documentación de Usuario
### Software RegistrInc
El software RegistrInc está dirigido principalmente a instituciones educativas y su objetivo es facilitar el ingreso, consulta y eliminación de la información básica de estudiantes al momento del registro de lo mismos mediante una interfaz intuitiva y fácil de utilizar.

## Instalación y requerimientos técnicos
![terms](https://i.ibb.co/YPZ7p66/instalador-licencia.png)

En esta pestaña solo se necesita aceptar la licencia de free software del programa.

![install](https://i.ibb.co/TWZMFCX/instalador.png)

En esta pestaña se deberá escoger el sitio donde se instalará el programa presionando "*Examinar*", una vez hecho se debe presionar el botón "*Extraer*" tras lo cual se procederá con la instalación del software.
Tras la instalación se creará una carpeta con el nombre del programa en la ubicación que se haya escogido para la instalación

![carpeta](https://i.ibb.co/Q9nDsbf/carpeta.png)

El ejecutable "*Registrinc*" abrirá el programa.

El software no tiene grandes requerimientos y puede funcionar sin problemas en cualquier computador con **Windows** y aunque sería recomendable tener Java instalado, no es 100% necesario pues el instalador incluye su propio JRE lo que hace que el programa sea **portable**.

## Uso
### Registro
Una vez ejecutado el programa aparecerá una ventana para dar inicio al uso del software.

![inicio](https://i.ibb.co/ZckvMDV/programa.png)

En esta ventana bastante sencilla, sólo se debe escribir la información requerida en cada campo, a excepción de la fecha de registro la cual se asginará sola en base a la fecha de la máquina en la que se este ejecutando, por lo cual es **importante** que la fecha de la máquina en la que se corra el programa esté correctamente configurada. Cabe mencionar que los campos de *Nombre*, *Apellido* y *Carrera* tienen un bloqueo que no permite colocar números, mientras que el campo *Edad* tiene bloqueado el ingreso de caracteres alfabéticos, para evitar errores. (Consultar con el administrador de base de datos o del software en caso de requerirlo). Una vez escrita la información necesaria, solo se debe presionar el botón "*Registrar*" para el que programa guarde la información en la base de datos, tras lo cual se mostrará un pequeño mensaje notificando el éxito del registro.

![notify](https://i.ibb.co/t2QbdbP/registro-exitoso.png)

### Consulta
Una vez ingresada la información probablemente se quiera consultar dicha información, esto se puede realizar presionando el botón "*Consulta*".

![consulta](https://i.ibb.co/hHTSY7x/consulta.png)

Aquí en primera instancia se mostrarán todos los registros ingresados, sin embargo en caso de tener muchos registros y se quiera buscar uno en específico, se lo puede buscar de dos maneras:
+ Ingresando en el campo ID el id del estudiante que se muestra en la tabla y luego presionando buscar.
+ Ingresando el apellido del estudiante en el campo Apellido y luego presionando buscar.

Si luego se quiere volver a ver la lista completa no hace falta más que presionar el botón "*Ver Lista Completa*" y en caso de querer volver al registro de estudiantes, simplemente se debe presionar el botón "*Volver a Registro*" tras lo cual se cerrará la ventana de consulta y se abrirá la de registro.

### Eliminación
Para eliminar un registro, es decir a un estudiante de la base de datos se debe ir a la ventana de Consulta y en la parte inferior central se encuentra un campo que indica que se debe ingresar un ID, se debe ingresar el ID del estudiante que se quiere borrar y luego presionar el botón "*Borrar*" tras lo cual el estudiante será eliminado de la base de datos. Es importante colocar correctamente el ID, pues esta opción no se puede deshacer, a no ser que se realice una restauración a través de un respaldo de la base de datos de la información.

## Recomendaciones
+ Se recomienda ingresar solo un nombre y apellido en cada campo correspondiente, pues la base de datos tiene un límite de 20 caracteres e ingresar más de 20 causará un error que no permitirá el correcto ingreso del registro.
+ Configurar bien la fecha de la máquina, pues el programa tomará la fecha de la máquina para la fecha de registro.
+ En caso de tener que modificar la información ya ingresada, consultar con el administrador de base de datos.




