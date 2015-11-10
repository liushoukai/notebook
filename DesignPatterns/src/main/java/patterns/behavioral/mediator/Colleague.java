package patterns.behavioral.mediator;

public interface Colleague {
	// 飞机向塔台发送消息
	public void send(String message);
	// 飞机接收塔台的消息
	public void receive(String message);
}
