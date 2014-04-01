/*
 * Copyright (c) for Murtaza Kheriwala
 * Date: 2014.
 * This code is not for distribution.
 */

package au.gov.ppsr.controller.form;

import au.gov.ppsr.client.response.PingResponse;
import au.gov.ppsr.exception.PpsrException;
import au.gov.ppsr.model.form.ChangePasswordForm;
import au.gov.ppsr.model.form.PingForm;
import au.gov.ppsr.service.soap.PingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * User: murtaza
 * Date: 31/03/2014
 * Time: 1:11 AM
 */
@Controller
public class PingController {
  private static final Logger LOG = LoggerFactory.getLogger(ChangePasswordController.class);
  private static final String MODEL_NAME = "response";

  @Autowired
  private PingService service;

  @RequestMapping(value = "/ping", method = RequestMethod.GET)
  public ModelAndView changePassword() {
    ModelAndView mav = new ModelAndView("forms/ping");
    mav.addObject("form", new ChangePasswordForm());
    return mav;
  }

  @RequestMapping(value = "/pingResponse", method = RequestMethod.POST)
  public String getResponse(@ModelAttribute("form") @Valid PingForm form, BindingResult result, Model model) throws PpsrException {
    if (!result.hasErrors()) {
      String username = form.getUsername();
      String password = form.getPassword();
      PingResponse response = service.invokeWebService(username, password);
      model.addAttribute(MODEL_NAME, response);
    }
    return "response/pingResponse";
  }
}
