package com.sham.optional;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		
		
//		Optional is a container/wrapper object that can hold one value or no value at all.
			
		
//		Optional.of()
//		Scenario:
//		You are 100% sure value is NOT null, otherwise it will throw NPE.
		
//		Optional<String> op = Optional.of("Spring Boot");
//		System.out.println(op.get());

//		Optional.ofNullable()
//		Scenario:
//		Value may be null, safe creation without exception.
//		Here if the value is null then this method will return an empty object of the optional class

		String email = null;
		Optional<String> op = Optional.ofNullable(email);
		System.out.println(op);  // Optional.empty
		
		
//		isPresent()
//		Scenario:
//		Just to check if value exists, but avoid using get() after it.
//		Example (not recommended but used sometimes in legacy checks):
	
//		Optional<Integer> op = Optional.ofNullable(null);
//		if(op.isPresent()) {
//		    System.out.println("Value exists");
//		}

		
//		ifPresent()
//		Scenario:
//		Execute logic only when value is present (used in logs, notifications, side effects).
	
//		Optional<String> user = Optional.ofNullable("Sham");
//		user.ifPresent(u -> System.out.println("Hello " + u));

//		get()
//		Scenario:
//		Retrieve the value only if you are sure Optional is not empty.
//		Avoid direct use without checks – risk of exception.

//		Optional<String> op = Optional.of("Developer");
//		System.out.println(op.get());
		
		
		
//		orElse()
//		Scenario:
//		Return a default value when Optional is empty.

//		Optional<String> op = Optional.ofNullable(null);
//		String role = op.orElse("USER");
//		System.out.println(role);  // USER
		
		
//		orElseGet()
//		Scenario:
//
//		Return default value using supplier (method call/lazy execution).
//		Useful when default value is expensive to create.

//		Optional<String> op = Optional.ofNullable(null);
//		String user = op.orElseGet(() -> "sham");
//		System.out.println(user);
		
		
		
//		orElseThrow()
//		Scenario:
//
//		Throw custom exception when value is missing (commonly used in services).
//		In Core Java you handle business validations like this.

//		Optional<String> op = Optional.empty();
//		String name = op.orElseThrow(() -> new RuntimeException("Name not found"));
//		System.out.println(name);
		
		
//		map()
//		Scenario:
//		Transform Optional<T> → Optional<R> (Entity to DTO, String manipulations, calculations).

//		Optional<String> op = Optional.of("spring");
//		Optional<String> upper = op.map(String::toUpperCase);
//
//		System.out.println(upper.get()); // SPRING

		
//		stream() 
//		converting the optional into a stream
//		Optional<String> data = Optional.of("Java Stream Optional");
//		data.stream().forEach(System.out::println);
		
		
//		filter()
//		Scenario:
//		Apply condition before consuming the value (business rule checks).

		Optional<Integer> age = Optional.of(22);
		age.filter(a -> a > 18)
		   .ifPresent(a -> System.out.println("Eligible"));

	}
}
