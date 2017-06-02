# RyuNinja

![Vista Juego](https://github.com/acominf/RyuNinja/blob/master/Juego.JPG)

### Objetivo del juego/aplicación
El objetivo del juego es aplicar los conocimientos adquiridos sobre la programacion orientada a objetos. Es una manera facil de comprender que pasa con las clases y como actuan entre sí. 

### Descripción del juego/aplicación
La descripción del juego es, que se trata de pasar tres niveles. En estos niveles va a haber un jugador que va a estar recolectando frutas que van cayendo, pero debe de recogerlas todas porque si no lo hace, se le irán quitando vidas y perderderá. Así también en cada nivel van apareciendo enemigos a los lados que le van a disparar para quitarle vidas tambien, pero el jugador tambien puede dispararles. En cada nivel hay que hacer cierta cantidad de puntos para poder avanzar de nivel.

### Clases principales y sus características
1. MainStart
* Crea la ventana del menu principal y agrega las opciones para que el jugador seleccione cuando quiere jugar o quiere ver la ayuda.

2. Level1
* Cambia la ventana para empezar a jugar e inicializa las posiciones de los objetos en el mundo (jugador, frutas, enemigos).
* Muestra los puntos que va ganando o perdiendo el juagdor.
* Checa si el jugador alcanzo los niveles necesarios para avanzar de nivel o checa si se terminan las vidas

3. Level2
* Cambia la ventana al nivel 2 e inicializa las posiciones de los objetos en el mundo.
* Muestra los puntos que va ganando o perdiendo el juagdor.
* Checa si el jugador alcanzo los niveles necesarios para avanzar de nivel o checa si se terminan las vidas

4. level3
* Cambia la ventana al nivel 2 e inicializa las posiciones de los objetos en el mundo.
* Muestra los puntos que va ganando o perdiendo el juagdor.
* Checa si el jugador alcanzo los niveles necesarios para avanzar de nivel o checa si se terminan las vidas

5. Disparo 
* Mueve la bala cuando el jugador quiere disparar.
* Checa cuando la bala alcanza los bordes y la desaparece.
* Checa si toca a un enemigo y lo remueve del mundo.

6. DisparEne
* Checa cuando la bala del enemigo toca al jugador lo remueve del mundo.

6. Item
* Contiene los metodo para mover las diferentes frutas que aparecen en el juego.
* Checa cuando caen las frutas y las desaparece.

6. Button 
* Es una clase que se usa para heredar todos los tipos de botones que se usan en el juego.

6. Enemigos
* Contiene el metodo de ataque para los diferentes enemigos que aparecen en cada nivel del juego

6. Jugador 
* Se encarga de mover al jugador
* checa cuando el jugador atrapa alguna fruta para saber cuantos puntos va a ganar
* checa cuando el jugador toca algun objeto que le pueda quitar puntos.

6. Vidas
* Guarda las imagenes que representan las vidas del jugador

6. Levelcomplete
* Muestra el mensaje de avanzar nivel cuando el jugador alcanza los puntos necesarios
* Muestra el mesaje que ganó el jugador cuando pasa todos los niveles

6. GameOver 
* Muestra el mensaje que el jugador perdio cuando se le acabarón las vidas.

### Diagrama de clases
![Diagrama de clases](https://github.com/acominf/RyuNinja/blob/master/Diagrama%201.JPG)

### Autor(es)
El autor(es) del proyecto son:
- Jorge Mendoza Garcia 
- Jaime Eduardo Luna Mireles 

### Materia(s)
- Programación Orientada a Objetos

### Semestre
- 2016-2017/II

### Universidad Autónoma de San Luis Potosí, 2017

### Markdown
El contenido de esta página está escrito en un lenguaje de marcado sencillo llamado _Markdown_. **Para modificar el contenido de esta página se tiene que editar el archivo README.md del repositorio**. Para más detalles consulta la página de [Markdown para GitHub](https://guides.github.com/features/mastering-markdown/).

### Temas de Jekyll
El estilo y presentación de esta página utiliza el tema de Jekyll seleccionado en la configuración del repositorio. El nombre de este tema está almacenado en el archivo de configuración `_config.yml`. Para más información acerca de los temas de Jekyll soportados por GitHub [haz click en este enlace](https://pages.github.com/themes/).
