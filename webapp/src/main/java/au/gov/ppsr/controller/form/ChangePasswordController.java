/*
 * Copyright (c) for Murtaza Kheriwala
 * Date: 2014.
 * This code is not for distribution.
 */

package au.gov.ppsr.controller.form;

import au.gov.ppsr.client.response.ChangePasswordResponse;
import au.gov.ppsr.exception.PpsrException;
import au.gov.ppsr.model.form.ChangePasswordForm;
import au.gov.ppsr.service.soap.ChangePasswordService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;

import javax.validation.Valid;

/**
 * User: murtaza
 * Date: 27/03/2014
 * Time: 9:19 AM
 */
@Controller
public class ChangePasswordController {

  private static final Logger LOG = LoggerFactory.getLogger(ChangePasswordController.class);
  private static final String MODEL_NAME = "response";
  private static final String ERROR_ATTRIBUTE_NAME = "exception";
  private static final String EXCEPTION_PAGE_NAME = "exceptionPage";

  @Autowired
  private ChangePasswordService service;

  @RequestMapping(value = "/changePassword", method = RequestMethod.GET)
  public ModelAndView changePassword() {
    ModelAndView mav = new ModelAndView("forms/changePassword");
    mav.addObject("form", new ChangePasswordForm());
    return mav;
  }

  @RequestMapping(value = "/changePasswordResponse", method = RequestMethod.POST)
  public String getResponse(@ModelAttribute("form") @Valid ChangePasswordForm form, BindingResult result, Model model) throws PpsrException{
    /*try {*/
      if (!result.hasErrors()) {
        String username = form.getUsername();
        String password = form.getPassword();
        String newPassword = form.getNewPassword();
        ChangePasswordResponse response = service.invokeWebService(username, password, newPassword);
        model.addAttribute(MODEL_NAME, response);
      }
    /*} catch (PpsrException e) {
      LOG.error(e.getMessage());
      model.addAttribute(ERROR_ATTRIBUTE_NAME, e);
      return EXCEPTION_PAGE_NAME;
    }*/
    return "changePasswordResponse";
  }
}
