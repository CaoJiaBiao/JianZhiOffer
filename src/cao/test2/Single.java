package cao.test2;

public class Single {
	/*
	 * //���߳�
	private static Single single = null;
	private Single(){
		
	}
	public static Single getSingle() {
		if (single == null) {
			single = new Single();
			return single;
		}else {
			return single;
		}
	}*/
	/*
	 * //���߳�v1��Ч�ʲ���
	private static Single single = null;
	private Single(){
		
	}
	public static synchronized Single getSingle() {
		if (single == null) {
			single = new Single();
			return single;
		}else {
			return single;
		}
	}*/
	//���߳�v2Ч�ʸ�
	/*private static Single single = null;
	private Single(){
		
	}
	public static Single getSingle(){
		if (single == null) {
			synchronized (Single.class) {
				if (single == null) {
					single = new Single();
				}
			}
		}
		return single;
	}*/
	//��̬�ڲ���
	private static class Test{
		private static final Single SINGLE = new Single();
	}
	private Single(){
		
	}
}
