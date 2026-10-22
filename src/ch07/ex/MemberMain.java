package ch07.ex;

public class MemberMain {

	public static void main(String[] args) {
		
		Member user1 = new Member("홍길동", "hong");
		user1.password = "12345";
		
		boolean result = user1.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			user1.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
