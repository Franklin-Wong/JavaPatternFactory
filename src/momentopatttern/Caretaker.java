package momentopatttern;
/**
 * 管理备忘录 唯一改变备忘录的入口
 */
public class Caretaker {
	Memoto memoto;

	public Memoto getMemoto() {
		return memoto;
	}

	public void setMemoto(Memoto memoto) {
		this.memoto = memoto;
	}
}
