# King of Glory Robot
这是电脑端王者荣耀试炼模式自动刷金币的java脚本。

基于java自动化测试类Robot。

关于此类的说明请看 https://github.com/zjllovecode/Java-Robot

你需要：

1、java环境

2、需要下载模拟器（我这里是夜神模拟器 https://www.yeshen.com/ ）

3、你需要修改相应的像素点，和匹配的颜色值（下载一个屏幕取点工具 http://www.xdowns.com/soft/31/46/2008/soft_44917.html ）



17/9/9 上传kingOfGloryRobot 类

kingOfGloryRobot 类为初始上传的实现代码，是普通java类实现的代码有些重复，不过功能实现了。




17/9/15上传ThreadRobot包 

ThreadRobot包下为多线程版本，提取了业务逻辑，减少了相同代码的编写。

Client为程序入口，你需要修改相应（x,y,r,g,b）参数

GetRGBUtil 为工具类帮你打印出相应像素点的RGB（需下一个取点工具）
