package it.unibo.oop.lab.nesting2;

import java.util.List;
import java.util.Iterator;

public class OneListAcceptable<T> implements Acceptable<T> {

	private final List<T> list;
	
	public OneListAcceptable(final List<T> list) {
		this.list = list;
	}
	
	@Override
	public Acceptor<T> acceptor() {
		//returns an anonymous class Acceptor
		return new Acceptor<T>() {
			
			private Iterator<T> iterator = OneListAcceptable.this.list.iterator();
			
			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				if (this.iterator.hasNext()) {
					if (!(this.iterator.next().equals(newElement))) {
						throw new ElementNotAcceptedException(newElement);
					}
				}
				else {
					System.out.println("iterator has no next avaiable");
				}
				
			}

			@Override
			public void end() throws EndNotAcceptedException {
				if(this.iterator.hasNext()) {
					throw new EndNotAcceptedException();
				}
			}
		};
	}

}
