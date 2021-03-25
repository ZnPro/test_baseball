package com.cos.baseball.domain.web;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
//@Lazy //스프링 빈 순환 종속성 문제 해결은 되는데...
public class FieldController {
	
	private final FieldController fieldController;
	
	@GetMapping({"/", "/field/saveForm"})
	public String saveForm() {
		return "field/saveForm";
	}
	
	@GetMapping("/field/list")
	public String list() {
		return "field/list";
	}

}
