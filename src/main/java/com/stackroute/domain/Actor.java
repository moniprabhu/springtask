package com.stackroute.domain;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
public class Actor implements BeanNameAware, BeanFactoryAware {
    private String name;
    private String gender;
    private int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public Actor(){}



    public String getName() {

        return name;
    }

    public String getGender() {

        return gender;
    }

    public int  getAge() {
        return age;
    }

    public void setName(String name) {

        this.name = name;
    }


    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setAge(int age) {

        this.age = age;
    }
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("In BeanFactoryAware "+beanFactory );

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("in BeanNameAware "+s);

    }
}
