package club.mit.common.model;

public class ResultModel<T> {
	public ResultModel(boolean isSuccess, String message, T data) {
		super();
		this.isSuccess = isSuccess;
		this.message = message;
		this.data = data;
	}
	public ResultModel() {
		// TODO Auto-generated constructor stub
	}
	public boolean isSuccess = true;
	public String message = "";
	public T data = null;
	
	@Override
	public String toString() {
		return "ResultModel [isSuccess=" + isSuccess + ", message=" + message + ", data=" + data + "]";
	}
}
