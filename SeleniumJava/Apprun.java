package SeleniumJava;

import java.io.IOException;

public class Apprun {

	public static void main(String[] args) throws IOException, InterruptedException {
		Process pr1,pr2;
		Runtime rt=Runtime.getRuntime();
		pr1=rt.exec("notepad.exe");
		
		String s[]=new String[]{"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe","C:\\Users\\Auto\\Downloads\\HunkVsTanks.mp4"};
		pr2=rt.exec(s);
		
		Thread.sleep(9000);
		pr1.destroy();
		pr2.destroy();
		
		
	}

}
