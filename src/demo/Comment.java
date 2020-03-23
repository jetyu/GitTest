package demo;

public class Comment<T> {

	private T context;

	public T getContext() {
		return context;
	}

	public void setContext(T context) {
		this.context = context;
	}

	public static void main(String[] args) {
		// string类型的文字评论
		Comment<String> commentString = new Comment<String>();
		commentString.setContext("这是一段文字评论");
		System.out.println(commentString.getContext());

		// integer类型的评论
		Comment<Integer> commentInteger = new Comment<Integer>();
		commentInteger.setContext(123);
		System.out.println(commentInteger.getContext());

	}

}
