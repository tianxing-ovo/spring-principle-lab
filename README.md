# spring-principle-lab

Spring 核心底层原理深度实验工程

---

## 核心概念

| 核心概念 | 英文全称 | 中文全称 | 核心理念 | 底层原理 | 典型场景 |
| :---: | :---: | :---: | :---: | :---: | :---: |
| **AOP** | Aspect-Oriented Programming | 面向切面编程 | 无侵入增强 | 动态代理 | `事务` `日志` `权限` `监控` `缓存` `防重` `重试` |
| **IoC** | Inversion of Control | 控制反转 | 依赖解耦 | 工厂与反射 | `组件管理` `生命周期` `单例池` `容器刷新` |
| **DI** | Dependency Injection | 依赖注入 | 按需装配 | 反射与后处理器 | `构造器注入` `Setter注入` `@Autowired` `@Resource` |
| **Event** | Event-Driven Architecture | 事件驱动架构 | 观察者模式 | 发布订阅机制 | `状态流转` `异步通知` `领域事件` `组件解耦` |
| **Async** | Asynchronous Processing | 异步任务机制 | 线程池解耦 | 代理拦截与线程池 | `数据导出` `日志异步落盘` `耗时计算` |

---

## 核心实验清单

- **底层容器**：基于 DefaultListableBeanFactory 演示 BeanDefinition 注册与后处理器执行顺序及单例预实例化机制
- **上下文实现**：对比 ClassPathXmlApplicationContext 与 FileSystemXmlApplicationContext 及 AnnotationConfigApplicationContext 等不同容器加载机制
- **扩展特性**：通过 ApplicationContext 演示国际化解析与类路径资源获取及环境配置读取和事件发布四大核心扩展能力
- **切面代理**：演示 AspectJ 切面拦截与 Spring Boot 3 默认 CGLIB 代理机制及 AopContext 暴露代理解决自调用失效原理
- **事件驱动**：基于 CustomEvent 与 CustomEventListener 演示声明式事件发布与监听解耦机制
- **异步机制**：基于 EnableAsync 与 Async 注解演示多线程异步方法调度与耗时任务解耦

---

## 技术栈规范

|       核心组件       | 技术版本 |      规范说明      |
| :-------------------: | :------: | :----------------: |
|    **Java**    |    17    |  标准开发语言版本  |
| **Spring Boot** |  3.3.5  |    核心基础框架    |
|    **JUnit**    |    5    |    单元测试框架    |
|   **Lombok**   | 1.18.34 | 日志与简化代码工具 |

---

## 开源协议

本项目基于 [MIT](LICENSE) 开源协议
