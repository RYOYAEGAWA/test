/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Person {
	public String name=null;
	public int age=0;

	//コンストラクタ化
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}

	//カプセル化部分
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name=name;
	}

}
