package com.info.haidara.sid.web;

import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class ControllerAuthentification {	
		private final Logger log = LoggerFactory.getLogger(ControllerAuthentification.class);

		// display login page
		@RequestMapping("/login")
		public String getAuthPageLogin() {
			return "authentification/login";
		}

		// display register page
		@RequestMapping(value = "/register", method = RequestMethod.GET)
		public String getAuthPageRegister(  Model model) throws URISyntaxException {
			model.addAttribute("code", genkeytoMe(5));
			return "authentification/registration";
		}

		// display reset password page
		@RequestMapping("/reset-password")
		public String getAuthPageResetPassword() {
			return "authentification/forgetPassword";
		}

		/**
		 * 
		 * @param group
		 * @return
		 * @throws URISyntaxException
		 */
		@RequestMapping(value = "/create", method = RequestMethod.POST)
		String createUser( Model model) throws URISyntaxException {
		
			return "redirect:/home";
		}
		private static String genkeytoMe(int length) {
			String randomNum = "";
			try {
				SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
				randomNum = new Integer(prng.nextInt()).toString().substring(0, length);
			} catch (NoSuchAlgorithmException e) {

				System.out.println("Une erreur est servenu :  " + e.getMessage());
			}
			return "K" + randomNum + "R";
		}
	}

