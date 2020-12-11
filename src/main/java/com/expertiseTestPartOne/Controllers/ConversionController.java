package com.expertiseTestPartOne.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expertiseTestPartOne.Models.Speed;
import com.expertiseTestPartOne.Models.Temperature;


@RestController
@RequestMapping("/conversions")
public class ConversionController {
	
	@PostMapping("/ktoc")
	public String convertKelvinToCelsius(@RequestBody Temperature temp) {
		temp.convertK2C();
		System.out.println(temp);
		return temp.toString();
	}
	
	@PostMapping("/ctok")
	public String convertCelsiusToKelvin(@RequestBody Temperature temp) {
		temp.convertC2K();
		System.out.println(temp);
		return temp.toString();
	}
	
	@PostMapping("/mtok")
	public String convertMileToKilometer(@RequestBody Speed speed) {
		speed.convertM2K();
		System.out.println(speed);
		return speed.toString();
	}
	
	@PostMapping("/ktom")
	public String convertKilometerToMile(@RequestBody Speed speed) {
		speed.convertK2M();
		System.out.println(speed);
		return speed.toString();	
	}

}
