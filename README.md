# Práctica 07 - Menú Lateral

**Instrucciones**: Desarrolle una aplicación móvil en plataforma Android, utilizando menú de tipo lateral para una **Ferretería**.

El diseño de la aplicación contempla la Activityprincipal donde se tiene el menú principal (de tipo lateral) que tendrá las opciones: *Información*, *Productos*, *Contacto*. La opción Información será para describir información sobre la ferretería (solamente texto). La opción Productos  corresponde a mostrar una serie de imágenes de los productos (al menos 10). La opción Contacto corresponde a un formulario para registrar la información: *nombre* (caja de texto), *teléfono* (caja de texto), *correo electrónico* (caja de texto) y *comentarios* (Lista desplegable al menos 6 nombres que correspondan a las imágenes).

La funcionalidad con respecto a cada Activity se detalla a continuación:
* ***Menú principal.*** En el main se programa el menú lateral y por cada opción ejecutar el Fragment correspondiente (Información, Productos y Contacto).
* ***Información***. Colocar texto con datos generales de la ferretería, como su nombre, ubicación, tipo, etcétera.
* ***Productos***: Se despliega una listado de imágenes correspondientes a imágenes representativas. Al dar clic sobre la imagen, debe mostrar el nombre de ella, mediante un Toast.
* ***Contacto***: Se debe visualizar el formulario para capturar datos solicitados. Al registrar, se guardan en un objeto y se muestra lo registrado en un mensaje de la clase Toast.
