package test.fruit;

public class AppleBox {
	//����ʵ�
	private Apple item;
	//��ü�� �����ϴ� �޼ҵ�
	public void push(Apple item) {
		this.item = item;
	}
	//��ü�� �������ִ� �޼ҵ�
	public Apple pull() {
		return item;
	}
}
