package myprototype;

import java.util.ArrayList;
import java.util.List;

public class WordDocument implements Cloneable{
	private String mText;
	private ArrayList<String> mImage = new ArrayList<>();
	public WordDocument() {
		System.out.println("-------WordDocument���췽��-------");
		
	}

	@Override
	protected WordDocument clone() throws CloneNotSupportedException {
		//����һ����������
		WordDocument doc = (WordDocument) super.clone();
		//��������
		doc.mText = this.mText;
		//���������һ������
		doc.mImage =  (ArrayList<String>) this.mImage.clone();
		return doc;
	}

	public String getmText() { 
		return mText;
	}

	public void setmText(String mText) {
		this.mText = mText;
	}

	public List<String> getmImage() {
		return mImage;
	}

	public void addImage(String name) {
		this.mImage.add(name);
	}

	public void showDocument(){
		System.out.println("--------��ʼ��ӡ--------");
		System.out.println("--------mText: "+mText);
		for (String mImageName : mImage) {
					System.out.println("--------mImageName--------"+mImageName);
		}
		System.out.println("--------������ӡ--------");
	}
}
