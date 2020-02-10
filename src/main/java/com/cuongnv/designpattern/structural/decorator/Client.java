package com.cuongnv.designpattern.structural.decorator;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

		Message decorator = new HtmlEncodedMessage(m);
		System.out.println(decorator.getContent());
		
		decorator = new Base64EncodedMessage(decorator);
		System.out.println(decorator.getContent());

		//or it will be easier to understand by using this chain style
		Message message = new Base64EncodedMessage(new HtmlEncodedMessage(new TextMessage("Hello world")));
		System.out.println(message);

		/*
		* Given:				-We already had HtmlEncodedMessage class, which implement Message interface
		* Want:					-Add base64 encoded into message, which already encoded by HtmlEncodedMessage, or by
		* 						other words, the message had HtmlEncodedMessage functionality already.
		* Normal approach:		-Create concrete Base64EncodedMessage class, implement Message interface, then copy the
		* 						functionality from HtmlEncodedMessage, then append new desired logic of base64 encoded.
		* Drawback:				-Imagine that after we use this normal way, we had the logic of HtmlEncoded in both
		* 						HtmlEncodedMessage and Base64EncodedMessage, if we want to change the logic of HtmlEncoded,
		* 						we have to change at two places.
		* 						This normal way use inheritance, which is static, if we use composition, it will be dynamic.
		* 						And decorator design pattern use composition to qualify this requirement.
		*
		* */
	}
}
