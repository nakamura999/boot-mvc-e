package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Contact;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(@ModelAttribute Contact caontact) {
		return "index";
	}
	
	@PostMapping("/")
	public String confirm(@Validated @ModelAttribute Contact contact, BindingResult result) {
		if (result.hasErrors()) {
			return "index";
		}
		return "confirm";
	}
	
	// (@Validated 入力値のチェックを行う。
	// チェックの結果がBindingResultに入るので、
	// result.hasErrors()でエラーがあるか確認できる

}
