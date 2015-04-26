package com.mkyong.common.controller;

import com.mkyong.common.model.CV;
import com.mkyong.common.model.CVS;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("CV")
public class XMLController{

	CVS maliste = new CVS();
	String cv = "<maliste><age>40</age><nom>Wayne</nom><prenom>Bruce</prenom></maliste>";

	@RequestMapping(value="", method = RequestMethod.GET)
	public @ResponseBody
	CVS getListeCV() { return maliste;}

	@RequestMapping(value="nom/{nom}", method = RequestMethod.GET)
	public @ResponseBody
	CV getCVInXML(@PathVariable String nom){
		CV cv = new CV(nom, "julien", 23 );
		return cv;
	}

	@RequestMapping(value="id/{id}", method = RequestMethod.GET)
	public @ResponseBody
	CV getCVbyId(@PathVariable int id){
		return maliste.CVbyId(id);
	}

	@RequestMapping(value="", method = RequestMethod.POST)
	public @ResponseBody void post(@RequestBody CV cv){
		maliste.getcv().add(cv);
	}

}
