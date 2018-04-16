/**
 *
 */
package person;

/**
 * @author internousdev
 *
 */
public class Person {


	public String name = null;
	public int age = 0;
	public String phoneNumber = null;
	public String address = null;
	public String birthday = null;

	//コンストラクタ①
	public Person(){}

	//コンストラクタ②
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}

	//コンストラクタ③
	public Person(String name){
		this.name=name;
		this.age=0;
	}

	//コンストラクタ④
	public Person(int age){
		this.name="名前なし";
		this.age=age;
	}

	//コンストラクタ⑤
	public Person(int age, String name){
		this.name=name;
		this.age=age;
	}
}


	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}*/

	/*public void talk() {
		System.out.println(this.name + "が話す");
	}

	public void walk() {
		System.out.println(this.name + "が歩く");
	}

	public void run() {
		System.out.println(this.name + "が走る");
	}*/


