package id.ac.stmikim.uas_361661001;

public class ExampleContactItem implements ContactItemInterface{

	private String nickName;
	private String fullName;
	
	public ExampleContactItem(String nickName, String fullName) {
		super();
		this.nickName = nickName;
		this.setFullName(fullName);
	}

	@Override
	public String getItemForIndex() {
		return nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
