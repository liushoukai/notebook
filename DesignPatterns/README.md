# DESIGN PATTERNS

### 设计模式六设计原则

### 单一职责原则(Single Responsibility Principle，SRP)

- **避免相同的职责分散到不同的类中**
- **避免一个类承担太多职责**

### 里氏替换原则(Liskov Substitution Principle，LSP)

- **子类必须能够被其基类替换**

### 依赖倒置原则(Dependence Inversion Principle，DIP)

- **抽象不能依赖于具体，具体应该要依赖于抽象**

### 接口隔离原则(Interface Segregation Principle，ISP)

- **一个类对另外一个类的依赖性应当是建立在最小的接口上的**
- **客户端程序不应该依赖它不需要的接口方法**
- **应该把胖接口中的方法分组，然后用多个专门接口代替它**

### 迪米特法则(Law Of Demeter，LOD)

- **一个类应该对其所依赖的其他类保持最少的了解**

### 开放-封闭原则(Open-Close Principle，OCP)

- **Open(Open for extension) 允许以新增接口、类的方式对程序进行扩展**
- **Closed(Closed for modification) 禁止修改现有的程序代码**

## Relation

### 聚合关系(大雁与雁群)
```
class WideGooseAggregate {
    private WideGoose[] arrayWideGoose;
}
```

### 组合关系（鸟与翅膀）
```
class Bird {
    private Wing wing;
    public Bird(Wing wing) {
        wing = new Wing();
    }
}
```

### 关联关系（企鹅与气候）
```
class Penguin {
    private Climate climate;
}
```

### 依赖关系（动物与水和氧气）
```
abstract class Animal {
    public Metabolism(Oxygen oxygen, Water water) {}
}
```


## 23 Design Patterns

### Creational

- [Factory Method]()           
- [Abstract Factory]()         
- [Builder]()                  
- [Prototype]()                
- [Singleton]()               

### Structural

- [Adapter]()                 	
- [Bridge]()                 
- [Composite]()              	
- [Decorator]()              	
- [Facade]()                 
- [Flyweight]()              	
- [Proxy]()                  	

### Behavioral

- [Interpreter]()             
- [Template Method]()          
- [Chain of Responsibility]() 
- [Command]()                
- [Iterator]()                
- [Mediator]()                
- [Memento]()                 
- [Observer]()                
- [State]()                  
- [Strategy]()               
- [Visitor]() 

## Recommend Books
- Design Patterns [GOF]
- Design Patterns in Java
