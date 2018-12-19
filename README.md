# recuperacionJava
ENUNCIADO. 
Desarrolla una aplicación gráfica en Java basada en una BDs de 3 tablas relacionadas y montadas sobre  Derby como en el siguiente esquema relacional.
REQUISITOS 
1.- BDs. 
1.1.- Contendrá campos de tipo numérico, real, alfanumérico, fecha e imagen.

2.- Vista. La aplicación se basará en un JFrame. 
2.1.- En el título aparecerá el nombre y apellidos del autor. 
2.2- Tendrá un menú para acceder a los distintos paneles. 
2.3.- La conexión a la BDs. será automática 
2.4.- Para la validación se permitirá 3 intentos tras lo cual se cerrará. 
2.5.- La contraseña nunca será visible. 
2.6.- Sobre la A se validarán los usuarios. 
2.7.- Al validarse se guardará un objeto de la clase Conexión en el fichero conexiones. 
2.8.**- Habrá un JPanel para insertar un elemento de B o C. La FK debe darlas el sistema de forma automática o mediante un JList. 2.9.**- Habrá paneles para bajas y modificaciones de alguna tabla o tablas. 
2.10.**- Se visualizarán de uno en uno los elementos de B del usuario validado. 
2.11.**- Se visualizará todos los elementos de C en un JTable, de cada elemento de B. Bien directamente en el mismo panel o indirectamente, mediante un botón, en otro panel. 
2.12.**- Habrá un cálculo (no un campo en la BDs) en B sobre los valores de C que dependerán de la fecha (PE. Antes o después de la fecha actual, del mes o año actual, etc.). 
2.13.- Tope. Un campo de cualquier tabla podrá llegar a un tope que no puede sobrepasar y saltara una alerta por una excepción. 
2.14.- Habrá una opción de ver en un panel todos los datos del usuario (tabla A) conectado. 
2.15.- Se podrá modificar el campo imagen, seleccionado el fichero con un JFileChooser.
2.16.**- En la anterior panel se mostrará en un JList con todas las conexiones realizadas por ese usuario, incluso la actual, con el formato fecha y hora. Se cargará del fichero de Conexiones a una lista solo con los objetos conexión del usuario conectado.
 
3.- Modelo. 
3.1.- Existirá una Clase asociada a cada tabla de la BDs. con constructores y métodos gets y sets. 
3.2.- Implementa un interfaz sobre la clase. 
3.3.- Dicho interfaz tendrá: - Castellanizadas las constantes que utilices de la clase Calendar.
- Desarrollar un método que diga si la fecha es o no la necesaria en los cálculos dependiente de la fecha. 
3.3.- Desarrolla una clase intermedia por cada clase y cada tabla (en total 3, A, B y C), con las consultas hacia esa tabla en la BDs.     3.3.1.- Contendrá las cadenas para realizar las consultas que pasarán a la clase de acceso a los datos. 
  3.3.2.- Para los select devolverán una Colectión de objetos que antes crearán con los resulset que reciban de la clase de acceso. 
  3.3.3. Para los updates devolverán el número de operaciones afectadas y verdadero o falso para los insert.
  
4.- Controlador. 
4.1.- Habrá una única clase para Drivers y conexión. 
4.2.- Habrá otra de acceso a los datos. Con los Statement, Resultset, etc. necesarios. Aunque pueden crearse  otras clases más específicas. 
4.3.- La clase de acceso a los datos devolverán a las clases intermedias: a) El resultset para los select, b) En las operaciones de inserción devolverán verdadero o falso. c) En las operaciones de “update” el número de filas actualizadas
4.4.- Otras consideraciones. 
  4.4.1.- Utiliza un PrepareStatement para la validación de los socios. 
  4.4.2.- Resto de las consultas se puede usar cualquier tipo de statement. 
4.5.- Crea una Excepción personalizada para el campo “tope”. Levantará un mensaje error, como las del sistema. 
4.6.- Los mensajes de error de las excepciones del sistema y la del campo “tope” se guardarán en un fichero de texto a modo de log (registro) con el formato fecha, hora y mensaje. 
  4.6.1.- El contenido del fichero log será visible con comandos linux (type, less o cat). 
4.7.- Crea una Excepción personalizada de error. Solo levantarán un código de error. Se lanzará después de capturar otras excepcione, para que los mensajes solo se muestren en la vista. 
4.8.-. Sistema de errores será centralizado mediante una clase donde se asociará el código de error al mensaje correspondiente. 
  4.8.1.- Debe contener errores que no provengan de una excepción, por ejemplo de un “if” por un campo vacío. 
4.9.- Habrá una clase Conexión serializable, con los campos fecha, hora (GregoryCalendar) e identificador de usuario, para guardar y leer objetos conexión en el fichero de conexiones.

5.- Otras consideraciones: 
5.1.- Los mensajes solo se lanzaran desde la clase de la vista. 
5.2.- Utiliza algunas comparaciones (if) para lanzar errores del sistema de errores centralizados. 
5.3.- Usa la notación de java: todo en minúscola, excepto las Clases (la inicial en mayúsculas) y las constantes (todo en mayúsculas). 5.4.- Paquetes existentes: vista, modelo, controlador e imagenes. 
5.5.- El único fichero ejecutable (main) será el único JFrame existente. 
5.6.- El JFrame cargara los distintos paneles desde el menú. 
5.7.***- Cumplimento estricto de la arquitectura MVC.

Criterios de corrección: 
Se requiere un cumplimiento del 90% de los apartado que aparecen. 
Los apartados con dos asteriscos multiplican su valor por el número de ellos.

