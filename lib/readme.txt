一,如何在Android Studio中运行java程序?(2017/12/26)
今天想在Android Studio中运行个java main方法练习一下算法.所以就有了这个工程.
步骤:(不理解可见附图)
1,依次点击“File”——“New”——“New Module”，弹出“Create New Module”窗体，在窗体中选择“Java Library”，接着点击“Next”——“Finish”，完成一个Java程序的创建
2,这个时候的Java程序还不能运行，需要进行“运行/调试”配置后才能运行。依次打开菜单“Run”——“Edit Configurations”，弹出“Run/Debug Configurations”窗体。
3,点击左上角的“添加”图标，在下拉列表中选择“Application”，添加一个新的配置，名称为“Unnamed”。然后在右侧窗体的“Configuration”选项卡中设置好Main Class类路径
（包含主函数的那个类）和Working directory（工作目录）以及Use classpath of module（新添加的Module的名称），点击Apply按钮即可
4,接下来我们就可以在调试栏中选择刚才的配置“Unnamed”，然后点击调试或者运行按钮，即可运行我们刚才添加的Java程序了。
