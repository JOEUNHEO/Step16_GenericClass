package test.fruit;

public class OrangeBox {
	//����ʵ�
	private Orange item;
	//��ü�� �����ϴ� �޼ҵ�
	public void push(Orange item) {
		this.item = item;
	}
	//��ü�� �������ִ� �޼ҵ�
	public Orange pull() {
		return item;
	}
}
