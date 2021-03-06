package kr.ac.mjc.java.generic;

public class Util {
	
	/**
	 * 자신만의 type parameter를 갖는 메서드를 제네릭 메서드라 한다.<br>
	 * 제네릭 메서드의 타입 파라미터는 리턴 타입 앞에 넣는다.<br>
	 * type parameter의 범위는 해당 메서드로 제한된다.
	 */
	public <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getKey().equals(p2.getKey())
				&& p1.getValue().equals(p2.getValue());
	}

	public <T> boolean compare(Box<T> b1, Box<T> b2) {
		return b1.get().equals(b2.get());
	}

}
