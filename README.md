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

