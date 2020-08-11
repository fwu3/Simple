package learning.factory.pizzafm;

/* 工厂方法：设计思想是要避免依赖具体类 ！！！！注意，这里的 PizzaStore 即用到了工程模式  */
public abstract class PizzaStore {
 
	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
