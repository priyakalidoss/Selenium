package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mob=new Mobile();
		mob.makeCall("iPhone15",170.5F);
		mob.sendMsg(true,85000);

	}
	public void makeCall(String mobileModel,float mobileWeight ) {
		System.out.println("Mobile model:" +mobileModel);
		System.out.println("Mbile weight:" +mobileWeight);
	}
	public void sendMsg(boolean isFullCharged,int mobileCost ) {
		System.out.println("Is Mobile fullycharged:" +isFullCharged);
		System.out.println("Mobile cost is:" +mobileCost);
		System.out.println("This is my mobile");
	}

}
