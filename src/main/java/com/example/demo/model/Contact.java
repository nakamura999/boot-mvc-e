package com.example.demo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
	// 最大文字数６０字まで
	@NotBlank
	@Size(max = 60)
	private String name;
	
	// Email形式 文字数最大254
	@NotBlank
	@Email
	@Size(max = 254)
	private String email;
	
	// 文字数最大500
	@NotBlank
	@Size(max = 500)
	private String contact;
	
	// @NotBlank @Size バリデーション用のアノテーション
	// @NotBlank 文字列が空白でないか
	// @NotNull null出ないか検証
	// @Size 文字列の長さの指定　@Size(min=1, max=150)
	// @Email 文字列が有効なメールアドレスか
	// @Min 指定の数値以上か　@Min(1)
	// @Range 数値の長さの指定 @Range(min=1, max=150)
}
