package com.burak.spring.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by TCTAHKOC on 04/24/19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonRootName(value = "User")
@JsonPropertyOrder({ "fullName" })
@JsonIgnoreProperties(value = { "birthDate" }, ignoreUnknown = true)
public class User {
	private long id;
	private String name;
	private String surname;
	private LocalDate birthDate;

	@JsonGetter("age")
	private int age() {
		return (int) ChronoUnit.YEARS.between(this.birthDate, LocalDate.now());
	}

	@JsonGetter("fullName")
	public String fullName() {
		return this.name + " " + this.surname;
	}
}
