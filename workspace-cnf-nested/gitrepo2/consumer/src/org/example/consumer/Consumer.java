package org.example.consumer;

import org.example.provider.Provider;

import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Deactivate;
import aQute.bnd.annotation.component.Reference;

@Component
public class Consumer {

	@Reference
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	
	private Provider provider;
	
	@Activate
	public void activate() {
		System.out.println("Consumer activated, got " + provider.newItem());
	}
	
	@Deactivate
	public void deactivate() {
		System.out.println("Consumer deactivated");
	}
}