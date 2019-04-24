package com.burak.spring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by TCTAHKOC on 04/24/19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class User {
	private String name;
	private String surname;

	public String fullName() {
		return this.name + " " + this.surname;
	}
}
