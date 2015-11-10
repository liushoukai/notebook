package patterns.structural.composite;

/**
 * 
 * COMPOSITE
 * 
 * taking an instance of same abstract/interface type into a tree structure
 *
 * - 意图
 * 将对象组成树形结构以表示“整体-部分”的层次结构。Composite使得用户对单个对象和组合对象的使用具有一致性
 * 
 * - 核心：给出了描述树形结构如何抽象分支节点和叶子节点的方案
 * Composite模式的核心是一个抽象类，它既可以代表图元，又可以代表图元的容器，在图形系统中的这个类就是Graphic，
 * 在图形系统中的这个类就是Graphic，它声明一些与特定图形对象相关的操作，如Draw。同时，它也声明了所有的组合对象共享的
 * 一些操作，例如一些操作用于访问和管理它的子部件
 * 
 * - Component 分支、叶子节点的抽象父类
 * - 为树中所有分支\叶子节点对象声明接口
 * - 在适当的情况下，实现所有分支\叶子节点 类共有接口
 * - 声明一个接口用于访问和管理叶子节点
 * - 声明一个接口用于访问其父节点
 * 
 * - Composite 分支节点
 * - 定义叶子节点的行为
 * - 存储叶子节点的引用
 * - 实现子部件有关的操作
 * 
 * - Leaf 叶子节点
 * - 在组合中标识叶子节点对象，叶子节点没有子节点
 * - 在组合中定义图元对象的行为
 * 
 * - 协作
 * 用户使用Component类接口与组合结构中的对象进行交互。
 * 如果接收者是一个叶子节点，则直接处理请求。
 * 如果接受者是一个分支节点，则通常将请求发送给它的子节点
 * 
 * - 相关模式
 * - Responsibility of Chain 用于分支节点和叶子节点的连接
 * - Decorator 装饰者模式与组合模式使用公共的父类，装饰着必须支持所有相关的接口
 * - Flyweight 让你共享组件，但不能再引用他们的父部件
 * - Itertor 可用来遍历Composite分支节点
 * - Visitor 将分布在分支节点和叶子节点中的操作和行为局部化
 * 
 * @author LSK
 * 
 */
public class Client {
	public static void main(String[] args) {
		Composite root = new Composite("root");
		Leaf leaf0 = new Leaf("leaf0");	
		root.addComponent(leaf0);
		Composite branch = new Composite("branch");
		Leaf leaf1 = new Leaf("leaf1");
		Leaf leaf2 = new Leaf("leaf2");
		root.addComponent(branch);
		branch.addComponent(leaf1);
		branch.addComponent(leaf2);
		root.show();
	}
}
