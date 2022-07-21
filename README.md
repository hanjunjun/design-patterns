# 目录
[toc]


# 设计模式相关介绍
## 1 参考
| 备注               | 地址                                                         |
| ------------------ | ------------------------------------------------------------ |
| 英文版设计模式介绍 | [设计模式](https://sourcemaking.com/design_patterns)         |
| 设计模式教程       | [设计模式](https://www.runoob.com/design-pattern/design-pattern-intro.html) |
| 设计模式编程网教程 | [设计模式](http://c.biancheng.net/view/1317.html)            |
| 秒懂设计模式       | [设计模式](https://weread.qq.com/web/reader/9b13257072562b5c9b1c8d6ke4d32d5015e4da3b7fbb1fa) |
| 设计模式总结       | [设计模式](https://github.com/mingyuHub/design-patterns) |

## 2 设计模式总结

<html>

<head>
<style type='text/css'>
table p {
margin:0;padding:0;font-size:13px
}
table th{
border: 1.5px solid black;
}
table td{
border: 1.5px solid black;
}
</style>
</head>
<table class='design-table'>
<tr>
<th style='width:30%'>模式&描述</th>
<th style='width:20%'>设计模式名称</th>
<th style='width:35%'>优点&缺点&结构与实现</th>
<th style='width:15%'>应用场景</th>
</tr>
<tr>
<td rowspan='5'>
<p style='font-weight:800'>创建型模式</p>
这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活
</td>
<td><a href='#21-工厂模式factoryˈfæktri-pattern'>工厂模式（Factory Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.满足开闭原则，不修改代码就可以支持新产品</p>
<p>2.只需要知道产品名称不需要知道产品创建过程即可得到产品</p>
<p>3.典型的解耦，高层模块只需知道产品的抽象类，无需关心产品具体实现，并且满足迪米特法则，依赖倒置，里氏替换原则</p>
<p><strong>缺点：</strong></p>
<p>1.每次增加产品都要加一个实现类，实现类过多，增加了复杂度</p>
<p>2.增加了系统抽象性和理解难度</p>
<p>3.抽象产品只能生产一种种类的产品，此弊端可以通过【抽象工厂】解决，抽象工厂是超级工厂里面很多子工厂，可以生产很多不同种类的产品</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象工厂（Abstract Factory）</strong>：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品</p>
<p><strong>2.具体工厂（ConcreteFactory）</strong>：主要是实现抽象工厂中的抽象方法，完成具体产品的创建</p>
<p><strong>3.抽象产品（Product）</strong>：定义了产品的规范，描述了产品的主要特性和功能</p>
<p><strong>4.具体产品（ConcreteProduct）</strong>：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应</p>
</td>
<td><p>日志记录器、数据库访问、打印机驱动</p></td>
</tr>
<tr>
<td><a href='#2.2 抽象工厂模式(Abstract([æbˈstrækt]) Factory([ˈfæktri]) Pattern)'>抽象工厂模式（Abstract Factory Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.当多个产品需要一起工作时，组成一个产品族，使用抽象工厂会方便现存产品的扩展和解耦（单一产品使用工厂模式即可）</p>
<p><strong>缺点：</strong></p>
<p>1.如果想给这个产品族加一个新的产品，需要改动代码，要在工厂生产者里加生产工厂的代码，还需要在代码里加实现类</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象工厂（Abstract Factory）</strong>：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品</p>
<p><strong>2.具体工厂（Concrete Factory）</strong>：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建</p>
<p><strong>3.抽象产品（Product）</strong>：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品</p>
<p><strong>4.具体产品（ConcreteProduct）</strong>：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系</p>
</td>
<td><p>QQ皮肤、电脑整机生产</p></td>
</tr>
<tr>
<td><a href='#2.3 单例模式(Singleton([ˈsɪŋɡltən]) Pattern)'>单例模式（Singleton Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.单例模式可以保证内存里只有一个实例，减少了内存开销</p>
<p>2.可以避免资源的多重占用</p>
<p>3.单例模式设置全局的访问点，可以方便的进行公共共享资源的访问</p>
<p><strong>缺点：</strong></p>
<p>1.单例模式没有接口，扩展困难，如果要扩展，要修改原来的代码，没有其他办法，违背开闭原则</p>
<p>2.单例模式的功能代码通常写在一个类中，如果设计不合理，很容易违反单一职责</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.单例类</strong>：包含一个实例且能自行创建这个实例的类</p>
<p><strong>2.访问类</strong>：使用单例的类</p>
</td>
<td><p>windows任务管理器、线程池、连接池</p></td>
</tr>
<tr>
<td><a href='#2.4 建造者模式(Builder( [ˈbɪldər]) Pattern)'>建造者模式（Builder Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.建造者独立，易扩展，建造者和套餐项目是分开的，套餐项目方便扩展，继承item自己实现一个新的项目即可，比如说肯德基想给某个套餐增加一个蛋挞，直接新建蛋挞实现item，就可以丢给建造者管理</p>
<p>2.方便控制细节，比如每个套餐项目的包装方式就可以自己控制，价格也是每个项目自己管理</p>
<p>3.购买套餐的人不需要关心套餐的生产装配过程，比如买肯德基的套餐，就不用管他怎么生产装配的，我直接去取套餐来吃就行了，有点像工厂模式，区别就是建造者模式更加关注装配的顺序，可以控制里面每一个项目生成的的细节</p>
<p><strong>缺点：</strong></p>
<p>1.产品必须有共同点，范围有限制，比如肯德基套餐，每个套餐项目都有一个共同特征，比如饮料抽象类，汉堡抽象类，可乐和雪碧，百事可乐都属于饮料的子类，如果想增加一个套餐项目纪念玩具，就得再新增一个抽象类给纪念品继承，不能使用其他套餐的抽象类</p>
<p>2.如果内部变化复杂，会有很多建造者类，建造者内部只是满足几个套餐，某一个建造者内部专门生成素食套餐和汉堡套餐，其他建造者生成全家桶套餐，还有的生成点心套餐，就需要很多建造者</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.产品角色（Product）</strong>：它是包含多个组成部件的复杂对象，由具体建造者来创建其各个零部件</p>
<p><strong>2.抽象建造者（Builder）</strong>：它是一个包含创建产品各个子部件的抽象方法的接口，通常还包含一个返回复杂产品的方法 getResult()</p>
<p><strong>3.具体建造者(Concrete Builder）</strong>：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法</p>
<p><strong>4.指挥者（Director）</strong>：它调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息</p>
</td>
<td><p>电信套餐</p></td>
</tr>
<tr>
<td><a href='#2.5 原型模式(Prototype([ˈproʊtətaɪp] ) Pattern)'>原型模式（Prototype Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.java自带的原型模式基于内存二进制流的复制，在性能上比new一个要更好</p>
<p>2.可以使用深拷贝的方式保存对象的状态，将原来的对象复制一份保存起来，以后如果需要恢复到历史某一状态就比较容易</p>
<p>3.</p>
<p><strong>缺点：</strong></p>
<p>1.需要为每个类都要写一个clone方法</p>
<p>2.clone方法位于类的内部，当对已有的类进行改造的时候，需要修改代码，违反开闭原则</p>
<p>3.当实现深拷贝的时候，当对象之间存在多重嵌套时，为了实现复制，需要每一层的对象都必须支持克隆，实现起来会很麻烦，需要写很多代码</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象原型类</strong>：规定了具体原型对象必须实现的接口</p>
<p><strong>2.具体原型类</strong>：实现抽象原型类的 clone() 方法，它是可被复制的对象</p>
<p><strong>3.访问类</strong>：使用具体原型类中的 clone() 方法来复制新的对象</p>
</td>
<td><p>状态还原、频繁生成实例</p></td>
</tr>
<tr>
<td rowspan='8'>
<p style='font-weight:800'>结构型模式</p>
这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式
</td>
<td><a href='#3.1 适配器模式(Adapter([əˈdæptər]) Pattern)'>适配器模式（Adapter Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.可以让任何两个没有关联的类一起运行</p>
<p>2.提高了类的复用</p>
<p>3.灵活性好</p>
<p><strong>缺点：</strong></p>
<p>1.适配器太多会让系统非常凌乱，建议重构</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.目标（Target）接口</strong>：当前系统业务所期待的接口，它可以是抽象类或接口</p>
<p><strong>2.适配者（Adaptee）类</strong>：它是被访问和适配的现存组件库中的组件接口</p>
<p><strong>3.适配器（Adapter）类</strong>：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者</p>
</td>
<td><p>USB定型的接口需要适配串口、PS2口、音频接口（当接口固定不可修改可以使用适配器设计一个转接口去适配）</p></td>
</tr>
<tr>
<td><a href='#3.2 桥接模式(Bridge( [brɪdʒ]) Pattern)'>桥接模式（Bridge Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.抽象和实现的分离降低了耦合度</p>
<p>2.优秀的扩展能力，比如包的颜色可以有不同的颜色，抽象类包，可以有不同的形态，比如钱包，拎包，挎包，扩展很方便</p>
<p>3.实现细节对客户透明，用户不用关心具体的实现细节</p>
<p><strong>缺点：</strong></p>
<p>1.由于抽象和实现的关系放在了抽象层，要求开发者针对抽象化进行设计和编程，需要能正确识别出系统中两个独立变化的维度，这增加了对系统的理解和设计难度</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象化（Abstraction）角色</strong>：定义抽象类，并包含一个对实现化对象的引用</p>
<p><strong>2.扩展抽象化（Refined Abstraction）角色</strong>：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法</p>
<p><strong>3.实现化（Implementor）角色</strong>：定义实现化角色的接口，供扩展抽象化角色调用</p>
<p><strong>4.具体实现化（Concrete Implementor）角色</strong>：给出实现化角色接口的具体实现</p>
</td>
<td>
<p>1.如果想提升两个实现的灵活性，可以使用组合代替继承</p>
<p>2.对于那些不想使用继承或因为多层次继承导致系统类的个数急剧增加的系统，使用组合关系来代替继承关系</p>
<p>3.一个类存在2个独立变化的维度，并且这两个维度都需要进行扩展</p>
</td>
</tr>
<tr>
<td><a href='#3.3 过滤器模式(Filter/Criteria( [kraɪ'tɪriə]) Pattern)'>过滤器模式（Filter、Criteria Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.可以把任意单个规则组合成一个大的规则，然后直接对整个规则进行计算，可以无限嵌套不用改代码很方便</p>
<p><strong>缺点：</strong></p>
<p>1.很多规则嵌套在一起之后会比较复杂，不容易理解</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.数据对象</strong>：定义一个数据集合用来被筛选的</p>
<p><strong>2.单一条件过滤器</strong>：定义一个姓名或性别等的单一条件过滤器</p>
<p><strong>3.和运算过滤器</strong>：定义一个过滤器接受2个过滤器并且做和运算</p>
<p><strong>4.或运算过滤器</strong>：定义一个过滤器接受2个过滤器并且做或运算</p>
</td>
<td><p>主要是针对一些数据进行一些动态的规则进行条件过滤，规则是可变的情况下，还需要做一套根据配置来生成规则表达式的方式</p></td>
</tr>
<tr>
<td><a href='#3.4 组合模式(Composite( [kəmˈpɑːzət] ) Pattern)'>组合模式（Composite Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.高层模块调用简单</p>
<p>2.层级节点可以无限自由添加</p>
<p><strong>缺点：</strong></p>
<p>1.树枝和树叶都直接使用的实现类，这在面向接口编程中是不恰当的，违反了依赖倒置的原则（依赖倒置核心思想，面向接口编程，不要面向实现编程，高层模块不能依赖低层模块，应该依赖其抽象，实现应该依赖抽象）</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象构件（Component）角色</strong>：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。在透明式的组合模式中抽象构件还声明访问和管理子类的接口；在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。（总的抽象类或接口，定义一些通用的方法，比如新增、删除）</p>
<p><strong>2.树叶构件（Leaf）角色</strong>：是组合中的叶节点对象，它没有子节点，用于继承或实现抽象构件</p>
<p><strong>3.树枝构件（Composite）角色 / 中间构件</strong>：是组合中的分支节点对象，它有子节点，用于继承和实现抽象构件。它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法</p>
</td>
<td><p>树形菜单栏、文件夹的管理等</p></td>
</tr>
<tr>
<td><a href='#3.5 装饰器模式(Decorator( [ˈdekəreɪtər]) Pattern)'>装饰器模式（Decorator Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.装饰器比类继承灵活，在不改变原有对象的情况下，动态的给一个对象加新的方法或让原有的方法支持额外的功能，即插即用</p>
<p>2.通过组合不同的装饰类，可以实现不同的效果</p>
<p>3.完全遵循开闭原则，不修改被装饰类的前提下，给他增加额外的功能</p>
<p>4.装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰类可以动态得扩展一个实现类的功能</p>
<p><strong>缺点：</strong></p>
<p>1.装饰器可以多层嵌套使用，会比较复杂，不容易理解</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象构件（Component）角色</strong>：定义一个抽象接口以规范准备接收附加责任的对象</p>
<p><strong>2.具体构件（ConcreteComponent）角色</strong>：实现抽象构件，通过装饰角色为其添加一些职责</p>
<p><strong>3.抽象装饰（Decorator）角色</strong>：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能</p>
<p><strong>4.具体装饰（ConcreteDecorator）角色</strong>：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任</p>
</td>
<td><p>扩展一个已存在的类、动态增加额外功能，动态撤销</p></td>
</tr>
<tr>
<td><a href='#3.6 外观模式(Facade([fəˈsɑːd]) Pattern)'>外观模式（Facade Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.减少系统相互依赖，使得子系统的变化不会影响到其他客户类</p>
<p>2.对客户屏蔽了子系统组件，减少了客户处理的对象数目，并使得子系统使用起来更加容易，都由客户类包装好了，调用简单</p>
<p>3.提高了安全性，低水平开发者也能简单使用</p>
<p><strong>缺点：</strong></p>
<p>1.增加新的子系统可能需要修改外观类或者客户端代码，违背了“开闭原则”</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.外观（Facade）角色</strong>：为多个子系统对外提供一个共同的接口</p>
<p><strong>2.子系统（Sub System）角色</strong>：实现系统的部分功能，客户可以通过外观角色访问它</p>
<p><strong>3.客户（Client）角色</strong>：通过一个外观角色访问各个子系统的功能</p>
</td>
<td><p>为复杂的模块或者子系统提供外界访问的模块、预防低水平人员使用子系统功能不当导致的风险</p></td>
</tr>
<tr>
<td><a href='#3.7 享元模式(Flyweight([ˈflaɪweɪt]) Pattern)'>享元模式（Flyweight Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.大大减少对象的创建，减少进程占用内存，使程序运行效率提升</p>
<p><strong>缺点：</strong></p>
<p>1.对象共享之后，需要将一些不能共享的状态外部化，这将增加程序复杂性</p>
<p>2.读取享元模式的外部状态，会使得程序运行时间变长</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象享元角色（Flyweight）</strong>：是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入</p>
<p><strong>2.具体享元（Concrete Flyweight）角色</strong>：实现抽象享元角色中所规定的接口</p>
<p><strong>3.非享元（Unsharable Flyweight)角色</strong>：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中</p>
<p><strong>4.享元工厂（Flyweight Factory）角色</strong>：负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象</p>
</td>
<td><p>系统有大量的相似对象、需要缓冲池的场景</p></td>
</tr>
<tr>
<td><a href='#3.8 代理模式(Proxy([ˈprɑːksi] ) Pattern)'>代理模式（Proxy Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.代理模式在客户端和目标对象之间加了一个中介，起到了保护目标对象的作用</p>
<p>2.代理对象可以扩展目标对象的功能，比如说spring的AOP切面就可以给目标对象加一些执行日志、调用的权限控制等</p>
<p>3.代理模式能将客户端和目标对象分离，起到了降低系统耦合，增加程序的可扩展性</p>
<p><strong>缺点：</strong></p>
<p>1.在客户端和目标对象之间增加一个代理对象，会造成请求处理速度变慢</p>
<p>2.增加了系统复杂度</p>
<p>3.实现代理模式需要做额外的工作，有些代理模式的实现会比较复杂</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象主题（Subject）类</strong>：通过接口或抽象类声明真实主题和代理对象实现的业务方法</p>
<p><strong>2.真实主题（Real Subject）类</strong>：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象</p>
<p><strong>3.代理（Proxy）类</strong>：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能</p>
</td>
<td><p>防火墙、AOP切面、网关、nginx</p></td>
</tr>
<td rowspan='12'>
<p style='font-weight:800'>行为型模式</p>
这些设计模式特别关注对象之间的通信
</td>
<td><a href='#4.1 责任链模式(Chain( [tʃeɪn] ) of Responsibility([rɪˌspɑːnsəˈbɪləti] ) Pattern)'>责任链模式（Chain of Responsibility Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.降低耦合度，他将请求的发送和解耦者解耦</p>
<p>2.简化了对象，使得对象不需要知道链的结构</p>
<p>3.增强责任链的灵活性，通过改变链内的成员或者调动他们的次序，允许动态的新增或者删除责任</p>
<p>4.增加新的处理类很方便</p>
<p><strong>缺点：</strong></p>
<p>1.系统性能将受到一定影响，而且在代码调试时不太方便，因为嵌套的过深，不方便看当前调试到哪个层了</p>
<p>2.不容易观察运行时的特征，妨碍排查错误</p>
<p>3.不能保证请求一定被接收</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象处理者（Handler）角色</strong>：定义一个处理请求的接口，包含抽象处理方法和一个后继连接</p>
<p><strong>2.具体处理者（Concrete Handler）角色</strong>：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者</p>
<p><strong>3.客户类（Client）角色</strong>：创建处理链，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程</p>
</td>
<td><p>springboot拦截器</p></td>
</tr>
<tr>
<td><a href='#4.2 命令模式(Command([kəˈmænd]) Pattern)'>命令模式（Command Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.降低系统耦合度，发送命令和接收命令解耦</p>
<p>2.扩展性好，新的命令很容易添加到系统中，命令集合中加一个方法，在写一个命令具体类调用这个方法，命令具体类发送给命令接收者即可</p>
<p>3.可以实现宏命令，命令模式和组合模式结合，将多个命令装配成一个组合命令，即宏命令</p>
<p>4.方便实现 “撤销”和“重做”。命令模式可以和 备忘录模式结合，实现命令的撤销与恢复</p>
<p>5.可以在现有命令的基础上，增加额外的功能，比如日志记录，结合装饰器模式会更加灵活</p>
<p><strong>缺点：</strong></p>
<p>1.会产生很多命令类，因为每一个具体的操作命令都需要设计一个具体命令类，会增加系统的复杂性</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象命令类（Command）角色</strong>：声明执行命令的接口，拥有执行命令的抽象方法 execute()</p>
<p><strong>2.具体命令类（Concrete Command）角色</strong>：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作</p>
<p><strong>3.实现者/接收者（Receiver）角色</strong>：执行命令功能的相关操作，是具体命令对象业务的真正实现者</p>
<p><strong>4.调用者/请求者（Invoker）角色</strong>：是请求的发送者，它通常拥有很多的命令对象，并通过访问命令对象来执行相关请求，它不直接访问接收者</p>
</td>
<td><p>GUI桌面程序上面很多按钮，每个按钮都是一条命令</p></td>
</tr>
<tr>
<td><a href='#4.3 解释器模式(Interpreter([ɪnˈtɜrprətər]) Pattern)'>解释器模式（Interpreter Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.扩展性好，由于在解释器模式中使用表达式类来表示语言的文法规则，因此可以通过继承等机制改变或者扩展文法</p>
<p>2.容易实现，在语法树中的每个表达式节点类都是相似的，所以实现其文法较为容易</p>
<p>3.</p>
<p><strong>缺点：</strong></p>
<p>1.执行效率低，解释器中通常使用循环和递归调用，当解释的句子较为复杂，速度就会很慢，且代码调试起来比较麻烦</p>
<p>2.会引起类膨胀。解释器模式中每个规则都要定义一个类，当包含的文法规则很多时，类的个数急剧增加，导致系统难以维护和管理</p>
<p>3.可应用的场景少，在软件开发中，需要定义语言文法的应用实例非常少，所以这种设计模式很少被使用到</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象表达式（Abstract Expression）角色</strong>：定义解释器的接口，约定解释器的解释操作，主要包含解释方法 interpret()</p>
<p><strong>2.终结符表达式（Terminal Expression）角色</strong>：是抽象表达式的子类，用来实现文法中与终结符相关的操作，文法中的每一个终结符都有一个具体终结表达式与之相对应</p>
<p><strong>3.非终结符表达式（Nonterminal Expression）角色</strong>：也是抽象表达式的子类，用来实现文法中与非终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式</p>
<p><strong>4.环境（Context）角色</strong>：通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值</p>
<p><strong>5.客户端（Client）</strong>：主要任务是将需要分析的句子或表达式转换成使用解释器对象描述的抽象语法树，然后调用解释器的解释方法，当然也可以通过环境角色间接访问解释器的解释方法</p>
</td>
<td><p>一个简单语法需要解释的场景</p></td>
</tr>
<tr>
<td><a href='#4.4 迭代器模式(Iterator([ætəri:tə]) Pattern)'>迭代器模式（Iterator Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.访问一个聚合对象的内容而无需暴露它的内部表示</p>
<p>2.遍历任务交给迭代器完成，简化了聚合类</p>
<p>3.它支持以不同方式遍历一个聚合，也可以实现Iterator接口自定义一个迭代器以支持新的遍历方式</p>
<p>4.增加新的聚合类和迭代器都很方便，无需修改原有代码</p>
<p>5.封装性良好，为遍历不同的聚合结构提供一个统一的接口（新建一个集合类型，迭代器可以自定义一个）</p>
<p><strong>缺点：</strong></p>
<p>1.增加了类的个数，这在一定程度上增加了系统的复杂性</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象聚合（Aggregate）角色</strong>：定义存储、添加、删除聚合对象以及创建迭代器对象的接口</p>
<p><strong>2.具体聚合（ConcreteAggregate）角色</strong>：实现抽象聚合类，返回一个具体迭代器的实例</p>
<p><strong>3.抽象迭代器（Iterator）角色</strong>：定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法</p>
<p><strong>4.具体迭代器（Concretelterator）角色</strong>：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置</p>
</td>
<td><p>访问一个聚合对象的内容而无需暴露它的内部细节、需要为聚合对象提供多种遍历方式、为遍历不同的聚合机构提供一个统一的接口</p></td>
</tr>
<tr>
<td><a href='#4.5 中介者模式(Mediator([ˈmiːdieɪtər]) Pattern)'>中介者模式（Mediator Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.类之间各司其职，符合迪米特法则</p>
<p>2.降低了对象之间的耦合性，使得对象易于独立地被复用</p>
<p>3.将对象间的一对多关联（卖家>多个买家）转变为一对一的关联（卖家>中介 或 买家>中介），提高系统的灵活性，使得系统易于维护和扩展</p>
<p><strong>缺点：</strong></p>
<p>1.中介者模式将原本多个对象直接相互依赖的关系转变成了中介者和多个同事类的依赖关系。当同事类越多时，中介者就会越臃肿，变得复杂且难以维护</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象中介者（Mediator）角色</strong>：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法</p>
<p><strong>2.具体中介者（Concrete Mediator）角色</strong>：实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色</p>
<p><strong>3.抽象同事类（Colleague）角色</strong>：定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能</p>
<p><strong>4.具体同事类（Concrete Colleague）角色</strong>：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互</p>
</td>
<td><p>房产中介、招聘平台等交易逻辑就可以参考中介者模式</p></td>
</tr>
<tr>
<td><a href='#4.6 备忘录模式(Memento( [məˈmentoʊ] ) Pattern)'>备忘录模式（Memento Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.提供了一种可以恢复状态的机制，当用户需要时可以方便得将数据恢复到某个历史的时刻</p>
<p>2.简化了发起人类，发起人类不用管理和保存其内部状态的各个备份，所有状态都保存在备忘录里</p>
<p>3.实现内部状态的封装，除了创建它的发起人类，其他对象都不能够访问这些备份的状态信息</p>
<p><strong>缺点：</strong></p>
<p>1.内存资源消耗过大，如果要保存的内部信息过多或者特别频繁，将会占用比较大的内存资源</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.发起人（Originator）角色</strong>：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息</p>
<p><strong>2.备忘录（Memento）角色</strong>：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人</p>
<p><strong>3.管理者（Caretaker）角色</strong>：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改</p>
</td>
<td><p>需要保存/恢复数据的场景，提供一个可回滚的操作、浏览器页面的前进后退、虚拟机的快照、记事本的剪切板撤销/重做、游戏存档</p></td>
</tr>
<tr>
<td><a href='#4.7 观察者模式(Observer[əbˈzɜːrvər] Pattern)'>观察者模式（Observer Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.降低了被观察者与观察者之间的耦合关系，两者之间是抽象耦合关系，符合依赖倒置原则</p>
<p>2.被观察类和观察者之间建立了一套触发机制</p>
<p><strong>缺点：</strong></p>
<p>1.目标与观察者之间的依赖关系并没有完全解除，而且有可能出现循环引用</p>
<p>2.当观察者对象很多时，通知的发布会花费很多时间，影响程序执行效率</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象主题（Subject）角色</strong>：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法</p>
<p><strong>2.具体主题（Concrete Subject）角色</strong>：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象</p>
<p><strong>3.抽象观察者（Observer）角色</strong>：它是一个抽象类或接口，它包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用</p>
<p><strong>4.具体观察者（Concrete Observer）角色</strong>：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态</p>
</td>
<td><p>对象之间存在一对多关系，一个对象发生改变影响其他对象、实现类似广播机制的功能，不需要知道具体的收听者，只需要分发广播，系统中收听广播的对象会自动响应广播</p></td>
</tr>
<tr>
<td><a href='#4.8 状态模式(State[steɪt] Pattern)'>状态模式（State Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.结构很清晰，每种状态都是单独的类，满足“单一职责原则”</p>
<p>2.减少对象间的相互依赖，将不同的状态引入独立的对象中，使得状态切换变得更加明确</p>
<p>3.状态类职责明确，有利于扩展新的状态，增加一个状态只需要实现state接口，实现里面的状态切换逻辑即可</p>
<p><strong>缺点：</strong></p>
<p>1.使用状态模式必然会增加系统的类和对象的个数</p>
<p>2.状态模式的结构和实现比较复杂，如果使用不当会导致程序结构和代码的混乱</p>
<p>3.状态模式对开闭原则支持不太好，增加一个状态需要改现有的代码</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.环境类（Context）角色</strong>：也称为上下文，它定义了客户端需要的接口，内部维护一个当前状态，并负责具体状态的切换</p>
<p><strong>2.抽象状态（State）角色</strong>：定义一个接口，用以封装环境对象中的特定状态所对应的行为，可以有一个或多个行为</p>
<p><strong>3.具体状态（Concrete State）角色</strong>：实现抽象状态所对应的行为，并且在需要的情况下进行状态切换</p>
</td>
<td><p>迅雷下载器、酒店入住退住状态管理</p></td>
</tr>
<tr>
<td><a href='#4.9 空对象模式(Null Object Pattern)'>空对象模式（Null Object Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.它可以加强系统的稳固性，能有效地减少空指针报错对整个系统的影响，使系统更加稳定</p>
<p>2.能实现对空对象情况的定制化的控制，掌握处理空对象的主动权</p>
<p>3.它并不依靠client来保证系统的稳定运行</p>
<p>4.她通过定义isNil判断对象是否为空，更加优雅易懂</p>
<p><strong>缺点：</strong></p>
<p>1.每一个要返回真实的实体都要建立一个对象的空对象模型，这样会增加类的数量</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.空对象抽象类</strong>：定义抽象方法isNil和getName</p>
<p><strong>2.具体的对象包装类</strong>：空对象和有值的对象</p>
<p><strong>3.对象获取工厂</strong>：传入一个字符串工厂内如果有则返回有值对象，没有则返回空对象</p>
</td>
<td><p>判断某个实例是否不存在，需要通过一个包装器来判断是否不存在</p></td>
</tr>
<tr>
<td><a href='#4.10 策略模式(Strategy[ˈstrætədʒi] Pattern)'>策略模式（Strategy Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.可以避免使用多重条件语句</p>
<p>2.策略模式提供了很多算法，可以把同类算法抽象到父类中复用代码</p>
<p>3.策略模式提供了很多算法，可以自由切换</p>
<p>4.支持开闭原则，新增算法很方便不需要改动现有代码</p>
<p><strong>缺点：</strong></p>
<p>1.客户端必须理解策略算法的区别，以便选择合适的算法</p>
<p>2.策略模式造成很多的策略类，增加了维护难度</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象策略（Strategy）类</strong>：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现</p>
<p><strong>2.具体策略（Concrete Strategy）类</strong>：实现了抽象策略定义的接口，提供具体的算法实现</p>
<p><strong>3.环境（Context）类</strong>：持有一个策略类的引用，最终给客户端调用</p>
</td>
<td><p>一个系统需要动态的在几种算法中选择其中一种</p></td>
</tr>
<tr>
<td><a href='#4.11 模板模式(Template[ˈtemplət] Pattern)'>模板模式（Template Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.它封装了不可变部分，让可变部分支持扩展。它把认为是不变部分的算法封装到父类中实现，而把可变的部分算法由子类继承实现，便于子类继续扩展</p>
<p>2.它在父类中提取了公共的部分代码，便于代码复用</p>
<p>3.部分方法是由子类实现的，因此子类可以通过扩展方式增加响应的功能，符合开闭原则</p>
<p><strong>缺点：</strong></p>
<p>1.对每个不同的实现都需要定义一个子类，这会导致类的个数增加</p>
<p>2.父类中的抽象方法由子类实现，子类执行结果会影响父类的结果，这是一种反向的控制结构，提高了阅读的难度</p>
<p>3.由于继承关系自身的缺点，如果父类添加新的抽象方法，则所有子类都要实现</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象类/抽象模板（Abstract Class）</strong></p>
<p>抽象模板类负责给出一个算法的流程骨架，它由一个模板方法和若干个基本方法组成。</p>
<p>① 模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法</p>
<p>② 基本方法：是整个算法中的一个步骤，包含以下几种类型</p>
<ul>
<li><p>抽象方法：在抽象类中声明，由具体子类实现</p></li>
<li><p>具体方法：在抽象类中已经实现，在具体子类中可以继承或重写它</p></li>
<li><p>钩子方法：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种</p></li>
</ul>
<p><strong>2.具体子类/具体实现（Concrete Class）</strong></p>
<p>具体实现类，实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的一个组成步骤</p>
</td>
<td><p>整个执行流程固定，其中某个流程可能有好几种不同的逻辑，可以使用模板方法</p></td>
</tr>
<tr>
<td><a href='#4.12 访问者模式(Visitor [ˈvɪzɪtər]  Pattern)'>访问者模式（Visitor Pattern）</a></td>
<td>
<p><strong>优点：</strong></p>
<p>1.扩展性好，能够在不修改对象结构中的元素的情况下，为对象结构中的元素添加新的功能</p>
<p>2.复用性好，可以通过访问者来定义整个对象结构通用的功能，从而提高系统的复用程度</p>
<p>3.灵活性好，访问者模式将数据结构与对数据结构的操作解耦，使得操作可以相对自由地演化而不影响系统的数据结构</p>
<p>4.符合单一职责原则，访问者模式相关的行为封装在一起，构成一个访问者，使得每一个访问者的功能都比较单一</p>
<p><strong>缺点：</strong></p>
<p>1.增加新的元素很困难，在访问者模式中，每增加一个新的元素类，都要再每一个具体访问类中增加相应的具体操作，这违背了“开闭原则”</p>
<p>2.破坏封装。访问者模式中具体元素对访问者公布细节，这破坏了对象的封装性</p>
<p>3.违反了依赖倒置原则，访问者模式依赖了具体类，而没有依赖抽象类</p>
<p style='border-top:2px solid #B0C4DE'><strong>结构与实现：</strong></p>
<p><strong>1.抽象访问者（Visitor）角色</strong>：定义一个访问具体元素的接口，为每个具体元素类对应一个访问操作 visit() ，该操作中的参数类型标识了被访问的具体元素</p>
<p><strong>2.具体访问者（ConcreteVisitor）角色</strong>：实现抽象访问者角色中声明的各个访问操作，确定访问者访问一个元素时该做什么</p>
<p><strong>3.抽象元素（Element）角色</strong>：声明一个包含接受操作 accept() 的接口，被接受的访问者对象作为 accept() 方法的参数</p>
<p><strong>4.具体元素（ConcreteElement）角色</strong>：实现抽象元素角色提供的 accept() 操作，其方法体通常都是 visitor.visit(this) ，另外具体元素中可能还包含本身业务逻辑的相关操作</p>
<p><strong>5.对象结构（Object Structure）角色</strong>：是一个包含元素角色的容器，提供让访问者对象遍历容器中的所有元素的方法，通常由 List、Set、Map 等聚合类实现</p>
</td>
<td><p>对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作(传入不同的访问者)，比如说账本查看这种场景，老板访问者和注会访问者关注点不一样，还有一部电影的所有的演员，观众对他们的关注点也不一样，对接结构固定，项目很多，有好几个访问者类似的场景可以使用访问者模式</p></td>
</tr>
<tr>
<td rowspan='8'>
<p style='font-weight:800'>J2EE 模式</p>
这些设计模式特别关注表示层。这些模式是由 Sun Java Center 鉴定的。
</td>
<td><a href='#5.1 MVC模式(MVC Pattern)'>MVC 模式（MVC Pattern）</a></td>
<td>
<p><strong>结构与实现：</strong></p>
<p><strong>1.Model(模型)</strong> - 模型代表一个存取数据的对象或JAVA POJO。它也可以带有逻辑，在数据变化时更新控制器</p>
<p><strong>2.View(视图)</strong> - 视图代表模型包含的数据的可视化</p>
<p><strong>3.Controller (控制器)</strong> - 控制器作用于模型和视图上，它控制数据流向模型对象，并在数据变化时更新视图，它使视图和模型分离</p>
</td>
<td><p>java spring mvc，前端页面是controller获取模型数据，传进view视图中渲染出前端页面内容给浏览器，浏览器进行页面渲染、代码生成器，代码模板视图，数据源，最终生成代码</p></td>
</tr>
<tr>
<td><a href='#5.2 业务代表模式(Business Delegate Pattern[ˈbɪznəs ˈdelɪɡət ˈpætərn])'>业务代表模式（Business Delegate Pattern）</a></td>
<td>
<p><strong>结构与实现：</strong></p>
<p><strong>1.客户端（Client）</strong>- 表示层代码可以是JSP、servlet或UI java代码</p>
<p><strong>2.业务代表（Business Delegate）</strong>- 一个为客户端实体提供的入口类，它提供了对业务服务方法的访问</p>
<p><strong>3.查询服务（LookUp Service）</strong>- 查找服务对象负责获取相关的业务实现，并提供业务对象对业务代表对象的访问</p>
<p><strong>4.业务服务（Business Service）</strong>- 业务服务接口。实现了该业务服务的实体类，提供了实际的业务实现逻辑</p>
</td>
<td><p>客户端和服务代表解耦，客户端只负责执行，具体使用哪个服务，由服务代表来控制</p></td>
</tr>
<tr>
<td><a href='#5.3 组合实体模式(Composite Entity Pattern[kəmˈpɑːzət ˈentəti ˈpætərn])'>组合实体模式（Composite Entity Pattern）</a></td>
<td>
<p><strong>结构与实现：</strong></p>
<p><strong>1.组合实体（Composite Entity）</strong></p>
<p><strong>2.粗粒度对象（Coarse-Grained Object）</strong></p>
<p><strong>3.依赖对象（Dependent Object）</strong></p>
</td>
<td><p>EJB的持久化可以看成是EJB中的数据的存储操作。例如：你如果new了100个Entity Bean，而这个bean保存了大量的数据，服务器的内存肯定吃不肖，所有服务器会把一些暂时不用的Entity Bean从内存中“请”到硬盘中，这个过程就是一个持久化。在需要时，服务器，准确的说应该是EJB容器再把数据从硬盘中“请”到内存中。这与操作系统的调页是相同的</p></td>
</tr>
<tr>
<td><a href='#5.4 数据访问对象模式(Data Access Object Pattern[ˈdeɪtə ˈækses ˈɑːbdʒekt ˈpætərn])'>数据访问对象模式（Data Access Object Pattern）</a></td>
<td>
<p><strong>结构与实现：</strong></p>
<p><strong>1.数据访问对象接口（Data Access Object Interface）</strong>- 该接口定义了一个模型对象上要执行的标准操作，就是数据源操作API接口</p>
<p><strong>2.数据访问对象实体类（Data Access Object concrete class）</strong>- 该类实现了上述的接口。该类负责从数据源获取数据，数据源可以是数据库，也可以是xml，或者是其他的存储机制，就是数据源CRUD操作具体的实现</p>
<p><strong>3.模型对象/数值对象（Model Object/Value Object）</strong>- 该对象是简单的POJO，包含了get/set方法来存储通过DAO类查询出来的数据</p>
</td>
<td><p>数据持久化CRUD封装，mybatis</p></td>
</tr>
<tr>
<td><a href='#5.5 前端控制器模式(Front Controller Pattern [frʌnt kənˈtroʊlər ˈpætərn])'>前端控制器模式（Front Controller Pattern）</a></td>
<td>
<p><strong>结构与实现：</strong></p>
<p><strong>1.前端控制器（Front Controller）</strong>- 处理应用程序所有类型请求的单个处理程序，用来做一些转发请求前的前置操作，该程序可以是web也可以桌面程序</p>
<p><strong>2.调度器（Dispatcher）</strong>- 前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序</p>
<p><strong>3.视图（View）</strong>- 视图是为请求而创建的对象</p>
</td>
<td><p>希望在单个位置封装通用请求处理功能、希望实现动态请求处理，在不修改代码的情况下更改路由</p></td>
</tr>
<tr>
<td><a href='#5.6 拦截过滤器模式(Intercepting Filter Pattern[ˌɪntərˈseptɪŋ ˈfɪltər ˈpætərn])'>拦截过滤器模式（Intercepting Filter Pattern）</a></td>
<td>
<p><strong>结构与实现：</strong></p>
<p><strong>1.过滤器（Filter）</strong>- 过滤器在请求处理程序执行请求之前或之后，执行某些任务</p>
<p><strong>2.过滤器链（Filter Chain）</strong>- 过滤器链带有多个处理器，并在Target上按照定义的顺序执行这些过滤器</p>
<p><strong>3.Target</strong> - Target对象是请求处理程序</p>
<p><strong>4.过滤管理器（Filter Manager）</strong>- 过滤管理器管理过滤器和过滤器链</p>
<p><strong>5.客户端（Client）</strong>- Client 是向Target对象发送请求的对象</p>
</td>
<td><p>java springboot/mvc web请求过滤器、cas协议权限认证对接</p></td>
</tr>
<tr>
<td><a href='#5.7 服务定位器模式(Service Locator Pattern[ˈsɜːrvɪs loʊˈkeɪtər ˈpætərn])'>服务定位器模式（Service Locator Pattern）</a></td>
<td>
<p><strong>结构与实现：</strong></p>
<p><strong>1.服务（Service）</strong> - 实际处理请求的服务。对这种服务的引用可以在JNDI服务器中查找到</p>
<p><strong>2.Context/初始的Context</strong> -JDNI Context带有对要查找的服务的引用</p>
<p><strong>3.服务定位器（Service Locator）</strong>- 服务定位器是通过JNDI查找和缓存服务来获取服务的单点接触</p>
<p><strong>4.缓存（Cache）</strong>- 缓存存储服务的引用，以便复用它们</p>
<p><strong>5.客户端（Client）</strong>- Client是通过ServiceLocator调用服务的对象</p>
</td>
<td><p>使用通用接口来访问不同种类的服务</p></td>
</tr>
<tr>
<td><a href='#5.8 传输对象模式(Transfer Object Pattern[trænsˈfɜːr ɑːbdʒekt pætərn])'>传输对象模式（Transfer Object Pattern）</a></td>
<td>
<p><strong>结构与实现：</strong></p>
<p><strong>1.BO</strong>：业务对象，封装业务逻辑的java对象，通过调用DAO从数据库中读取数据，然后填充到VO里</p>
<p><strong>2.VO</strong>：传输对象，把从业务对象BO中获取的数据填充到值对象VO中，一般用作业务层之间的数据传递，可以和表对应</p>
<p><strong>3.客户端（Client）</strong>：客户端可以发送请求或者发送传输对象到业务对象</p>
</td>
<td><p>mybatis增删改查</p></td>
</tr>
</table>





</html>

> 下面用一个图片来整体描述一下设计模式之间的关系：

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E4%B9%8B%E9%97%B4%E7%9A%84%E5%85%B3%E7%B3%BB.png)

# 设计模式七大原则

|   设计原则   |                          一句话归纳                          |                    目的                    |
| :----------: | :----------------------------------------------------------: | :----------------------------------------: |
|   开闭原则   |                    对扩展开放，对修改关闭                    |            降低维护带来的新风险            |
| 依赖倒置原则 |            高层不应该依赖低层低层，要面向接口编程            |          更利于代码结构的升级扩展          |
| 单一职责原则 |             一个类只干一件事，实现类的功能要单一             |         便于理解，提高代码的可读性         |
| 接口隔离原则 |              一个接口只干一件事，接口要精简单一              |          功能解耦，高聚合，低耦合          |
|  迪米特法则  |  不该知道的不要知道，一个类保持对其他类最少的理解，降低耦合  | 只和朋友交流，不和陌生人说话，减少代码臃肿 |
| 里氏替换原则 | 不要破坏继承体系，子类重写方法功能发生改变，不应该影响父类方法的含义 |                防止继承泛滥                |
| 合成复用原则 |        尽量使用组合或聚合关系实现代码复用，少使用继承        |                降低代码耦合                |

## 1 开闭原则
> 定义

<font color="red">当应用的需求改变时，在不修改源代码或者编译生成的二进制代码的前提下，可以扩展模块的功能，使其满足新的需求</font>

> 作用
* 软件测试时只需要对扩展的代码进行测试就可以了，因为原有的测试代码仍然能够正常运行
* 粒度越小，被复用的可能性就越大
* 稳定性高和延续性强，从而易于扩展和维护

> 实现方法
* 通过接口或者抽象类为软件定义一个相对稳定的抽象层，而将相同的可变因素封装在相同的具体实现类中
* 只要抽象层设计合理基本上不需要改变，而软件中易变的细节可以从抽象派生类进行扩展，当软件需要发生改变时，只需要根据需求重新派生一个实现类来扩展即可

## 2 依赖倒置原则
> 定义
- <font color="red">高层模块不应该依赖低层模块，两者都应该依赖其抽象</font>
- <font color="red">抽象不应该依赖细节</font>
- <font color="red">细节应该依赖抽象</font>

<font color="red">核心思想：面向接口编程，不要面向实现编程</font>

解释：
1.什么是低层模块？
被调用者为低层
2.什么是高层模块？
调用者为高层
3.什么是抽象？
抽象就是接口或者抽象类
4.什么是细节？
细节就是实现类

> 作用
* 降低类的耦合性
* 提高系统的稳定性
* 减少并行开发引起的风险
* 可以提高代码的可读性和可维护性

> 实现方法
* 每个类尽量继承接口或者抽象类
* 变量的声明类型尽量是接口或者是抽象类

**错误的例子：**
```java
// 低层模块-奔驰车
public class Benz{
	public void run(){
		System.out.println("司机驾驶奔驰车在路上跑");
	}
}

// 高层模块-司机
public class Driver{
	//这里司机直接依赖的是具体实现奔驰车（如果想给司机换个宝马开就完犊子，所以高层应该依赖抽象，低层也应该抽象）
	public void drive(Benz benz){
		benz.run();
	}
}

public class Client{
	public static void main(String args[]){
		Benz benz = new Benz();
		Driver driver = new Driver();
		driver.drive();
	}
}
```
**正确的例子：**

```java
// 低层模块-汽车抽象
public interface ICar {
    /**
     * 汽车就应该能在路上跑
     */
    public void run();
}

// 高层模块-司机抽象
public interface IDriver {
    /**
     * 司机就应该会驾驶汽车
     */
    public void drive(ICar car);
}

// 细节应该依赖抽象
// 低层模块-奔驰车
public class Benz implements ICar {
    @Override
    public void run(){
        System.out.println("司机驾驶奔驰车在路上跑");
    }
}

// 细节应该依赖抽象
// 低层模块-宝马车
public class Bmw implements ICar{
    @Override
    public void run() {
        System.out.println("司机驾驶宝马车在路上跑");
    }
}

// 高层模块不应该依赖低层模块，两者都应该依赖其抽象
// 高层模块-司机
public class Driver implements IDriver{
    // 这里依赖ICar抽象，不依赖具体的车子细节
    @Override
    public void drive(ICar car) {
        car.run();
    }
}

public class Client {
    public static void main(String[] args) {
    	// 高层模块司机依赖抽象
        IDriver iDriver = new Driver();
        // 开宝马，低层模块也应该依赖抽象
        ICar car = new Bmw();
        iDriver.drive(car);
        System.out.println("司机换了一辆车");
        // 开奔驰
        car = new Benz();
        iDriver.drive(car);
    }
}
```
**程序运行结果如下：**
```
司机驾驶宝马车在路上跑
司机换了一辆车
司机驾驶奔驰车在路上跑
```

## 3 单一职责原则
> 定义

<font color="red">单一职责原则规定一个类应该仅有一个引起它变化的原因，否则类应该被拆分</font>

单一职责原则提出对象不应该承担太多的职责，如果一个对象承担了太多的职责，至少存在以下2个缺点：
1.一个职责的变化可能会削弱或者抑制这个类其他职责的能力
2.当客户端需要调用这个类某一个代码时，不得不将其他不需要的职责全部都包含进来，从而造成冗余代码或代码的浪费

> 作用

单一职责的原则就是控制类的粒度大小、将对象解耦，提高其内聚性
* 降低类的复杂度，一个类只负责一项职责，其逻辑肯定要比负责多项职责简单得多
* 提高类的可读性，类的功能单一必然代码复杂性降低，自然可读性就会高
* 提高系统的可维护性，可读性提高，自然维护起来就容易
* 变更引起的风险降低，变更是必然的，如果单一职责原则遵守的好，当修改一个功能时，可以显著降低对其他功能的影响

> 实现方法
单一职责原则比较简单，一个类应该保持他的功能单一，不要把太多的功能放到同一个类里，这个原则同样适用于方法，一个方法尽可能做好一件事，如果一个方法处理的事情太多，其颗粒度会变得很粗，不利于重用

## 4 接口隔离原则
> 定义

接口隔离原则和单一职责都是为了提高类的内聚性、降低它们之间的耦合性，体现了封装的思想，但两者是不同的：


- <font color="red">单一职责原则注重的是职责，而接口隔离原则注重的是对接口依赖的隔离</font>
- <font color="red">单一职责原则主要是约束类，它针对的是程序中的实现细节；接口隔离原则主要约束接口，主要针对抽象和程序整体框架的构建</font>


> 作用

接口隔离原则是为了约束接口、降低类对接口的依赖性，遵循接口隔离原则有以下5个优点
- 1.将臃肿庞大的接口分解为多个粒度小的接口，可以预防外来变更的扩散，提高系统的灵活性和可维护性
- 2.接口隔离提高了系统的内聚性，减少了对外交互，降低了系统的耦合性
- 3.如果接口的粒度大小定义合理，能够保证系统的稳定性；但是，如果定义过小，则会造成接口数量过多，使设计复杂化；如果定义太大，灵活性降低，无法提供定制服务，给整体项目带来无法预料的风险
- 4.使多个专门的接口还能够体现对象的层次，因为可以通过接口的继承，实现对总接口的定义
- 5.能减少项目工程中的代码冗余。过大的大接口里面通常放置许多不用的方法，当方法实现这个接口的时候，被迫设计成冗余的代码

> 实现方法
* 接口尽量小，但是要有限度。一个接口只服务于一个子模块或业务逻辑
* 为依赖接口的类定制服务。只提供调用者需要的方法，屏蔽不需要的方法
* 了解环境，拒绝盲从。每个项目或产品都有选定的环境因素，环境不同，接口拆分的标准就不同深入了解业务逻辑
* 提高内聚，减少对外交互。使接口用最少的方法完成最多的事情

**程序代码如下：**

```java
public class ISPtest {
    public static void main(String[] args) {
        InputModule input = StuScoreList.getInputModule();
        CountModule count = StuScoreList.getCountModule();
        PrintModule print = StuScoreList.getPrintModule();
        // 方法是隔离的，转换成对应的接口，其他接口的方法是无法调用的
        input.insert();
        count.countTotalScore();
        print.printStuInfo();
        //print.delete();
    }
}
//输入模块接口
interface InputModule {
    void insert();
    void delete();
    void modify();
}
//统计模块接口
interface CountModule {
    void countTotalScore();
    void countAverage();
}
//打印模块接口
interface PrintModule {
    void printStuInfo();
    void queryStuInfo();
}
//实现类
class StuScoreList implements InputModule, CountModule, PrintModule {
    private StuScoreList() {
    }
    public static InputModule getInputModule() {
        return (InputModule) new StuScoreList();
    }
    public static CountModule getCountModule() {
        return (CountModule) new StuScoreList();
    }
    public static PrintModule getPrintModule() {
        return (PrintModule) new StuScoreList();
    }
    public void insert() {
        System.out.println("输入模块的insert()方法被调用！");
    }
    public void delete() {
        System.out.println("输入模块的delete()方法被调用！");
    }
    public void modify() {
        System.out.println("输入模块的modify()方法被调用！");
    }
    public void countTotalScore() {
        System.out.println("统计模块的countTotalScore()方法被调用！");
    }
    public void countAverage() {
        System.out.println("统计模块的countAverage()方法被调用！");
    }
    public void printStuInfo() {
        System.out.println("打印模块的printStuInfo()方法被调用！");
    }
    public void queryStuInfo() {
        System.out.println("打印模块的queryStuInfo()方法被调用！");
    }
}
```
**程序运行结果如下：**
```
输入模块的insert()方法被调用！
统计模块的countTotalScore()方法被调用！
打印模块的printStuInfo()方法被调用！
```

## 5 迪米特法则
> 定义

​	迪米特法则的定义是：只与你的直接朋友交谈，不跟“陌生人”说话。其含义是：如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方在换发该调用。其目的是降低类之间的耦合度，提高模块的相对独立性

​	迪米特法则中的“朋友”是指：当前对象本身、当前对象的成员对象、当前对象所创建的对象、当前对象的方法参数等，这些对象同当前对象存在关联、聚合或组合关系，可以直接访问这些对象的方法

> 作用
* 降低了类之间的耦合度，提高了模块的相对独立性
* 由于亲和度降低，从而提高了类的可复用率和系统的扩展性
但是，过度使用迪米特法则会使系统产生大量的中介类，从而增加系统复杂性

> 实现方法

从迪米特法则的定义来看，它强调以下2点：
1.从依赖者的角度来说，只依赖应该依赖的对象
2.从被依赖者的角度说，只暴露应该暴露的方法

所以，在运行迪米特法则时要注意以下6点：
1.在类的划分上，应该创建弱耦合的类。类与类之间的耦合越弱，就越有利于实现可复用的目标
2.在类的结构设计上，尽量降低类成员的访问权限
3.在类的设计上，优先考虑将一个类设置成不变类（尽量不去修改它，类职责划分清晰改动就会小）
4.在对其他类的引用上，将引用其他对象的次数降到最低
5.不暴露类的属性成员，而应该提供响应的访问器（get和set方法）
6.谨慎使用序列化功能（类或接口在客户端变更，却未在服务端同步更新，引发序列化失败）

**程序代码如下：**

```java
public class LoDtest {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setStar(new Star("林心如"));
        agent.setFans(new Fans("粉丝韩丞"));
        agent.setCompany(new Company("中国传媒有限公司"));
        agent.meeting();
        agent.business();
    }
}
//经纪人
class Agent {
    private Star myStar;
    private Fans myFans;
    private Company myCompany;
    public void setStar(Star myStar) {
        this.myStar = myStar;
    }
    public void setFans(Fans myFans) {
        this.myFans = myFans;
    }
    public void setCompany(Company myCompany) {
        this.myCompany = myCompany;
    }
    public void meeting() {
        System.out.println(myFans.getName() + "与明星" + myStar.getName() + "见面了。");
    }
    public void business() {
        System.out.println(myCompany.getName() + "与明星" + myStar.getName() + "洽淡业务。");
    }
}
//明星
class Star {
    private String name;
    Star(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
//粉丝
class Fans {
    private String name;
    Fans(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
//媒体公司
class Company {
    private String name;
    Company(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
```
**程序运行结果如下：**
```
粉丝韩丞与明星林心如见面了。
中国传媒有限公司与明星林心如洽淡业务。
```

## 6 里氏替换原则
> 定义

* 里氏替换原则通俗的讲就是：子类可以重写父类的功能，但不能改变父类原有的功能含义
* 父类犬，子类哈士奇，父类犬里有个吃这个方法，功能是狗吃肉。子类哈士奇重写父类的吃方法，功能是吃草，这种就属于破坏了原来父类功能含义

> 作用
* 代码共享，减少创建类的工作量，每个子类都拥有父类的方法和属性
* 提高代码的重用性
* 子类可以形似父类，但又异于父类，“龙生龙，凤生凤，老鼠生来会打洞”是说子拥有父的“种”，“世界上没有两片完全相同的叶子”是指明子与父的不同
* 提高代码的可扩展性，实现父类的方法就可以“为所欲为”了，君不见很多开源框架的扩展接口都是通过继承父类来完成的
* 提高产品或项目的开放性

> 实现方法

<font color="red">里氏替换原则通俗来讲就是：子类可以重写父类功能，但不能改变父类原有方法的含义，简单的说假设定义一个List类里面有个getFirst方法，功能是返回集合的第一个元素，你子类重写getFirst方法返回集合的第二个元素，这种就是违反了里氏替换原则，方法跟原来的功能含义都不一样了，里氏替换要求尽量不重写父类方法，如果重写父类方法，也不能改变原来方法的含义和功能</font>

**程序代码如下：**
```java
public class LSPtest {
    public static void main(String[] args) {
        Bird bird1 = new Swallow();
        Bird bird2 = new BrownKiwi();
        bird1.setSpeed(120);
        bird2.setSpeed(120);
        System.out.println("如果飞行300公里：");
        try {
            System.out.println("燕子将飞行" + bird1.getFlyTime(300) + "小时.");
            System.out.println("几维鸟将飞行" + bird2.getFlyTime(300) + "小时。");
        } catch (Exception err) {
            System.out.println("发生错误了!");
        }
    }
}
//鸟类
class Bird {
    double flySpeed;
    public void setSpeed(double speed) {
        flySpeed = speed;
    }
    public double getFlyTime(double distance) {
        return (distance / flySpeed);
    }
}
//燕子类
class Swallow extends Bird {
}
//几维鸟类
class BrownKiwi extends Bird {
    public void setSpeed(double speed) {
        flySpeed = 0;
    }
}
```

**程序运行结果如下：**
```
如果飞行300公里：
燕子将飞行2.5小时.
几维鸟将飞行Infinity小时。
```

## 7 合成复用原则

> 定义

<font color="red">合成复用原则(Composite Reuse Principle) 又叫组合/聚合复用原则(Composition/Aggregate Reuse Principle,CARP)。它要求在软件复用时，要尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现</font>
如果要使用继承关系，则必须严格遵守里氏替换原则

> 作用

**通常类的复用分为继承复用和合成复用两种，继承复用虽然有简单和易实现，但也存在以下缺点：**
* 1.继承复用破坏了类的封装性。因为继承会将父类的实现细节暴露给子类，父类对子类是透明的，所以这种复用又称为“白箱”复用
* 2.子类与父类的耦合度高。父类的实现发生改变会影响子类，这不利于扩展和维护
* 3.它限制了复用的灵活性。从父类继承而来的实现是静态的，在编译时已经定义，所以在运行时不可能发生改变（如果使用组合代替继承，可以在运行时控制复用，比如传一个接口到类里，具体实现可以运行时动态确定，比较灵活）

**采用组合或聚合复用时，可以将已有对象纳入新对象中，使之成为新对象的一部分，新对象可以调用已有对象的功能，它有以下优点：**
* 1.它维持了类的封装性。因为组合对象的内部细节是新对象看不见的，所以这种复用又称为“黑箱”复用
* 2.新旧类之间的耦合度低。这种复用所需的依赖较少，新对象存取组合对象的唯一方法是通过组合对象的接口
* 3.复用的灵活性高。这种复用可以在运行时动态进行，新对象可以动态地引用与组合对象接口相同的对象

> 实现方法

合成复用原则是通过将已有的对象纳入新对象中，作为新对象成员来实现的，新对象可以调用成员对象的功能，从而达到复用

**下面举例各种颜色的钱包和手提包**

* 包抽象，定义包这个物品的抽象层
* 钱包，具体的包的实现
* 手提包，具体的包的实现
* Color颜色抽象
* 黄色，颜色具体实现
* 红色，颜色具体实现
Color接口是钱包或手提包类的成员对象，两者组合代替继承（维持了各自类的封装性），可以互相独立发展，互不影响（耦合度低），钱包想生成红色，直接将红色类丢进钱包里里，运行时也可以换成黄色类，生成黄色钱包（复用灵活性高）

**类图结构**
![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F-UML1.png)

# 设计模式(Design Patterns)
## 1 面向对象（三大特性）
> 理解面向对象三大特性是学习设计模式的必要条件
### 1.1 封装
#### 概念
将类的某些信息隐藏在内部，不允许外部直接访问，只能通过该类提供的公共方法来实现对隐藏信息的操作和访问

#### 好处
* 只能通过规定方法访问数据，不会污染内部的数据
* 隐藏类的内部实现细节，方便修改和实现
#### 现实世界参照物
* 我们可以把枪抽象成一个类，开枪和换弹夹是公开的方法，我们不需要知道枪发射子弹的原理，只需要按开关就能发射子弹。枪的内部弹夹就像一个堆栈一样，最后放进去的子弹，最先被发射出去
* 类似的现实世界参照物还有主机箱封装cpu硬盘电源显卡等，还有饮料，内部可能是可乐，雪碧，提供给外部的就是吸这个方法
#### 图解
![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%B0%81%E8%A3%85-%E6%89%8B%E6%9E%AA.png)
![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%B0%81%E8%A3%85-%E7%94%B5%E8%84%91%E4%B8%BB%E6%9C%BA.png)
![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%B0%81%E8%A3%85-UML.png)

### 1.2 继承
#### 概念
继承是一种【类和类的关系】。比如“狗”继承“动物”，这里的动物类是狗类的父类或基类，狗类是动物类的子类或派生类（java中的类是单继承的，一个类只有一个父类），狗类下面还有很多品种的狗，哈士奇，泰迪
#### 好处
子类拥有父类所有的属性和方法（除了private修饰的不能拥有）从而实现了代码的复用
支持扩展，子类可以重写父类的某个方法实现自己的逻辑

#### 现实世界参照物
* 动物>犬科>哈士奇、泰迪、金毛、中华田园犬（动物是父类，犬科是子类，下面的各种狗是孙子类）
* 爷爷奶奶，爸爸妈妈，兄弟姐妹
#### 图解
![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E7%BB%A7%E6%89%BF-%E7%8A%AC%E7%B1%BB.png)
![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E7%BB%A7%E6%89%BF-UML.png)

### 1.3 多态
#### 概念
多态是一种【类的行为】，指的是同一个对象可以表现出多种形态，通俗的说就是一个对象的引用类型可以是实际类，也可以是实际类的父类
#### 好处
* 可替换性，多态对已经存在的方法具有可替换性
* 可扩充性，新增一个子类不影响其他已经实现的类
* 接口行，多态是父类通过方法签名，向子类提供一个公共接口，由子类覆盖实现
* 简化性，多态简化了代码编写和修改过程，有些代码已经实现了，整体流程也定义好了，主要填鸭式的增加实现类，实现某些方法即可
#### 现实世界参照物
* 各种有机食物，虽然食材形态各异，但是万变不离其宗，人类只能食用有机食物，不能食用金属、塑料，人类能食用对象是番茄，苹果，牛肉等有机食物的多形态表现，而不能是金属类物质
* 动物>鸟、狗、猫，他们都有共同的方法叫，当实例化不同的对象时，发出的声音是不同的。
#### 图解
![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%A4%9A%E6%80%81-%E8%94%AC%E8%8F%9C.png)
![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%A4%9A%E6%80%81-UML1.png)
![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%A4%9A%E6%80%81-UML2.png)

## 2 创建型模式(Creational([kri'eɪʃn]))(共5个)
> 这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用new运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。
> 用人话说就是一个对外隐藏创建逻辑，外部开发者调用的时候只需要传参数告诉组件要哪些东西，组件创建好了返回给外部使用者。比如工厂、抽象工厂、单例模式都是如此，外部不关心内部怎么创建实例。

### 2.1 工厂模式(Factory([ˈfæktri]) Pattern)
#### 2.1.1 特点&优点&缺点&适用场景
> 优点
* 使系统在不修改代码的情况下，支持新产品，满足了开闭原则
* 只需要知道产品的名称就能得到产品，不需要知道产品的生产创建过程
* 灵活性强，对于新产品的创建，只需要加一个对应的实现类
* 典型的解耦，高层模块只要知道产品的抽象类，无需知道产品的实现类，满足迪米特法则，依赖倒置，里氏替换原则

> 缺点
* 每次增加产品都要加一个实现类，实现类过多，增加了复杂度
* 增加了系统抽象性和理解难度
* 抽象产品只能生产一种种类的产品，此弊端可以通过【抽象工厂】解决，抽象工厂是超级工厂里面很多子工厂，可以生产很多不同种类的产品

> 适用场景
* 日志记录器：日志可能记录到本地硬盘，数据库，系统事件等，用户可以选择记录到不同的地方
* 数据库访问：组件支持多种数据库，用户可以自行选择使用哪种数据库
* 打印机驱动：系统不知道接入了哪种打印机，系统只提供一个打印接口，装不同打印机驱动实现了打印接口，用户只需要配置使用的打印机打印即可

#### 2.1.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F-UML.png)

#### 2.1.3 代码
[工厂模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)

**步骤1：创建一个生产鼠标的接口**

```java
/**
 * 鼠标接口
 */
public interface Mouse {
	/**
	 * 生产
	 */
	void produce();
}
```
**步骤2：创建实现生产鼠标接口的具体实现类**

```java
/**
 * 牧马人鼠标
 */
public class MuMaRen implements Mouse{
	@Override
	public void produce() {
		System.out.println("生产了一个牧马人鼠标");
	}
}
/**
 * 双飞燕鼠标
 */
public class ShuangFeiYan implements Mouse{
	@Override
	public void produce() {
		System.out.println("生产了一个双飞燕鼠标");
	}
}
/**
 * 小米鼠标
 */
public class XiaoMi implements Mouse{
	@Override
	public void produce() {
		System.out.println("生产了一个小米鼠标");
	}
}
```
**步骤3：创建一个工厂，生成基于指定信息的鼠标实体类对象**

```java
/**
 * 鼠标工厂
 */
public class MouseFactory {
	/**
	 * 生成基于指定信息的鼠标实体类对象
	 *
	 * @param mouseType 鼠标品牌
	 * @return 具体的鼠标实现类
	 */
	public Mouse getMouse(String mouseType) {
		if (mouseType == null) {
			return null;
		}
		// 此处可以优化成反射创建实例对象，可以不用写if,else
		if (mouseType.equalsIgnoreCase("XiaoMi")) {
			return new XiaoMi();
		} else if (mouseType.equalsIgnoreCase("MuMaRen")) {
			return new MuMaRen();
		} else if (mouseType.equalsIgnoreCase("ShuangFeiYan")) {
			return new ShuangFeiYan();
		}
		return null;
	}
}
```
**步骤4：使用鼠标工厂，通过传递指定的鼠标品牌来获取具体鼠标实体类的对象**

```java
/**
 * 工厂模式
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		// 创建一个工厂
		MouseFactory mouseFactory = new MouseFactory();
		// 从工厂获取一个小米鼠标
		Mouse xiaoMi = mouseFactory.getMouse("XiaoMi");
		xiaoMi.produce();
		// 从工厂获取一个双飞燕鼠标
		Mouse shuangFeiYan = mouseFactory.getMouse("ShuangFeiYan");
		shuangFeiYan.produce();
		// 从工厂获取一个牧马人鼠标
		Mouse muMaRen = mouseFactory.getMouse("MuMaRen");
		muMaRen.produce();
	}
}
```
**程序运行结果如下：**
```
生产了一个小米鼠标
生产了一个双飞燕鼠标
生产了一个牧马人鼠标
```
### 2.2 抽象工厂模式(Abstract([æbˈstrækt]) Factory([ˈfæktri]) Pattern)
#### 2.2.1 介绍
> 说明
* 抽象工厂模式是一个围绕超级工厂创建其他工厂，该工厂又称为其他工厂的工厂

> 主要解决
* 主要解决接口选择问题

> 何时使用
* 系统中的产品多于一个，是一个产品族的时候用到

> 如何解决
* 在一个产品族里面定义多个产品

> 关键代码
* 在一个产品里面聚合多个产品

> 使用场景
* QQ换皮肤，每个部位都有多个服饰，比如帽子有很多种类，手套也有不同款式的，衣服有很多样式，这时候就可以把帽子，衣服，手套等各定义成一个工厂，每个工厂可以获取不同款式的产品，比如手套可以有很多种颜色的手套都是来自手套工厂，其他的部位同理
* 电脑整机生产超级工厂：超级工厂里面有很多工厂，有内存，硬盘，cpu，显卡等工厂，CPU工厂可以生产ADM和英特尔两种CPU，硬盘工厂能生产三星硬盘，金士顿硬盘等，需要哪种先从超级工厂里获取指定的工厂，在从这个工厂里生产指定的产品

> 优点
* 当多个产品需要一起工作时，组成一个产品族，使用抽象工厂会方便现存产品的扩展和解耦（单一产品使用工厂模式即可）

> 缺点
* 如果想给这个产品族加一个新的产品，需要改动代码，要在工厂生产者里加生产工厂的代码，还需要在代码里加实现类


#### 2.2.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82-UML.png)

#### 2.2.3 代码
[抽象工厂模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：为形状创建一个接口**

```java
/**
 * 形状接口
 */
public interface Shape {
	/**
	 * 绘制
	 */
	void draw();
}
```
**步骤2：创建具体的形状实体类**

```java
/**
 * 圆形
 */
public class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("draw 圆形");
	}
}
/**
 * 矩形
 */
public class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("draw 矩形");
	}
}
/**
 * 正方形
 */
public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("draw 正方形");
	}
}
```
**步骤3：为颜色创建一个接口**

```java
/**
 * 颜色
 */
public interface Color {
	/**
	 * 填充
	 */
	void fill();
}
```
**步骤4：创建具体的颜色实体类**

```java
/**
 * 蓝色
 */
public class Blue implements Color {
	@Override
	public void fill() {
		System.out.println("fill blue");
	}
}
/**
 * 绿色
 */
public class Green implements Color {
	@Override
	public void fill() {
		System.out.println("fill green");
	}
}
/**
 * 红色
 */
public class Red implements Color {
	@Override
	public void fill() {
		System.out.println("fill red");
	}
}
```
**步骤5：创建一个图形工厂和颜色工厂的抽象类**

```java
/**
 * 颜色和图形工厂的抽象
 */
public abstract class AbstractFactory {
	/**
	 * 获取颜色具体实现
	 *
	 * @param color
	 * @return
	 */
	public abstract Color getColor(String color);

	/**
	 * 获取图形具体实现
	 *
	 * @param shape
	 * @return
	 */
	public abstract Shape getShape(String shape);
}
```
**步骤6：创建颜色工厂和图形工厂具体的实现**

```java
/**
 * 颜色工厂
 */
public class ColorFactory extends AbstractFactory {
	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("red")) {
			return new Red();
		} else if (color.equalsIgnoreCase("green")) {
			return new Green();
		} else if (color.equalsIgnoreCase("blue")) {
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}
}
/**
 * 图形工厂
 */
public class ShapeFactory extends AbstractFactory {
	@Override
	public Color getColor(String color) {
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if (shape == null) {
			return null;
		}
		if (shape.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}
}
```
**步骤7：创建一个超级工厂，通过传递的类型获取工厂**

```java
/**
 * 工厂生成器
 * 超级工厂，生成其他工厂的工厂
 */
public class FactoryProducer {
	/**
	 * 通过传递的类型获取工厂
	 *
	 * @param choice
	 * @return
	 */
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		return null;
	}
}
```
**步骤8：使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象**

```java
/**
 * 抽象工厂模式
 */
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// 获取图形工厂
		AbstractFactory shape = FactoryProducer.getFactory("shape");
		// 获取图形工厂里的"圆形产品"
		Shape circle = shape.getShape("circle");
		// 画图
		circle.draw();

		// 获取图形工厂里的"矩形产品"
		Shape rectangle = shape.getShape("rectangle");
		rectangle.draw();

		// 获取正方形产品
		Shape square = shape.getShape("square");
		square.draw();

		// 获取颜色工厂
		AbstractFactory color = FactoryProducer.getFactory("color");
		// 从颜色工厂里获取产品"红色"
		Color red = color.getColor("red");
		red.fill();

		// 从颜色工厂里获取产品"蓝色"
		Color blue = color.getColor("blue");
		blue.fill();

		// 从颜色工厂里获取产品"绿色"
		Color green = color.getColor("green");
		green.fill();
	}
}
```
**程序运行结果如下：**
```
从超级工厂中获取图形工厂
让图形工厂生产指定的图形实现类
draw 圆形
draw 矩形
draw 正方形
------------------------------
从超级工厂中获取颜色工厂
让颜色工厂生产指定的颜色实现类
fill red
fill blue
fill green
```

### 2.3 单例模式(Singleton([ˈsɪŋɡltən]) Pattern)
#### 2.3.1 特点&优点&缺点&适用场景
> 特点
* 单例类全局只有一个实例
* 这个单例实例必须是由单例类自己创建
* 单例类需要对外提供一个公共的静态方法，让外部获取这个实例

> 优点
* 单例模式可以保证内存里只有一个实例，减少了内存开销
* 可以避免资源的多重占用
* 单例模式设置全局的访问点，可以方便的进行公共共享资源的访问

> 缺点
* 单例模式没有接口，扩展困难，如果要扩展，要修改原来的代码，没有其他办法，违背开闭原则
* 单例模式的功能代码通常写在一个类中，如果设计不合理，很容易违反单一职责

> 适用场景
* 比如windows系统中的任务管理器，全局唯一，就可以用单例模式来设计
* 比如线程池，连接池，全局调度器之类的
* web中的全局配置对象

> 饿汉式
* 这种方式的特点是类一旦加载就创建一个单例，保证在调用getInstance之前实例已经存在

> 懒汉式
* 该模式的特点是类加载时没有生成实例，只有当第一次调用getInstance才去创建这个实例
* 懒汉式还分为无锁（无锁，多线程情况下会多次对单例进行【覆盖】操作会存在很多内存浪费，前面生成的实例会被后面生成覆盖掉），双重锁检查（会有一点性能问题，因为是同步锁等待，只有一个线程创建线程，其他的线程等待）

#### 2.3.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F-UML1.png)

#### 2.3.3 代码
##### 1、懒汉式，线程不安全
**是否Lazy初始化：**是
**是否多线程安全：**否
**实现难度：**易
**描述：**这种方式是最简单的实现方式，这种实现最大的问题是不支持多线程。因为没有加同步锁synchronized [ˈsɪŋkrənaɪzd]，这种是懒加载，用到才会第一次加载，不是线程安全的，严格意义上来说不是单例，因为它会生成很多实例，在多线程下不能正常运行，因为你在创建实例的时候其他线程会覆盖掉被你写入的实例，造成线程不安全的情况
[懒汉式，线程不安全](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
```java
/**
 * 懒汉-无锁
 */
public class Sun1 {
	private static Sun1 SUN;

	/**
	 * 私有化构造函数，不让外部调用者创建实例，只允许静态调用getInstance方法获取实例
	 */
	private Sun1() {
	}

	/**
	 * 获取实例
	 *
	 * @return
	 */
	public static Sun1 getInstance() {
		// 如果无日才造日
		if (SUN == null) {
			SUN = new Sun1();
		}
		return SUN;
	}
}
```
##### 2、懒汉式，线程安全	
**是否Lazy初始化：**是
**是否多线程安全：**是
**实现难度：**易
**描述：**这种方式具备很好的懒加载，能够在多线程很好的工作，但是效率很低，synchronized加到方法上，不管有没有创建过实例，每次都会进入同步锁中，多线程同时getInstance会很慢

**优点：**第一次调用才初始化，避免内存浪费

**缺点：**必须加锁synchronized才能保证单例，但加锁会影响效率
[懒汉式，线程安全](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)

```java
/**
 * 懒汉-有锁
 */
public class Sun2 {
	private static Sun2 SUN;

	private Sun2() {
	}

	/**
	 * 方法加入同步锁
	 * 这种方法有个缺陷，如果有很多线程调用getInstance会造成都要排队，影响性能
	 *
	 * @return
	 */
	public static synchronized Sun2 getInstance() {
		// 双重检查
		if (SUN == null) {
			SUN = new Sun2();
		}
		return SUN;
	}
}
```
##### 3、饿汉式，线程安全
**是否Lazy初始化：**否
**是否多线程安全：**是
**实现难度：**易
**描述：**这种方式比较常用，但容易产生垃圾对象

**优点：**没有加锁，执行效率会提高

**缺点：**类加载时就初始化，浪费内存

它基于classloader机制避免了多线程的同步问题，这个类型的单例的线程安全是由JVM类加载器来保障的，这个因为初始化时就生成了实例，所以它不是懒加载的
[饿汉式，线程安全](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
```java
/**
 * 饿汉
 * 这种无论有没有人使用都会创建一个单例
 */
public class Sun3 {
	// 加了static之后，jvm会类加载器会有锁去控制避免多线程同时进入时一个类被初始化多次
	// 静态的字段和static代码块都是在jvm类加载器加载时初始化，并且无论什么情况下都只会执行一次，是天生的线程安全
	private static final Sun3 SUN = new Sun3();

	static {
		int a = 1;
	}

	private Sun3() {

	}

	public static Sun3 getInstance() {
		return SUN;
	}
}
```
##### 4、双检锁/双重校验锁（DCL，即double-checked locking），线程安全
**JDK版本：**JDK1.5起（JDK1.5以上对volatile语义进行了增强）

**是否Lazy初始化：**是
**是否多线程安全：**是
**实现难度：**较复杂
**描述：**这种方式采用双锁机制，安全且在多线程情况下能保持高性能

getInstance()的性能对应用程序很关键
[双检锁/双重校验锁（DCL，即double-checked locking），线程安全](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
```java
/**
 * 懒汉-双重锁检查
 */
public class Sun4 {
	// 实例对其他线程可见
	private volatile static Sun4 SUN;

	private Sun4() {

	}

	/**
	 * 比Sun4的同步方法好些
	 *
	 * @return
	 */
	public static Sun4 getInstance() {
		// 双重检查
		if (SUN == null) {
			synchronized (Sun4.class) {
				// 如果无日才造日
				if (SUN == null) {
					SUN = new Sun4();
				}
			}
		}
		return SUN;
	}
}
```
##### 5、登记式/静态内部类，线程安全
**是否Lazy初始化：**是
**是否多线程安全：**是
**实现难度：**一般
**描述：**这种方式能达到双锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用（双检锁在静态域和实例域都可以使用，因为它是基于同步锁实现的，多线程同时初始化会进入锁内执行，而静态域的实现方式是通过jvm来保证实例的线程安全，如果改成非静态的则会出现线程不安全的情况，即使加了volatile也不能保证线程安全，volatile只能保证读安全，不能保证写安全）

**相比第3种单例，静态内部类方式的单例相同和不同点：**

**相同点：**这两种方式都是使用了classloader机制来保证初始化instance时只有一个线程，也就是它们都是线程安全的

**不同点：**

静态内部类单例是懒加载的，而第3种不是懒加载：

第3种只要Sun3类被装载了，那么instance就会被实例化（没有达到懒加载效果），而静态内部类方式Sun5被装载了，instance不一定被初始化，因为SingletonHolder在getInstance方法内部，没有被主动调用，只有通过显示调用getInstance方法时，才会装载SingletonHolder类，从而实例化instance，这种方式要优于第3种方案，同时如果单例不用必须在实例域，也应该使用这种方案来代替第4种双检锁单例
[登记式/静态内部类，线程安全](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
```java
/**
 * 懒汉-静态内部类
 */
public class Sun5 {
	/**
	 * 内部类
	 * 初始化Sun5的时候并不会初始化SingletonHolder，只有当显示调用getInstance时才会初始化SingletonHolder
	 * SingletonHolder内部静态变量靠JVM来保证线程安全
	 */
	private static class SingletonHolder {
		private static final Sun5 INSTANCE = new Sun5();
	}

	private Sun5() {

	}

	public static final Sun5 getInstance() {
		// 只有主动调用getInstance才会加载SingletonHolder，实现懒加载
		// SingletonHolder内部的Sun5实例是静态的是jvm来保证线程安全的，不会存在多个线程同时初始化的情况
		return SingletonHolder.INSTANCE;
	}
}
```
##### 6、枚举

**JDK版本：**JDK1.5起

**是否Lazy初始化：**否
**是否多线程安全：**是
**实现难度：**易
**描述：**这种实现方式还没有被广泛采用，但这是实现单例模式最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。这种方式是Effective Java 作者Josh Bloch提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。不过，由于JDK1.5之后才加入enum特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用
[枚举](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
```java
/**
 * 单例无法被反射创建实例，其他几种单例都有漏洞可以被人使用反射去new实例
 */
public enum Sun6 {
	INSTANCE;
	private String test = "";

	public void whateverMethod() {
		test = "测试";
	}
}
```
##### 六种创建单例的方式使用经验
**经验之谈：**一般情况下，不建议使用第1种和第2种懒汉方式，建议使用第3种饿汉方式。只有在明确需要实现lazy loading懒加载效果时，才会使用第5种静态内部类方式。如果涉及到反序列化创建对象时，可以尝试使用第6种枚举方式。如果有其他特殊的需求，可以考虑使用第4种双检锁方式

### 2.4 建造者模式(Builder( [ˈbɪldər]) Pattern)
#### 2.4.1 特点&优点&缺点&适用场景
>说明
* 使用多个对象一步一步创建成一个复杂对象。
* 去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的套餐

> 主要解决
* 一些基本部件不变，而起组合经常变化
* 将变与不变分离开

> 优点
* 建造者独立，易扩展，建造者和套餐项目是分开的，套餐项目方便扩展，继承item自己实现一个新的项目即可，比如说肯德基想给某个套餐增加一个蛋挞，直接新建蛋挞实现item，就可以丢给建造者管理
* 方便控制细节，比如每个套餐项目的包装方式就可以自己控制，价格也是每个项目自己管理
* 购买套餐的人不需要关心套餐的生产装配过程，比如买肯德基的套餐，就不用管他怎么生产装配的，我直接去取套餐来吃就行了，有点像工厂模式，区别就是建造者模式更加关注装配的顺序，可以控制里面每一个项目生成的的细节

> 缺点
* 产品必须有共同点，范围有限制，比如肯德基套餐，每个套餐项目都有一个共同特征，比如饮料抽象类，汉堡抽象类，可乐和雪碧，百事可乐都属于饮料的子类，如果想增加一个套餐项目纪念玩具，就得再新增一个抽象类给纪念品继承，不能使用其他套餐的抽象类
* 如果内部变化复杂，会有很多建造者类，建造者内部只是满足几个套餐，某一个建造者内部专门生成素食套餐和汉堡套餐，其他建造者生成全家桶套餐，还有的生成点心套餐，就需要很多建造者

> 适用场景
* 需要生成的对象具有复杂的内部结构（比如肯德基套餐，内部每个套餐项目都不一样薯条汉堡点心饮料等等，每个套餐项目的装配方式也不一样，有的用纸盒，有的用杯子）
* 给PDF增加签章（签章有很多提供商）水印二维码，文字等就可以使用建造者模式
* 套餐项目内部每个属性需要有相关性，比如肯德基的饮料和汉堡，都是吃的，要么是玩具纪念品，都有关联

#### 2.4.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F-UML.png)

#### 2.4.3 代码
[建造者模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建一个表示食物条目和食物包装的接口**

```java
/**
 * 套餐项目接口
 */
public interface Item {
	/**
	 * 项目名称
	 *
	 * @return
	 */
	public String name();

	/**
	 * 项目包装方式
	 *
	 * @return
	 */
	public Packing packing();

	/**
	 * 项目价格
	 *
	 * @return
	 */
	public float price();
}
/**
 * 包装行为约束
 */
public interface Packing {
	/**
	 * 包装
	 *
	 * @return
	 */
	public String pack();
}
```
**步骤2：创建实现 Packing 接口的实体类**
```java
/**
 * 纸包装
 */
public class Wrapper implements Packing {
	/**
	 * 包装（动词）
	 *
	 * @return
	 */
	@Override
	public String pack() {
		return "用纸包装";
	}
}
/**
 * 瓶装
 */
public class Bottle implements Packing {
	/**
	 * 包装（动词）
	 *
	 * @return
	 */
	@Override
	public String pack() {
		return "用瓶子包装";
	}
}
```
**步骤3：创建实现 Item 接口的抽象类，该类提供了默认的功能**

```java
/**
 * 套餐子项目-汉堡抽象基类
 */
public abstract class Burger implements Item {
	/**
	 * 包装
	 *
	 * @return
	 */
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	/**
	 * 价格
	 *
	 * @return
	 */
	@Override
	public abstract float price();
}
/**
 * 套餐子项目-冰饮料
 */
public abstract class ColdDrink implements Item {

	/**
	 * 包装
	 *
	 * @return
	 */
	@Override
	public Packing packing() {
		return new Bottle();
	}

	/**
	 * 价格
	 *
	 * @return
	 */
	@Override
	public abstract float price();
}
```
**步骤4：创建扩展了 Burger 和 ColdDrink 的实体类**

```java
/**
 * 套餐子项目-鸡肉汉堡
 */
public class ChickenBurger extends Burger{
	/**
	 * 汉堡名称
	 * @return
	 */
	@Override
	public String name() {
		return "鸡肉汉堡";
	}

	/**
	 * 价格
	 * @return
	 */
	@Override
	public float price() {
		return 50.5f;
	}
}
/**
 * 套餐子项目-素食汉堡
 */
public class VegBurger extends Burger{
	/**
	 * 汉堡名称
	 * @return
	 */
	@Override
	public String name() {
		return "素食汉堡";
	}

	/**
	 * 价格
	 * @return
	 */
	@Override
	public float price() {
		return 25.0f;
	}
}
/**
 * 套餐子项目-可口可乐
 */
public class Coke extends ColdDrink{
	/**
	 * 可乐名称
	 * @return
	 */
	@Override
	public String name() {
		return "可口可乐";
	}

	/**
	 * 价格
	 * @return
	 */
	@Override
	public float price() {
		return 30.0f;
	}
}
/**
 * 套餐子项目-百事可乐
 */
public class Pepsi extends ColdDrink{
	/**
	 * 可乐名称
	 * @return
	 */
	@Override
	public String name() {
		return "百事可乐";
	}

	/**
	 * 价格
	 * @return
	 */
	@Override
	public float price() {
		return 0;
	}
}
```
**步骤5：创建一个 Meal 类，带有上面定义的 Item 对象**

```java
/**
 * 套餐
 */
public class Meal {
	/**
	 * 套餐项目列表
	 */
	private List<Item> items = new ArrayList<>();

	/**
	 * 给套餐添加项目
	 *
	 * @param item
	 */
	public void addItem(Item item) {
		items.add(item);
	}

	/**
	 * 计算套餐的总价格
	 *
	 * @return
	 */
	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	/**
	 * 展示所有的套餐子项目
	 */
	public void showItems() {
		for (Item item : items) {
			System.out.println("Item:" + item.name());
			System.out.println("Packing:" + item.packing().pack());
			System.out.println("Price:" + item.price());
		}
	}
}
```
**步骤6：创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象**

```java
/**
 * 套餐建造者
 */
public class MealBuilder {
	/**
	 * 准备一个素食套餐
	 *
	 * @return
	 */
	public Meal prepareVegMeal() {
		// 生成一个空套餐
		Meal meal = new Meal();
		// 给套餐加一个素食汉堡
		meal.addItem(new VegBurger());
		// 添加一个可口可乐
		meal.addItem(new Coke());
		return meal;
	}

	/**
	 * 准备一个非素食套餐
	 *
	 * @return
	 */
	public Meal prepareNonVegMeal() {
		// 生成一个空套餐
		Meal meal = new Meal();
		// 添加一个鸡肉汉堡
		meal.addItem(new ChickenBurger());
		// 添加一个百事可乐
		meal.addItem(new Pepsi());
		return meal;
	}
}
```
**步骤7：BuiderPatternDemo 使用 MealBuilder 来演示建造者模式（Builder Pattern）**

```java
/**
 * 建造者模式
 */
public class BuilderPatternDemo {
	public static void main(String[] args) {
		// 创建一个套餐建造者
		MealBuilder mealBuilder = new MealBuilder();
		// 生成一个素食套餐
		Meal meal = mealBuilder.prepareVegMeal();
		System.out.println("准备一个素食套餐");
		// 展示套餐的内容
		meal.showItems();
		System.out.println("素食套餐总费用：" + meal.getCost());

		System.out.println("--------------------------------------------");
		// 生成一个非素食套餐
		Meal meal1 = mealBuilder.prepareNonVegMeal();
		System.out.println("准备一个非素食套餐");
		// 展示套餐的内容
		meal1.showItems();
		System.out.println("非素食套餐总费用：" + meal1.getCost());
	}
}
```
**程序运行结果如下：**
```
准备一个素食套餐
打印套餐内容：
Item:素食汉堡
Packing:用纸包装
Price:25.0
Item:可口可乐
Packing:用瓶子包装
Price:30.0
素食套餐总费用：55.0
--------------------------------------------
准备一个非素食套餐
打印套餐内容：
Item:鸡肉汉堡
Packing:用纸包装
Price:50.5
Item:百事可乐
Packing:用瓶子包装
Price:0.0
非素食套餐总费用：50.5
```

### 2.5 原型模式(Prototype([ˈproʊtətaɪp] ) Pattern)
#### 2.5.1 特点&优点&缺点&适用场景
> 特点
* 用一个已经创建的实例作为原型，通过复制这个原型对象来创一个和原型相同的新对象
* 就像打印机原件和复印件一样，原件：new出来的原始实例，复印件：复制原始实例作为一个新的实例

**原型模式有两种拷贝方式：**

**浅拷贝：**创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址

**深拷贝：**创建一个新对象，属性中引用的其他对象也会被克隆，被克隆出来的对象不再指向原有对象的地址

> 优点
* java自带的原型模式基于内存二进制流的复制，在性能上比new一个要更好
* 可以使用深拷贝的方式保存对象的状态，将原来的对象复制一份保存起来，以后如果需要恢复到历史某一状态就比较容易

> 缺点
* 需要为每个类都要写一个clone方法
* clone方法位于类的内部，当对已有的类进行改造的时候，需要修改代码，违反开闭原则
* 当实现深拷贝的时候，当对象之间存在多重嵌套时，为了实现复制，需要每一层的对象都必须支持克隆，实现起来会很麻烦，需要写很多代码

> 适用场景
* 需要频繁生成实例对象，可以先new一个原件，然后复印这个原件
* 状态还原，比如某一个时间点的对象状态可以先复制一份放在一边，等到用户操作回滚的时候直接把这个复印件对象拿过来

#### 2.5.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%8E%9F%E5%9E%8B%E6%A8%A1%E5%BC%8F-UML.png)

#### 2.5.3 代码
[原型模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建实现Cloneable接口的子弹和敌机类（要支持深拷贝）**

```java
/**
 * 子弹
 */
public class Bullet implements Cloneable {
	private int size;

	public Bullet() {

	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return this.size;
	}

	/**
	 * 克隆一发子弹
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Bullet clone() throws CloneNotSupportedException {
		return (Bullet) super.clone();
	}
}
/**
 * 敌机
 */
public class EnemyPlane implements Cloneable {
	/**
	 * 子弹-引用类型
	 */
	private Bullet bullet;
	/**
	 * 敌机横坐标
	 */
	private int x;
	/**
	 * 敌机纵坐标
	 */
	private int y = 0;

	public EnemyPlane(int x, Bullet bullet) {
		this.x = x;
		this.bullet = bullet;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	/**
	 * 让敌机飞行
	 */
	public void fly() {
		// 每次调用让敌机的纵坐标+1
		y++;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setBullet(Bullet bullet) {
		this.bullet = bullet;
	}

	public Bullet getBullet() {
		return this.bullet;
	}

	/**
	 * 克隆一个敌机
	 * 为了演示浅拷贝和深拷贝重新写了俩方法
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected EnemyPlane clone() throws CloneNotSupportedException {
		EnemyPlane clone = (EnemyPlane) super.clone();
		// 子弹类是引用类型，复制EnemyPlane，Bullet只是地址被引用了，修改一个其他全部都会跟着变，需要复制Bullet，并重新赋值
		// 深拷贝每个敌机对象里的子弹对象都是不同的，不跑这段就是浅拷贝，每个敌机里的子弹对象都是同一个。
		clone.setBullet(this.bullet.clone());
		clone.getBullet().setSize(new Random().nextInt(200));
		return clone;
	}

	/**
	 * 深拷贝
	 * 把属性是引用类型的全都要clone一遍，每一个bullet子弹对象地址是不同的
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	protected EnemyPlane cloneDeep() throws CloneNotSupportedException {
		// 克隆当前敌机对象
		EnemyPlane clone = (EnemyPlane) super.clone();
		// 克隆bullet子弹对象，并更新到克隆的bullet引用对象
		clone.setBullet(this.bullet.clone());
		clone.getBullet().setSize(new Random().nextInt(200));
		return clone;
	}

	/**
	 * 浅拷贝
	 * 把bullet子弹对象的地址指向到敌机对象的引用类型bullet上，每个敌机对象的子弹对象都是同一个
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	protected EnemyPlane cloneShallow() throws CloneNotSupportedException {
		// 克隆当前敌机对象
		EnemyPlane clone = (EnemyPlane) super.clone();
		// 更新子弹的大小，这行代码其实修改的都是同一个bullet引用对象，因为浅拷贝只是克隆指向地址
		clone.getBullet().setSize(new Random().nextInt(200));
		return clone;
	}
}
```
**步骤2：创建一个克隆工厂**

```java
/**
 * 敌机生产工厂
 */
public class EnemyPlaneFactory {
	/**
	 * 原文件
	 */
	private static EnemyPlane prototype = new EnemyPlane(200, new Bullet());

	/**
	 * 复印件-深拷贝
	 *
	 * @param x
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public static EnemyPlane cloneDeep(int x) throws CloneNotSupportedException {
		// 复制一份原文件
		EnemyPlane clone = prototype.cloneDeep();
		clone.setX(x);
		return clone;
	}

	/**
	 * 复印件-浅拷贝
	 *
	 * @param x
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public static EnemyPlane cloneShallow(int x) throws CloneNotSupportedException {
		// 复制一份原文件
		EnemyPlane clone = prototype.cloneShallow();
		clone.setX(x);
		return clone;
	}
}
```
**步骤3：从工厂里面分别获取深拷贝对象和浅拷贝对象存储并打印出来**

```java
/**
 * 原型模式
 */
public class PrototypePatternDemo {
	@SneakyThrows
	public static void main(String[] args) {
		// 深拷贝敌机列表
		List<EnemyPlane> deepList = new ArrayList<>();
		// 浅拷贝敌机列表
		List<EnemyPlane> shallowList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			deepList.add(EnemyPlaneFactory.cloneDeep(new Random().nextInt(200)));
			shallowList.add(EnemyPlaneFactory.cloneShallow(new Random().nextInt(200)));
		}
		System.out.println("【深拷贝】敌机信息：");
		for (EnemyPlane item : deepList) {
			System.out.println("敌机的X坐标：" + item.getX());
			System.out.println("子弹" + item.getBullet().getSize());
		}
		System.out.println("【深拷贝】结论：深拷贝不仅可以复制基本类型，还可以复制引用类型，深拷贝得到的子弹每一个都是独立的");
		System.out.println("------------------------------：");
		System.out.println("【浅拷贝】敌机信息：");
		for (EnemyPlane item : shallowList) {
			System.out.println("敌机的X坐标：" + item.getX());
			System.out.println("子弹" + item.getBullet().getSize());
		}
		System.out.println("【深拷贝】结论：浅拷贝只能拷贝基础类型，引用类型需要手动复制并更新引用，浅拷贝复制的每个引用类型实际上还是原件的引用类型的地址，所以得到的子弹都是同一个对象");
	}
}
```
**程序运行结果如下：**
```
【深拷贝】敌机信息：
敌机的X坐标：49
子弹38
敌机的X坐标：50
子弹144
敌机的X坐标：165
子弹93
敌机的X坐标：174
子弹19
敌机的X坐标：29
子弹178
【深拷贝】结论：深拷贝不仅可以复制基本类型，还可以复制引用类型，深拷贝得到的子弹每一个都是独立的
------------------------------：
【浅拷贝】敌机信息：
敌机的X坐标：129
子弹94
敌机的X坐标：129
子弹94
敌机的X坐标：22
子弹94
敌机的X坐标：69
子弹94
敌机的X坐标：89
子弹94
【深拷贝】结论：浅拷贝只能拷贝基础类型，引用类型需要手动复制并更新引用，浅拷贝复制的每个引用类型实际上还是原件的引用类型的地址，所以得到的子弹都是同一个对象

Process finished with exit code 0

```


## 3 结构型模式(Structural([ˈstrʌktʃərəl] ))(共8个，特殊：过滤器)
> 它描述如何将类或对象按某种布局组成更大的结构。它分为类结构型模式和对象结构型模式，前者采用继承机制来组织接口和类，后者采用组合或聚合来组合对象

### 3.1 适配器模式(Adapter([əˈdæptər]) Pattern)
#### 3.1.1 特点&优点&缺点&适用场景
>说明
* 适配器模式是作为两个不兼容的接口之间的桥梁，举个真实的例子，现在的显示器基本都是HDMI接口，如果我们的主机是比较老的，他只支持VGA接口，这个时候需要买一个转换器，把HDMI转换成VGA，这样就能把新款的显示器，接到老的主机上。还有以前的老键盘PS2接口，现在都没有PS2口了，如果想用老键盘，就需要买个转换器，把PS2转换成USB

> 主要解决
* 在软件系统中，经常要将一些“现存的对象”放到新的环境中，而新环境中要求的接口是现对象不能满足的

> 优点
* 可以让任何两个没有关联的类一起运行
* 提高了类的复用
* 灵活性好

> 缺点
* 适配器太多会让系统非常凌乱，建议重构

> 适用场景
* 有动机的修改一个正常运行的系统的接口，这时应该考虑使用适配器模式
* 适配器不是在详细设计时添加的，而是解决正在服役的项目的问题

#### 3.1.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F-UML.png)

#### 3.1.3 代码
[适配器模式](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F-UML.png)
**步骤1：为媒体播放器和更高级的媒体播放器创建接口**

```java
/**
 * 媒体播放器接口约束
 */
public interface MediaPlayer {
	/**
	 * 播放
	 *
	 * @param audioType 音频类型
	 * @param fileName  文件名称
	 */
	void play(String audioType, String fileName);
}
/**
 * 高级媒体播放器
 */
public interface AdvancedMediaPlayer {
	/**
	 * 播放vlc
	 *
	 * @param fileName
	 */
	public void playVlc(String fileName);

	/**
	 * 播放mp4
	 *
	 * @param fileName
	 */
	public void playMp4(String fileName);
}
```
**步骤2：创建实现了 *AdvancedMediaPlayer* 接口的实体类**

```java
/**
 * MP4播放器
 */
public class Mp4Player implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		// 什么也不做
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("playing mp4 file. Name:" + fileName);
	}
}
/**
 * VLC播放器
 */
public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("playing vlc file. Name:" + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// 什么也不做
	}
}
```
**步骤3：创建实现了 *MediaPlayer* 接口的适配器类**

```java
/**
 * 媒体适配器
 */
public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMediaPlayer;

	/**
	 * 定义媒体类型
	 *
	 * @param audioType
	 */
	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new Mp4Player();
		}
	}

	/**
	 * 播放对应媒体类型的文件
	 *
	 * @param audioType 音频类型
	 * @param fileName  文件名称
	 */
	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMp4(fileName);
		}
	}
}
```
**步骤4：创建音频播放器类**

```java
/**
 * 音频播放器
 */
public class AudioPlayer implements MediaPlayer {
	/**
	 * 播放视频的适配器
	 */
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		// 播放mp3文件的内置支持
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("playing mp3 file. Name:" + fileName);
		}
		// 提供了其他格式的文件播放方式
		else if (audioType.equalsIgnoreCase("vlc") ||
				audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("无效的音频：" + audioType + "格式不支持");
		}
	}
}
```
**步骤5：使用 AudioPlayer 来播放不同类型的音频格式**

```java
/**
 * 适配器模式
 */
public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "app.mp3");
		audioPlayer.play("mp4", "app.mp4");
		audioPlayer.play("vlc", "app.vlc");
		audioPlayer.play("avi", "app.avi");
	}
}
```
**程序运行结果如下：**
```
playing mp3 file. Name:app.mp3
playing mp4 file. Name:app.mp4
playing vlc file. Name:app.vlc
无效的音频：avi格式不支持
```
### 3.2 桥接模式(Bridge( [brɪdʒ]) Pattern)
#### 3.2.1 特点&优点&缺点&适用场景
>说明
* 桥接模式主要是把抽象和实现解耦分离，使得两者可以独立变化，他是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度，这类设计模式属于结构型模式。
* 举例：比如钱包，提包，挎包，都是继承了抽象类包，包的颜色就可以是接口，实现就是不同的颜色，这种场景就可以用桥接模式，抽象“包”和实现“各种颜色”分离，各自独立变化和扩展，用组合的方式代替继承，可以更好的进行扩展，降低耦合度
* 就像长江大桥一样，同一个城市，2个不同的区域（维度），可以各自发展
* 简单的说就是钱包，拎包对象不负责颜色的控制，而是内部有个Draw接口，由外部传入RedDraw、GreenDraw进去来控制钱包拎包的颜色，包和颜色都能独立变化，互不影响。使用传统的继承的方式会比较麻烦，因为钱包有N多种颜色，子类会非常多。

> 主要解决
* 在有多重可能变化的情况下，用继承会造成类爆炸问题，扩展

> 优点
* 抽象和实现的分离降低了耦合度
* 优秀的扩展能力，比如包的颜色可以有不同的颜色，抽象类包，可以有不同的形态，比如钱包，拎包，挎包，扩展很方便
* 实现细节对客户透明，用户不用关心具体的实现细节

> 缺点
* 由于抽象和实现的关系放在了抽象层，要求开发者针对抽象化进行设计和编程，需要能正确识别出系统中两个独立变化的维度，这增加了对系统的理解和设计难度

> 适用场景
* 如果一个系统需要在抽象层和具体实现层之间增加更多的灵活性，不想在2个层次之间使用静态的继承联系（比如圆形和画红色的圆形，类“RedCircle”继承“Cicle”），通过桥接模式可以使他们在抽象层建立一个关联关系
* 对于那些不想使用继承或者因为多层次继承导致系统类的个数急剧增加的系统，比如抽象“包”有钱包、手提包，颜色有3种，红、绿、蓝，如果使用继承，想实现2种包都有3种颜色，就需要创建6个类：红色钱包、红色手提包、蓝色钱包、蓝色手提包等等。如果使用桥接模式只需要创建5个，如果颜色特别多，包种类特别多，类的数量会更多，这种情况就推荐使用桥接模式，使用组合关系来代替继承关系
* 一个类存在2个独立变化的维度，并且这两个维度都需要进行扩展

#### 3.2.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F-UML1.png)
![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F-UML2.png)

#### 3.2.3 代码
[桥接模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建桥接实现接口**

```java
/**
 * 画图API
 */
public interface DrawAPI {
	/**
	 * 画圆
	 *
	 * @param radius
	 * @param x
	 * @param y
	 */
	void drawCircle(int radius, int x, int y);
}
```
**步骤2：创建实现了 *DrawAPI* 接口的实体桥接实现类**

```java
/**
 * 给图形画红色
 */
public class Red implements DrawAPI {
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("画图形[ color: 红色, radius: "
				+ radius + ", x: " + x + ", " + y + "]");
	}
}
/**
 * 给图形画绿色
 */
public class Green implements DrawAPI {
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("画图形[ color: 绿色, radius: "
				+ radius + ", x: " + x + ", " + y + "]");
	}
}
```
**步骤3：使用 *DrawAPI* 接口创建抽象类 *Shape***

```java
/**
 * 图形抽象类
 */
public abstract class Shape {
	/**
	 * 画颜色api
	 */
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	/**
	 * 根据传入的颜色画
	 */
	public abstract void draw();
}
```
**步骤4：创建实现了 *Shape* 抽象类的实体类**

```java
/**
 * 正方形
 */
public class Square extends Shape{
	private int x, y, radius;

	public Square(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/**
	 * 根据传入的颜色画图形
	 */
	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
}
/**
 * 圆形
 */
public class Circle extends Shape {
	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/**
	 * 根据传入的颜色画图形
	 */
	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
}
```
**步骤5：使用 *Shape* 和 *DrawAPI* 类画出不同颜色的圆**

```java
/**
 * 桥接模式，适合1个类存在2个独立的变化维度，且2个维度都需要进行扩展的情况
 * 比如圆形和画不同颜色的圆形，这两个变化就可以分开写代码
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		// 画红色的圆形
		Shape redCircle = new Circle(100, 100, 10, new Red());
		redCircle.draw();

		// 画绿色的圆形
		Shape greenCircle = new Circle(100, 100, 10, new Green());
		greenCircle.draw();

		// 画绿色的正方形
		Shape square = new Square(10, 20, 5, new Green());
		square.draw();
	}
}
```
**程序运行结果如下：**

```
画图形[ color: 红色, radius: 10, x: 100, 100]
画图形[ color: 绿色, radius: 10, x: 100, 100]
画图形[ color: 绿色, radius: 5, x: 10, 20]
```
### 3.3 过滤器模式(Filter/Criteria( [kraɪ'tɪriə]) Pattern)
#### 3.3.1 特点&优点&缺点&适用场景
>说明
* 对一组数据集合做数据过滤，可以多层过滤器嵌套，最终返回符合要求的数据

> 主要解决
* 指定任意组合的规则，然后对一个数据集合条件过滤，最终返回符合规则的数据

> 优点
* 可以把任意单个规则组合成一个大的规则，然后直接对整个规则进行计算，可以无限嵌套不用改代码很方便

> 缺点
* 很多规则嵌套在一起之后会比较复杂，不容易理解

> 适用场景
* 主要是针对一些数据进行一些动态的规则进行条件过滤，规则是可变的情况下，还需要做一套根据配置来生成规则表达式的方式

#### 3.3.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E8%BF%87%E6%BB%A4%E5%99%A8%E6%A8%A1%E5%BC%8F-UML.png)

#### 3.3.3 代码
[过滤器模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建一个类，在该类上应用标准**

```java
/**
 * 个人信息实体
 */
public class Person {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别
	 */
	private String gender;
	/**
	 * 婚姻状况
	 */
	private String maritalStatus;

	public Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}
}
```
**步骤2：为标准（Criteria）创建一个接口**

```java
/**
 * 标准
 */
public interface Criteria {
	/**
	 * 筛选出满足标准的数据
	 *
	 * @param persons
	 * @return
	 */
	public List<Person> meetCriteria(List<Person> persons);
}
```
**步骤3：创建实现了 *Criteria* 接口的实体类**

```java
/**
 * 男性标准
 */
public class CriteriaMale implements Criteria {
	/**
	 * 返回集合中所有的男性
	 *
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// 男人列表
		List<Person> malePersons = new ArrayList<>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("男")) {
				malePersons.add(person);
			}
		}
		// 返回列表中所有的男性
		return malePersons;
	}
}
/**
 * 女性标准
 */
public class CriteriaFemale implements Criteria {
	/**
	 * 返回集合中所有的女性
	 *
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// 女人列表
		List<Person> femalePersons=new ArrayList<>();
		for (Person person:persons){
			if(person.getGender().equalsIgnoreCase("女")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}
/**
 * 单身过滤器
 */
public class CriteriaSingle implements Criteria{
	/**
	 * 返回单身的人
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getMaritalStatus().equalsIgnoreCase("单身")){
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}
}
/**
 * 和过滤器
 */
public class AndCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	/**
	 * 返回和过滤器满足标准
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// 第一个过滤器筛选一遍
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		// 【第一个过滤器】得到的结果放到【第二个过滤器】里在过滤一遍
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}
}
/**
 * 或过滤器
 */
public class OrCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;

	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	/**
	 * 返回或过滤器满足条件的集合
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// 计算第一个集合
		// 结果：1,2,3,4,5
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		// 计算第二个集合（两次筛选都是独立的）
		// 结果：4,5,6,7,8
		List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
		// 或运算，实际就是取2个集合的并集
		for (Person person : otherCriteriaItems) {
			// 遍历集合结果2的项目，如果集合2的项目在集合1中不存在就添加到集合1里
			if (!firstCriteriaItems.contains(person)) {
				firstCriteriaItems.add(person);
			}
		}
		// 结果：1,2,3,4,5,6,7,8
		return firstCriteriaItems;
	}
}
```
**步骤4：使用不同的标准（Criteria）和它们的结合来过滤 *Person* 对象的列表**

```java
/**
 * 过滤器模式
 */
public class FilterPatternDemo {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("张三", "女", "单身"));
		persons.add(new Person("王二", "男", "已婚"));
		persons.add(new Person("李静", "女", "单身"));
		persons.add(new Person("张三丰", "男", "单身"));
		persons.add(new Person("张无忌", "男", "已婚"));
		persons.add(new Person("谢逊", "男", "单身"));
		persons.add(new Person("赵敏", "女", "已婚"));
		System.out.println("原始数据：");
		for (Person person : persons) {
			System.out.println(person.toString());
		}
		System.out.println("-----------------------------------------------------------------");
		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();

		System.out.println("过滤出男人:");
		printPersons(male.meetCriteria(persons));

		System.out.println("过滤出女人:");
		printPersons(female.meetCriteria(persons));

		System.out.println("过滤出单身的人:");
		printPersons(single.meetCriteria(persons));

		// 过滤出单身的所有男性
		Criteria singleMale = new AndCriteria(single, male);
		System.out.println("过滤出单身的男性:");
		printPersons(singleMale.meetCriteria(persons));

		// 筛选出是单身或者是男性的集合
		Criteria singleOrMale = new OrCriteria(single, male);
		System.out.println("筛选出是单身或者是男性的集合：");
		printPersons(singleOrMale.meetCriteria(persons));

		// 筛选出是单身男性，并且姓张的人
		Criteria singleMaleAndName = new AndCriteria(new AndCriteria(single, male), new CriteriaName("张"));
		System.out.println("筛选出是单身男性,并且姓张的人：");
		printPersons(singleMaleAndName.meetCriteria(persons));

		// 筛选出是单身男性或者姓张的人
		Criteria singleMaleOrName = new OrCriteria(new AndCriteria(single, male), new CriteriaName("张"));
		System.out.println("筛选出是单身男性,或者姓张的人：");
		printPersons(singleMaleOrName.meetCriteria(persons));

	}

	public static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("人 : [ 姓名 : " + person.getName()
					+ ", 性别 : " + person.getGender()
					+ ", 婚姻状况 : " + person.getMaritalStatus()
					+ " ]");
		}
		System.out.println("-----------------------------------------------------------------");
	}
}
```
**程序运行结果如下：**
```
原始数据：
Person(name=张三, gender=女, maritalStatus=单身)
Person(name=王二, gender=男, maritalStatus=已婚)
Person(name=李静, gender=女, maritalStatus=单身)
Person(name=张三丰, gender=男, maritalStatus=单身)
Person(name=张无忌, gender=男, maritalStatus=已婚)
Person(name=谢逊, gender=男, maritalStatus=单身)
Person(name=赵敏, gender=女, maritalStatus=已婚)
-----------------------------------------------------------------
过滤出男人:
人 : [ 姓名 : 王二, 性别 : 男, 婚姻状况 : 已婚 ]
人 : [ 姓名 : 张三丰, 性别 : 男, 婚姻状况 : 单身 ]
人 : [ 姓名 : 张无忌, 性别 : 男, 婚姻状况 : 已婚 ]
人 : [ 姓名 : 谢逊, 性别 : 男, 婚姻状况 : 单身 ]
-----------------------------------------------------------------
过滤出女人:
人 : [ 姓名 : 张三, 性别 : 女, 婚姻状况 : 单身 ]
人 : [ 姓名 : 李静, 性别 : 女, 婚姻状况 : 单身 ]
人 : [ 姓名 : 赵敏, 性别 : 女, 婚姻状况 : 已婚 ]
-----------------------------------------------------------------
过滤出单身的人:
人 : [ 姓名 : 张三, 性别 : 女, 婚姻状况 : 单身 ]
人 : [ 姓名 : 李静, 性别 : 女, 婚姻状况 : 单身 ]
人 : [ 姓名 : 张三丰, 性别 : 男, 婚姻状况 : 单身 ]
人 : [ 姓名 : 谢逊, 性别 : 男, 婚姻状况 : 单身 ]
-----------------------------------------------------------------
过滤出单身的男性:
人 : [ 姓名 : 张三丰, 性别 : 男, 婚姻状况 : 单身 ]
人 : [ 姓名 : 谢逊, 性别 : 男, 婚姻状况 : 单身 ]
-----------------------------------------------------------------
筛选出是单身或者是男性的集合：
人 : [ 姓名 : 张三, 性别 : 女, 婚姻状况 : 单身 ]
人 : [ 姓名 : 李静, 性别 : 女, 婚姻状况 : 单身 ]
人 : [ 姓名 : 张三丰, 性别 : 男, 婚姻状况 : 单身 ]
人 : [ 姓名 : 谢逊, 性别 : 男, 婚姻状况 : 单身 ]
人 : [ 姓名 : 王二, 性别 : 男, 婚姻状况 : 已婚 ]
人 : [ 姓名 : 张无忌, 性别 : 男, 婚姻状况 : 已婚 ]
-----------------------------------------------------------------
筛选出是单身男性,并且姓张的人：
人 : [ 姓名 : 张三丰, 性别 : 男, 婚姻状况 : 单身 ]
-----------------------------------------------------------------
筛选出是单身男性,或者姓张的人：
人 : [ 姓名 : 张三丰, 性别 : 男, 婚姻状况 : 单身 ]
人 : [ 姓名 : 谢逊, 性别 : 男, 婚姻状况 : 单身 ]
人 : [ 姓名 : 张三, 性别 : 女, 婚姻状况 : 单身 ]
人 : [ 姓名 : 张无忌, 性别 : 男, 婚姻状况 : 已婚 ]
-----------------------------------------------------------------
```
### 3.4 组合模式(Composite( [kəmˈpɑːzət] ) Pattern)
#### 3.4.1 特点&优点&缺点&适用场景
> 主要解决
* 在树形结构中，模糊了简单元素和复杂元素的概念，客户程序可以像处理简单元素那样处理复杂的元素，从而使得客户程序和复杂元素的内部结构解耦

> 优点
* 高层模块调用简单
* 层级节点可以无限自由添加

> 缺点
* 树枝和树叶都直接使用的实现类，这在面向接口编程中是不恰当的，违反了依赖倒置的原则（依赖倒置核心思想，面向接口编程，不要面向实现编程，高层模块不能依赖低层模块，应该依赖其抽象，实现应该依赖抽象）

> 适用场景
* 树形菜单栏，文件夹的管理等

#### 3.4.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F-UML.png)

#### 3.4.3 代码
[组合模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建 *Employee* 类，该类带有 *Employee* 对象的列表**

```java
/**
 * 人员信息实体
 */
public class Employee {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 部门
	 */
	private String dept;
	/**
	 * 薪资
	 */
	private int salary;
	/**
	 * 下属-儿子节点
	 */
	private List<Employee> subordinates;

	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<>();
	}

	public void add(Employee employee) {
		subordinates.add(employee);
	}

	public void remove(Employee employee) {
		subordinates.remove(employee);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return ("Employee :[ 姓名 : " + name
				+ ", 部门 : " + dept + ", 薪资 :"
				+ salary + " ]");
	}
}
```
**步骤2：使用 *Employee* 类来创建和打印员工的层次结构**

```java
/**
 * 组合模式-树形图
 */
public class CompositePatternDemo {
	public static void main(String[] args) {
		// 老板
		Employee ceo = new Employee("刘备", "蜀国", 99999999);
		// 老板直接下属
		Employee zhangfei = new Employee("张飞", "战区1", 1000000);
		Employee guanyu = new Employee("关羽", "战区2", 1000000);
		Employee zhugeliang = new Employee("诸葛亮", "指挥部", 2000000);
		// 张飞下属
		Employee zhang1 = new Employee("张一", "战区1", 1000);
		Employee zhang2 = new Employee("张二", "战区1", 1000);
		Employee zhang3 = new Employee("张三", "战区1", 1000);
		Employee zhang4 = new Employee("张四", "战区1", 1000);
		// 关羽下属
		Employee guan1 = new Employee("关一", "战区2", 500);
		Employee guan2 = new Employee("关二", "战区2", 500);
		Employee guan3 = new Employee("关三", "战区2", 500);
		Employee guan4 = new Employee("关四", "战区2", 500);
		// 诸葛亮下属
		Employee zhuge1 = new Employee("诸葛一", "指挥部", 2000);
		Employee zhuge2 = new Employee("诸葛二", "指挥部", 2000);
		Employee zhuge3 = new Employee("诸葛三", "指挥部", 2000);
		Employee zhuge4 = new Employee("诸葛四", "指挥部", 2000);
		// 刘备直接下属人员
		ceo.add(zhangfei);
		ceo.add(guanyu);
		ceo.add(zhugeliang);
		// 张飞下属
		zhangfei.add(zhang1);
		zhangfei.add(zhang2);
		zhangfei.add(zhang3);
		zhangfei.add(zhang4);
		// 关羽下属
		guanyu.add(guan1);
		guanyu.add(guan2);
		guanyu.add(guan3);
		guanyu.add(guan4);
		// 诸葛亮下属
		zhugeliang.add(zhuge1);
		zhugeliang.add(zhuge2);
		zhugeliang.add(zhuge3);
		zhugeliang.add(zhuge4);
		// 打印整个组织下的员工
		System.out.println("-老板" + ceo);
		for (Employee employee : ceo.getSubordinates()) {
			System.out.println("--领导：" + employee.getName());
			for (Employee item : employee.getSubordinates()) {
				System.out.println("---" + item);
			}
		}
	}
}
```
**程序运行结果如下：**
```
-老板Employee :[ 姓名 : 刘备, 部门 : 蜀国, 薪资 :99999999 ]
--领导：张飞
---Employee :[ 姓名 : 张一, 部门 : 战区1, 薪资 :1000 ]
---Employee :[ 姓名 : 张二, 部门 : 战区1, 薪资 :1000 ]
---Employee :[ 姓名 : 张三, 部门 : 战区1, 薪资 :1000 ]
---Employee :[ 姓名 : 张四, 部门 : 战区1, 薪资 :1000 ]
--领导：关羽
---Employee :[ 姓名 : 关一, 部门 : 战区2, 薪资 :500 ]
---Employee :[ 姓名 : 关二, 部门 : 战区2, 薪资 :500 ]
---Employee :[ 姓名 : 关三, 部门 : 战区2, 薪资 :500 ]
---Employee :[ 姓名 : 关四, 部门 : 战区2, 薪资 :500 ]
--领导：诸葛亮
---Employee :[ 姓名 : 诸葛一, 部门 : 指挥部, 薪资 :2000 ]
---Employee :[ 姓名 : 诸葛二, 部门 : 指挥部, 薪资 :2000 ]
---Employee :[ 姓名 : 诸葛三, 部门 : 指挥部, 薪资 :2000 ]
---Employee :[ 姓名 : 诸葛四, 部门 : 指挥部, 薪资 :2000 ]
```
### 3.5 装饰器模式(Decorator( [ˈdekəreɪtər]) Pattern)
#### 3.5.1 特点&优点&缺点&适用场景
>说明
* 装饰器模式，允许向一个现有的对象添加新的功能，同时又不改变骑结构，这种属于结构型模式，他是作为现有类的一个包装
* 这种类是一个装饰类，用来包装现有的类，并在保持类方法签名完整性的前提下，提供了额外的功能

> 主要解决
* 一般我们需要扩展一个类的功能的时候都是使用的继承的方式，继承属于静态方式，如果扩展的方法特别多，子类就会膨胀，越积越多，可能有好几千行，我们可以创建多个包装类，去装饰原始类，不同的包装类实现的功能不一样，这样就能通过增加装饰类的方式来减少单个类膨胀的问题
* 当我们想扩展一个类的功能，或者我们想动态的给一个已存在的类增加额外功能，动态撤销功能就可以使用装饰器模式
* 装饰器可以代替继承

> 优点
* 装饰器比类继承灵活，在不改变原有对象的情况下，动态的给一个对象加新的方法或让原有的方法支持额外的功能，即插即用
* 通过组合不同的装饰类，可以实现不同的效果 
* 完全遵循开闭原则，不修改被装饰类的前提下，给他增加额外的功能
* 装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰类可以动态得扩展一个实现类的功能

> 缺点
* 装饰器可以多层嵌套使用，会比较复杂，不容易理解

```java
// 多层嵌套会比较复杂，最里面的Circle是被包装的类，装饰器可以无限嵌套  
ShapeDecorator redCircle1 = new RedShapeDecorator(new RedShapeDecorator(new RedShapeDecorator(new Circle())));
```


> 适用场景
* 扩展一个已存在的类
* 动态增加额外功能，动态撤销

#### 3.5.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E8%A3%85%E9%A5%B0%E5%99%A8%E6%A8%A1%E5%BC%8F-UML.png)

#### 3.5.3 代码
[装饰器模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建一个图形接口**

```java
/**
 * 图形接口
 */
public interface Shape {
	/**
	 * 画图形
	 */
	void draw();
}
```
**步骤2：创建实现图形接口的实体类**

```java
/**
 * 圆形
 */
public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("shape:圆形");
	}
}
/**
 * 矩形
 */
public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("shape:矩形");
	}
}
```
**步骤3：创建实现了 *Shape* 接口的抽象装饰类**

```java
/**
 * 装饰器抽象类
 */
public abstract class ShapeDecorator implements Shape {
	/**
	 * 被装饰的类
	 */
	protected Shape shape;

	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}

	/**
	 * 被装饰的方法
	 * 例：装饰A类，装饰器和A类都要实现同一个接口，装饰A类，需要把被装饰类A类的所有方法暴露出去，所有要用到接口约束强迫装饰类必须实现方法
	 */
	@Override
	public void draw() {
		this.shape.draw();
	}
}
```
**步骤4：创建扩展了 *ShapeDecorator* 类的实体装饰类**

```java
/**
 * 装饰类的具体实现
 */
public class RedShapeDecorator extends ShapeDecorator {
	/**
	 * 被装饰的类
	 *
	 * @param shape
	 */
	public RedShapeDecorator(Shape shape) {
		super(shape);
	}

	/**
	 * 被装饰的类的方法
	 */
	@Override
	public void draw() {
		this.shape.draw();
		// 给draw方法增加装饰的方法
		setRedBorder(shape);
	}

	/**
	 * 给图形画边框
	 *
	 * @param decoratedShape
	 */
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("给圆形增加一个红色边框");
	}
}
```
**步骤5：使用 *RedShapeDecorator* 来装饰 *Shape* 对象**

```java
/**
 * 装饰器模式
 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Shape shape = new Circle();
		System.out.println("原始的圆形对象：");
		shape.draw();

		System.out.println("-------------------------");
		System.out.println("红色的圆形装饰之后的对象：");
		ShapeDecorator redCircle = new RedShapeDecorator(shape);
		redCircle.draw();

		System.out.println("-------------------------");
		System.out.println("被多个装饰器嵌套包装之后的对象：");
		ShapeDecorator redCircle1 = new RedShapeDecorator(new RedShapeDecorator(new RedShapeDecorator(new Circle())));
		redCircle1.draw();
		System.out.println("总结：可以看到装饰器自定义方法setRedBorder()被调用了3次");
	}
}
```
**程序运行结果如下：**

```
原始的圆形对象：
画一个圆形
-------------------------
红色的圆形装饰之后的对象：
画一个圆形
给圆形增加一个红色边框
-------------------------
被多个装饰器嵌套包装之后的对象：
画一个圆形
给圆形增加一个红色边框
给圆形增加一个红色边框
给圆形增加一个红色边框
总结：可以看到装饰器自定义方法setRedBorder()被调用了3次
```
### 3.6 外观模式(Facade([fəˈsɑːd]) Pattern)
#### 3.6.1 特点&优点&缺点&适用场景
>说明
* 外观模式隐藏系统的复杂性，提供一个客户端给开发者调用，简化提供服务的系统的复杂性，开发者只需要关注客户端提供的api即可。
* 创建一个类，提供对现有系统的委托调用

> 主要解决
* 降低访问复杂系统的内部子系统时的复杂度，简化客户端之间的接口

> 优点
* 减少系统相互依赖，使得子系统的变化不会影响到其他客户类
* 对客户屏蔽了子系统组件，减少了客户处理的对象数目，并使得子系统使用起来更加容易，都由客户类包装好了，调用简单
* 提高了安全性，低水平开发者也能简单使用

> 缺点
* 增加新的子系统可能需要修改外观类或者客户端代码，违背了“开闭原则”

> 适用场景
* 为复杂的模块或者子系统提供外界访问的模块
* 预防低水平人员使用子系统功能不当导致的风险

#### 3.6.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8F-UML.png)

#### 3.6.3 代码
[外观模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建一个图形接口**

```java
/**
 * 图形接口
 */
public interface Shape {
	/**
	 * 画图
	 */
	void draw();
}
```
**步骤2：创建实现图形接口的实体类**

```java
/**
 * 圆形
 */
public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("画圆形");
	}
}
/**
 * 正方形
 */
public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("画正方形");
	}
}
/**
 * 矩形
 */
public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("画矩形");
	}
}
```
**步骤3：创建一个外观类**

```java
/**
 * 外观类
 * 把多个对象封装到一个外观类里调用
 */
public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Rectangle();
	}

	/**
	 * 画圆形
	 */
	public void drawCircle() {
		circle.draw();
	}

	/**
	 * 画矩形
	 */
	public void drawRectangle() {
		rectangle.draw();
	}

	/**
	 * 画正方形
	 */
	public void drawSquare() {
		square.draw();
	}
}
```
**步骤4：使用该外观类画出各种类型的形状**

```java
/**
 * 外观模式
 * 医院排队，挂号，就诊，缴费，取药流程比较复杂，搞一个接待员去帮病人去做这些事会简单很多
 * 预防低水平开发人员带来的风险
 */
public class FacadePatternDemo {
	public static void main(String[] args) {
		// 把一些复杂的方法包装起来提供一个客户端给开发者调用
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
```
**程序运行结果如下：**
```
画圆形
画矩形
画矩形
```
### 3.7 享元模式(Flyweight([ˈflaɪweɪt]) Pattern)

#### 3.7.1 特点&优点&缺点&适用场景
>说明
* 享元模式主要用来减少创建对象的数量，以减少内存占用和提高性能，这种设计模式属于结构型模式，享元模式尝试重用现有的同类对象，如果没有找到匹配的对象就重新创建一个新的，并放到对象池中，下次再取就不用重新创建了。

> 主要解决
* 在有大量对象时，有可能会造成内存溢出，我们可以共同的对象抽离出来放到对象map里，取的时候如果有相同的对象就不用再重新创建了，避免了重复创建，节省内存开销，提升程序性能

> 优点
* 大大减少对象的创建，减少进程占用内存，使程序运行效率提升

> 缺点
* 对象共享之后，需要将一些不能共享的状态外部化，这将增加程序复杂性
* 读取享元模式的外部状态，会使得程序运行时间变长

> 享元模式组成
* 享元模式的对象信息分为2个部分：内部状态和外部状态
* 内部状态：指的是共享的信息，存储在享元信息内部，并且不会随环境的改变而改变
* 外部状态：指的对象依赖的一个标记状态，随环境变化，不能共享

比如连接池中的连接对象，保存在连接对象中的用户名、密码、连接url等信息，在对象被创建的时候就生成好了，不会随着环境变化而改变，这些就被称为“内部状态”，而当每个连接被回收利用时，我们需要将它标记位可用状态，这些为外部状态

> 适用场景
* 系统有大量的相似对象
* 需要缓冲池的场景

> 注意事项
* 需要注意划分外部状态和内部状态，否则可能会发生线程安全问题
* 这些类必须有一个工厂对象加以控制

#### 3.7.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E4%BA%AB%E5%85%83%E6%A8%A1%E5%BC%8F-UML.png)

#### 3.7.3 代码
[享元模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建一个图形接口**

```java
/**
 * 图形接口
 */
public interface Shape {
	/**
	 * 画图
	 */
	void draw();
}
```
**步骤2：创建实现图形接口的实体类**

```java
/**
 * 圆形
 */
@Data
public class Circle implements Shape {
	private String color;
	private int x;
	private int y;
	private int radius;

	public Circle(String color) {
		this.color = color;
		this.setX((int) (Math.random() * 100));
		this.setY((int) (Math.random() * 100));
		this.setRadius((int) (Math.random() * 100));
	}

	@Override
	public void draw() {
		System.out.println("圆形: Draw() [Color : " + color
				+ ", x : " + x + ", y :" + y + ", radius :" + radius);
	}
}
```
**步骤3：创建一个工厂，生成基于给定信息的实体类的对象**

```java
/**
 * 图形工厂
 */
public class ShapeFactory {
	// 如果是对象池的场景，最好使用堆栈，后进先出
	private static final HashMap<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {
		// 从对象池里面取对象
		Shape circle = circleMap.get(color);
		if (circle == null) {
			// 如果没有取到旧生成一个新的对象丢进对象池中
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("创建了一个新对象圆形，它的颜色是：" + color);
		}
		return circle;
	}
}
```
**步骤4：使用该工厂，通过传递颜色信息来获取实体类的对象**

```java
/**
 * 享元模式
 */
public class FlyweightPatternDemo {
	private static final String colors[] =
			{"Red", "Green", "Blue", "White", "Black"};

	public static void main(String[] args) {

		for (int i = 0; i < 20; ++i) {
			Circle circle =
					(Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
```
**程序运行结果如下：**
```
创建了一个新对象圆形，它的颜色是：White
圆形: Draw() [Color : White, x : 31, y :1, radius :100
创建了一个新对象圆形，它的颜色是：Black
圆形: Draw() [Color : Black, x : 22, y :22, radius :100
创建了一个新对象圆形，它的颜色是：Blue
圆形: Draw() [Color : Blue, x : 92, y :61, radius :100
创建了一个新对象圆形，它的颜色是：Red
圆形: Draw() [Color : Red, x : 44, y :65, radius :100
圆形: Draw() [Color : White, x : 31, y :31, radius :100
圆形: Draw() [Color : White, x : 49, y :41, radius :100
创建了一个新对象圆形，它的颜色是：Green
圆形: Draw() [Color : Green, x : 65, y :13, radius :100
圆形: Draw() [Color : Blue, x : 38, y :27, radius :100
圆形: Draw() [Color : Blue, x : 49, y :29, radius :100
圆形: Draw() [Color : Black, x : 85, y :83, radius :100
圆形: Draw() [Color : Black, x : 71, y :20, radius :100
圆形: Draw() [Color : Red, x : 49, y :99, radius :100
圆形: Draw() [Color : Green, x : 68, y :67, radius :100
圆形: Draw() [Color : Green, x : 34, y :57, radius :100
圆形: Draw() [Color : Green, x : 39, y :77, radius :100
圆形: Draw() [Color : Black, x : 96, y :23, radius :100
圆形: Draw() [Color : Red, x : 99, y :33, radius :100
圆形: Draw() [Color : Red, x : 38, y :20, radius :100
圆形: Draw() [Color : Blue, x : 72, y :18, radius :100
圆形: Draw() [Color : Red, x : 45, y :95, radius :100
```

### 3.8 代理模式(Proxy([ˈprɑːksi] ) Pattern)
#### 3.8.1 特点&优点&缺点&适用场景
>说明
* 有些时候一个客户不想或者不能直接访问另一个对象，这个时候就需要一个中介来帮客户完成需求某项任务，这个中介就是代理对象
* 例如，购买火车票不一定非要去火车站买，可以通过12306网站、巴士管家、火车票代售站点去购买。又比如说找女朋友、找保姆、找工作、租房子等都可以通过中介完成

> 主要解决
* 一些对象无法直接访问，或者访问需要做一些权限控制、日志记录等操作时，我们可以在访问此对象时加上一个对此对象的访问层

> 优点
* 代理模式在客户端和目标对象之间加了一个中介，起到了保护目标对象的作用
* 代理对象可以扩展目标对象的功能，比如说spring的AOP切面就可以给目标对象加一些执行日志、调用的权限控制等
* 代理模式能将客户端和目标对象分离，起到了降低系统耦合，增加程序的可扩展性

> 缺点
* 在客户端和目标对象之间增加一个代理对象，会造成请求处理速度变慢
* 增加了系统复杂度
* 实现代理模式需要做额外的工作，有些代理模式的实现会比较复杂

> 适用场景
* 需要生成的对象具有复杂的内部结构（比如肯德基套餐，内部每个套餐项目都不一样薯条汉堡点心饮料等等，每个套餐项目的装配方式也不一样，有的用纸盒，有的用杯子）

> 注意事项
* 代理模式和适配器的区别：适配器模式主要是改变对象的接口，让2个不相干的接口可以干同一件事（HDMI转VGA，PS2转USB）而代理模式不能改变类的接口，只是作为一个中介去帮忙访问目标对象
* 代理模式和装饰器模式的区别（这俩的界限确实比较模糊）：装饰器模式强调的是增强自身，在被装饰之后你可以使用增强后的功能，增强后你还是你，只不过变强了。代理模式强调的是让别人帮你做一些和你本身业务无关的事（日志记录、设置缓存、调用频率限制）代理模式是为了实现对对象的控制，因为被代理的对象一般比较难获得，或者是不想暴露出来的（比如网关代理服务器，后面的应用服务是不能被直接调用的，需要经过代理网关，网关要做权限控制）
* 装饰器模式是增强目标对象本身，而代理模式是对目标对象加以控制，并不对对象本身的功能进行增强（加日志和设置缓存等也只是加了一层控制，并没有增强目标对象本身，装饰器是增强了目标对象本身）


#### 3.8.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F-UML.png)

#### 3.8.3 代码
[代理模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建一个接口**

```java
/**
 * 图像接口
 */
public interface Image {
	/**
	 * 展示
	 */
	void display();
}
```
**步骤2：创建实现接口的实体类**

```java
/**
 * 目标对象，被代理对象
 */
public class RealImage implements Image {
	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(this.fileName);
	}

	@Override
	public void display() {
		System.out.println("展示：" + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("首次初始化图像，加载文件：" + fileName);
	}
}
/**
 * 代理类
 */
public class ProxyImage implements Image {
	private String fileName;
	private RealImage realImage;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		// 如果被代理对象是null，就new一个目标对象
		if (realImage == null) {
			realImage = new RealImage(this.fileName);
			System.out.println("初始化被代理类");
		} else {
			System.out.println("被代理类已经初始化");
		}
		// 拥有被代理对象的上下文
		// 调用被代理目标对象的方法
		realImage.display();
	}
}
```
**步骤3：当被请求时，使用 *ProxyImage* 来获取 *RealImage* 类的对象**

```java
/**
 * 代理模式
 * 有点类似java spring的AOP切面
 */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test.png");
		image.display();
		System.out.println("--------------------");
		System.out.println("在调用一次");
		System.out.println("--------------------");
		image.display();
	}
}
```
**程序运行结果如下：**
```
初始化被代理类
首次初始化图像，加载文件：test.png
展示：test.png
--------------------
在调用一次
--------------------
被代理类已经初始化
展示：test.png
```
## 4 行为型模式(Behavioral( [bɪ'heɪvjərəl]))(共12个，特殊：空对象模式)
> 这些设计模式特别关注对象之间的通信

### 4.1 责任链模式(Chain( [tʃeɪn] ) of Responsibility([rɪˌspɑːnsəˈbɪləti] ) Pattern)
#### 4.1.1 特点&优点&缺点&适用场景
>说明
* 责任链模式为请求创建了一个接收者对象的链，这种模式对请求的发送者和接收者进行解耦，这种类型的设计模式属于行为模式

> 主要解决
* 责任链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无需关心请求的处理细节和请求的传递，所以职责链将请求的发送和请求的处理者解耦了

> 优点
* 降低耦合度，他将请求的发送和解耦者解耦
* 简化了对象，使得对象不需要知道链的结构
* 增强责任链的灵活性，通过改变链内的成员或者调动他们的次序，允许动态的新增或者删除责任
* 增加新的处理类很方便

> 缺点
* 系统性能将受到一定影响，而且在代码调试时不太方便，因为嵌套的过深，不方便看当前调试到哪个层了
* 不容易观察运行时的特征，妨碍排查错误
* 不能保证请求一定被接收

> 适用场景
* 有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定
* 在不明确指定处理器的情况下，向多个处理器嵌套集合提交一个请求，最后被谁处理要看内部的处理器是否命中处理条件
* 可动态指定一组处理器处理请求
* java web中的多层拦截器就是使用的类似的设计模式
* 这种设计模式就跟大鱼吃小鱼一样，从最外面的大鱼进入肚子里的鱼的肚子里还有鱼，最后到最后一条小鱼

#### 4.1.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E8%B4%A3%E4%BB%BB%E9%93%BE%E6%A8%A1%E5%BC%8F-UML.png)

#### 4.1.3 代码
[责任链模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建简易的http请求包装类**

```java
/**
 * http 请求封装
 */
@Data
public class Request {
	/**
	 * 是否已授权
	 */
	Boolean authorization;
	/**
	 * xss验证是否通过
	 */
	Boolean xssAdopt;
	/**
	 * csrf验证是否通过
	 */
	Boolean csrfAdopt;
	/**
	 * 接口地址
	 */
	String url;
}
```
**步骤2：创建责任链抽象类-拦截器基类**

```java
/**
 * 责任链抽象
 * 拦截器基类
 */
@Data
public abstract class AbstractInterceptor {

	/**
	 * 下一个拦截器
	 */
	protected AbstractInterceptor nextInterceptor;

	/**
	 * 递归处理拦截器链条
	 *
	 * @param request
	 */
	public void handleRequest(Request request) {
		if (!handle(request)) {
			return;
		}
		if (nextInterceptor != null) {
			nextInterceptor.handleRequest(request);
		}
	}

	/**
	 * 每个拦截器的业务处理
	 *
	 * @param message
	 * @return
	 */
	protected abstract boolean handle(Request message);
}
```
**步骤3：创建AbstractInterceptor责任链抽象类的具体实现**

```java
/**
 * xss拦截器
 */
public class XssInterceptor extends AbstractInterceptor {

	@Override
	protected boolean handle(Request request) {
		System.out.println("xss拦截验证：" + (request.getXssAdopt() ? "验证通过" : "验证失败"));
		return request.getXssAdopt();
	}
}
/**
 * csrf拦截器
 */
public class CsrfInterceptor extends AbstractInterceptor {

	@Override
	protected boolean handle(Request request) {
		System.out.println("csrf拦截验证：" + (request.getCsrfAdopt() ? "验证通过" : "验证失败"));
		return request.getCsrfAdopt();
	}
}
/**
 * 会话拦截器
 */
public class AuthorizationInterceptor extends AbstractInterceptor {

	@Override
	protected boolean handle(Request request) {
		System.out.println("会话拦截：" + (request.getAuthorization() ? "验证通过" : "验证失败"));
		return request.getAuthorization();
	}
}
```
**步骤4：组装拦截器调用链，发起请求让调用链处理**

```java
/**
 * 责任链模式
 * 简易版的拦截器
 */
public class ChainOfResponsibilityPatternDemo {
	public static void main(String[] args) {
		// 组装拦截器调用链
		AbstractInterceptor abstractInterceptor = getInterceptors();
		// 创建一个请求
		Request request = new Request();

		// xss验证失败
		System.out.println("------------------------------------------------------");
		request.setXssAdopt(false).setCsrfAdopt(true).setAuthorization(true).setUrl("/order/save");
		System.out.println("发送请求：" + JSONObject.toJSONString(request));
		abstractInterceptor.handleRequest(request);

		// csrf验证失败
		System.out.println("------------------------------------------------------");
		request.setXssAdopt(true).setCsrfAdopt(false).setAuthorization(true).setUrl("/order/update");
		System.out.println("发送请求：" + JSONObject.toJSONString(request));
		abstractInterceptor.handleRequest(request);

		// 会话验证失败
		System.out.println("------------------------------------------------------");
		request.setXssAdopt(true).setCsrfAdopt(true).setAuthorization(false).setUrl("/order/update");
		System.out.println("发送请求：" + JSONObject.toJSONString(request));
		abstractInterceptor.handleRequest(request);

		// 所有拦截器验证通过
		System.out.println("------------------------------------------------------");
		request.setXssAdopt(true).setCsrfAdopt(true).setAuthorization(true).setUrl("/order/update");
		System.out.println("发送请求：" + JSONObject.toJSONString(request));
		abstractInterceptor.handleRequest(request);

	}

	/**
	 * 组装拦截器调用链
	 *
	 * @return
	 */
	private static AbstractInterceptor getInterceptors() {
		// 大鱼
		AbstractInterceptor xssInterceptor = new XssInterceptor();
		// 中鱼
		AbstractInterceptor csrfInterceptor = new CsrfInterceptor();
		// 小鱼
		AbstractInterceptor authorizationInterceptor = new AuthorizationInterceptor();

		// 大鱼吃中鱼
		xssInterceptor.setNextInterceptor(csrfInterceptor);
		// 中鱼吃小鱼
		csrfInterceptor.setNextInterceptor(authorizationInterceptor);

		// 返回大鱼，拦截器是一个单向链表结构，第一个节点可以一直往下遍历出所有的节点
		return xssInterceptor;
	}
}
```
**程序运行结果如下：**
```
------------------------------------------------------
发送请求：{"authorization":true,"csrfAdopt":true,"url":"/order/save","xssAdopt":false}
xss拦截验证：验证失败
------------------------------------------------------
发送请求：{"authorization":true,"csrfAdopt":false,"url":"/order/update","xssAdopt":true}
xss拦截验证：验证通过
csrf拦截验证：验证失败
------------------------------------------------------
发送请求：{"authorization":false,"csrfAdopt":true,"url":"/order/update","xssAdopt":true}
xss拦截验证：验证通过
csrf拦截验证：验证通过
会话拦截：验证失败
------------------------------------------------------
发送请求：{"authorization":true,"csrfAdopt":true,"url":"/order/update","xssAdopt":true}
xss拦截验证：验证通过
csrf拦截验证：验证通过
会话拦截：验证通过
```
### 4.2 命令模式(Command([kəˈmænd]) Pattern)
#### 4.2.1 特点&优点&缺点&适用场景
>说明
* 命令模式是一种数据驱动的设计模式，它属于行为型模式
* 命令模式是将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开，这样两者之间通过命令对象进行沟通，这样方便将命令对象进行储存、传递、调用、增加与管理
* 简单理解就是跟遥控器遥控电视机一样，用户操作遥控器命令，遥控器发送命令电视机执行

> 主要解决
* 在软件系统中，常常出现“方法的请求者”与“方法的实现者”之间存在紧密的耦合关系。这不利于软件功能的扩展与维护。例如，想对行为进行撤销、重做、记录等都很不方便，因此如何将方法的请求者与方法的实现者解耦(命令的发送与命令的执行解耦)，就很重要，命令模式就能解决这个问题
* 现实生活中，这样的例子也很多，例如：电视机遥控器（命令发送者）通过按钮（具体命令）来遥控电视机（命令接收者），还有计算机键盘上的功能键等

> 优点
* 降低系统耦合度，发送命令和接收命令解耦
* 扩展性好，新的命令很容易添加到系统中，命令集合中加一个方法，在写一个命令具体类调用这个方法，命令具体类发送给命令接收者即可
* 可以实现宏命令，命令模式和组合模式结合，将多个命令装配成一个组合命令，即宏命令
* 方便实现 “撤销”和“重做”。命令模式可以和 备忘录模式结合，实现命令的撤销与恢复
* 可以在现有命令的基础上，增加额外的功能，比如日志记录，结合装饰器模式会更加灵活

> 缺点
* 会产生很多命令类，因为每一个具体的操作命令都需要设计一个具体命令类，会增加系统的复杂性

> 适用场景
* 认为是命令的地方都可以使用命令模式，比如：1、GUI中每一个按钮都是一条命令

#### 4.2.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F-UML.png)

#### 4.2.3 代码
[命令模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建命令处理接口**

```java
/**
 * 命令处理接口
 * 订单实体
 */
public interface Order {
	/**
	 * 执行命令
	 */
	void execute();
}
```
**步骤2：创建命令操作集合封装**

```java
/**
 * 股票买入或卖出命令包装类
 * 命令操作集合封装
 */
public class Stock {
	/**
	 * 股票名称
	 */
	private String name = "ABC";
	/**
	 * 股票数量
	 */
	private int quantity = 10;

	/**
	 * 买股票操作
	 */
	public void buy() {
		System.out.println("股票 [名称：" + name + "数量：" + quantity + "] 购买");
	}

	/**
	 * 卖股票操作
	 */
	public void sell() {
		System.out.println("股票 [名称：" + name + "数量：" + quantity + "] 出售");
	}
}
```
**步骤3：创建实现了 *Order* 命令处理接口的实体类**

```java
/**
 * 购买股票命令
 * 具体使用哪种命令
 */
public class BuyStock implements Order {
	/**
	 * 命令操作集合
	 */
	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	/**
	 * 购买股票
	 */
	@Override
	public void execute() {
		abcStock.buy();
	}
}
/**
 * 出售股票命令
 * 具体使用哪种命令
 */
public class SellStock implements Order {
	/**
	 * 命令操作集合
	 */
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	/**
	 * 出售股票
	 */
	@Override
	public void execute() {
		abcStock.sell();
	}
}
```
**步骤4：创建命令管理类**

```java
/**
 * 命令的接收并处理
 */
public class Broker {
	/**
	 * 待处理命令操作集合
	 */
	private List<Order> orderList = new ArrayList<>();

	/**
	 * 接收命令
	 *
	 * @param order
	 */
	public void takeOrder(Order order) {
		orderList.add(order);
	}

	/**
	 * 下订单
	 * 遍历命令并执行
	 */
	public void placeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
```
**步骤5：使用 Broker 命令管理类来接受并执行命令**

```java
/**
 * 命令发送者
 */
public class CommandPatternDemo {
	public static void main(String[] args) {
		// 命令操作集合
		Stock abcStock = new Stock();
		// 具体的命令
		// 购买股票命令
		Order buyStockOrder = new BuyStock(abcStock);
		// 出售股票命令
		Order sellStockOrder = new SellStock(abcStock);

		// 定义一个命令管理类
		Broker broker = new Broker();
		// 添加购买股票命令到命令管理类
		broker.takeOrder(buyStockOrder);
		// 添加出售股票命令到命令管理类
		broker.takeOrder(sellStockOrder);

		// 处理订单
		broker.placeOrders();
	}
}
```
**程序运行结果如下：**
```
添加购买股票命令
添加出售股票命令
处理命令操作
股票 [名称：ABC数量：10] 购买
股票 [名称：ABC数量：10] 出售
```
### 4.3 解释器模式(Interpreter([ɪnˈtɜrprətər]) Pattern)
#### 4.3.1 特点&优点&缺点&适用场景
>说明
* 给分析对象定义一个语言，并定义该语言的文法表示，再设计一个解释器来解释语言中的句子。
* 也就是说，用编译语言的方式来分析应用中的实例，这种模式实现了文法表达式处理的接口，该接口解释一个特定的上下文

> 这里提到的文法和句子的概念和编译原理中的相同 
* 文法：语言的语法规则
* 句子：语言集中的元素，例如，汉语中的句子有很多，“我是中国人”是其中一个句子，可以用一棵语法树来直观的描述语言中的句子

> 主要解决
* 对于一些固定的文法构建一个解释句子的解释器

> 优点
* 扩展性好，由于在解释器模式中使用表达式类来表示语言的文法规则，因此可以通过继承等机制改变或者扩展文法
* 容易实现，在语法树中的每个表达式节点类都是相似的，所以实现其文法较为容易

> 缺点
* 执行效率低，解释器中通常使用循环和递归调用，当解释的句子较为复杂，速度就会很慢，且代码调试起来比较麻烦
* 会引起类膨胀。解释器模式中每个规则都要定义一个类，当包含的文法规则很多时，类的个数急剧增加，导致系统难以维护和管理
* 可应用的场景少，在软件开发中，需要定义语言文法的应用实例非常少，所以这种设计模式很少被使用到

> 适用场景
* 可以将一个需要解释执行的语言中的句子表示为一个抽象语法树
* 一些重复出现的问题可以用一种简单的语言进行表达
* 一个简单语法需要解释的场景

#### 4.3.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E8%A7%A3%E9%87%8A%E5%99%A8%E6%A8%A1%E5%BC%8F-UML.png)

#### 4.3.3 代码
[解释器模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建一个表达式接口**

```java
/**
 * 表达式
 */
public interface Expression {
	/**
	 * 翻译
	 *
	 * @param context 上下文
	 * @return 返回解释结果
	 */
	public boolean interpret(String context);
}
```
**步骤2：创建实现了上述接口的实体类**

```java
/**
 * 字符串包含计算表达式
 */
public class TerminalExpression implements Expression {
	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if (context.contains(data)) {
			return true;
		}
		return false;
	}
}
/**
 * 与运算表达式
 */
public class AndExpression implements Expression {
	private Expression expr1 = null;
	private Expression expr2 = null;

	public AndExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpret(String context) {
		return expr1.interpret(context) && expr2.interpret(context);
	}
}
/**
 * 或运算表达式
 */
public class OrExpression implements Expression {
	private Expression expr1 = null;
	private Expression expr2 = null;

	public OrExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpret(String context) {
		return expr1.interpret(context) || expr2.interpret(context);
	}
}
```
**步骤3：*InterpreterPatternDemo* 使用 *Expression* 类来创建规则，并解析它们**

```java
/**
 * 解释器模式
 */
public class InterpreterPatternDemo {
	/**
	 * 规则：罗伯特和约翰是男性
	 *
	 * @return
	 */
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("罗伯特");
		Expression john = new TerminalExpression("约翰");
		return new OrExpression(robert, john);
	}

	/**
	 * 规则：朱莉是一个已婚的女性
	 *
	 * @return
	 */
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("朱莉");
		Expression married = new TerminalExpression("已婚");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {
		// 获取规则：罗伯特和约翰是男性
		Expression isMale = getMaleExpression();
		// 获取规则：朱莉是一个已婚的女性
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("约翰是男性吗？" + isMale.interpret("约翰"));
		System.out.println("张三是男性吗？" + isMale.interpret("张三"));
		System.out.println("朱莉是已婚女性吗？" + isMarriedWoman.interpret("朱莉已婚"));
		System.out.println("朱莉是已婚女性吗？" + isMarriedWoman.interpret("张三已婚"));
	}
}
```
**程序运行结果如下：**

```
约翰是男性吗？true
张三是男性吗？false
朱莉是已婚女性吗？true
朱莉是已婚女性吗？false
```
### 4.4 迭代器模式(Iterator([ætəri:tə]) Pattern)
#### 4.4.1 特点&优点&缺点&适用场景
>说明
* 迭代器模式，这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示

> 主要解决
* 不同的方式来遍历整个集合

> 优点
* 访问一个聚合对象的内容而无需暴露它的内部表示
* 遍历任务交给迭代器完成，简化了聚合类
* 它支持以不同方式遍历一个聚合，也可以实现Iterator接口自定义一个迭代器以支持新的遍历方式
* 增加新的聚合类和迭代器都很方便，无需修改原有代码
* 封装性良好，为遍历不同的聚合结构提供一个统一的接口（新建一个集合类型，迭代器可以自定义一个）

> 缺点
* 增加了类的个数，这在一定程度上增加了系统的复杂性

> 适用场景
* 访问一个聚合对象的内容而无需暴露它的内部细节
* 需要为聚合对象提供多种遍历方式
* 为遍历不同的聚合机构提供一个统一的接口

#### 4.4.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E8%BF%AD%E4%BB%A3%E5%99%A8%E6%A8%A1%E5%BC%8F-UML.png)

#### 4.4.3 代码
[迭代器模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建迭代器接口**

```java
/**
 * 迭代器接口
 */
public interface Iterator {
	/**
	 * 获取是否有下一个元素
	 *
	 * @return
	 */
	public boolean hasNext();

	/**
	 * 获取下一个元素
	 *
	 * @return
	 */
	public Object next();
}
/**
 * 集合对象接口
 */
public interface Collection {
	/**
	 * 获取迭代器
	 *
	 * @return
	 */
	Iterator getIterator();
}
```
**步骤2：创建实现了 *Collection* 接口的实体类。该类有实现了 *Iterator* 接口的内部类 *NameIterator***

```java
/**
 * ArrayList集合对象
 *
 * @param <E>
 */
public class ArrayList<E> implements Collection {
	/**
	 * 集合的数据源
	 * JDK的ArrayList内部是使用数组实现的，这边使用List模拟
	 */
	public List<E> names = new java.util.ArrayList<>();
	int index;

	/**
	 * 添加一个元素
	 *
	 * @param e
	 */
	public void add(E e) {
		names.add(e);
	}

	/**
	 * 获取迭代器，通过迭代器去遍历集合的数据源
	 *
	 * @return
	 */
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	/**
	 * 获取是否存在下一个元素
	 */
	private class NameIterator implements Iterator {

		/**
		 * 是否
		 *
		 * @return
		 */
		@Override
		public boolean hasNext() {
			if (index < names.size()) {
				return true;
			}
			return false;
		}

		/**
		 * 获取下一个元素
		 *
		 * @return
		 */
		@Override
		public Object next() {
			if (this.hasNext()) {
				return names.get(index++);
			}
			return null;
		}
	}
}
```
**步骤3：使用 *NameRepository* 来获取迭代器，并打印名字**

```java
/**
 * 迭代器模式
 * 用迭代器模式设计一个简易的ArrayList集合
 */
public class IteratorPatternDemo {
	public static void main(String[] args) {
		System.out.println("定义自定义的ArrayList集合");
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println("添加元素a,b,c");
		// 获取迭代器
		Iterator iterator = list.getIterator();
		System.out.println("获取ArrayList迭代器");
		// 判断迭代器是否存在下一个元素
		while (iterator.hasNext()) {
			// 从第一个开始返回元素
			System.out.println("获取元素：" + iterator.next());
		}
	}
}
```
**程序运行结果如下：**
```
定义自定义的ArrayList集合
添加元素a,b,c
获取ArrayList迭代器
获取元素：a
获取元素：b
获取元素：c
```
### 4.5 中介者模式(Mediator([ˈmiːdieɪtər]) Pattern)
#### 4.5.1 特点&优点&缺点&适用场景
>说明
* 中介者模式是一种行为模式
* 生活中，常常会出现对象之间存在复杂的交互关系，这种关系叫做“网状结构”，它要求每个对象都必须知道它需要交互的对象，例如，每个人必须记住他所有朋友的电话，而且，朋友中有人的电话修改了，他必须让朋友们全部修改，这叫做”牵一发而动全身“，非常复杂
* 我们可以使用中介者模式来降低“耦合性”，这时只要找一个中介就可以了，只需要在网上建立一个每个朋友都能看到的通信录就解决了。
* 类似例子很多，比如房产中介，招聘平台

> 主要解决
* 对象与对象之间存在大量的关联关系，这样会导致系统结构太复杂，我们可以使用一个中间人的角色，通过中间人进行类和类之间的通信

> 优点
* 类之间各司其职，符合迪米特法则
* 降低了对象之间的耦合性，使得对象易于独立地被复用
* 将对象间的一对多关联（卖家>多个买家）转变为一对一的关联（卖家>中介 或 买家>中介），提高系统的灵活性，使得系统易于维护和扩展

> 缺点
* 中介者模式将原本多个对象直接相互依赖的关系转变成了中介者和多个同事类的依赖关系。当同事类越多时，中介者就会越臃肿，变得复杂且难以维护

> 适用场景
* 系统中对象之间存在比较复杂的引用关系，导致他们之间的依赖关系结构混乱而且难以复用对象
* 想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类
* 房产中介、招聘平台等交易逻辑就可以参考中介者模式

#### 4.5.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E4%B8%AD%E4%BB%8B%E8%80%85%E6%A8%A1%E5%BC%8F-UML.png)

#### 4.5.3 代码
[中介者模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建一个中介的客户抽象类**

```java
/**
 * 中介的客户抽象类
 */
public abstract class Colleague {
	/**
	 * 中介者
	 */
	protected Mediator mediator;

	/**
	 * 给客户对象一个属性用来存放中介对象
	 * 一方可以通过中介对象告知另一方（房产交易中的买卖双方）
	 *
	 * @param mediator
	 */
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	/**
	 * 接收其他客户的消息
	 */
	public abstract void receive();

	/**
	 * 发送消息给其他客户
	 */
	public abstract void send();
}
```
**步骤2：创建具体的中介客户类买家和卖家**

```java
/**
 * 买家
 */
public class ColleagueA extends Colleague {
	@Override
	public void receive() {
		System.out.println("买家：现在就可以签合同");
	}

	@Override
	public void send() {
		System.out.println("买家：便宜10万我就买");
		// 请中介者转发请求
		mediator.relay(this);
	}
}
/**
 * 卖家
 */
public class ColleagueB extends Colleague{
	@Override
	public void receive() {
		System.out.println("卖家：好的，没有问题");
	}

	@Override
	public void send() {
		System.out.println("卖家：啥时候签合同");
		// 请中介者转发请求
		mediator.relay(this);
	}
}
```
**步骤3：创建一个抽象的中介**

```java
/**
 * 抽象中介者
 */
public abstract class Mediator {
	/**
	 * 注册客户
	 * @param colleague
	 */
	public abstract void register(Colleague colleague);

	/**
	 * 给除自己以外的所有客户发送消息
	 * @param colleague
	 */
	public abstract void relay(Colleague colleague);
}
```
**步骤4：创建房产中介具体实现类**

```java
/**
 * 房产中介
 */
public class ConcreteMediator extends Mediator {
	/**
	 * 客户列表
	 */
	private List<Colleague> colleagues = new ArrayList<>();

	/**
	 * 注册客户
	 *
	 * @param colleague
	 */
	@Override
	public void register(Colleague colleague) {
		if (!colleagues.contains(colleague)) {
			// 把客户加到列表里
			colleagues.add(colleague);
			// 设置中介者
			colleague.setMediator(this);
		}
	}

	/**
	 * 转发给另一个客户
	 *
	 * @param colleague
	 */
	@Override
	public void relay(Colleague colleague) {
		for (Colleague ob :colleagues){
			if(!ob.equals(colleague)){
				// 给除自己以外的所有客户发送消息
				ob.receive();
			}
		}
	}
}
```
**步骤5：创建一个中介让买家和卖家通过中介沟通**

```java
/**
 * 中介者模式
 * 模拟一个房产交易过程中买家和卖家的交易行为
 */
public class MediatorPatternDemo {
	public static void main(String[] args) {
		// 定义一个中介
		Mediator mediator = new ConcreteMediator();
		// 买家
		Colleague colleagueA = new ColleagueA();
		// 卖家
		Colleague colleagueB = new ColleagueB();
		// 把买家注册进来
		mediator.register(colleagueA);
		// 把卖家注册进来
		mediator.register(colleagueB);
		colleagueA.send();
		System.out.println("-----------------------------------");
		colleagueB.send();
	}
}
```
**程序运行结果如下：**
```
买家：便宜10万我就买
中介代买家传达
卖家：好的，没有问题
-----------------------------------
卖家：啥时候签合同
中介代卖家家传达
买家：现在就可以签合同
```
### 4.6 备忘录模式(Memento( [məˈmentoʊ] ) Pattern)
#### 4.6.1 特点&优点&缺点&适用场景
>说明
* 备忘录模式是行为模式，在不破坏封装性的前提下，捕获一个对象的内部状态，并在对象之外保存这个状态，以便以后需要时将这个状态恢复到备份的状态，这个模式也叫快照模式

> 模式结构与实现

备忘录模式的核心是备忘录类，用于管理备忘录的管理类，当前时刻内部状态类
备忘录模式的主要角色如下：

* 1.发起人(Originator[əˈrɪdʒɪneɪtər]) 角色：记录当前时刻的内部状态信息，提供创建备忘和恢复备份数据的功能，他可以访问备忘录里的所有信息
* 2.备忘录(Memento[məˈmentoʊ]) 角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人
* 3.管理者(Caretaker[ˈkerteɪkər]) 角色：对备忘录进行管理，提供保存和获取备忘录数据的功能，但是他不能对备忘录进行访问和修改

> 优点
* 提供了一种可以恢复状态的机制，当用户需要时可以方便得将数据恢复到某个历史的时刻
* 简化了发起人类，发起人类不用管理和保存其内部状态的各个备份，所有状态都保存在备忘录里
* 实现内部状态的封装，除了创建它的发起人类，其他对象都不能够访问这些备份的状态信息

> 缺点
* 内存资源消耗过大，如果要保存的内部信息过多或者特别频繁，将会占用比较大的内存资源

> 适用场景
* 需要保存/恢复数据的场景，提供一个可回滚的操作
* 浏览器页面的前进后退
* 虚拟机的快照
* 记事本的剪切板撤销/重做
* 数据库事务
* 游戏存档

#### 4.6.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%A4%87%E5%BF%98%E5%BD%95%E6%A8%A1%E5%BC%8F-UML.png)

#### 4.6.3 代码
[备忘录模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)

**步骤1：创建一个备忘录**

```java
/**
 * 备忘录
 * Memento[məˈmentoʊ]
 */
public class Memento {
	/**
	 * 需要备份的数据
	 */
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	/**
	 * 获取备份数据
	 *
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * 设置备份数据
	 *
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
}
```
**步骤2：创建一个备份数据管理器**

```java
/**
 * 管理者
 * Caretaker[ˈkerteɪkər]
 */
public class Caretaker {
	/**
	 * 备忘录
	 */
	private Memento memento;

	/**
	 * 获取备忘录
	 *
	 * @return
	 */
	public Memento getMemento() {
		return memento;
	}

	/**
	 * 设置备忘录
	 *
	 * @param memento
	 */
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
```
**步骤3：创建发起人**

```java
/**
 * 发起人
 * Originator[əˈrɪdʒɪneɪtər]
 */
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 创建一个备忘录
	 * @return
	 */
	public Memento createMemento(){
		return new Memento(state);
	}

	/**
	 * 还原备忘录
	 * @param m
	 */
	public void restoreMemento(Memento m){
		this.setState(m.getState());
	}
}
```
**步骤4：发起人创建备忘录，并通过备份管理器备份和还原数据**

```java
/**
 * 备忘录模式
 */
public class MementoPatternDemo {
	public static void main(String[] args) {
		// 当前的业务状态
		Originator originator = new Originator();
		System.out.println("创建发起人");
		// 状态管理员
		Caretaker caretaker = new Caretaker();
		System.out.println("创建备份管理器");
		originator.setState("未开始");
		System.out.println("发起人初始状态：" + originator.getState());
		// 备份状态
		// 获取当前状态>放进状态管理器中
		caretaker.setMemento(originator.createMemento());
		System.out.println("发起人创建备忘录，并将备忘录放进备份管理器中");
		;
		originator.setState("下载中...");
		System.out.println("发起人新的状态：" + originator.getState());
		// 还原状态
		// 从状态管理器中获取保存的状态>还原到当前状态中
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("从备份管理器中取出备忘录传给发起人还原数据");
		System.out.println("发起人恢复之后的状态：" + originator.getState());
	}

```
**程序运行结果如下：**
```
创建发起人
创建备份管理器
发起人初始状态：未开始
发起人创建备忘录，并将备忘录放进备份管理器中
发起人新的状态：下载中...
从备份管理器中取出备忘录传给发起人还原数据
发起人恢复之后的状态：未开始
```
### 4.7 观察者模式(Observer[əbˈzɜːrvər] Pattern)
#### 4.7.1 特点&优点&缺点&适用场景
>说明
* 观察者模式是行为模式，指的是多个对象之间存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于他的对象都得到通知
* 这种模式又称为发布-订阅模式、模型-视图模式
* 行为模式侧重点是对象和对象之间的通信

> 模式结构与实现
* 抽象主题 (Subject) 角色：也叫抽象被观察类，它提供了一个用于保存观察者对象的列表和增加、删除观察者的方法，以及通知所有观察者的抽象方法（具体通知的逻辑延迟到子类实现）
* 具体主题 (Concrete Subject) 角色：也叫具体被观察类，它实现抽象被观察类的通知方法，当具体的被观察类内部状态发生改变时，通知所有注册过的观察者对象
* 抽象观察者 (Observer) 角色：它是一个抽象类或接口，它包含了一个响应方法，当接到被观察类发送的更改通知时被调用
* 具体观察者 (Concrete Observer) 角色：实现抽象观察者中定义的响应方法，当接到被观察类发出的通知之后更新自身的状态

> 优点
* 降低了被观察者与观察者之间的耦合关系，两者之间是抽象耦合关系，符合依赖倒置原则
* 被观察类和观察者之间建立了一套触发机制

> 缺点
* 目标与观察者之间的依赖关系并没有完全解除，而且有可能出现循环引用
* 当观察者对象很多时，通知的发布会花费很多时间，影响程序执行效率

> 适用场景

在软件系统中，当系统一方行为依赖另一方的变动时，可以使用观察者模式松耦合联动双方，使得一方的变动可以通知到感兴趣的另一方对象，从而让另一方对象做出响应
* 对象之间存在一对多关系，一个对象发生改变影响其他对象
* 实现类似广播机制的功能，不需要知道具体的收听者，只需要分发广播，系统中收听广播的对象会自动响应广播

#### 4.7.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F-UML.png)

#### 4.7.3 代码
[观察者模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建观察者接口**

```java
/**
 * 观察者接口
 */
public interface Observer {
	/**
	 * 观察者收到主题变更之后做出的响应
	 * response[rɪˈspɑːns]
	 */
	void response();
}
```
**步骤2：创建2个具体的观察者**

```java
/**
 * 具体观察者1
 */
public class ConcreteObserver1 implements Observer{
	/**
	 * 观察者收到主题变更之后做出的响应
	 */
	@Override
	public void response() {
		System.out.println("具体观察者1作出反应！");
	}
}
/**
 * 具体观察者2
 */
public class ConcreteObserver2 implements Observer {
	/**
	 * 观察者收到主题变更之后做出的响应
	 */
	@Override
	public void response() {
		System.out.println("具体观察者2作出反应！");
	}
}
```
**步骤3：创建被观察的主题抽象接口**

```java
/**
 * 被观察的主题抽象接口
 */
abstract class Subject {
	/**
	 * 观察者列表
	 */
	protected List<Observer> observers = new ArrayList<>();

	/**
	 * 添加观察者
	 *
	 * @param observer
	 */
	public void add(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 删除观察者
	 *
	 * @param observer
	 */
	public void remove(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * 通知所有观察者
	 */
	public abstract void notifyObserver();
}
```
**步骤4：创建具体的被观察的主题**

```java
/**
 * 具体被观察的主题
 */
public class ConcreteSubject extends Subject {
	/**
	 * 通知所有观察者
	 */
	@Override
	public void notifyObserver() {
		System.out.println("具体目标发生改变,通知所有注册的观察者");
		System.out.println("------------------");
		for (Observer observer : observers) {
			observer.response();
		}
	}
}
```
**步骤5：当主题发生变更时通知所有被观察者**

```java
/**
 * 观察者模式
 */
public class ObserverPatternDemo {
	public static void main(String[] args) {
		// 创建一个被观察的主题
		ConcreteSubject concreteSubject = new ConcreteSubject();
		System.out.println("创建一个被观察的主题");
		// 添加观察者1
		concreteSubject.add(new ConcreteObserver1());
		// 添加观察者2
		concreteSubject.add(new ConcreteObserver2());
		// 当被观察的主题发生了变更，通知所有观察者
		concreteSubject.notifyObserver();
	}
}
```
**程序运行结果如下：**
```
创建一个被观察的主题
具体的被观察的主题发生改变,通知所有注册的观察者
------------------
具体观察者1作出反应！
具体观察者2作出反应！
```

### 4.8 状态模式(State[steɪt] Pattern)

#### 4.8.1 特点&优点&缺点&适用场景
>说明
* 在一些有很多状态会来回切换的场景中，如果按照传统的解决方案：我们是将这些所有可能发生的情况全部考虑到，然后用if-else去做状态判断，在进行不同情况的处理，但是这种做法对复杂的状态判断存在很大弊端，条件判断会很臃肿，而且不具备扩展性，维度难度大，增加一个新的状态你就得在写一个if-else语句，这违背了开闭原则，不利于程序扩展
* 对于以上这种问题，我们可以使用状态模式就能很好的解决，状态模式的核心思想是，我们可以把每个状态抽取出来，使用各个不同的类进行表示状态，系统处于哪个状态，直接使用对应的状态进行处理，这样就能把原来的判断逻辑简单化，消除了if-else语句，代码更有层次性，并且具备很好的扩展性

> 模式结构与实现
* 环境类 (Context) 角色：也称为上下文，它定义了客户端需要的接口，内部维护一个当前状态，并负责具体状态的切换
* 抽象状态 (State) 角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为，可以有一个或多个行为
* 具体状态 (Concrete State) 角色：实现抽象状态所对应的行为，并且在需要的情况下进行状态切换

> 优点
* 结构很清晰，每种状态都是单独的类，满足“单一职责原则”
* 减少对象间的相互依赖，将不同的状态引入独立的对象中，使得状态切换变得更加明确
* 状态类职责明确，有利于扩展新的状态，增加一个状态只需要实现state接口，实现里面的状态切换逻辑即可

> 缺点
* 使用状态模式必然会增加系统的类和对象的个数
* 状态模式的结构和实现比较复杂，如果使用不当会导致程序结构和代码的混乱
* 状态模式对开闭原则支持不太好，对于可以切换状态的场景，比如说你开发了一个下载器，刚开始只有下载中状态和已完成状态，后来你要新加一个暂停状态，不仅仅需要增加一个暂停状态类，还需要修改抽象状态接口，增加新的方法暂停，才能切换到你新加的暂停状态里，这个是违反开闭原则的，开闭原则不允许修改已经实现的代码

> 适用场景
* 有很多状态需要来回切换的场景，比如说试用期、正式、离职，酒店入住退主等状态
* 迅雷下载器，未开始、下载中、暂停、下载完成、下载失败

#### 4.8.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8F-UML.png)

#### 4.8.3 代码
[状态模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建状态的抽象**

```java
public interface State {
	/**
	 * 状态名称
	 *
	 * @return
	 */
	String name();

	/**
	 * 初始化下载
	 */
	void init();

	/**
	 * 开始下载
	 */
	void start();

	/**
	 * 暂停下载
	 */
	void suspend();

	/**
	 * 继续下载
	 */
	void resume();

	/**
	 * 重试下载
	 */
	void retry();

	/**
	 * 下载完成
	 *
	 * @param success 下载是否成功
	 * @param msg     下载返回结果
	 */
	void complete(boolean success, String msg);
}
```
**步骤2：创建未开始、暂停、下载中、下载完成4个状态的具体实现**

```java
/**
 * 未开始下载状态
 */
public class NotStartedDownloadState implements State {
	private final DownloadStateContext context;

	/**
	 * 状态名称
	 *
	 * @return
	 */
	@Override
	public String name() {
		return "未开始下载";
	}

	public NotStartedDownloadState(DownloadStateContext context) {
		this.context = context;
	}

	/**
	 * 初始化下载
	 */
	@Override
	public void init() {
		this.context.setCurrentState(this.context.getNotStartedDownloadState());
	}

	/**
	 * 开始下载
	 */
	@Override
	public void start() {
		// 切换到下载中状态
		this.context.setCurrentState(this.context.getDownloading());
	}

	/**
	 * 暂停下载
	 */
	@Override
	public void suspend() {
		this.context.setCurrentState(this.context.getSuspendDownload());
	}

	/**
	 * 继续下载
	 */
	@Override
	public void resume() {

	}

	/**
	 * 重试下载
	 */
	@Override
	public void retry() {
		this.context.setCurrentState(this.context.getDownloading());
	}

	/**
	 * 下载完成
	 *
	 * @param success 下载是否成功
	 * @param msg     下载返回结果
	 */
	@Override
	public void complete(boolean success, String msg) {
		this.context.setCurrentState(this.context.getDownloadComplete());
	}
}
/**
 * 已暂停状态
 */
public class SuspendDownloadState implements State {
	private final DownloadStateContext context;

	/**
	 * 状态名称
	 *
	 * @return
	 */
	@Override
	public String name() {
		return "已暂停";
	}

	public SuspendDownloadState(DownloadStateContext context) {
		this.context = context;
	}

	/**
	 * 初始化下载
	 */
	@Override
	public void init() {

	}

	/**
	 * 开始下载
	 */
	@Override
	public void start() {

	}

	/**
	 * 暂停下载
	 */
	@Override
	public void suspend() {

	}

	/**
	 * 继续下载
	 */
	@Override
	public void resume() {
		this.context.setCurrentState(this.context.getDownloading());
	}

	/**
	 * 重试下载
	 */
	@Override
	public void retry() {

	}

	/**
	 * 下载完成
	 *
	 * @param success 下载是否成功
	 * @param msg     下载返回结果
	 */
	@Override
	public void complete(boolean success, String msg) {

	}
}
/**
 * 下载中状态
 */
public class DownloadingState implements State {
	private final DownloadStateContext context;

	/**
	 * 状态名称
	 *
	 * @return
	 */
	@Override
	public String name() {
		return "下载中";
	}

	/**
	 * 初始化下载
	 */
	@Override
	public void init() {

	}

	public DownloadingState(DownloadStateContext context) {
		this.context = context;
	}

	/**
	 * 开始下载
	 */
	@Override
	public void start() {

	}

	/**
	 * 暂停下载
	 */
	@Override
	public void suspend() {
		this.context.setCurrentState(this.context.getSuspendDownload());
	}

	/**
	 * 继续下载
	 */
	@Override
	public void resume() {

	}

	/**
	 * 重试下载
	 */
	@Override
	public void retry() {

	}

	/**
	 * 下载完成
	 *
	 * @param success 下载是否成功
	 * @param msg     下载返回结果
	 */
	@Override
	public void complete(boolean success, String msg) {
		this.context.setCurrentState(this.context.getDownloadComplete());
	}
}
/**
 * 下载完成状态
 */
public class DownloadCompleteState implements State {
	private final DownloadStateContext context;

	/**
	 * 状态名称
	 *
	 * @return
	 */
	@Override
	public String name() {
		return "下载完成";
	}

	/**
	 * 初始化下载
	 */
	@Override
	public void init() {
		// 重置状态为未开始下载
		this.context.setCurrentState(this.context.getNotStartedDownloadState());
	}

	public DownloadCompleteState(DownloadStateContext context) {
		this.context = context;
	}

	/**
	 * 开始下载
	 */
	@Override
	public void start() {

	}

	/**
	 * 暂停下载
	 */
	@Override
	public void suspend() {

	}

	/**
	 * 继续下载
	 */
	@Override
	public void resume() {

	}

	/**
	 * 重试下载
	 */
	@Override
	public void retry() {
		this.context.setCurrentState(this.context.getDownloading());
	}

	/**
	 * 下载完成
	 *
	 * @param success 下载是否成功
	 * @param msg     下载返回结果
	 */
	@Override
	public void complete(boolean success, String msg) {
		this.context.setCurrentState(this.context.getDownloadComplete());
	}
}
```
**步骤3：创建状态控制上下文**

```java
/**
 * 状态控制上下文
 */
@Data
public class DownloadStateContext {
	/**
	 * 当前状态
	 */
	private State currentState;
	/**
	 * 未开始状态
	 */
	private State notStartedDownloadState;
	/**
	 * 下载中
	 */
	private State downloading;
	/**
	 * 已暂停
	 */
	private State suspendDownload;
	/**
	 * 下载完成
	 */
	private State downloadComplete;


	public DownloadStateContext() {
		// 创建各个状态
		this.notStartedDownloadState = new NotStartedDownloadState(this);
		this.downloading = new DownloadingState(this);
		this.suspendDownload = new SuspendDownloadState(this);
		this.downloadComplete = new DownloadCompleteState(this);
		// 设置当前状态为未开始状态
		this.currentState = this.notStartedDownloadState;
	}

	/**
	 * 初始化下载任务
	 */
	public void init() {
		this.currentState.init();
	}

	/**
	 * 开始下载，等待5秒后下载完成
	 */
	public void startThread(Integer sleep) throws InterruptedException {
		this.currentState.start();
		Thread.sleep(sleep * 1000);
		System.out.println(sleep + "秒之后");
		this.complete(true, "下载成功");
	}

	/**
	 * 开始下载，不等待
	 */
	public void start() {
		this.currentState.start();
	}

	/**
	 * 暂停下载
	 */
	public void suspend() {
		this.currentState.suspend();
	}

	/**
	 * 继续下载
	 */
	public void resume() {
		this.currentState.resume();
	}

	/**
	 * 重试下载
	 */
	public void retry() {
		this.currentState.retry();
	}

	/**
	 * 下载完成，下载线程成功或失败之后回调此方法
	 */
	public void complete(boolean success, String msg) {
		this.currentState.complete(success, msg);
	}

	/**
	 * 获取当前任务的状态
	 *
	 * @return
	 */
	public State getCurrentState() {
		return currentState;
	}

	/**
	 * 设置当前任务状态
	 *
	 * @param currentState
	 */
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		System.out.println("当前状态：" + this.currentState.name());
	}
}
```
**步骤4：创建2个下载任务**

```java
/**
 * 状态模式
 * 使用类来代替各种状态，类里面的方法就是状态之间的变更逻辑，可以很灵活的来回切换状态
 */
public class StatePatternDemo {
	public static void main(String[] args) throws InterruptedException {
		DownloadStateContext context = new DownloadStateContext();
		// 开始下载5秒后下载完成
		System.out.println("操作：初始化下载任务");
		context.init();
		System.out.println("操作：开始下载");
		context.startThread(2);

		// 开始下载-状态间的切换
		System.out.println("-------------------------------");
		System.out.println("操作：初始化下载任务");
		context.init();
		System.out.println("操作：开始下载");
		context.start();
		System.out.println("操作：暂停");
		context.suspend();
		System.out.println("操作：继续");
		context.resume();
		System.out.println("3秒后下载完成");
		Thread.sleep(3000);
		context.complete(true, "下载成功");
	}
}
```
**程序运行结果如下：**
```
任务1：
操作：初始化下载任务
当前状态：未开始下载
操作：开始下载
当前状态：下载中
2秒之后
当前状态：下载完成
-------------------------------
任务2：
操作：初始化下载任务
当前状态：未开始下载
操作：开始下载
当前状态：下载中
操作：暂停
当前状态：已暂停
操作：继续
当前状态：下载中
3秒后下载完成
当前状态：下载完成
```

### 4.9 空对象模式(Null Object Pattern)
#### 4.9.1 特点&优点&缺点&适用场景
>说明
* 空对象模式是行为模式，通过一个空对象来返回默认行为

> 模式结构与实现
* AbstractCustomer：抽象消费者，提供一个获取是否为空的抽象方法和获取数据的抽象方法
* RealCustomer：非空对象子类继承抽象消费者，覆盖是否为空抽象方法和获取数据的抽象方法
* NullCustomer：空对对象子类继承抽象消费者，覆盖是否为空抽象方法和获取数据的抽象方法
* CustomerFactory：消费者工厂，提供一个方法根据入参进去查找list是否包含，有则返回非空对象子类，无则返回空对象子类

> 优点
> 它可以加强系统的稳固性，能有效地减少空指针报错对整个系统的影响，使系统更加稳定
* 能实现对空对象情况的定制化的控制，掌握处理空对象的主动权
* 它并不依靠client来保证系统的稳定运行
* 她通过定义isNil判断对象是否为空，更加优雅易懂

> 缺点
* 每一个要返回真实的实体都要建立一个对象的空对象模型，这样会增加类的数量

> 适用场景
* 判断某个实例是否不存在，需要通过一个包装器来判断是否不存在

#### 4.9.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E7%A9%BA%E5%AF%B9%E8%B1%A1%E6%A8%A1%E5%BC%8F-UML.png)

#### 4.9.3 代码
[空对象模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建空对象包装器抽象**

```java
/**
 * 对象包装器抽象
 * 抽象消费者
 */
public abstract class AbstractCustomer {
	protected String name;

	/**
	 * 是否为空
	 *
	 * @return
	 */
	public abstract boolean isNil();

	/**
	 * 获取名称
	 *
	 * @return
	 */
	public abstract String getName();
}
```
**步骤2：创建空对象包装器抽象的实现**

```java
/**
 * 空对象
 */
public class NullCustomer extends AbstractCustomer {
	public NullCustomer(String name) {
		this.name = name;
	}

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
/**
 * 真实的消费者
 */
public class RealCustomer extends AbstractCustomer {
	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
```
**步骤3：创建消费者工厂**

```java
/**
 * 消费者工厂
 */
public class CustomerFactory {
	public static final String[] names = {"张无忌", "张三丰", "铁木真", "曹操"};

	/**
	 * 根据参数name获取对象包装器
	 *
	 * @param name
	 * @return
	 */
	public static AbstractCustomer getCustomer(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer(name);
	}
}
```
**步骤4：传参数给消费者工厂，获取一个对象，来表示传进去的数据是否存在**

```java
/**
 * 空对象模式
 */
public class NullObjectPatternDemo {
	public static void main(String[] args) {
		// 输入一个存在的名称
		AbstractCustomer customer1 = CustomerFactory.getCustomer("张无忌");
		System.out.println("【" + customer1.getName() + "】是否是空数据：" + customer1.isNil());

		// 输入一个不存在的名称
		AbstractCustomer customer2 = CustomerFactory.getCustomer("李四");
		System.out.println("【" + customer2.getName() + "】是否是空数据：" + customer2.isNil());
	}
}
```
**程序运行结果如下：**
```
【张无忌】是否是空数据：false
【李四】是否是空数据：true
```
### 4.10 策略模式(Strategy[ˈstrætədʒi] Pattern)
#### 4.10.1 特点&优点&缺点&适用场景
>说明
* 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响使用算法的客户，策略模式属于行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对做这些算法进行管理

> 模式结构与实现
* 抽象策略（Strategy）类：定义了一个接口，各种不同算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现
* 具体策略（Concrete Strategy）类：实现了抽象策略接口，提供具体的算法实现
* 环境（Context）类：这个类里有一个具体的策略类的引用，并暴露一个算法入口函数，最终给客户端调用

> 优点
* 多重条件语句不易维护，而使用策略模式可以避免使用多重条件语句，如if-else、switch-case语句
* 策略模式提供了一系列可以重用的算法族，恰当使用继承可以把算法族的公共代码转移到父类里面，从而避免重复的代码（就是把相同特征有重复的计算的方法放到一个单独的方法里，并转移到父类里，其他有一样的行为的算法作为子类继承父类即可，可以减少重复代码）
* 策略模式可以提供相同行为的不同实现（就是入参和返回值一样，计算的过程不一样），客户可以根据自己的需求选择不同的算法实现
* 策略模式对开闭原则完美支持，可以在不修改原代码的情况下，灵活新增新算法
* 策略模式把算法的使用放到环境类里，而算法的实现移动到具体的策略类中，实现二者的分离

> 缺点
* 客户端必须理解策略算法的区别，以便选择合适的算法
* 策略模式造成很多的策略类，增加了维护难度

> 适用场景
* 一个系统需要动态的在几种算法中选择其中一种
* 一个系统有很多种行为，他们的特征都是一样的，入参和返回一样，可以使用策略模式选择其中一个行为

> 注意事项
* 策略模式需要这些具体的算法实现具有相同的入参和返回值

#### 4.10.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F-UML.png)

#### 4.10.3 代码
[策略模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建一个策略抽象类**

```java
/**
 * 策略抽象类
 */
public interface Strategy {
	/**
	 * 策略方法
	 */
	public int doOperation(int num1, int num2);
}
```
**步骤2：创建策略抽象类的实现，两数相加策略、两数相乘策略、两数相减策略**

```java
/**
 * 两数相加策略
 */
public class OperationAdd implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}
/**
 * 两数相乘策略
 */
public class OperationMultiply implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}
}
/**
 * 两数相减策略
 */
public class OperationSubtract implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}
```
**步骤3：创建策略上下文**

```java
/**
 * 策略上下文
 */
public class StrategyContext {
	private Strategy strategy;

	public StrategyContext(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 执行策略
	 *
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int executeStrategy(int num1, int num2) {
		return this.strategy.doOperation(num1, num2);
	}
}
```
**步骤4：传入不同的策略获得不同的算法结果**

```java
/**
 * 策略模式
 */
public class StrategyPatternDemo {
	public static void main(String[] args) {
		// 两数相加策略
		StrategyContext strategyContext = new StrategyContext(new OperationAdd());
		System.out.println("两数相加策略");
		System.out.println("10+5=" + strategyContext.executeStrategy(10, 5));

		// 两数相减策略
		strategyContext = new StrategyContext(new OperationSubtract());
		System.out.println("两数相减策略");
		System.out.println("10-5=" + strategyContext.executeStrategy(10, 5));

		// 两数相乘
		strategyContext = new StrategyContext(new OperationMultiply());
		System.out.println("两数相乘");
		System.out.println("10*5=" + strategyContext.executeStrategy(10, 5));
	}
}
```
**程序运行结果如下：**
```
两数相加策略:
10+5=15
两数相减策略:
10-5=5
两数相乘:
10*5=50
```
### 4.11 模板模式(Template[ˈtemplət] Pattern)
#### 4.11.1 特点&优点&缺点&适用场景
>说明
* 定义一个算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变算法的结构和流程的情况下重新定义该算法的某些特定步骤，这是一种行为模式
* 去银行办业务一般要经历以下4个流程：取号、排队、办理具体的业务、对银行工作人员进行评分等，其中取号、排队、对银行工作人员评分的业务对每个客户都是一样的，可以在父类实现，但是办理具体业务却因人而异，它可能是存款，取款或者转账等，可以延迟到子类中实现

> 模式结构与实现

AbstractTemplate抽象类/抽象模板，抽象模板类负责给出一个算法的轮廓和骨架，它由一个模板方法和若干个基本方法构成
① 模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法
② 基本方法：是整个算法中的一个步骤，包含以下几种类型
- 抽象方法：在抽象类中声明(办理具体的业务)，由具体子类实现(可能是存款或者取款转账等)
- 具体方法：在抽象类中已经实现(取号、排队、评分操作)，在具体子类中可以继承或重写它
- 钩子方法：在抽象类中已经实现（健康码登记，这是一个空方法，由子类去覆盖），包括用于判断的逻辑方法和需要子类重写的空方法两种（有些场景可能会存在前置判断或者个性化的前置方法，需要写一个空方法交给子类去实现）

具体子类/具体实现
具体实现类，实现抽象类定义的抽象方法和钩子方法，他们是一个顶级逻辑的组成步骤，对特定的步骤进行个性化的定制，主体流程步骤是固定的

> 优点
* 它封装了不可变部分，让可变部分支持扩展。它把认为是不变部分的算法封装到父类中实现，而把可变的部分算法由子类继承实现，便于子类继续扩展
* 它在父类中提取了公共的部分代码，便于代码复用
* 部分方法是由子类实现的，因此子类可以通过扩展方式增加响应的功能，符合开闭原则

> 缺点
* 对每个不同的实现都需要定义一个子类，这会导致类的个数增加
* 父类中的抽象方法由子类实现，子类执行结果会影响父类的结果，这是一种反向的控制结构，提高了阅读的难度
* 由于继承关系自身的缺点，如果父类添加新的抽象方法，则所有子类都要实现

> 适用场景
* 整个执行流程固定，其中某个流程可能有好几种不同的逻辑，可以使用模板方法

#### 4.11.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E6%A8%A1%E6%9D%BF%E6%A8%A1%E5%BC%8F-UML.png)

#### 4.11.3 代码
[模板模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建模板的抽象**

```java
/**
 * 模板的抽象
 */
public abstract class AbstractTemplate {
	/**
	 * 钩子方法
	 * 1.健康码登记
	 */
	protected void registerHealthCode() {

	}

	/**
	 * 具体方法
	 * 2.取号
	 */
	protected void takeNumber() {
		System.out.println("叫号机取号");
	}

	/**
	 * 具体方法
	 * 3.排队
	 */
	protected void lineUp() {
		System.out.println("排队");
	}

	/**
	 * 抽象方法
	 * 4.办理指定的业务
	 */
	abstract void handleDesignatedBusiness();

	/**
	 * 具体方法
	 * 5.评分
	 */
	protected void score() {
		System.out.println("业务办理完成，给柜员评分");
	}

	/**
	 * 办业务整个流程
	 * 1,2,3,5都是去银行办业务固定的流程，4是办理不同的业务，比如存款，取钱，开卡等
	 */
	protected void handleBusiness() {
		// 1.健康码登记
		registerHealthCode();
		// 2.取号
		takeNumber();
		// 3.排队
		lineUp();
		// 4.办理指定的业务
		handleDesignatedBusiness();
		// 5.评分
		score();
	}
}
```
**步骤2：创建不同的业务模板、办理存款、先进行健康码登记，再办理存款、取款**

```java
/**
 * 办理存款
 */
public class Deposit extends AbstractTemplate {

	@Override
	void handleDesignatedBusiness() {
		System.out.println("--存款");
	}
}
/**
 * 先进行健康码登记，再办理存款
 */
public class DepositHealthCode extends Deposit{
	@Override
	protected void registerHealthCode() {
		System.out.println("健康码登记");
		super.registerHealthCode();
	}
}
/**
 * 办理取款
 */
public class WithdrawMoney extends AbstractTemplate {
	@Override
	void handleDesignatedBusiness() {
		System.out.println("--取款");
	}
}
```
**步骤3：使用不同的业务模板，执行办理不同的业务**

```java
/**
 * 模板模式
 */
public class TemplatePatternDemo {
	public static void main(String[] args) {
		// 办理存款
		AbstractTemplate template = new Deposit();
		System.out.println("办理存款业务：");
		template.handleBusiness();
		System.out.println("----------------------------");
		// 先进行健康码登记，再办理存款
		template = new DepositHealthCode();
		System.out.println("先进行健康码登记，再办理存款：");
		template.handleBusiness();
		System.out.println("----------------------------");
		// 办理取款
		template = new WithdrawMoney();
		System.out.println("办理取款业务：");
		template.handleBusiness();
	}
}
```
**程序运行结果如下：**
```
办理存款业务：
叫号机取号
排队
--办理存款
业务办理完成，给柜员评分
----------------------------
先进行健康码登记，再办理存款：
--健康码登记
叫号机取号
排队
--办理存款
业务办理完成，给柜员评分
----------------------------
办理取款业务：
叫号机取号
排队
--办理取款
业务办理完成，给柜员评分
```
### 4.12 访问者模式(Visitor [ˈvɪzɪtər]  Pattern)
#### 4.12.1 特点&优点&缺点&适用场景
>说明
* 将数据结构中的元素的操作分离出来封装成独立的类，使其在不改变数据结构的前提下可以添加作用于这些元素的新的操作，为数据结构中的每个元素提供多种访问方式。
* 他将数据的操作与数据结构进行分离，是行为模式中最复杂的一种模式

> 模式结构与实现
* 抽象访问者(Visitor) 角色：定义一个访问具体元素的接口，为每个具体元素类对应一个访问操作 visit()，该操作中的参数类型标识了被访问的具体元素
* 具体访问者(ConcreteVisitor)角色：实现抽象访问者角色中声明的各个访问操作，确定访问者访问一个元素时该做什么
* 抽象元素(Element)角色：声明一个包含接受操作accept()的接口，访问者对象作为accept()方法的参数，数据列表是固定的，访问者对象丢进list里计算，最终访问者对象里都是算好的账本数据
* 具体元素(ConcreteElement)角色：实现抽象元素角色提供的accept()操作，其方法体通常都是visitor.visit(this),另外具体元素中可能还包含本身业务逻辑的相关操作
* 对象结构(Object Structure)角色：是一个包含元素对象的容器，提供一个方法遍历所有元素并将观察者对象丢进元素中

> 优点
* 扩展性好，能够在不修改对象结构中的元素的情况下，为对象结构中的元素添加新的功能
* 复用性好，可以通过访问者来定义整个对象结构通用的功能，从而提高系统的复用程度
* 灵活性好，访问者模式将数据结构与对数据结构的操作解耦，使得操作可以相对自由地演化而不影响系统的数据结构
* 符合单一职责原则，访问者模式相关的行为封装在一起，构成一个访问者，使得每一个访问者的功能都比较单一

> 缺点
* 增加新的元素很困难，在访问者模式中，每增加一个新的元素类，都要再每一个具体访问类中增加相应的具体操作，这违背了“开闭原则”
* 破坏封装。访问者模式中具体元素对访问者公布细节，这破坏了对象的封装性
* 违反了依赖倒置原则，访问者模式依赖了具体类，而没有依赖抽象类

> 适用场景
* 对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作，比如说账本查看这种场景，老板和会计查看账单的关注点不一样，账单有支出和收入，老板观察者只关注总的收益和支出，会计要关注每笔账是否交税，如果在加一个观察者，比如说工商局，查企业账本，他们只关注是否和上报的一致，每笔是否交税

#### 4.12.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E8%AE%BF%E9%97%AE%E8%80%85%E6%A8%A1%E5%BC%8F-UML.png)

#### 4.12.3 代码
[访问者模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建一个订单抽象**

```java
/**
 * 单个单子的接口（相当于Element）
 * [bɪl]
 */
public interface Bill {
	/**
	 * 接收
	 *
	 * @param visitor
	 */
	void accept(AccountBookVisitor visitor);

	/**
	 * 获取订单名称
	 *
	 * @return
	 */
	String getItem();

	/**
	 * 获取金额
	 * @return
	 */
	double getAmount();
}
```
**步骤2：创建订单的具体实现，支出订单、收入订单**

```java
/**
 * 收入-具体的被访问的元素
 * IncomeBill[ˈɪnkʌm]
 */
public class IncomeBill implements Bill {
	/**
	 * 金额
	 */
	private double amount;
	/**
	 * 项目
	 */
	private String item;

	public IncomeBill(double amount, String item) {
		this.amount = amount;
		this.item = item;
	}

	/**
	 * 接受
	 *
	 * @param visitor
	 */
	@Override
	public void accept(AccountBookVisitor visitor) {
		visitor.visit(this);
	}

	/**
	 * 获取金额
	 *
	 * @return
	 */
	@Override
	public double getAmount() {
		return amount;
	}

	/**
	 * 获取项目名称
	 *
	 * @return
	 */
	@Override
	public String getItem() {
		return item;
	}
}
/**
 * 支出-具体的被访问的元素
 * Consume[kənˈsuːm]
 */
public class ConsumeBill implements Bill {

	/**
	 * 金额
	 */
	private double amount;
	/**
	 * 项目
	 */
	private String item;

	public ConsumeBill(double amount, String item) {
		this.amount = amount;
		this.item = item;
	}

	/**
	 * 接收访问者的访问
	 *
	 * @param visitor
	 */
	@Override
	public void accept(AccountBookVisitor visitor) {
		visitor.visit(this);
	}

	/**
	 * 获取金额
	 *
	 * @return
	 */
	@Override
	public double getAmount() {
		return amount;
	}

	/**
	 * 获取项目名称
	 *
	 * @return
	 */
	@Override
	public String getItem() {
		return item;
	}
}
```
**步骤3：创建一个账本对象用来存放订单的**

```java
/**
 * 账本类-对象结构Object Structure[ˈstrʌktʃər]
 */
public class AccountBook {
	/**
	 * 账单列表
	 */
	private List<Bill> billList = new ArrayList<>();

	/**
	 * 添加账单
	 *
	 * @param bill 账单
	 */
	public void addBill(Bill bill) {
		billList.add(bill);
	}

	/**
	 * 提供一个方法给访问者查看账单
	 *
	 * @param visitor 访问者
	 */
	public void show(AccountBookVisitor visitor) {
		for (Bill bill : billList) {
			String type = bill.getClass().getSimpleName().equalsIgnoreCase("IncomeBill") ? "收入" : "支出";
			System.out.println(visitor.getClass().getSimpleName() + "查看" + type + "订单：" + bill.getItem() + ",金额：" + bill.getAmount());
			bill.accept(visitor);
		}
	}
}
```
**步骤4：创建账本访问者抽象**

```java
/**
 * 账本访问者-抽象访问者
 */
public interface AccountBookVisitor {
	/**
	 * 查看支出账单
	 *
	 * @param bill
	 */
	void visit(ConsumeBill bill);

	/**
	 * 查看收入账单
	 *
	 * @param bill
	 */
	void visit(IncomeBill bill);
}
```
**步骤5：创建具体的访问者，老板、注册会计师**

```java
/**
 * 老板类-具体访问者之一
 * 老板只关心一共收入多少支出多少，其余并不关心
 */
public class BossVisitor implements AccountBookVisitor {
	/**
	 * 总的收入金额
	 */
	private double totalIncome;
	/**
	 * 总的支出金额
	 */
	private double totalConsume;

	/**
	 * 查看支出账单
	 *
	 * @param bill
	 */
	@Override
	public void visit(ConsumeBill bill) {
		totalConsume += bill.getAmount();
	}

	/**
	 * 查看收入账单
	 *
	 * @param bill
	 */
	@Override
	public void visit(IncomeBill bill) {
		totalIncome += bill.getAmount();
	}

	public double getTotalIncome() {
		System.out.println("老板查看一共的收入多少，数目："+totalIncome);
		return totalIncome;
	}

	public double getTotalConsume() {
		System.out.println("老板查看一共的支出多少，数目："+totalConsume);
		return totalConsume;
	}
}
/**
 * 注册会计师类-具体访问者之一
 */
public class CpaVisitor implements AccountBookVisitor {

	/**
	 * 查看支出账单
	 * 注会在查看账本时，如果是支出，且支出是工资时，则需要查看是否交税了
	 *
	 * @param bill
	 */
	@Override
	public void visit(ConsumeBill bill) {
		if ("工资".equals(bill.getItem())) {
			System.out.println("注会查看工资是否交了个人所得税");
		}
	}

	/**
	 * 查看收入账单
	 * 如果是收入，则查看所有的收入是否交税
	 *
	 * @param bill
	 */
	@Override
	public void visit(IncomeBill bill) {
		System.out.println("注会查看收入是否交税");
	}
}
```
**步骤6：创建账本，往账本添加收入和支出，分别给老板和注会查看账本**

```java
/**
 * 访问者模式
 * 数据结构和数据操作者解耦
 * 数据结构尽量不变化，数据操作可以随便变化
 * 本例子是账单数据结构不变，注会和老板2个访问者他们俩的关注点不一样
 */
public class VisitorPatternDemo {
	public static void main(String[] args) {
		// 账本
		AccountBook accountBook = new AccountBook();
		System.out.println("创建一个账本");
		// 给账本添加收入账单
		accountBook.addBill(new IncomeBill(1000, "卖商品"));
		System.out.println("添加收入：卖商品1000元");
		accountBook.addBill(new IncomeBill(1000, "卖广告位"));
		System.out.println("添加收入：卖广告1000元");
		// 给账本添加支出账单
		accountBook.addBill(new ConsumeBill(20000, "工资"));
		System.out.println("添加支出：工资20000");
		accountBook.addBill(new ConsumeBill(1000, "材料费"));
		System.out.println("添加支出：材料费1000");
		// 创建访问者
		// 创建一个老板访问者
		AccountBookVisitor boss = new BossVisitor();
		System.out.println("创建老板访问者");
		// 创建一个注会访问者
		AccountBookVisitor cpa = new CpaVisitor();
		System.out.println("创建注册会计师访问者");
		System.out.println("-----------------------------");

		// 老板访问账本
		System.out.println("老板访问者查看账单：");
		accountBook.show(boss);
		// 打印老板想知道的收入支出总金额
		((BossVisitor) boss).getTotalIncome();
		((BossVisitor) boss).getTotalConsume();
		System.out.println("-----------------------------");
		// cpa注会访问账本
		System.out.println("注册会计师访问者查看账单：");
		accountBook.show(cpa);
	}
}
```
**程序运行结果如下：**
```
创建一个账本
添加收入：卖商品1000元
添加收入：卖广告1000元
添加支出：工资20000
添加支出：材料费1000
创建老板访问者
创建注册会计师访问者
-----------------------------
老板访问者查看账单：
BossVisitor查看收入订单：卖商品,金额：1000.0
BossVisitor查看收入订单：卖广告位,金额：1000.0
BossVisitor查看支出订单：工资,金额：20000.0
BossVisitor查看支出订单：材料费,金额：1000.0
老板查看一共的收入多少，数目：2000.0
老板查看一共的支出多少，数目：21000.0
-----------------------------
注册会计师访问者查看账单：
CpaVisitor查看收入订单：卖商品,金额：1000.0
注会查看收入是否交税
CpaVisitor查看收入订单：卖广告位,金额：1000.0
注会查看收入是否交税
CpaVisitor查看支出订单：工资,金额：20000.0
注会查看工资是否交了个人所得税
CpaVisitor查看支出订单：材料费,金额：1000.0
```
## 5 J2EE模式
> 这些设计模式特别关注表示层。这些模式是由Sun Java Center鉴定的

### 5.1 MVC模式(MVC Pattern)
#### 5.1.1 特点&优点&缺点&适用场景
>说明
* MVC模式代表Mode-View-Controller(模型-视图-控制器)模式。这种模式用于应用程序的分层开发

> 模式结构与实现
* Model(模型) - 模型代表一个存取数据的对象或JAVA POJO。它也可以带有逻辑，在数据变化时更新控制器
* View(视图) - 视图代表模型包含的数据的可视化
* Controller (控制器) - 控制器作用于模型和视图上，它控制数据流向模型对象，并在数据变化时更新视图，它使视图和模型分离

> 适用场景
* java spring mvc，前端页面是controller获取模型数据，传进view视图中渲染出前端页面内容给浏览器，浏览器进行页面渲染
* 代码生成器，代码模板视图，数据源，最终生成代码

#### 5.1.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/MVC%E6%A8%A1%E5%BC%8F-UML1.png)

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/MVC%E6%A8%A1%E5%BC%8F-UML2.png)

#### 5.1.3 代码
[MVC模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建模型**

```java
/**
 * MVC的模型
 */
public class Student {
	private String rollNo;
	private String name;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
```
**步骤2：创建视图**

```java
/**
 * MVC的视图
 */
public class StudentView {
	public void printStudentDetails(String studentName, String studentRollNo) {
		System.out.println("Student:");
		System.out.println("Name:" + studentName);
		System.out.println("Roll No:" + studentRollNo);
	}
}
```
**步骤3：创建控制器**

```java
/**
 * MVC的控制器
 */
public class StudentController {
	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
```
**步骤4：使用 *StudentController* 方法来演示 MVC 设计模式的用法**

```java
/**
 * MVC设计模式
 */
public class MVCPatternDemo {
	public static void main(String[] args) {
		// 查询学生数据
		Student model = retrieveStudentFromDatabase();
		// 创建一个视图
		StudentView view = new StudentView();
		// 创建一个控制器
		StudentController controller = new StudentController(model, view);

		// view根据model生成数据
		System.out.println("-------------------------");
		System.out.println("打印视图渲染结果：");
		controller.updateView();

		// 更新模型数据
		System.out.println("-------------------------");
		System.out.println("修改模型数据");
		controller.setStudentName("凡人修仙");

		// view根据model生成数据
		System.out.println("打印视图渲染结果：");
		controller.updateView();
	}

	/**
	 * 从数据库中检索学生信息
	 *
	 * @return
	 */
	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("张无忌");
		student.setRollNo("10");
		return student;
	}
}
```
**程序运行结果如下：**
```
-------------------------
打印视图渲染结果：
Student:
Name:张无忌
Roll No:10
-------------------------
修改模型数据
打印视图渲染结果：
Student:
Name:凡人修仙
Roll No:10
```
### 5.2 业务代表模式(Business Delegate Pattern[ˈbɪznəs ˈdelɪɡət ˈpætərn])
#### 5.2.1 特点&优点&缺点&适用场景
>说明

* 可以根据客户传的service类型让业务代表选择不同的服务
* 业务代表模型用于对表示层和业务层解耦，它基本上是用来减少通信或对表示层代码中的业务层代码的远程查询功能
* 像是命令模式+策略模式的组合
* 核心思想是客户端和业务代表分开，业务代表切换服务实现之后，客户端执行的就是新的服务，切换服务由服务代表执行，客户端只需要执行

> 模式结构与实现
* 客户端（Client）- 表示层代码可以是JSP、servlet或UI java代码
* 业务代表（Business Delegate）- 一个为客户端实体提供的入口类，它提供了对业务服务方法的访问
* 查询服务（LookUp Service）- 查找服务对象负责获取相关的业务实现，并提供业务对象对业务代表对象的访问
* 业务服务（Business Service）- 业务服务接口。实现了该业务服务的实体类，提供了实际的业务实现逻辑

> 适用场景
* 客户端和服务代表解耦，客户端只负责执行，具体使用哪个服务，由服务代表来控制

#### 5.2.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E4%B8%9A%E5%8A%A1%E4%BB%A3%E8%A1%A8%E6%A8%A1%E5%BC%8F-UML.png)


#### 5.2.3 代码
[业务代表模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建 BusinessService 接口**

```java
/**
 * 抽象业务服务
 */
public interface BusinessService {
	/**
	 * 服务处理
	 */
	void doProcessing();
}
```
**步骤2：创建实体服务类**

```java
/**
 * 具体的业务服务
 */
public class EJBService implements BusinessService{
	@Override
	public void doProcessing() {
		System.out.println("处理EJB服务中");
	}
}
/**
 * 具体的业务服务
 */
public class JMSService implements BusinessService {
	@Override
	public void doProcessing() {
		System.out.println("处理JMS服务中");
	}
}
```
**步骤3：创建业务查询服务**

```java
/**
 * 查询服务
 * 根据业务代表传过来的{serviceType}服务类型去生成不同的服务
 */
public class BusinessLookUp {
	/**
	 * 根据类型获取对应的服务
	 *
	 * @param serviceType
	 * @return
	 */
	public BusinessService getBusinessService(String serviceType) {
		if ("EJB".equalsIgnoreCase(serviceType)) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}
```
**步骤4：创建业务代表**

```java
/**
 * 业务代表，控制客户端执行哪种服务
 */
public class BusinessDelegate {
	/**
	 * 查询服务
	 */
	private BusinessLookUp businessLookUp = new BusinessLookUp();
	private BusinessService businessService;
	private String serviceType;

	public BusinessDelegate() {
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		// 获取指定的服务
		businessService = businessLookUp.getBusinessService(this.serviceType);
		// 执行服务
		businessService.doProcessing();
	}
}
```
**步骤5：创建客户端**

```java
/**
 * 客户端
 */
public class Client {
	/**
	 * 业务代表
	 */
	private BusinessDelegate businessDelegate;

	public Client(BusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;
	}

	/**
	 * 调用业务代表执行服务
	 */
	public void doTask() {
		this.businessDelegate.doTask();
	}
}
```
**步骤6：使用 BusinessDelegate 和 Client 类来演示业务代表模式**

```java
/**
 * 业务代表模式
 */
public class BusinessDelegatePatternDemo {
	public static void main(String[] args) {
		// 定义一个业务代表
		BusinessDelegate businessDelegate = new BusinessDelegate();
		// 定义一个客户端，把业务代表丢进去
		Client client = new Client(businessDelegate);

		System.out.println("让业务代表准备EJB服务");
		// 让业务代表准备一个EJB服务
		businessDelegate.setServiceType("EJB");

		// 执行服务
		client.doTask();

		System.out.println("让业务代表准备JMS服务");
		businessDelegate.setServiceType("JMS");

		// 执行服务
		client.doTask();
	}
}
```
**程序运行结果如下：**
```
让业务代表准备EJB服务
处理EJB服务中
让业务代表准备JMS服务
处理JMS服务中
```
### 5.3 组合实体模式(Composite Entity Pattern[kəmˈpɑːzət ˈentəti ˈpætərn])
#### 5.3.1 特点&优点&缺点&适用场景
>说明

* 通过暴露出来的方法修改组合实体对象内部的某些属性
* 组合实体模式用在持久化机制中。当更新一个组合实体时，内部依赖对象也会自动更新

**理解**
各个细颗粒对象组合成一个粗颗粒对象，细颗粒对象和粗颗粒对象又可以组合成 组合实体。
这实体的内部状态变化也会引起各个颗粒的状态变化
通常使用在对象持久化中

> 模式结构与实现
* 1.组合实体（Composite Entity）
* 2.粗粒度对象（Coarse-Grained Object）
* 3.依赖对象（Dependent Object）

> 适用场景
* EJB的持久化可以看成是EJB中的数据的存储操作。例如：你如果new了100个Entity Bean，而这个bean保存了大量的数据，服务器的内存肯定吃不肖，所有服务器会把一些暂时不用的Entity Bean从内存中“请”到硬盘中，这个过程就是一个持久化。在需要时，服务器，准确的说应该是EJB容器再把数据从硬盘中“请”到内存中。这与操作系统的调页是相同的

#### 5.3.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E7%BB%84%E5%90%88%E5%AE%9E%E4%BD%93%E6%A8%A1%E5%BC%8F-UML.png)

#### 5.3.3 代码
[组合实体模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建依赖对象**

```java
/**
 * 依赖对象
 */
public class DependentObject1 {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
/**
 * 依赖对象
 */
public class DependentObject2 {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
```
**步骤2：创建粗粒度对象**

```java
/**
 * 创建粗粒度对象
 */
public class CoarseGrainedObject {
	DependentObject1 do1 = new DependentObject1();
	DependentObject2 do2 = new DependentObject2();

	public void setData(String data1, String data2){
		do1.setData(data1);
		do2.setData(data2);
	}

	public String[] getData(){
		return new String[] {do1.getData(),do2.getData()};
	}
}
```
**步骤3：创建组合实体**

```java
/**
 * 创建组合实体
 */
public class CompositeEntity {
	private CoarseGrainedObject cgo = new CoarseGrainedObject();

	public void setData(String data1, String data2) {
		cgo.setData(data1, data2);
	}

	public String[] getData() {
		return cgo.getData();
	}
}
```
**步骤4：创建使用组合实体的客户端类**

```java
/**
 * 创建使用组合实体的客户端类
 */
public class Client {
	private CompositeEntity compositeEntity = new CompositeEntity();

	public void printData(){
		for (int i = 0; i < compositeEntity.getData().length; i++) {
			System.out.println("Data: " + compositeEntity.getData()[i]);
		}
	}

	public void setData(String data1, String data2){
		compositeEntity.setData(data1, data2);
	}
}
```
**步骤5：使用 *Client* 来演示组合实体设计模式的用法**

```java
/**
 * 组合实体模式
 * 使用client来演示组合实体设计模式的用法
 */
public class CompositeEntityPatternDemo {
	public static void main(String[] args) {
		Client client = new Client();
		System.out.println("设置数据：");
		System.out.println("client.setData(\"Test\", \"Data\");");
		client.setData("Test", "Data");
		System.out.println("打印数据：");
		client.printData();
		System.out.println("----------------------");
		System.out.println("设置数据：");
		System.out.println("client.setData(\"Second Test\", \"Data1\");");
		client.setData("Second Test", "Data1");
		System.out.println("打印数据：");
		client.printData();
	}
}
```
**程序运行结果如下：**
```
设置数据：
client.setData("Test", "Data");
打印数据：
Data: Test
Data: Data
----------------------
设置数据：
client.setData("Second Test", "Data1");
打印数据：
Data: Second Test
Data: Data1
```
### 5.4 数据访问对象模式(Data Access Object Pattern[ˈdeɪtə ˈækses ˈɑːbdʒekt ˈpætərn])
#### 5.4.1 特点&优点&缺点&适用场景
>说明
* 数据访问对象模式（Data Access Object Pattern）或DAO模式用于把低级的数据访问API或操作从高级的业务服务中分离出来。
* 数据访问对象模式就是单独抽出来的数据访问层，专门用来操作数据的增删改查

> 模式结构与实现
* 数据访问对象接口（Data Access Object Interface）- 该接口定义了一个模型对象上要执行的标准操作，就是数据源操作API接口
* 数据访问对象实体类（Data Access Object concrete class）- 该类实现了上述的接口。该类负责从数据源获取数据，数据源可以是数据库，也可以是xml，或者是其他的存储机制，就是数据源CRUD操作具体的实现
* 模型对象/数值对象（Model Object/Value Object）- 该对象是简单的POJO，包含了get/set方法来存储通过DAO类查询出来的数据

> 适用场景
* 数据持久化CRUD封装，mybatis

#### 5.4.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E6%95%B0%E6%8D%AE%E8%AE%BF%E9%97%AE%E5%AF%B9%E8%B1%A1%E6%A8%A1%E5%BC%8F-UML.png)

#### 5.4.3 代码
[数据访问对象模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建数值对象**

```java
/**
 * 数据对象
 * 学生实体
 */
public class Student {
	private String name;
	private int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
```
**步骤2：创建数据访问对象接口**

```java
/**
 * 数据访问DAO接口
 */
public interface StudentDao {
	/**
	 * 获取所有学生
	 *
	 * @return
	 */
	List<Student> getAllStudents();

	/**
	 * 获取指定学号的学生
	 *
	 * @param rollNo
	 * @return
	 */
	Student getStudent(int rollNo);

	/**
	 * 更新学生信息
	 *
	 * @param student
	 */
	void updateStudent(Student student);

	/**
	 * 删除学生
	 *
	 * @param student
	 */
	void deleteStudent(Student student);
}
```
**步骤3：创建实现了上述接口的实体类**

```java
/**
 * 数据访问DAO实现
 */
public class StudentDaoImpl implements StudentDao {
	/**
	 * 数据源
	 */
	List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("张三", 0);
		Student student2 = new Student("杨戬", 1);
		students.add(student1);
		students.add(student2);
	}

	/**
	 * 获取所有学生
	 *
	 * @return
	 */
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	/**
	 * 获取指定学号的学生
	 *
	 * @param rollNo
	 * @return
	 */
	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	/**
	 * 更新学生信息
	 *
	 * @param student
	 */
	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("学生：学号 " + student.getRollNo() + ",姓名：" + student.getName() + "已更新到数据库中");
	}

	/**
	 * 删除学生
	 *
	 * @param student
	 */
	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("学生：学号 " + student.getRollNo() + ",姓名：" + student.getName() + "已从数据中删除");
	}
}
```
**步骤4：使用 *StudentDao* 来演示数据访问对象模式的用法**

```java
/**
 * 数据访问对象模式
 */
public class DataAccessObjectPattern {
	public static void main(String[] args) {
		// 定义一个数据访问DAO对象
		StudentDao studentDao = new StudentDaoImpl();

		// 打印所有学生
		System.out.println("获取所有学生：");
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("学生：[学号：" + student.getRollNo() + ",姓名：" + student.getName() + "]");
		}

		// 更新学生
		System.out.println("-------------------------------------");
		System.out.println("更新学号为0的学生：");
		Student student = studentDao.getStudent(0);
		System.out.println("原学生信息：[学号：" + student.getRollNo() + ",姓名：" + student.getName() + "]");
		student.setName("韩立");
		studentDao.updateStudent(student);

		// 获取学生
		System.out.println("-------------------------------------");
		System.out.println("获取学号为0的学生：");
		Student student1 = studentDao.getStudent(0);
		System.out.println("学生：[学号：" + student1.getRollNo() + ",姓名：" + student1.getName() + "]");

		// 删除学生
		System.out.println("-------------------------------------");
		System.out.println("删除学生：");
		studentDao.deleteStudent(student);

		// 打印所有学生
		System.out.println("-------------------------------------");
		System.out.println("获取所有学生：");
		for (Student student2 : studentDao.getAllStudents()) {
			System.out.println("学生：[学号：" + student2.getRollNo() + ",姓名：" + student2.getName() + "]");
		}
	}
}
```
**程序运行结果如下：**
```
获取所有学生：
学生：[学号：0,姓名：张三]
学生：[学号：1,姓名：杨戬]
-------------------------------------
更新学号为0的学生：
原学生信息：[学号：0,姓名：张三]
学生：学号 0,姓名：韩立已更新到数据库中
-------------------------------------
获取学号为0的学生：
学生：[学号：0,姓名：韩立]
-------------------------------------
删除学生：
学生：学号 0,姓名：韩立已从数据中删除
-------------------------------------
获取所有学生：
学生：[学号：1,姓名：杨戬]
```
### 5.5 前端控制器模式(Front Controller Pattern [frʌnt kənˈtroʊlər ˈpætərn])
#### 5.5.1 特点&优点&缺点&适用场景
>说明
* 前端控制器模式（Front Controller Pattern）是用来提供一个集中的请求处理机制，所有的请求都将由 前端控制器统一处理，该控制器可以做认证/授权/记录日志，或者跟踪请你求，然后再通过调度器把请求传给相应的处理类

> 模式结构与实现
* 前端控制器（Front Controller）- 处理应用程序所有类型请求的单个处理程序，用来做一些转发请求前的前置操作，该程序可以是web也可以桌面程序
* 调度器（Dispatcher）- 前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序
* 视图（View）- 视图是为请求而创建的对象

> 适用场景
* 希望在单个位置封装通用请求处理功能
* 希望实现动态请求处理，在不修改代码的情况下更改路由

#### 5.5.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E5%89%8D%E7%AB%AF%E6%8E%A7%E5%88%B6%E5%99%A8%E6%A8%A1%E5%BC%8F-UML.png)

#### 5.5.3 代码
[前端控制器模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建视图**

```java
/**
 * 视图
 */
public class HomeView {
	/**
	 * 渲染视图
	 */
	public void show() {
		System.out.println("调度主页");
	}
}
/**
 * 视图
 */
public class StudentView {
	/**
	 * 渲染视图
	 */
	public void show() {
		System.out.println("调度学生页面");
	}
}
```
**步骤2：创建调度器 Dispatcher**

```java
/**
 * 调度器
 */
public class Dispatcher {
	/**
	 * 视图
	 */
	private StudentView studentView;
	private HomeView homeView;

	public Dispatcher() {
		studentView = new StudentView();
		homeView = new HomeView();
	}

	/**
	 * 根据请求调度渲染不同的视图
	 *
	 * @param request
	 */
	public void dispatch(String request) {
		if (request.equalsIgnoreCase("STUDENT")) {
			studentView.show();
		} else {
			homeView.show();
		}
	}
}
```
**步骤3：创建前端控制器 FrontController**

```java
/**
 * 控制器
 */
public class FrontController {
	/**
	 * 调度器
	 */
	private Dispatcher dispatcher;

	public FrontController() {
		dispatcher = new Dispatcher();
	}

	/**
	 * 请求认证
	 *
	 * @return
	 */
	private boolean isAuthenticUser() {
		System.out.println("用户认证成功");
		return true;
	}

	/**
	 * 请求记录
	 *
	 * @param request
	 */
	private void trackRequest(String request) {
		System.out.println("记录请求：" + request);
	}

	/**
	 * 请求调度
	 *
	 * @param request
	 */
	public void dispatchRequest(String request) {
		// 记录每一个请求
		trackRequest(request);
		// 对用户进行身份验证
		if (isAuthenticUser()) {
			// 根据请求调度任务
			dispatcher.dispatch(request);
		}
	}
}
```
**步骤4：使用 *FrontController* 来演示前端控制器设计模式**

```java
/**
 * 前端控制器模式
 */
public class FrontControllerPatternDemo {
	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("Home");
		System.out.println("----------------------------------");
		frontController.dispatchRequest("Student");
	}
}
```
**程序运行结果如下：**
```
记录请求：Home
用户认证成功
调度主页
----------------------------------
记录请求：Student
用户认证成功
调度学生页面
```
### 5.6 拦截过滤器模式(Intercepting Filter Pattern[ˌɪntərˈseptɪŋ ˈfɪltər ˈpætərn])
#### 5.6.1 特点&优点&缺点&适用场景
>说明
* 拦截过滤器模式用于对应用程序的请求或响应做一些预处理/后处理
* 过滤器可以做认证/授权/记录日志，或跟踪请求，然后把请求传给相应的处理程序。

> 模式结构与实现
* 过滤器（Filter）- 过滤器在请求处理程序执行请求之前或之后，执行某些任务
* 过滤器链（Filter Chain）- 过滤器链带有多个处理器，并在Target上按照定义的顺序执行这些过滤器
* Target - Target对象是请求处理程序
* 过滤管理器（Filter Manager）- 过滤管理器管理过滤器和过滤器链
* 客户端（Client）- Client 是向Target对象发送请求的对象

> 适用场景
* java springboot/mvc web请求过滤器
* cas协议权限认证对接

#### 5.6.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E6%8B%A6%E6%88%AA%E8%BF%87%E6%BB%A4%E5%99%A8%E6%A8%A1%E5%BC%8F-UML.png)

#### 5.6.3 代码
[拦截过滤器模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建过滤器接口**

```java
/**
 * 过滤器接口
 */
public interface Filter {
	/**
	 * 执行过滤器
	 *
	 * @param request
	 */
	void execute(String request);
}
```
**步骤2：创建过滤器接口实现，请求鉴权过滤器、请求日志过滤器**

```java
/**
 * 请求鉴权过滤器
 */
public class AuthenticationFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("请求鉴权中：" + request);
	}
}
/**
 * 请求日志过滤器
 */
public class DebugFilter implements Filter {
	@Override
	public void execute(String request) {
		System.out.println("请求日志：" + request);
	}
}
```
**步骤3：创建过滤链**

```java
/**
 * 过滤链
 */
@Data
public class FilterChain {
	/**
	 * 过滤器列表
	 */
	private List<Filter> filters = new ArrayList<>();
	/**
	 * 请求的目标
	 */
	private Target target;

	/**
	 * 添加过滤器
	 *
	 * @param filter
	 */
	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	/**
	 * 遍历过滤器，执行请求目标
	 *
	 * @param request
	 */
	public void execute(String request) {
		// 遍历过滤器执行
		for (Filter filter : filters) {
			filter.execute(request);
		}
		// 进入目标处理器处理请求
		target.execute(request);
	}
}
```
**步骤4：创建过滤器管理器**

```java
/**
 * 过滤器管理器
 */
public class FilterManager {
	/**
	 * 过滤器链
	 */
	FilterChain filterChain;

	public FilterManager(Target target) {
		this.filterChain = new FilterChain();
		this.filterChain.setTarget(target);
	}

	/**
	 * 添加过滤器
	 * @param filter
	 */
	public void setFilter(Filter filter) {
		filterChain.addFilter(filter);
	}

	/**
	 * 过滤器请求
	 * @param request
	 */
	public void filterRequest(String request) {
		filterChain.execute(request);
	}
}
```
**步骤5：创建目标请求类**

```java
/**
 * 请求目标
 */
public class Target {
	public void execute(String request) {
		System.out.println("执行请求：" + request);
	}
}
```
**步骤6：创建过滤器和请求，使请求处理前经过过滤器**

```java
/**
 * 拦截过滤器模式
 */
public class InterceptingFilterPatternDemo {
	public static void main(String[] args) {
		System.out.println("创建过滤器");
		// 过滤器管理器
		FilterManager filterManager = new FilterManager(new Target());
		// 添加认证过滤器
		System.out.println("添加权限过滤器");
		filterManager.setFilter(new AuthenticationFilter());
		// 添加日志过滤器
		System.out.println("添加日志过滤器");
		filterManager.setFilter(new DebugFilter());

		System.out.println("------------------------------------");
		// 客户端
		Client client = new Client();
		System.out.println("创建客户端");
		// 给客户端设置过滤器管理器
		System.out.println("设置过滤器");
		client.setFilterManager(filterManager);
		// 发送请求
		System.out.println("发起请求");
		client.sendRequest("Home");
	}
}
```
**程序运行结果如下：**
```
创建过滤器
添加权限过滤器
添加日志过滤器
------------------------------------
创建客户端
设置过滤器
发起请求
请求鉴权中：Home
请求日志：Home
执行请求：Home
```
### 5.7 服务定位器模式(Service Locator Pattern[ˈsɜːrvɪs loʊˈkeɪtər ˈpætərn])
#### 5.7.1 特点&优点&缺点&适用场景
>说明
* 服务定位器模式（Service Locator Pattern）用在我们想试用JNDI查询定位各种服务的时候。考虑到为某个服务查找JNDI的代价很高，服务定位器模式充分利用了缓存技术。在首次请求某个服务时，服务定位器在JNDI中查找服务，并缓存该服务对象。当再次请求相同的服务时，服务定位器会在它的缓存中查找，这样可以在很大程度上提高应用程序的性能

> 模式结构与实现
* 服务（Service） - 实际处理请求的服务。对这种服务的引用可以在JNDI服务器中查找到
* Context/初始的Context -JDNI Context带有对要查找的服务的引用
* 服务定位器（Service Locator）- 服务定位器是通过JNDI查找和缓存服务来获取服务的单点接触
* 缓存（Cache）- 缓存存储服务的引用，以便复用它们
* 客户端（Client）- Client是通过ServiceLocator调用服务的对象

> 适用场景
* 使用通用接口来访问不同种类的服务

#### 5.7.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E6%9C%8D%E5%8A%A1%E5%AE%9A%E4%BD%8D%E5%99%A8%E6%A8%A1%E5%BC%8F-UML.png)

#### 5.7.3 代码
[服务定位器模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建服务接口**

```java
/**
 * 实际处理请求的服务。这种服务的引用可以在JNDI服务器中查到
 */
public interface Service {
	String getName();

	void execute();
}
```
**步骤2：创建服务接口的实现**

```java
/**
 * 具体的服务
 */
public class Service1 implements Service {
	@Override
	public String getName() {
		return "Service1";
	}

	@Override
	public void execute() {
		System.out.println("执行服务1中...");
	}
}
/**
 * 具体的服务
 */
public class Service2 implements Service{
	@Override
	public String getName() {
		return "Service2";
	}

	@Override
	public void execute() {
		System.out.println("执行服务2中...");
	}
}
```
**步骤3：创建服务缓存容器**

```java
/**
 * 缓存存储服务的引用，以便复用他们
 */
public class Cache {
	private List<Service> services;

	public Cache() {
		this.services = new ArrayList<>();
	}

	public Service getServices(String serviceName) {
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(serviceName)) {
				System.out.println("返回缓存" + serviceName + "对象");
				return service;
			}
		}
		return null;
	}

	/**
	 * 添加服务
	 * 如果服务已存在，则退出
	 * @param newService
	 */
	public void addService(Service newService) {
		boolean exists = false;
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(newService.getName())) {
				exists = true;
			}
		}
		if (!exists) {
			services.add(newService);
		}
	}
}
```
**步骤4：创建服务查找工具**

```java
/**
 * JNDI Context带有对要查找的服务的引用
 */
public class InitialContext {
	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("Service1")) {
			System.out.println("创建一个新的Service1对象");
			return new Service1();
		} else if (jndiName.equalsIgnoreCase("Service2")) {
			System.out.println("创建一个新的Service2对象");
			return new Service2();
		}
		return null;
	}
}
```
**步骤5：创建服务定位器**（从缓存中找服务，不存在就让服务查找器创建一个并缓存起来）

```java
/**
 * 服务定位器是通过JNDI查找和缓存服务来获取的单点接触
 */
public class ServiceLocator {
	/**
	 * 全局静态缓存对象
	 */
	private static Cache cache;

	static {
		cache = new Cache();
	}

	/**
	 * 获取服务
	 * @param jndiName
	 * @return
	 */
	public static Service getService(String jndiName) {
		// 从缓存中获取服务
		Service service = cache.getServices(jndiName);
		if (service != null) {
			// 缓存中存在服务则返回
			return service;
		}

		InitialContext context = new InitialContext();
		// 从JNDI上下文中创建和查找一个服务对象
		Service service1 = (Service) context.lookup(jndiName);
		// 把获取的服务存储到缓存中，只有服务不存在缓存中才会添加到缓存中
		cache.addService(service1);
		return service1;
	}
}
```
**步骤6：从服务定位器中获取指定的服务**

```java
/**
 * 服务定位器模式
 */
public class ServiceLocatorPatternDemo {
	public static void main(String[] args) {
		// service1和service2都是首次创建并缓存起来
		Service service = ServiceLocator.getService("service1");
		service.execute();
		service = ServiceLocator.getService("service2");
		service.execute();

		// 后续在使用service1和service2是走的缓存中取的
		service = ServiceLocator.getService("service1");
		service.execute();
		service = ServiceLocator.getService("service2");
		service.execute();
	}
}
```
**程序运行结果如下：**
```
创建一个新的Service1对象
执行服务1中...
创建一个新的Service2对象
执行服务2中...
----------------------------------------
再次从服务定位器中获取service1和2
返回缓存service1对象
执行服务1中...
返回缓存service2对象
执行服务2中...
```
### 5.8 传输对象模式(Transfer Object Pattern[trænsˈfɜːr ɑːbdʒekt pætərn])
#### 5.8.1 特点&优点&缺点&适用场景
>说明
* 传输对象模式（Transfer Object Pattern）用于从客户端向服务器传输多个属性的数据（实体）。传输对象也称为数值对象。传输对象是一个具有getter/setter方法的简单的POJO类，它是可序列化的，所以它可以通过网络传输。它没有任何的行为。服务器端的业务类通常从数据库读取数据，然后填充到POJO，并把它发送到客户端或按值传递它。对于客户端，传输对象是只读的。客户端可以创建自己的传输对象，并把它传递给服务器，以便一次性更新数据库中的值

> 模式结构与实现
* BO：业务对象，封装业务逻辑的java对象，通过调用DAO从数据库中读取数据，然后填充到VO里
* VO：传输对象，把从业务对象BO中获取的数据填充到值对象VO中，一般用作业务层之间的数据传递，可以和表对应
* 客户端（Client）：客户端可以发送请求或者发送传输对象到业务对象

> 适用场景
* mybatis增删改查

#### 5.8.2 UML类图

> UML类图

![image](https://jjhan.oss-cn-beijing.aliyuncs.com/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/images/%E4%BC%A0%E8%BE%93%E5%AF%B9%E8%B1%A1%E6%A8%A1%E5%BC%8F-UML.png)

#### 5.8.3 代码
[传输对象模式](https://github.com/hanjunjun/design-patterns/tree/main/src/main/java/com/hanjunjun/designpatterns/creational/factorymethod)
**步骤1：创建传输对象**

```java
/**
 * 传输对象
 */
public class StudentVO {
	private String name;
	private int rollNo;

	public StudentVO(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
```
**步骤2：创建业务对象**

```java
/**
 * 业务对象
 */
public class StudentBO {
	List<StudentVO> students;

	public StudentBO() {
		this.students = new ArrayList<>();
		StudentVO student1 = new StudentVO("张无忌", 0);
		StudentVO student2 = new StudentVO("韩立", 1);
		students.add(student1);
		students.add(student2);
	}

	/**
	 * 删除学生
	 *
	 * @param student
	 */
	public void deleteStudent(StudentVO student) {
		students.remove(student.getRollNo());
		System.out.println("学生：RollNo" + student.getRollNo() + "已从数据库中删除");
	}

	/**
	 * 获取所有学生
	 *
	 * @return
	 */
	public List<StudentVO> getAllStudents() {
		return students;
	}

	/**
	 * 获取指定学号的学生
	 *
	 * @param rollNo
	 * @return
	 */
	public StudentVO getStudent(int rollNo) {
		return students.get(rollNo);
	}

	/**
	 * 更新学生信息
	 *
	 * @param student
	 */
	public void updateStudent(StudentVO student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("学生：Roll No" + student.getRollNo() + "已在数据库中更新");
	}
}
```
**步骤3：从StudentBO业务对象中获取传输对象StudentVO**

```java
/**
 * 传输对象模式
 * VO：传输对象
 * BO：业务对象
 * BO获取VO传输对象
 */
public class TransferObjectPattern {
	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();
		// 输出所有学生
		System.out.println("输出所有学生信息StudentVO：");
		for (StudentVO student : studentBusinessObject.getAllStudents()) {
			System.out.println("学生：[RollNo:" + student.getRollNo() + ",Name:" + student.getName() + "]");
		}

		// 更新学生
		System.out.println("----------------------------------------");
		System.out.println("更新学生：");
		StudentVO student = studentBusinessObject.getAllStudents().get(0);
		student.setName("李化元");
		studentBusinessObject.updateStudent(student);

		// 获取学生
		System.out.println("----------------------------------------");
		System.out.println("获取学生信息StudentVO：");
		StudentVO student1 = studentBusinessObject.getStudent(0);
		System.out.println("学生：[RollNo:" + student1.getRollNo() + ",Name:" + student1.getName() + "]");
	}
}
```
**程序运行结果如下：**
```
输出所有学生信息StudentVO：
学生：[RollNo:0,Name:张无忌]
学生：[RollNo:1,Name:韩立]
----------------------------------------
更新学生：
设置学号=0的学生姓名为李化元
学生：Roll No0已在数据库中更新
----------------------------------------
获取学生信息StudentVO：
学生：[RollNo:0,Name:李化元]
```