package br.com.aula2.patern.proxy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UnmodifiedList<E> implements List<E> {
	
	final List<? extends E> list;
	
	public UnmodifiedList(List<? extends E> list){
		this.list = list;
	}
	
	private static final long serialVersionUID = -4001190886398401214L;

	@Override
	public boolean add(E e) {
		throw new UnsupportedOperationException("Não permitido");
	}

	@Override
	public void add(int index, E element) {
		throw new UnsupportedOperationException("Não permitido");
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		throw new UnsupportedOperationException("Não permitido");
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		throw new UnsupportedOperationException("Não permitido");
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException("Não permitido");
	}

	@Override
	public boolean contains(Object o) {
		return list.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return list.containsAll(c);
	}

	@Override
	public E get(int index) {
		return list.get(index);
	}

	@Override
	public int indexOf(Object o) {
		return list.indexOf(o);
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		return (Iterator<E>) list.iterator();
	}

	@Override
	public int lastIndexOf(Object o) {
		return list.lastIndexOf(o);
	}

	@Override
	public ListIterator<E> listIterator() {
		return (ListIterator<E>) list.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return (ListIterator<E>) list.listIterator(index);
	}

	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException("Não permitido");
	}

	@Override
	public E remove(int index) {
		throw new UnsupportedOperationException("Não permitido");
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException("Não permitido");
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException("Não permitido");
	}

	@Override
	public E set(int index, E element) {
		throw new UnsupportedOperationException("Não permitido");
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return (List<E>) list.subList(fromIndex, toIndex);
	}

	@Override
	public Object[] toArray() {
		return list.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return list.toArray(a);
	}

}
