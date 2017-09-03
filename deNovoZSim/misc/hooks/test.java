
public class test {
    public static void main(String[] args) {
        System.out.println("Java test");
        zsim.roi_begin();
	System.out.println("liot addition");
	int mul = 4;
        for (int i = 0; i < 42; i++) {
		zsim.heartbeat();
		mul+=4;
		System.out.println("i:" + i + " mul:" + mul);
	}
        zsim.roi_end();
        System.out.println("Java test done");
    }
}

