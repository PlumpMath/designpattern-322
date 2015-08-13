package abstactFactory;

public class BetterPrinterFactory implements OutputFactory
{
	public Output getOutput()
	{
		// 该工厂只负责产生BetterPrinter对象
		return new BetterPrinter();
	}
}
