package compositepattern2;

public class Client {
	public static void main(String[] args) {
		//����һ��Ŀ¼�����ʾ C�̸�Ŀ¼
		Dir diskC = new Folder("C");
		
		//C�̸�Ŀ¼��һ���ļ�
		diskC.addDir(new File("IBM.txt"));
		//C�̸�Ŀ¼����3����Ŀ¼
		Dir dirWin = new Folder("Windows");
		//windowsĿ¼����a.exe 
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
