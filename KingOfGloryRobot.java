package com.zjl.FirstOne;

//这是电脑端需要下载模拟器（我这里是夜神模拟器），王者荣耀试炼模式刷金币。你需要修改相应的像素点（下载一个屏幕取点工具）
//设置延迟是因为加载或游戏中有相应的延迟，让其延迟一点时间让处理器休息一下，避免无谓的判断
//代码可以优化，可以把点击鼠标方法单独提取出来为一个方法。我这里没做优化

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class KingOfGloryRobot {
	boolean equals1;
	boolean equals2;
	boolean equals3;
	boolean equals4;

	public void run() {
		try {
			Robot robot = new Robot();
			// 定义3秒的延迟切换到你的王者荣耀
			// Robot 开始写
			robot.delay(3000);
			while (true) {

				// 点击闯关
				do {
					Color e = robot.getPixelColor(1000, 600);
					Color f = new Color(229, 164, 46);
					equals3 = e.getRGB() == f.getRGB();
				} while (equals3 != true);
				robot.delay(1000);
				robot.mouseMove(1000, 600);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(5000);
			
				// 点击自动
				do {
					Color g = robot.getPixelColor(1195, 52);
					// 通过toString()方法获取的相应点的颜色RGB值
					// System.out.println(a.toString());
					Color h = new Color(250, 253, 253);// 自动按钮某一点的颜色值
					equals4 = g.getRGB() == h.getRGB();
				} while (equals4 != true);
				// 颜色相同
				robot.mouseMove(1195, 52);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(60000);//时间上限为60秒
				robot.delay(60000);
				
				// 点击屏幕继续
				do {
					Color a = robot.getPixelColor(665, 198);
					Color b = new Color(218, 207, 110);
					equals1 = a.getRGB() == b.getRGB();
				} while (equals1 != true);
				robot.delay(1000);
				robot.mouseMove(665, 198);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(3000);
				
				// 点击再次挑战
				do {
					Color c = robot.getPixelColor(1050, 685);
					Color d = new Color(213, 126, 24);
					equals2 = c.getRGB() == d.getRGB();
				} while (equals2 != true);
				robot.delay(1000);
				robot.mouseMove(1050, 685);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(3000);
			}

		} catch (

		AWTException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		KingOfGloryRobot robot = new KingOfGloryRobot();
		robot.run();
	}
}
