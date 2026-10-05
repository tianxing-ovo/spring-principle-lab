# spring-principle-lab

In-Depth Laboratory Project for Spring Core Underlying Principles

---

## Core Concepts

| Core Concept |      Full English Name      | Full Chinese Name |     Core Philosophy      |        Underlying Mechanism        |                                Typical Scenarios                                |
|:------------:|:---------------------------:|:-----------------:|:------------------------:|:----------------------------------:|:-------------------------------------------------------------------------------:|
|   **AOP**    | Aspect-Oriented Programming |   面向切面编程    | Non-invasive Enhancement |           Dynamic Proxy            | `Transaction` `Logging` `Security` `Monitoring` `Caching` `Idempotency` `Retry` |
|   **IoC**    |    Inversion of Control     |     控制反转      |  Dependency Decoupling   |       Factory and Reflection       |     `Component Management` `Lifecycle` `Singleton Pool` `Container Refresh`     |
|    **DI**    |    Dependency Injection     |     依赖注入      |    On-Demand Assembly    |   Reflection and Post-Processor    |       `Constructor Injection` `Setter Injection` `@Autowired` `@Resource`       |
|  **Event**   |  Event-Driven Architecture  |   事件驱动架构    |     Observer Pattern     |    Publish-Subscribe Mechanism     |  `State Transition` `Async Notification` `Domain Event` `Component Decoupling`  |
|  **Async**   |   Asynchronous Processing   |   异步任务机制    |  Thread Pool Decoupling  | Proxy Interception and Thread Pool |             `Data Export` `Async Log Flushing` `Heavy Computation`              |

---

## Core Experiments

- **Underlying Container**: Demonstrating BeanDefinition registration with post-processor execution order and singleton pre-instantiation mechanism based on DefaultListableBeanFactory
- **Context Implementations**: Comparing container loading mechanisms across ClassPathXmlApplicationContext and FileSystemXmlApplicationContext as well as AnnotationConfigApplicationContext
- **Extension Features**: Demonstrating internationalization resolution and classpath resource retrieval along with environment configuration reading and event publishing via ApplicationContext
- **Aspect Proxying**: Demonstrating AspectJ aspect interception with Spring Boot 3 default CGLIB proxy mechanism and AopContext proxy exposure to resolve self-invocation failure
- **Event-Driven**: Demonstrating declarative event publishing and listener decoupling mechanism based on CustomEvent and CustomEventListener
- **Async Mechanism**: Demonstrating multithreaded asynchronous method scheduling and task decoupling based on EnableAsync and Async annotations

---

## Tech Stack Specifications

| Core Component  | Version |       Specification Description        |
|:---------------:|:-------:|:--------------------------------------:|
|    **Java**     |   17    | Standard development language version  |
| **Spring Boot** |  3.3.5  |       Core foundation framework        |
|    **JUnit**    |    5    |         Unit testing framework         |
|   **Lombok**    | 1.18.34 | Logging and boilerplate reduction tool |

---

## License

This project is licensed under the [MIT](LICENSE) License
