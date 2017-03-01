#Data Structures with Java (Second Edition)
---
🔽**Java类型**🔽

	Java数据类型
		|---- 原始类型
		|		|---- 数值类型
		|		|		|---- 整型
		|		|		|		|---- 整数
		|		|		|		|		|---- byte
		|		|		|		|		|---- short
		|		|		|		|		|---- int
		|		|		|		|		|---- long
		|		|		|		|---- 字符
		|		|		|				|---- byte
		|		|		|---- 浮点类型
		|		|				|---- float
		|		|				|---- double
		|		|---- 布尔类型
		|				|---- boolean
		|---- 引用类型
				|---- 数据组
				|---- 接口
				|---- 类
				|---- 枚举

---
🔽**Java定义一个类的格式**🔽

```java
modifers class class-name associations {
	declarations
}
```
modifers 是关键字（比如 ==public== 和 ==abstract==），class-name 是表示类名称的标识符（比如Person），associations 是子句（比如==extends== Object），declarations 是对类成员的声明。

---
🔽**构造函数与其他方法的区别**🔽

构造函数是创建对象的子程序，它与方法类似，区别在于：

* 其名称和类名相同
* 没有返回类型
* 通过 ==new== 操作符调用

🔽**修饰符**🔽

>用于类、接口和枚举的修饰符：

|修饰符|含义|
|:-:|:-:|
|abstract|该类不能被实例化|
|final|该类不能被继承|
|strictfp|浮点结果将与平台无关|
|public|可以从任何其他类访问|

>构造函数修饰符

|修饰符|含义|
|:-:|:-:|
|public|访问范围为所有类|
|protected|访问范围仅限于当前类及其子类|
|private|访问范围仅限于当前类|

>字段修饰符

|修饰符|含义|
|:-:|:-:|
|final|必须初始化而且不能对其进行改变|
|static|同一存储适用于该类的所有实例|
|public|访问范围为所有类|
|protected|访问范围仅限于当前类及其子类|
|private|访问范围仅限于当前类|
|transient|不是对象的永久状态|
|volatile|可以由异步线程修改|


>方法修饰符

|修饰符|含义|
|:-:|:-:|
|abstract|主体内容缺失，需要在子类中定义|
|public|访问范围为所有类|
|protected|访问范围仅限于当前类及其子类|
|private|访问范围仅限于当前类|
|final|在类继承中不能被重写|
|static|不带有隐式参数|
|native|主体内容是在另一种编程语言中实现的|
|strictfp|浮点结果将与平台无关|
|synchronized|必须锁定后才能被线程调用|
|volatile|可以由异步线程修改|

>局部变量修饰符

|修饰符|含义|
|:-:|:-:|
|final|必须初始化而且不能对其进行改变|

🔽**复习题汇总**🔽

==Chapter 1==
>1.1 什么是需求文档？

	答：软件开发项目的需求文档是对软件应该实现的内容的准确描述。

>1.2 在软件开发过程中，设计阶段和实现阶段的区别是什么？

	答：在软件开发过程中，设计阶段指定要使用的组件（类）和这些组件之间的关系，而实现阶段实际编写计算机程序代码。

>1.3 一个类的状态和行为之间的区别是什么？

	答：类的状态包含字段的值，而类的行为由其方法定义。

>1.4 什么是抽象数据类型？

	答：抽象数据类型是对类型操作的描述：即该类型的实例可以执行哪些操作。

>1.5 一个Java程序的组成部分有哪些？

	答：Java程序是一个包含main()方法的Java类，main()方法必须具有如下头部：
		public static void main(String[] args)

>1.6 类可以具有什么样的成员？

	答：类成员可以是字段、构造函数、方法、嵌套类、嵌套接口或某种枚举类型。

>1.7 什么是隐式参数？

	答：方法的隐式参数是方法调用所附属于的对象。

>1.8 toString()方法的作用是什么？

	答：返回代表其隐式参数状态的一个String对象。

>1.9 equals()方法的作用是什么？

	答：当且仅当隐式参数和显式参数的状态（内容）相同时，equals()方法才返回true。

>1.10 public、private和protected之间的区别是什么？

	答：见上表（修饰符）。

>1.11 什么是包？

	答：包是一种命名空间，也就是说是一组类、接口和枚举类型的名称，可以用于将同名的类、接口和枚举类型区别开来。

>1.12 抽象类和抽象数据类型之间的区别是什么？

	答：抽象类是至少包含一种抽象方法（没有主体内容的方法）的Java类，而抽象数据类型是对某种类型操作的描述，
	   可以通过任意一种面向对象的编程语言实现。

>1.13 构造函数和方法之间的区别是什么？

	答：构造函数是类的一种成员函数，用来创建该类的对象，它与该类具有相同的名称，没有返回类型，而且是使用new操作符来调用的；
	   方法是类的一种普通成员函数，它具有自己的名称、返回类型（可以为void），而且是使用.操作符来调用的。

>1.14 类方法和实例方法之间的区别是什么？

	答：类方法被声明为static而且是使用类名称来调用的，例如：
			double y = Math.abs(x);
	   调用Math类中定义的类方法abs()。
	   而实例方法被声明为不带有static修饰符且是使用所附属于的对象名称来调用的，例如：
	   		double x = random.nextDouble();
	   调用Random类中定义的类方法nextDouble()，而且附属于该类的一个实例：random对象。

>1.15 对象相等和对对象的引用相等之间的区别是什么？

	答：如果两个对象具有相同的数据值（即相同的状态），那么它们就应该相等。如果两个引用引用的是同一对象，则这两个引用相等。
	   条件(p == q)测试引用p和引用q是否相等，而不是它们所引用的对象是否相等。

>1.16 解释以下两种代码的输出结果之间的区别。

```java
String s;
System.out.println("s="+s);
```
```
String s = new String();
System.out.println("s="+s);
```

	第一个输出：s=null
	第二个输出：s=
	第一个中，引用s被默认初始化为null，不存在String对象。第二个中，s被初始化为指代空的String对象。

> 1.17 将一个字段声明为private并声明一个增变方法来允许公众改变该字段的目的是什么？这与将该字段直接声明为public是一样的吗？

	答：使公众可以使用增变方法来改变字段的好处是你可以控制字段的改变方式。

> 1.18 什么是枚举类型？

	答：枚举类型是一种类型，通过关键字enum定义，并列出该类型的各种可能值。

> 1.19 组合和聚合之间的区别是什么？

	答：对于组合，当一种类型包含另一种类型时，后者对象的存在完全受控于前者的对象；后者唯一受限于前者，而且不能被任何外部对象改变。
	   而对于聚合，构成的元素存在于该集合的外部，可以被其他类改变，甚至可以属于其他聚合。

> 1.20 什么是多态？

	答：多态描述的是对象或变量可以在不同的环境中作为不同的类型来处理的一种方式。例如：
		如果B是从A派生来的，继承允许B类型的参数传递给A类型的参数。








