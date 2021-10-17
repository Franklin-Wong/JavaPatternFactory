package iteratorpattern;

public abstract class AbstractHandler {

	//��һ�ڵ��ϵĴ����߶���
	protected AbstractHandler mNextHandler;
	/**
	 * ��������
	 * @param request
	 */
	public final void handlerRequest(AbstractRequest request){
		//�жϵ�ǰ�������Ĵ����� �Ƿ��������ߵļ��� һ��
		if (getHandlerLevel() == request.getRequestLevel()) {
			//���һ�£������й��������   ������
			handle(request);
		}else {
			//�����еĴ�����󣬶����ܴ����й����󣬾������ʾ
			if (null != mNextHandler) {
				mNextHandler.handlerRequest(request);
				System.out.println("�޷������������");

			}
		}
		
	}
	/**
	 * ��ȡ�������� ������
	 * @return ������
	 */
	protected abstract int getHandlerLevel();
	/**
	 * ÿ�������߶���� ���崦��ʽ
	 * @param request �����߶��� 
	 */
	
	protected abstract void handle(AbstractRequest request);
}
