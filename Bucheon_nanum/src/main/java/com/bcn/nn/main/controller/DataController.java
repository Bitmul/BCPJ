package com.bcn.nn.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.bcn.nn.main.domain.DataVO;
import com.bcn.nn.main.repository.MainMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/data")
public class DataController {

	@Autowired
	private MainMapper mainMapper;

	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

	@PostMapping("/insert")
	public String insertData(DataVO dvo, Model model) {
		mainMapper.insertData(dvo);

		List<DataVO> result = mainMapper.getData();
		model.addAttribute("dataList", result);
		return "result";
	}

	@GetMapping("/modify")
	public String modifyPage(@RequestParam("dataNo") int dataNo, Model model) {
		DataVO dvo = mainMapper.getDataOne(dataNo);
		model.addAttribute("data", dvo);
		return "modify";
	}

	@PostMapping("/update")
	public String updateData(DataVO dvo) {
		mainMapper.updateData(dvo);
		return "redirect:/data/result";
	}

	@GetMapping("/delete")
	public String deleteData(@RequestParam("dataNo") int dataNo) {
		mainMapper.deleteData(dataNo);
		return "redirect:/data/result";
	}

	@GetMapping("/result")
	public String resultPage(Model model) {
		
		List<DataVO> result = mainMapper.getData();
		model.addAttribute("dataList", result);
		return "result"; 
	}
}