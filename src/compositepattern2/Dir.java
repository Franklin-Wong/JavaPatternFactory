package compositepattern2;

import java.util.ArrayList;
import java.util.List;

/**
 * ͸�������ģʽ
 * 
 */
public abstract class Dir {

	//����һ��list�������е��ļ�
	protected List<Dir> dirs = new ArrayList<>();
	//��ǰ�ļ�������
	private String name;
	
	public Dir(String name) {
		super();
		this.name = name;
	}
	
	public abstract void addDir(Dir dir);
	
	public abstract void removeDir(Dir dir);
	
	public abstract void clear();
	
	public abstract void print();
	
	public abstract List<Dir> getFiles();

	public String getName() {
		return name;
	}
	
}
