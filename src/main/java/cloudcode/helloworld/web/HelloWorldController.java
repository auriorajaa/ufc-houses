package cloudcode.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/** Defines a controller to handle HTTP requests */
@Controller
public final class HelloWorldController {

  /**
   * Create an endpoint for the landing page
   *
   * @return the index view template
   */
  @GetMapping("/")
  public String helloWorld(Model model) {

    // Get Cloud Run environment variables.
    String revision = System.getenv("K_REVISION") == null ? "???" : System.getenv("K_REVISION");
    String service = System.getenv("K_SERVICE") == null ? "???" : System.getenv("K_SERVICE");

    // Set variables in html template.
    model.addAttribute("revision", revision);
    model.addAttribute("service", service);
    return "index";
  }

  @RequestMapping("/pages/search-article")
  public String searchArticle() {
    return "pages/search-article/search-article";
  }

  @RequestMapping("/pages/article")
  public String article() {
    return "pages/article/index";
  }

  @RequestMapping("/admin")
  public String adminLogin() {
    return "admin/index";
  }

  @RequestMapping("/admin-signup")
  public String adminSignup() {
    return "admin/sign-up";
  }

  @RequestMapping("/admin/pages/home")
  public String adminHome() {
    return "admin/pages/admin-home/index";
  }

  @RequestMapping("/admin/pages/search-article")
  public String adminSearchArticle() {
    return "admin/pages/admin-search-article/index";
  }

  @RequestMapping("/admin/pages/article")
  public String adminArticle() {
    return "admin/pages/admin-article/index";
  }

  @RequestMapping("/admin/pages/create-article")
  public String adminCreateArticle() {
    return "admin/pages/admin-create-article/admin-create-article";
  }

  @RequestMapping("/admin/pages/edit-article")
  public String adminEditArticle() {
    return "admin/pages/admin-edit-article/index";
  }
}
