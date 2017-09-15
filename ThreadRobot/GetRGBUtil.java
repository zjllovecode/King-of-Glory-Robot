package ThreadRobot;


import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.util.Random;


/**
 * @author zjl
 *工具类获取某一点RGB值
 */
public class GetRGBUtil {

	private static Robot robot;
	static {// 使用静态代码块类只实例化一次Robot类
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public void GetRgb(int x, int y) {
		robot.delay(3000);// 延迟三秒供你打开相应界面
		Color color = robot.getPixelColor(x, y);
		System.out.println(color.toString());
	}

	public static void main(String[] args) {
		GetRGBUtil g = new GetRGBUtil();
		g.GetRgb(1219, 81);//传入真实像素点

	}

}
