# Daniel Felipe Alfonso Bueno 

# Profesor: Luis Daniel Benavides
# ARSW - Arquitectura de Software 2020-I
## Descripci�n

En este proyecto se busca asegurar un WebSocket, mediante la implementaci�n de un Ticket el cual solo ser� otorgado a las personas que se autentiquen en la aplicaci�n, este Ticket ser� confirmado al momento de enviar mensajes. Adem�s de administrar las sesiones en redis, por si se cae el servidor cuando se restablezca este pueda responder exitosamente a una sesi�n ya iniciada.
 
[�Link de la aplicaci�n desplegada en Heroku!](https://polar-bastion-28499.herokuapp.com/index.html)
## Prerrequisitos
Instalaci�n de JAVA 8 y Maven, manejo de Maven como administrador proyectos y librer�as y JAVA OO
## Dise�o
#### Diagrama de componentes
![ImagenComponente](./img/DiagramaComponentes.PNG)
#### Diagrama de clases
![ImagenComponente](./img/DiagramaClases.PNG)
### Descripci�n
Contamos con una clase principal App la cual es la encargada de ejecutar, nuestra aplicaci�n esta usa un DrawingServiceController donde se har�n las peticiones http para obtener los recursos del servidor en el backend, esta misma clase es la encargada de devolver el ticket solicitado por el cliente y validando su existencia en cache. La clase principal tambi�n usa un configurator el cual se encarga de la administraci�n del Web socket, tambi�n el manejo de rutas y configuraci�n de autenticaci�n de usuarios y este configurador usa un endpoint donde el web socket recibe la informaci�n maneja el envi� de mensajes, inicio y cierre de conexi�n tambi�n se hace la solicitud y verificaci�n del Ticket. Usamos redis para almacenar la sesi�n y hacer lo mas stateless posible nuestra aplicaci�n, es decir no almacenar nada en memoria, si no persistir las sesiones. 
## Uso del proyecto
Clonamos el proyecto desde el siguiente link con el comando o ingresamos directamente el link en heroku 
 
~~~
https://github.com/DanielAlfonso17/ARSWLAB8.git
~~~

Podemos ejecutarlo desde mvn o desde una IDE de la siguiente manera 

![ImagenComponente](./img/proyectoClonar.PNG)

Accedemos a la aplicaci�n con los usuarios user y user2 con las contrase�a password

![ImagenComponente](./img/login.PNG)

![ImagenComponente](./img/loginUsers.PNG)

Iniciamos sesi�n y podemos observar que el tablero es interactivo el socket  tambien esta protegido, esto podemos probarlo corriendo una nueva instancia de nuestro tablero que no tenga autenticaci�n y podremos comprobar que lo que hagamos en dicho tablero no se actualizara en nuestro tablero original donde estan los dos usuarios. 

![ImagenComponente](./img/Tablero.PNG)