package midexercise;

public class Member extends Visitor{
	private int rewardPoint;
	private final int thresholdPointsToGetReward = 10, rewardToEMoney = 10;
	
	public Member(String vc, String vn, int bl) {
		super(vc, vn, bl);
		rewardPoint = 0;
	}
	
	public void deductEmoney(int deduction) throws Exception{
		super.deductEmoney(deduction);
		addRewardPoint(1);
	}
	
	private void addRewardPoint(int add) {
		rewardPoint += add;
		if (rewardPoint >= thresholdPointsToGetReward) {
			eMoneyBalance += rewardToEMoney;
			rewardPoint -= thresholdPointsToGetReward;
		}
		System.out.println("rp " + rewardPoint);
	}
}
