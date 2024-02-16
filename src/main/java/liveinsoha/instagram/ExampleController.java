package liveinsoha.instagram;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ExampleController {

    @GetMapping
    public String home() {
        return "home";
    }
}
