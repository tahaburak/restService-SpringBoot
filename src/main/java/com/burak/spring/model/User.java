package com.burak.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

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

	@JsonIgnore
	private Date birthDate;

	@JsonProperty("age")
	private int age() {
		LocalDate birthDateLocalDate = this.birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return (int) ChronoUnit.YEARS.between(birthDateLocalDate, LocalDate.now());
	}

	@JsonProperty("fullName")
	public String fullName() {
		return this.name + " " + this.surname;
	}
}
