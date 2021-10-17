package iteratorpattern2;

public abstract class AbstractLeader {
	//上一级领导处理者
	protected AbstractLeader nextLeader;
	/**
	 * 处理报账的请求;判断是否可以自己批复，或者 向上请求
	 * @param money 能够批复的额度
	 */
	public final void handleRequest(int money){
		if (money <= limit()) {
			handle(money);
		}else {
			System.out.println(getClass().getSimpleName() +"无权批复报销 ： "+ money +"元");		

			if(null != nextLeader){
				/**
				 * 递归方法
				 */
				nextLeader.handleRequest(money);
				System.out.println("请示上级");		
				System.out.println(getClass().getSimpleName() +"无权批复报销 ： "+ money +"元");		

			}
		}
		
	}
	/**
	 * 自身能够批复的额度权限
	 * @return 具体的额度
	 */
	public abstract int limit();
	/**
	 * 处理报账的批复行为
	 * @param money 批复行为
	 */
	public abstract void handle(int money);
}
