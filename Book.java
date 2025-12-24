public class Book extends TangibleAssent{
	private String isbn;
	public Book(String name,int price,String isbn){
		super(name,price,colir);
		this.isbn=isbn;
	}
	public String gettlsbn(){
		return this.isbn;
	}

