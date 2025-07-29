DataTech/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.DataTech
│   │   │       ├── Base/             # Driver initialization and setup
│   │   │       ├── Config/           # Configuration reader
│   │   │       ├── enums/            # Browser type enums
│   │   │       ├── factory/          # DriverFactory for ThreadLocal WebDriver
│   │   │       ├── Pages/            # Page classes using POM
│   │   │       └── utils/            # Utility classes
│   │   └── resources/
│   │       └── prod.Properties       # Environment configuration
│
│   ├── test/
│   │   ├── java/
│   │   │   └── com.DataTech
│   │   │       ├── dataProvider/     # Data providers for parameterized tests
│   │   │       └── Tests/            # Test classes with TestNG
│   │   └── resources/
│   │       ├── Task1.xml             # TestNG suite XML for specific tasks
│   │       └── Task2.xml             # Another suite file
│
├── pom.xml                           # Maven configuration
├── test-output/                      # TestNG results (ignored in git)
└── .gitignore                        # File exclusions
HOW TO EXECUTE:
------------------

Pre-requisites:
- JDK 17 installed
- Maven installed
- TestNG plugin in IDE (Eclipse or IntelliJ)
- Git (if cloning)

Execution via Command Line (Maven):
Run the suite file using:

    mvn clean test -DsuiteXmlFile=src/test/resources/Task1.xml

Execution via Eclipse/IDEA:
- Right click on  'Task1.xml' or 'Task2.xml'
- Choose Run As > TestNG Suite

NOTE:
--------
- Both tasks are implemented and mapped inside `Task1.xml` and `Task2.xml` TestNG suite files.
- Just run either of them directly to execute the respective test flows.

REPORT:
----------
After execution, view the report at:
    /test-output/index.html

Thank you.

