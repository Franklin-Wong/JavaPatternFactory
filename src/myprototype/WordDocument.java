package myprototype;

import java.util.ArrayList;
import java.util.List;

public class WordDocument implements Cloneable{
	private String mText;
	private ArrayList<String> mImage = new ArrayList<>();
	public WordDocument() {
		System.out.println("-------WordDocument构造方法-------");
		
	}

	@Override
	protected WordDocument clone() throws CloneNotSupportedException {
		//产生一个拷贝对象
		WordDocument doc = (WordDocument) super.clone();
		//拷贝变量
		doc.mText = this.mText;
		//深拷贝，拷贝一个变量
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
		System.out.println("--------开始打印--------");
		System.out.println("--------mText: "+mText);
		for (String mImageName : mImage) {
					System.out.println("--------mImageName--------"+mImageName);
		}
		System.out.println("--------结束打印--------");
	}
}
