package org.example.provider.impl;

import org.example.provider.Item;
import org.example.provider.Provider;

import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Deactivate;

@Component()
public class ProviderImpl implements Provider {

	@Override
	public Item newItem() {
		return new Item() {
			@Override
			public String toString() {
				return "an Item";
			}
		};
	}

	@Activate
	public void activate() {
		System.out.println("Provider activated");
	}
	
	@Deactivate
	public void deactivate() {
		System.out.println("Provider deactivated");
	}
}