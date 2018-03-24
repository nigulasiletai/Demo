import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	int a, b, c, d, e, f;
	static int n;
	int[] s = new int[n];
	String[] st = new String[n];
	String str1;
	
	public Main() {

	}

	// 产生随机数和运算：
	public void M() throws FileNotFoundException {
	
		for (int k = 0; k < n; k++) {
			a = (int) (Math.random() * 100 + 1);
			b = (int) (Math.random() * 100 + 1);
			c = (int) (Math.random() * 100 + 1);
			e = (int) (Math.random() * 10 + 1);
			d = 6 * e;
			f = (int) (Math.random() * 3);
			if (f == 0) {
						s[k] = a * b - d / e + c;
				if (a * b - d / e >= 0) {  //处理负数；
					st[k] = a + "*" + b + "-" + d + "/" + e + "+" + c + "=" + s[k];
					System.out.println(st[k]);
				} else {
						s[k] = d / e - a * b + c;
					st[k] = d + "/" + e + "-" + a + "*" + b + "+" + c + "=" + s[k];
					System.out.println(st[k]);
				}
			} else if (f == 1) {
					s[k] = a + b * d / e - c;
				if (b * d / e - c >= 0) { //处理负数；
					st[k] = a + "+" + b + "*" + d + "/" + e + "-" + c + "=" + s[k];
					System.out.println(st[k]);
				} else {
					s[k] = c - b * d / e + a;
					st[k] = c + "-" + b + "*" + d + "/" + e + "+" + a + "=" + s[k];
					System.out.println(st[k]);
				}
			} else if (f == 2) {
					s[k] = d / e - a * c + b;
				if (d / e - a * c >= 0) { //处理负数；
					st[k] = d + "/" + e + "-" + a + "*" + c + "+" + b + "=" + s[k];
					System.out.println(st[k]);
				} else {
					s[k] = a * c - d / e + b;
					st[k] = a + "*" + c + "-" + d + "/" + e + "+" + b + "=" + s[k];
					System.out.println(st[k]);
				}
			}
		
		}
	}


	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("你想做多少道题？");
		n = input.nextInt();
		System.out.println("学号；201571030319");
		Main m = new Main();
		m.M();
		
	}

}
