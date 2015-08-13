package abstactFactory;

public class OutputFactoryFactory
{
	//仅定义一个方法用于返回输出设备。
	public static OutputFactory getOutputFactory(
		String type)
	{
		if (type.equalsIgnoreCase("better"))
		{
			return new BetterPrinterFactory();
		}
		else
		{
			return new PrinterFactory();
		}
	}
}
