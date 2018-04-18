package com.kong_food_map;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kong_food_map.domain.Member;
import com.kong_food_map.repository.MemberRepository;
/**
 
@Controller
//@RequestMapping("/member")
public class WebController {
	
	@Autowired
	private MemberRepository memberDao;
	
	@RequestMapping("/add")
	@ResponseBody
	public Member add(Member member){
		Member memberData = memberDao.save(member);
		return memberData;
	}

	@RequestMapping("/view/{id}")
	@ResponseBody
	public Member view(@PathVariable int id){
		Member memberData = memberDao.getOne(id);
		return memberData;
	}	


	@RequestMapping("/list")
	@ResponseBody
	public List<Member> list(){
		List<Member> memberList = memberDao.findAll();
		return memberList;
	}

	@RequestMapping("/del/{id}")
	public String delete(@PathVariable int id){
		System.out.println("id=" + id);
		memberDao.deleteById(id);
		return "redirect:/member/list";
	}

	@RequestMapping("/edit/{id}")
	@ResponseBody
	public Member edit(Member member){
		Member memberData = memberDao.save(member);
		return memberData;
	}

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello Kong Food Map";
	}
	
	@RequestMapping("/jsp")
	public String jspPage(Model model) {
		model.addAttribute("name", "my name is kong");
		return "hello";
	}
}
 */
