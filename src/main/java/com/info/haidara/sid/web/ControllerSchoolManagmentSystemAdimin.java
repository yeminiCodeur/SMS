package com.info.haidara.sid.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.info.haidara.sid.entities.Departement;
import com.info.haidara.sid.entities.Person;
import com.info.haidara.sid.entities.Salle;
import com.info.haidara.sid.services.DepartementStrategy;
import com.info.haidara.sid.services.FormationStrategy;
import com.info.haidara.sid.services.PersonnelStrategy;
import com.info.haidara.sid.services.SalleStrategy;
import com.info.haidara.sid.services.TypeSalleStrategy;

@Controller
public class ControllerSchoolManagmentSystemAdimin {

	@Autowired
	DepartementStrategy dep;
	@Autowired
	FormationStrategy form;
	@Autowired
	SalleStrategy ss;
	@Autowired
	TypeSalleStrategy ts;
	@Autowired
	PersonnelStrategy ps;

	@RequestMapping(value = "/")
	public String home(Model model) {
		return "index";
	}

	@RequestMapping(value = "/filiere/detail/{slug}", method = RequestMethod.GET)
	public String getDetailFiliere(@PathVariable(name = "slug") String slug, Model model) {
		model.addAttribute("filiere", form.getFormationBySlug(slug));
		return "detailFiliere";
	}

	@RequestMapping(value = "/filiere")
	public String getFileres(Model model) {
		List<Departement> lfi = dep.listeDepartements();
		model.addAttribute("listDepartement", lfi);
		return "filieres";
	}

	@RequestMapping(value = "/salles")
	public String getSalles(Model model) {
		model.addAttribute("typesalles", ts.findAll());
		return "salles";
	}

	@RequestMapping(value = "/salles/{numSalle}")
	public String getDetailSalle(@PathVariable(name = "numSalle") String numSalle, Model model) {
		model.addAttribute("salle", ss.findByNumSalle(numSalle));
		return getSalles(model);
	}

	@RequestMapping(value = "/personnel/departement/{slug}", method = RequestMethod.GET)
	public String getPersonnels(@PathVariable(name = "slug") long slug, Model model) {
		Departement d = null;
		if (slug != 0) {
			d = dep.find(slug);
		}
		model.addAttribute("departement", d);
		return getPersonnelByDepartement(model);
	}

	@RequestMapping(value = "/personnel/detail/{slug}", method = RequestMethod.GET)
	public String geOnetPersonnel(@PathVariable(name = "slug") String slug, Model model) {
		Person p = null;
		if (!slug.equals("")) {
			p = ps.findByCode(slug);
		}
		String[] semaines = { "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "S11", "S12", "S13", "S14",
				"S15", "S16" };
		model.addAttribute("semaines", semaines);
		model.addAttribute("enseignant", p);
		return getPersonnelByDepartement(model);
	}

	@RequestMapping(value = "/personnel", method = RequestMethod.GET)
	public String getPersonnelByDepartement(Model model) {
		model.addAttribute("departements", dep.listeDepartements());
		return "personnels";
	}

}
