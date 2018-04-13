package com.kong_food_map.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kong_food_map.domain.Member;
import com.kong_food_map.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberRepository memberDao;
	
	@RequestMapping("/list")
	public String list(Model model){
		List<Member> list = memberDao.findAll(new Sort(Sort.Direction.DESC, "id"));
		model.addAttribute("list",list);
		return "member/list";
	}

	@RequestMapping(value="/add",method = RequestMethod.GET)
	public String add(){
		return "member/add";
	}

	@RequestMapping(value="/add",method = RequestMethod.POST)
	public String postAdd(Member member){
		memberDao.save(member);
		return "redirect:/member/list";
	}

	@RequestMapping(value="/mod/{id}",method = RequestMethod.GET)
	public String mod(@PathVariable int id, Model model){
//		Member member = memberDao.getOne(id);
		Optional<Member> member =  memberDao.findById(id);
		model.addAttribute("data",member);
		return "member/mod";
	}

	@RequestMapping(value="/mod",method = RequestMethod.POST)
	public String postMod(Member member){
		memberDao.save(member);
		return "redirect:/member/list";
	}

	@RequestMapping("/del/{id}")
	public String del(@PathVariable int id){
//		memberDao.deleteById(id);
		memberDao.updateDeleteByid(id);
		return "redirect:/member/list";
	}

}
