package bridge;

public class Test
{
	public static void main(String[] args)
	{
		// 下面将得到“辣味”的牛肉面
		AbstractNoodle noodle1 = new BeefNoodle(new PepperySytle());
		noodle1.eat();
		// 下面将得到“不辣”的牛肉面
		AbstractNoodle noodle2 = new BeefNoodle(new PlainStyle());
		noodle2.eat();
		// 下面将得到“辣味”的猪肉面
		AbstractNoodle noodle3 = new PorkyNoodle(new PepperySytle());
		noodle3.eat();
		// 下面将得到“不辣”的猪肉面
		AbstractNoodle noodle4 = new PorkyNoodle(new PlainStyle());
		noodle4.eat();
	}
}
