package product;

/**
 * 제품 판매 매장에서 관리하는 대상인
 * 제품을 정의하는 클래스
 * -------------------------------------
 * 제품번호	: prodCode	: String
 * 제품 명		: prodName	: String
 * 가격		: price		: int
 * 재고수량	: quantity	: int
 * -------------------------------------
 * 기본 생성자, 매개변수를 받는 생성자 각 필드 1개씩 늘려가며
 * 생성자 중복정의로 5개의 생성자를 정의 this, this() 사용
 * -------------------------------------
 * 메소드
 * print()	: void
 * 		==> 제품의 상태 출력
 * discount(double percentage) : int
 * 		==> 입력된 퍼센트만큼 할인 가격 리턴
 * sell(int amount)	: void
 * 		==> 매장에서 판매(출고)되어 재고수량이 줄어듬
 * buy(int amount)	: void
 * 		==> 매장에 입고되어 재고수량이 늘어남
 * 
 * @author PC38209
 *
 */

public class Product {
	// 멤버변수 선언부
	/** 제품 번호 */
	String prodCode;
	/** 제품 명 */
	String prodName;
	/** 가격 */
	int    price;
	/** 제고 수량 */
	int    quantity;
	
	// 생성자 선언부
	/** 기본 생성자 */
	Product() {
		
	}
	
	/**
	 * prodCode 필드만 초기화하는 생성자
	 * @param prodCode
	 */
	Product(String prodCode) {
		this.prodCode = prodCode;
	}
	
	/**
	 * prodCode, ProdName 필드만 초기화하는 생성자
	 * @param prodCode
	 * @param prodName
	 */
	Product(String prodCode, String prodName) {
		this(prodCode);
		this.prodName = prodName;
	}
	
	/**
	 * prodCode, prodName, price 필드만 초기화하는 생성자
	 * @param prodCode
	 * @param prodName
	 * @param price
	 */
	Product(String prodCode, String prodName, int price) {
		this(prodCode, prodName);
		this.price = price;
	}
	
	/**
	 * 모든 필드를 초기화하는 생성자
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	Product(String prodCode, String prodName, int price, int quantity) {
		this(prodCode, prodName, price);
		this.quantity = quantity;
	}
	
	// 메소드 선언부
	/** 제품의 상태 출력 */
	public void print() {
		System.out.printf("제품 번호 : %s [제품 명 : %s, 가격 : %d, 재고 수량 : %d]%n"
						, prodCode, prodName, price, quantity);
	}
	
	/**
	 * 입력된 퍼센트만큼 할인 가격 리턴
	 * @param percentage
	 * @return
	 */
	public int discount(double percentage) {
		int price = this.price;
		if (percentage > 0) {
			price = price - (int)(this.price * (percentage / 100));
		}
		return price;
	}
	
	/**
	 * 매장에서 판매(출고)되어 재고수량이 줄어듬
	 * @param amount
	 */
	public void sell(int amount) {
		if (this.quantity >= amount) {
			this.quantity -= amount;
		}
	}
	
	/**
	 * 매장에 입고되어 재고수량이 늘어남
	 * @param amount
	 */
	public void buy(int amount) {
		this.quantity += amount;
	}
}
