package iteratorpattern;

public abstract class AbstractHandler {

	//下一节点上的处理者对象
	protected AbstractHandler mNextHandler;
	/**
	 * 处理请求
	 * @param request
	 */
	public final void handlerRequest(AbstractRequest request){
		//判断当前处理对象的处理级别 是否与请求者的级别 一致
		if (getHandlerLevel() == request.getRequestLevel()) {
			//如果一致，就由中共处理对象   来处理
			handle(request);
		}else {
			//当所有的处理对象，都不能处理中共请求，就输出提示
			if (null != mNextHandler) {
				mNextHandler.handlerRequest(request);
				System.out.println("无法处理这个请求");

			}
		}
		
	}
	/**
	 * 获取处理对象的 处理级别
	 * @return 处理级别
	 */
	protected abstract int getHandlerLevel();
	/**
	 * 每个处理者对象的 具体处理方式
	 * @param request 请求者对象 
	 */
	
	protected abstract void handle(AbstractRequest request);
}
