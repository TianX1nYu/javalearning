五步：
1、无参构造方法执行
2、给对象赋值(注入)
3、initBean
4、使用Bean
5、销毁Bean

七步：(多了初始化Bean的前和后)
1、无参构造方法执行
2、给对象赋值(注入)
3、执行"Bean后处理器"的before方法
4、initBean
5、执行"Bean后处理器"的after方法
6、使用Bean
7、销毁Bean

十步(比七步多的三步)：
1、before之前，检查Bean是否实现了Aware的相关接口，
如果实现了接口则调用这些接口中的方法。然后调用这些方法的目的是为了给你传递一些数据，让你更加方便使用。
2、before方法之后，检查Bean是否实现了InitializingBean接口，实现了则调用接口方法
3、使用bean之后，销毁bean之前，是否实现了DisposableBean接口，实现了则调用接口方法