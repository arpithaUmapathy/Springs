package com.xworkz.criminals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.criminals.dto.CriminalDTO;
import com.xworkz.criminals.service.CriminalService;

@Controller
@RequestMapping("/Criminal")
public class CriminalsController {
	@Autowired
	private CriminalService criminalService;

	public CriminalsController() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSave(CriminalDTO criminalDTO,Model model ) {
		System.out.println("Calling on save method");
		System.out.println("CriminalsDTO" + criminalDTO);
		boolean validateAndSave = criminalService.validateAndSave(criminalDTO);
		if (validateAndSave) {
			System.out.println("Data is valid and Save");
			model.addAttribute("records", "Records are Saved");
			return "index";
		} else {
			System.out.println("Data is notvalid and notSave");
			return "index";
		}

	}

	@GetMapping
	public String readAll(Model model) {
		System.out.println("Calling Read All Method");
		List<CriminalDTO> dtos = criminalService.findAll();
		if (dtos != null && !dtos.isEmpty()) {
			System.out.println("dtos are found" + dtos.size());
			model.addAttribute("CriminalDetails", dtos);
			model.addAttribute("size", "Total Criminals found:" + dtos.size());

		} else {
			System.out.println("dtos are not found");
			model.addAttribute("msg", "Data is Empty");
		}

		return "ShowAll";

	}
}
