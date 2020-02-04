import java.io.*;
import java.awt.Desktop;

public class main {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please put in something!");
		} else if (args[0].equals("sun")) {
			System.out.println("Praise the " + args[0] + "!");

			try {
				File file = new File("/mnt/d/vu/y2/p4/systems_design/workspace/source/praise-100.txt");
				FileInputStream in = new FileInputStream(file);

				int r = 0;
				float i = 0;
				float time_wait = 0;
				while ((r = in.read())!=-1) {
					System.out.print((char)r);
					Thread.sleep((int)time_wait);
					i += 0.00001;
					time_wait += i;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Hello, " + args[0] + "!");
		}
	}
}