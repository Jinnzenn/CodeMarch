package Chapter301Prototype.Section401DesignPattern.CreationalPattern.FactoryMethod;

import Chapter301Prototype.Section401DesignPattern.CreationalPattern.SimpleFactory.Product;

public abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}
