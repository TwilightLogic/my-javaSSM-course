### Scenario:

Spring MVC 默认提供了一些常用的类型转换器，这些类型转换器可以**将客户端提交的参数自动转换为处理器形参类型的数据**。

但是！默认类型转换器并不能将提交的参数转换味所有的类型，此时就需要开发者自定义类型转换器，来将参数转换为程序所需要的类型。

Spring框架提供了 `org.springframework.core.convert.converter.Converter` 接口作为类型转换器，开发者可以通过实现 `Converter` 接口来自定义类型转换器。

泛型参数 `S` 表示源类型，`T` 表示目标类型，而 `convert()`方法将源类型转换为目标类型返回，方法内的具体转换规则可由开发者而定。

```java
public interface Converter<S, T> {
    T convert(S source);
}
```

我们在这个project会自定义一个converter，这个converter可以把 `String` 类型自动转化为 `Date` 类型。 