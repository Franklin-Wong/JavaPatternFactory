package compositepattern2;

import java.util.List;

/**
 *
 */
public class File extends Dir{

	public File(String name) {
		super(name);
	}

	@Override
	public void addDir(Dir dir) {
		throw new UnsupportedOperationException("�ļ�����֧�ָò���");
	}

	@Override
	public void removeDir(Dir dir) {
		throw new UnsupportedOperationException("�ļ�����֧�ָò���");
		
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException("�ļ�����֧�ָò���");
		
	}

	@Override
	public void print() {
		System.out.print(getName());
	}

	@Override
	public List<Dir> getFiles() {
		throw new UnsupportedOperationException("�ļ�����֧�ָò���");
	}

}
