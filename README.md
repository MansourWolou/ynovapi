# ynovapi
# installation
IL faut installer java
# Lancement
mvn spring-boot:run
# CONFIGURATION
le fichier application.properties contient la configuration vers la bdd.
AU lancement de l'application , l'api va chercher à se connecter à la base de données spécifié. 
Si elle n'en trouve pas elle va générer une erreur.

Le fichier pom.xml contient toutes les dépendances du projet.
Par exemple la dépendance permettant la connxion à la base de donnée et la persistance des donné depuis 
les classes java est spring-boot-starter-web. 

# INFO 
Le repertoire test ne contient aucun test pertinent.
Le répertoire target contient le projet sous le format jar (Le projet marche sans donc je ne l'ai pas fait).

```
.
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── demo
│   │   │               ├── DemoApplication.java: fichier principale du projet
│   │   │               └── student : répertoire d'implémentation de la feature student
│   │   │                   ├── StudentConfig.java
│   │   │                   ├── StudentController.java
│   │   │                   ├── Student.java
│   │   │                   ├── StudentRepository.java
│   │   │                   ├── StudentServiceImpl.java
│   │   │                   └── StudentService.java
│   │   └── resources
│   │       └── application.properties 
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── demo
│                       └── DemoApplicationTests.java
└── target
    ├── classes
    │   ├── application.properties
    │   └── com
    │       └── example
    │           └── demo
    │               ├── DemoApplication.class
    │               └── student
    │                   ├── Student.class
    │                   ├── StudentConfig.class
    │                   ├── StudentController.class
    │                   ├── StudentRepository.class
    │                   ├── StudentService.class
    │                   └── StudentServiceImpl.class
    └── generated-sources
        └── annotations

```