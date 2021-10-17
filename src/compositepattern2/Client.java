package compositepattern2;

public class Client {
	public static void main(String[] args) {
		//构造一个目录对象表示 C盘根目录
		Dir diskC = new Folder("C");
		
		//C盘根目录有一个文件
		diskC.addDir(new File("IBM.txt"));
		//C盘根目录还有3个子目录
		Dir dirWin = new Folder("Windows");
		//windows目录下有a.exe 
		dirWin.addDir(new File("a.exe"));
		diskC.addDir(dirWin);
		Dir dirPer = new Folder("Perflog");
		
		dirPer.addDir(new File("null.txt"));
		diskC.addDir(dirPer);
		
		Dir dirPro = new Folder("Program File");
		dirPro.addDir(new File("ftp.txt"));
		diskC.addDir(dirPro);
		diskC.print();
		
	}
}
