package tryclass;

public class Testclass {

	public static void main(String[] args) {
		Television tv1 = new Television();
		Television tv2 = new Television();

		tv1.setPleace("居間");
		tv2.setPleace("寝室");

		tv1.setChannel(1);
		tv2.setChannel(8);


		tv1.dispChannel();
		tv2.dispChannel();

	}
}

class Television{
	int channelNo;
	String pleace;

	void setChannel(int newChannelNo) {
		channelNo = newChannelNo;
	}

	void setPleace(String newPleace) {
		pleace = newPleace;
	}

	void dispChannel() {
		System.out.println(pleace + "にあるテレビの現在のチャンネルは " +  channelNo + " です");
	}
}
