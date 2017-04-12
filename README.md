> # ***BuyCars***
>
> ## Descripción de la temática
> Se trata de una Web de compra/venta de coches en la que un usuario podrá ver una gran variedad de coches para comprar. En la parte pública de la web, el usuario podrá hacer una búsqueda filtrada para encontrar el vehículo que desee, ver su descripción, características, precio, etc. También tendrá la opción de loguearse o registrarse para acceder a la parte privada de la aplicación.
>
> En la parte privada el usuario podrá subir su vehículo para venderlo, negociar con otro usuario o concretar una compra de un vehículo, además de todas las funcionalidad de la parte pública de la web.
>
> ## Nombre y descripcion de cada entidad
> **Coche:** esta entidad nos mostrará todos los datos relacionados con el vehículo, así como: Marca, Modelo, Matricula, Color, etc.<br/>
> **Categoría:** en esta entidad aparecerán las distintas categorías o familias de cada vehículo como por ejemplo: coches familiares, 4x4, americanos, japoneses, etc.<br/>
>**Usuario:** en esta entidad aparecerán los datos relativos a los usuarios registrados en la aplicación como el nombre, apellidos, email, teléfono, etc.<br/>
> **Compra:** en esta entidad guardaremos todas las compras o transacciones realizadas entre usuarios, en la que aparecerán entre otros coche, comprador, vendedor, precio de la compra, etc.<br/>
> **Venta:** en esta entidad guardaremos los datos relacionados a los usuarios y los coches que venden además del precio de venta y más datos.<br/>
> **CocheCategoria:** en esta tabla, creada a consecuencia de una relación N:M entre la tabla Coche y la tabla Categoria, guardaremos los datos de cada coche y su categoría correspondiente. Como un coche puede tener más de una categoría necesitamos guardar estos datos en esta tabla auxiliar, ya que no podríamos meter estos datos en la tabla Coche.<br/>
> 
> ## Integrantes del equipo de desarrollo:
> **Pavel Egido del Arco**<br/>
>   * Email: p.egido@alumnos.urjc.es<br/>
>   * Cuenta GitHub: o0Pavelo0 <br/>
>   
>**Alvaro Rollin Guerro**<br/>
>   * Email:	a.rollin@alumnos.urjc.es<br/>
>   * Cuenta GitHub: ROLLIN89 <br/>
>   
>**Osvaldo Renato	Luzuriaga Luzuriaga**<br/>
>   * Email: or.luzuriaga@alumnos.urjc.es <br/>
>   * Cuenta GitHub: orluzuriaga <br/>
>
> ## Tablero Trello
>  [Tablero BuyCars] (https://trello.com/invite/b/89zXO16r/06b870b346ef37954a5d89b8330a5326/sistemas-distribuidos)
>
> ## Diagrama de navegacion
>  [Diagrama de navegación] (http://prezi.com/q3d9w2dci5w4/?utm_campaign=share&utm_medium=copy&rc=ex0share  )
>
>
> ## Diagrama UML
> [Diagrama UML] (https://github.com/o0Pavel0o/SistemasDistribuidos/blob/master/UMLBuyCars.png)
>
>## Diagrama Entidad-Relacion
> [Diagrama Entidad-Relación] (https://github.com/o0Pavel0o/SistemasDistribuidos/blob/master/Entidad_relacion.png )
>
>## Instrucciones azure
> 1. Creamos un certificado pem para acceder a la mv
> 2. Creamos una mv en azure
> 3. Accedemos a la mv utilizando las claves creadas<br/>
>     3.1 ssh -i clave privada azureuser@ ip mv <br/>
> 4. Instalamos OpenJDK 8 JRE: <br/>
>     4.1 sudo add-apt-repository ppa:openjdk-r/ppa <br/>
>     4.2 sudo apt-get update <br/>
>     4.3 sudo apt-get install openjdk-8-jre <br/>
> 5. Instalamos MySql<br/>
>     5.1 sudo apt-get update<br/>
>     5.2 sudo apt-get install -y mysql-server<br/>
>     5.3 comprobamos que tenemos acceso a MySQL con:<br/>
>           5.3.1 mysql -u root -p<br/>
> 6. Subimos el .jar de la aplicacion utilizando la siguiente secuencia<br/>
>     6.1 Nos situamos en la carpeta cd target <br/>
>     6.2 Subimos el jar utilizando la clave privada:<br/>
>           6.2.1 scp -i "clave privada azure" BuyCars-0.0.1-SNAPSHOT.jar azureuser@ "ip vm":/home/azureuser/ <br/>
> 7. Configuramos la BBDD accedemos como root <br/>
>     7.1 mysql -u root -p <br/>
>     7.2 Una vez dentro teclamos lo siguiente <br/>
>       > 7.2.1 mysql> create database buycars; <br/>
>          7.2.2 mysql> create user ‘renato’@’%’ identified by ‘123456’; <br/>
>          7.2.3 mysql> grant all privileges on buycars.* to ‘renato’@’%’ <br/>
>          7.2.4 mysql> flush privileges; <br/>
>          7.2.5 mysql> exit; <br/>
>     7.3 Comprobamos que tenemos acceso a la BBDD <br/>
>           7.3.1 mysql -u renato -p buycars <br/>
> 8. Ejecutamos la aplicacióncon: java -jar BuyCars-0.0.1-SNAPSHOT.jar <br/>
> 9. Accedemos a la aplicacón con **buycars.cloudapp.net**
>
>  
