package ThreadRobot;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;

/**
 * @author zjl 相应点击鼠标线程类
 */
public class TRobot implements Runnable {
	private static Robot robot;
	static {// 使用静态代码块类只实例化一次Robot类
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	private int x, y, r, g, b; // 声明 位置xy 和rgb颜色值
	private boolean token;// 终止线程的令牌 可以设置一定次数后退出

	public TRobot(int x, int y, int r, int g, int b) {// 带参数构造函数
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	@Override
	public void run() {
		token = true;
		while (token) {
			this.action();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 点击鼠标的方法
	 */
	public void action() {
		Color color1 = robot.getPixelColor(x, y);// 获取一点颜色
		Color color2 = new Color(r, g, b);// 预定某一点颜色RGB
		boolean equals = color1.getRGB() == color2.getRGB();
		if (equals) {
			// 颜色相同
			robot.delay(1000);// 延迟一秒
			robot.mouseMove(x, y);// 移动鼠标
			robot.mousePress(InputEvent.BUTTON1_MASK);// 点击
			robot.mouseRelease(InputEvent.BUTTON1_MASK);// 释放
			robot.delay(1000);// 延迟一秒
			// System.out.println("颜色相同");
		} else {
			// System.out.println(Thread.currentThread().getName()+"运行");
		}
	}

}
