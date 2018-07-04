package cao.test2;

public class Single {
	/*
	 * //单线程
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
	 * //多线程v1但效率不高
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
	//多线程v2效率高
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
	//静态内部类
	private static class Test{
		private static final Single SINGLE = new Single();
	}
	private Single(){
		
	}
}
