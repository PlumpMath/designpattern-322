package simpleFactory;

public class OutputFactory
{
	public Output getOutput()
	{
		// 下面两行代码用于控制系统到底使用Output的哪个实现类。
		// return new Printer();
		return new BetterPrinter();
	}
}
