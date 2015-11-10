package patterns.behavioral.memento;

/**
 * 
 * MEMONTO 备忘录模式
 * 
 * - internally changes the state of the whole instance
 * 
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 这样以后就可将该对象恢复到原先保存的状态。
 * 
 * 备忘录对象存储原发器(originator)对象在某个瞬间的内部状态，
 * 当需要设置原发器的检查点时，取消操作机制会向原发器请求一个备忘录。原发器用描述当前状态的信息初始化
 * 该备忘录。只有原发器可以向备忘录中存取信息，备忘录对其他对象不可见
 * 
 * - Memento包含需要被存储的对象状态
 * - Originator创建并存储对象状态至Memento
 * - Caretaker负责从Memento中恢复对象状态
 * 
 * - 数据库事务回滚操作
 * - 相关模式
 *   命令模式
 * 
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Caretaker ct = new Caretaker();
		Originator ori = new Originator();
		ori.set("state1");
		ct.addMemento(ori.saveToMemento());
		ori.set("state2");
		ct.addMemento(ori.saveToMemento());
		ori.set("state3");
		ct.addMemento(ori.saveToMemento());
		ori.restoreFromMemento(ct.getMemento(0));
		System.out.println(ori);
	}

}
