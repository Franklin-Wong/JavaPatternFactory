package iteratorpattern;

public class Handler3 extends AbstractHandler{

	@Override
	protected int getHandlerLevel() {
		return 3;
	}

	@Override
	protected void handle(AbstractRequest request) {
		System.out.println("Handler3 handle request :"+ request.getRequestLevel());
		
	}

}
