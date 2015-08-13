package facade;

public class WaiterImpl implements Waiter
{
	// 模拟服务员上菜的方法
	public void serve(String food)
	{
		System.out.println("服务器员已将" + food + "端过来了，请慢用...");
	}
}
