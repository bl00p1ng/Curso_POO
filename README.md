## Curso de Programación Orientada a Objetos

Apuntes y código del [Curso de Programación Orientada a Objetos de Platzi](https://platzi.com/clases/oop/)

## 📚 Módulo 1. Bienvenida e Introducción

- ### ¿Por qué aprender Programación Orientada a Objetos?

  - Porque permite programar más rápido, esto se debe a que se hace un análisis previo de lo que se esta realizando.
  - Al saber analizar problemas y entender la programación orientada a objetos se puede avanzar y dejar de ser un programador Junior. Esto se debe a que varias de las preguntas más frecuentes de los reclutadores son *¿Qué es encapsulamiento, abstracción, herencia, polimorfismo?*
  - Saber POO permite dejar ala mala práctica de copiar y pegar código y tomar el control del proyecto y el código.

  En el curso de abordan 3 aspectos fundamentales:

  - **Analizar:** 
    - Observación
    - Entendimiento
    - Lectura: "leer" muy bien la situación del problema
  - **Plasmar:**
    - Diagramas: plasmar el análisis de una forma gráfica
  - **Programar:**
    - Desarrollar lo que se acaba de diagramar usando algún lenguaje de programación.
  
- ### ¿Qué resuelve la Programación Orientada a Objetos?

  Permite resolver muchos de los "huecos" que tiene la programación estructurada. Entre los problemas que resuelve están: 

  - El código muy largo.
  - Evita que si algo falla todo se rompa.
  - Reduce la dificultad de mantener el código.
  - Evita el código espagueti (demasiadas sentencias de control anidadas).

- ### Paradigma Orientado a Objetos

  La filosofía de **Orientación a Objetos** surge a partir de la necesitad de los programadores de plasmar soluciones a problemas en el código. Se basa en un  análisis del problema que se quiere abordar para posteriormente empezar a programar basándose a las conclusiones llegadas en dicho análisis. Esto ahorra el problema de no saber por donde empezar a resolver un problema con software.

  En dicho análisis se observan los problemas en forma de objetos para después llevar todo a una solución en código.

  **Paradigma:** teoría que suministra la base y modelo para resolver problemas.

  El **Paradigma de Programación Orientada a Objetos** se compone de 4 elementos:

  - **Clases**
  - **Propiedades**
  - **Métodos**
  - **Objetos**

  Además de esos 4 elementos , la POO también tiene 4 "Pilares":
  
  - **Encapsulamiento**
  - **Abstracción**
  - **Herencia**
  - **Polimorfismo**
  
- ### Lenguajes Orientados a Objetos

  Algunos lenguajes orientados a objetos son:

  - **Java:** orientado a objetos naturalmente, de hecho POO es su paradigma principal. Se usa principalmente en desarrollo de Apps para Android y Backend en servidores, APIs, etc. Extensión de archivo →  *.java*
  - **PHP:** es un leguaje interpretado creado para programación Web. Extensión de archivo → *.php*
  - **Python:** esta diseñado para ser fácil de usar, tiene una sintaxis amigable e intuitiva. Se puede usar en diversos campos como Backend, Data Science e Inteligencia Artificial. Extensión de archivo → *.py*
  - **JavaScript:** es un lenguaje interpretado. Esta orientado a objetos pero basándose en *prototipos*. Es un leguaje pensado para Web y actualmente puede usarse tanto en el Frontend como en el Backend. Extensión de archivo → *.js*
  - C#
  - Ruby
  - Kotlin

- ### Diagramas de Modelado

  Los **diagramas de modelado** son una especie de gráficos que sirven de intermediarios entre el análisis que se hace del problema que se quiere solucionar y el código que se va a generar para solucionar dicho problema.

  Hay 2 opciones de diagramas de modelado disponibles:

  - **OMT:** *(Object Modeling Techniques)*. Creado en 1991. Es una metodología para el análisis orientado a objetos. Lo que propone es que una vez se hace el análisis y se tienen identificados los objetos, atributos, métodos, etc; se pasa a plasmar cada objeto en un recuadro, se ponen todos los atributos y métodos dentro de dicho recuadro y luego se usa una serie de conectores para establecer las relaciones entre los diferentes objetos.

    ![OMT](https://i.imgur.com/GRHnJgt.png)

    Actualmente esta en desuso y no se recomienda emplearlo en ningún proyecto.

    

  - **UML:** *(Unified Modeling Language - Lenguaje de modelado unificado)*. Creado en 1997. Se podría resumir como la versión moderna de OMT, pues unifica las bases y técnicas de este y las mejora. Es el método para crear diagramas de modelado que se usa en la actualidad. Tiene muchas más capacidades que OMT, entre las cuáles están:

    - Clases
    - Casos de uso
    - Objetos
    - Actividades
    - Iteración
    - Estados
    - Implementación
    - Etc

    [Aprender más de UML](https://es.slideshare.net/still01/aprendiendo-uml-en-24-horas-16815956)

    ![UML](https://i.imgur.com/5Dy46xi.png)

    Aprender UML es importante pues permite plasmar de forma gráfica lo que se va a implementar en el código y como esta construido el proyecto.

    Algunas herramientas para trabajar con UML:

    - [StarUML](http://staruml.io/download)
    - [ArgoUML](https://argouml.uptodown.com/windows)
    - [Lucidchart](https://www.lucidchart.com/)

  

## 📚 Módulo 2. Orientación a Objetos

- ### Objetos

  Cuando hay un problema que se quiere resolver con Software lo primero que hay que hacer es **identificar los Objetos**.

  - **¿Cómo identificar a los Objetos?** Los **objetos** son aquellos que tienen propiedades y comportamientos. Siempre son sustantivos. Pueden ser físicos (un Usuario por ejemplo) o conceptuales, es decir, que no existen físicamente, son simbologías de procesos que lleva a cabo el software que se esta construyendo (una de Sesión de Usuario por ejemplo).
  - **¿Qué son las Propiedades?** También llamadas **atributos**. Son características o propiedades que describen a un objeto (por ejemplo: nombre, tamaño, forma, estado). Los tributos también son sustantivos.
  - **¿Qué son los comportamientos?** También se les conoce como **métodos**. Son todas las operaciones/acciones del objeto (por ejemplo: login(), logout(), makeReport()). Suelen ser verbos o sustantivo y verbo.

- ### Abstracción y Clases

  Una **Clase** es el modelo sobre el cuál se construye un objeto. Para definirlo de una forma más sencilla de entender, se puede pensar en un una clase como un molde que se usa para crear objetos. 

  En este punto se analizan Objetos, se establecen todos sus atributos y métodos y  en base a eso se crean Clases. Este proceso de abstraer los datos de un objeto para generar una clase (molde) se le conoce como **Abstracción**. En resumidas cuentas, la abstracción es ese proceso de analizar los objetos para identificar sus atributos y métodos comunes para en base a eso crear un molde llamando Clase.

- ### Modularidad

  Consiste en dividir un sistema en partes más pequeñas, cada una de esas partes se llaman **módulos**. Cada uno de esos módulos funciona de manera independiente, pero juntos conforman el sistema completo.

  La modularidad permite hacer más fácil el mantenimiento y la escalabilidad de un proyecto, pues mientras en las programación estructurada se tiene un sólo archivo muy grande en el que esta toda la lógica del sistema y en el que un error puede detener la ejecución de todo el programa, en la programación orientada a objetos las diferentes funciones de un sistema se dividen en módulos independientes, por lo que a la hora de solucionar bugs sólo hay que ubicar el módulo que esta fallando y repararlo sin tener que afectar al resto del código; y si se quieren añadir más funcionalidades al proyecto solo hay que crear nuevos módulos e integrarlos dentro del sistema.

  **Ventajas de la modularidad:**

  - Reutilizar código.
  - Se evitan colapsos.
  - Código más mantenible.
  - Mejor legibilidad en el código
  - Rápida resolución de problemas

  Las clases son el elemento que permite la modularidad en la POO, pues permiten dividir el problema en distintas clases/módulos y a su vez separar dichas clases en diferentes archivos.
  
- ### Analizando Uber en Objetos

  - **Análisis del problema:**

    ![Análisis del funcionamiento de Uber](https://i.imgur.com/1VwEKHN.png)

    

  - **Análisis de los Objetos:**

    |   **User**    |
    | :-----------: |
    |   **Route**   |
    |  **Driver**   |
    |   **UberX**   |
    | **UberPool**  |
    | **UberBlack** |
    |  **UberVan**  |
    |   **Trip**    |
    |   **Cash**    |
    |   **Card**    |
    |  **Paypal**   |

## 📚 Módulo 3. Programación Orientada a Objetos. Análisis

- ### Clases en UML y su sintaxis en código

  Las clases en UML son representadas por un rectángulo. En la parte superior se pone el nombre de la clase (verde), después los atributos (morado) y por último los comportamientos/métodos (azul).

  ![Definir Clases enUML](https://i.imgur.com/Li7Ndkf.png)

  - **Definir Clases en Java:**

    ````java
    class Person {
        String name = ""; /* Atributo */
        void walk() {} /* Comportamiento / método */
    }
    ````

  - **Definir Clases en Python:**

    ````python
    class Person:
        name = ""; # Atributo
        def walk(): # Comportamiento / método
    ````

  - **Definir Clases en JavaScript:**

    ````javascript
    function Person() {} /* "Clase" */
    
    Person.prototype.walk = function() { 
         /* Comportamiento / método */
    }
    ````

  - **Definir Clases en PHP:**

    ````php
    class Person {
        $name = ""; # Atributo
        function walk() {} # Comportamiento / método
    }
    ````

  

- ### Modelando nuestros objetos Uber

  Este es el diagrama de los diferentes Objetos vistos en clase junto con sus respectivos atributos
  
  
   ![Diagrama UML Objetos Uber](https://i.imgur.com/mfm5qZt.jpg)

- ### ¿Qué es la herencia?

  > "Don´t repeat yourself"

  Es una filosofía que promueve la reducción de la duplicación en programación.

  Toda pieza de información **nunca debería ser duplicada** pues esto incrementa la dificultad en los cambios y la evolución del proyecto. En cambio se debe procurar reutilizar código.

  La **herencia** es una pieza fundamental para la reutilización de código, permite crear nuevas clases a partir de otras. Cuando se detecten elementos duplicados, se hace una *abstracción* para generar una Clase mas general de la que otras clases hereden todas esas características duplicadas.

  > "Cuando se detectan características y comportamientos iguales se debe realizar una abstracción."
  
  En la herencia se establece una relación **padre e hijo**. A la clase padre se le conoce como **súper clase** y a sus clases hijas se les llama **subclases**.
  
  ![Súperclases y subclases](https://i.imgur.com/PKcznhI.png)
  
  
  
  En el siguiente ejemplo hay varios atributos(rojo) y comportamientos(verde) que se están repitiendo en varias clases.
  
  ![Ejemplo de herencia parte 1](https://i.imgur.com/eFCGqxe.png)
  
  A partir de esto se puede crear una súperclase(SeleccionFutbol) que agrupe esos atributos y comportamientos que se repiten y hacer que las clases Futbolista, Entrenador y Masajista los hereden.
  
  ![Ejemplo de herencia parte 2](https://i.imgur.com/M62n8Sj.png)
  
  De esta forma todos los atributos y métodos de la clase padre serán heredados a las clases hijas, lo que ahorra el tener que escribir en código cada uno de esos atributos y comportamientos para cada Clase.
  
  Otra raz+on por la que se puede aplicar herencia es por lógica de negocio, es decir clases que si bien no comparten muchos elementos, debido a la forma en la que funcione el software se crea un Clase padre que herede a un grupo de Clases hijas que están relacionadas entre si.
  
  
  
- ### Aplicando Herencia a nuestro proyecto Uber

  ![Diagrama UML Uber](https://i.imgur.com/gRKUnZL.jpg)

## 📚 Módulo 4. Clases, Objetos y Método Constructor

- ### Definiendo clases en Java y Python

  *Main.java, main.py, index.js* → Es el punto de entrada del programa, aquí iniciará la ejecución del mismo, se importarán otras clases/módulos etc. Si el programa fuera una una especie de árbol este archivo sería como la punta de la raíz desde la cuál empezará a ejecutarse todo.

- ### Definiendo Clases en JavaScript

  Hasta el estándar EcmaScript 6 no existía el concepto de clases, por lo que estas se creaban a partir de **prototipos** que son una forma de representar *clases* a partir de la declaración de una función.

  ````javascript
  function Account() { /* Account → nombre "Clase" */
      this.id; /* Atributo */
      this.name;
      this.document;
      this.email;
      this.password;
  }
  ````

- ### Objetos, método constructor y su sintaxis en código

  Los **Objetos** son *instancias* de la clase. Son el resultado de lo que se "moldeo" en la clase.

  - **Declarar Objetos en Java**

    ````java
    Person person = new Person();
    ````

  - **Declarar Objetos en Python**

    ````python
    person = Person()
    ````

  - **Declarar Objetos en JavaScript**

    ````javascript
    var person = new Person();
    ````

  - **Declarar Objetos en PHP**

    ````php
    $person = new Person();
    ````

    **Método Constructor:** es un método que le da un estado inicial al objeto. Debe llamarse igual que la clase seguido de paréntesis. Dentro de esos paréntesis se ponen los parámetros mínimos para inicializar el objeto.

    **Crear métodos constructores en diferentes lenguajes:**

    - **Java**

      ````java
      public Person(String name) { /* String name → Parámetro */
          this.name =  name;
      }
      ````

    - **JavaScript**

      ````javascript
      function Person (name) { /* name → Parámetro */
          this.name = name
      }
      ````

    - **Python**

      ````python
      def __init__(self, name): # name → Parámetro
          self.name = name
      ````

    - **PHP**

      ````php
      public function _construct($name) { # $name → Parámetro
          $this -> name = name;
      }
      ````

    **Llamar a un Objeto en diferentes lenguajes**

    - **Java**

      ````java
      Person person = new Person("Andrés");
      ````

    - **JavaScript**

      ````javascript
      var person = new Person("Andrés");
      ````

    - **Python**

      ````python
      person = Person("Andrés")
      ````

    - **PHP**

      ````php
      $person = new Person("Andrés);
      ````

- ### Objetos. Dando vida a nuestras clases en Java y Python

  **Java**, entre otros lenguajes, provee un método constructor **por defecto** para los objetos que se creen. 

  ````java
  Car car = new Car();
  ````

  Una vez se ha instanciado el objeto se puede acceder a sus atributos usando notación de punto.

  ````java
  car.license = "AMQ258";
  ````

  También pueden crearse métodos dentro de la clase y acceder a ellos usando notación de punto.

  ````java
  public class Car {
  	/* Atributos */
          
  	void printDataCar() { /* Método */
          
          System.out.println("Car License: " + license);
          System.out.println("Car Driver: " + driver);
          System.out.println("Car Passengers: " + passenger);
  
      }
  }
  ````

  Para llamar al método *printDataCar()* con la sintaxis de notación de punto

  ````java
  car.printDataCar();
  ````

  En el caso de **Python**, primero hay que importar el módulo con la Clase

  ````python
  from car import Car # car → nombre de archivo sin la extención. Car → Nombre de la clase
  ````

  Luego se instancia el objeto, y una vez hecho eso ya se puede acceder a los atributos del objeto usando la notación de punto.

  ````python
  car = car()
  car.licese = "AMS286"
  car.driver = "Felipe López"
  car.passengers = 4
  
  # Para imprimir los atributos del objeto
  print(vars(car))
  ````


- ### Declarando un Método Constructor en Java y JavaScript

  **Método constructor en Java:**

  ````java
  public Car(String license, Account driver) { /* String license, Account driver → Parámetros obligatorios para crear el objeto. */
  	this.license = license; /* this.license → Hace resferencia a la variable de la clase. license → Hace referencia a la variable del método */ 
  }
  ````

  Los parámetros del método constructor pueden tener cualquier nombre pero es una buena práctica nombrarlos igual que los atributos de la clase.

  Los parámetros que se le pasan al método son variables locales, para que el valor que se les pase se aplique a los atributos de la Clase hay que llamar al atributo con *this*. 

  Para instanciar un Objeto, en Java la sintaxis sería la siguiente:

  ````java
  Car car = new Car("AMQ258", new Account("Andrés López", "AND123"));
  ````

  Se pone el tipo de la Clase seguido del nombre de la instancia, y luego con *new* se crea dicha instancia y se pasan los parámetros necesarios para crear el objeto deseado.

  

  **Método Constructor en JavaScript**

  ````javascript
  function Car(license, driver) { /* license, driver → Parámetros para crear el objeto */
  
      this.id;
      this.license = license;
      this.driver = driver;
      this.passenger;
      
  }
  ````

  En el caso de JavaScript la función que define la Clase también sirve como método constructor, por lo que sólo hay que pasarle a dicha función los parámetros necesarios para crear el objeto.

  El funcionamiento de *this* en JavaScript es igual qu een Java, pues este también hace referencia a la Clase para así poder acceder a sus atributos usando l anotación de punto.

  Lós métodos en JavaScript se crean fuera de la Clase y usando *Prototipos*.

  ````javascript
  Car.prototype.printDataCar = function () { /* Método de la Clase Car */
      
      console.log(this.driver)
      console.log(this.driver.name)
      console.log(this.driver.document)
       
  }
  ````

  Para instanciar un Objeto, en JavaScript la sintaxis sería la siguiente:

  ````javascript
  var car = new Car("AW572", new Account("Andrés López", "ANDL580"))
  ````

  Se una variable donde se va crear el Objeto, y luego con *new* se crea el objeto y se pasan los parámetros necesarios para su creación.