package au.gov.ppsr.controller;

import au.gov.ppsr.model.form.Form;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

/**
 * @author kheriwalam5g
 * @since <version>
 */
@Controller
public class IndexController {

  public static final String VIEW_NAME = "operations";

  @RequestMapping(value="/invoke", method = RequestMethod.GET)
  public ModelAndView invokeOperation() {
    ModelAndView mav = new ModelAndView(VIEW_NAME);
    mav.addObject("operationsMap", buildOperationMap());
    //mav.addObject("operation", new OperationForm());
    return mav;
  }

  @RequestMapping(value = "/response", method = RequestMethod.POST)
  public String getResponse(@ModelAttribute("form") @Valid Form operation, BindingResult result) {
    if (!result.hasErrors()) {

    }
    return "response";
  }

  private Map<String, String> buildOperationMap() {
    Map<String, String> operationsMap = Maps.newHashMap();
    operationsMap.put("changePassword", "ChangeB2GPassword");
    operationsMap.put("register", "RegisterOperation");
    operationsMap.put("search", "SearchOperation");
    return operationsMap;
  }
}
