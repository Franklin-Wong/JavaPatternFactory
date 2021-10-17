package compositepattern2;

import java.util.ArrayList;
import java.util.List;

/**
 * 透明的组合模式
 * 
 */
public abstract class Dir {

	//声明一个list保存所有的文件
	protected List<Dir> dirs = new ArrayList<>();
	//当前文件夹名称
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
