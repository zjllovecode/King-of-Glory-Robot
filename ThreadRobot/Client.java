package ThreadRobot;

/**
 * @author zjl 线程运行场景类
 */
public class Client {

	public static void main(String[] args) {

		TRobot zd = new TRobot(1195, 52, 250, 253, 253);// 点击自动
		Thread a = new Thread(zd);
		a.start();

		TRobot jx = new TRobot(665, 198, 218, 207, 110);// 点击屏幕继续
		Thread b = new Thread(jx);
		b.start();

		TRobot zctz = new TRobot(1050, 685, 213, 126, 24);// 点击再次挑战
		Thread c = new Thread(zctz);
		c.start();

		TRobot cg = new TRobot(1000, 600, 229, 164, 46);// 点击闯关
		Thread d = new Thread(cg);
		d.start();

		TRobot tg = new TRobot(1219, 81, 204, 228, 243);// 点击跳过
		Thread f = new Thread(tg);
		f.start();
	}

}
