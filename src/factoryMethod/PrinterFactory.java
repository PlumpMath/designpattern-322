package factoryMethod;

public class PrinterFactory implements OutputFactory
{
	public Output getOutput()
	{
		// 该工厂只负责产生Printer对象
		return new Printer();
	}
}
