/**
 *
 */
package person;

/**
 * @author internousdev
 *
 */

	/**
	 * @param args
	 */
	public class Test{
		public static void main(String[] args) {
			Person taro=new Person();
			taro.name="taro";
			taro.age=18;
			System.out.println(taro.name);
			System.out.println(taro.age);

			Person jiro=new Person("jiro",20);
			System.out.println(jiro.name);
			System.out.println(jiro.age);

			Person saburo=new Person("saburo");
			System.out.println(saburo.name);
			System.out.println(saburo.age);

			Person nashi =new Person(25);
			System.out.println(nashi.name);
			System.out.println(nashi.age);

			Person hanako =new Person("hanako",17);
			System.out.println(hanako.name);
			System.out.println(hanako.age);
		}
	}







/*Person jiro = new Person();
		Person hanako = new Person();
			jiro.name = "木村次郎";
			jiro.talk();
			jiro.walk();
			jiro.run();

			hanako.name = "鈴木花子";

			jiro.age = 18;
			jiro.phoneNumber = "080-9999-8888";
			jiro.address = "okinawa";
			jiro.birthday = "1950.10.24";

			hanako.age = 16;
			hanako.phoneNumber = "080-4444-0000";
			hanako.address = "hokkaido";
			hanako.birthday = "1970.8.9";

				System.out.println(jiro.name);
				System.out.println(jiro.age);
				System.out.println(jiro.phoneNumber);
				System.out.println(jiro.address);
				System.out.println(jiro.birthday);

				System.out.println(hanako.name);
				System.out.println(hanako.age);
				System.out.println(hanako.phoneNumber);
				System.out.println(hanako.address);
				System.out.println(hanako.birthday);*/

			/*Person aibo = new Person();
			Person asimo = new Person();
			Person pepper = new Person();
			Person doraemon = new Person();
			    aibo.name = "aibo";
				aibo.talk();
				aibo.walk();
				aibo.run();

				asimo.name = "asimo";
				asimo.talk();
				asimo.walk();
				asimo.run();

				pepper.name = "pepper";
				pepper.talk();
				pepper.walk();
				pepper.run();

				doraemon.name = "doraemon";
				doraemon.talk();
				doraemon.walk();
				doraemon.run();*/

	/*	}

	}*/
