# BeanInheritance
https://www.sagarandcompany.com/
# Xml based inheritance 

```java
public class Animal {
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```


```java
package com.sagarandcompany.beaninheritance;

public class Elephant extends Animal {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "location='" + location + '\'' + "Animal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +

                '}';
    }
}
```

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-4.3.xsd">

    <bean id="animal"
          class="com.sagarandcompany.beaninheritance.Animal">
        <property name="name" value="Hello!"/>
        <property name="age" value="24"/>
    </bean>


    <bean id="elephant"
          class="com.sagarandcompany.beaninheritance.Elephant" parent="animal">
        <property name="location" value="Delhi!"/>
    </bean>

</beans>

```

# Annotaion based inheritance 

```java
@Configuration
public class JavaConfig {
    @Bean
    public Elephant getElephant() {
        Elephant elephant = new Elephant();
        initilizationAnimal(elephant);
        elephant.setLocation("Banglore");
        return elephant;
    }

    public void initilizationAnimal(Animal animal) {
        animal.setAge(24);
        animal.setName("Lion");
    }
}
```

