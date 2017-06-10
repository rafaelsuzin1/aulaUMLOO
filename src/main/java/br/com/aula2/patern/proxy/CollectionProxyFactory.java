package br.com.aula2.patern.proxy;

import java.util.List;

public class CollectionProxyFactory {

	public static List createUnmodifiedList(List list) {
		return new UnmodifiedList(list);
	}

}
