package homework;

public class Main01 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		// 9.isPowerOn false인 상태로 channel, volume 수정 후, toString()으로 확인
		t.setPowerOn(false);
		t.setChannel(30);
		t.setVolume(99);
		System.out.println(t.toString());
		
		// 10.isPowerOn true인 상태로 channel, volume 수정 후, toString()으로 확인
		t.setPowerOn(true);
		t.setChannel(50);
		t.setVolume(15);
		System.out.println(t.toString());
		
		// 11.isPowerOn true인 상태로 channel만 수정 후, toString()으로 확인
		t.setPowerOn(true);
		t.setChannel(20);
		System.out.println(t.toString());
		
		// 12.gotoPrevChannel()(이전 채널로 되돌리기) 호출 후, toString()으로 확인
		t.gotoPrevChannel();
		System.out.println(t.toString());
		
	}

}
