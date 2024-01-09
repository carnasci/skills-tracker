package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String homePageList() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the List!" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
         return        "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/hello'>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                 "<br>" +
                 "<label>My favorite language</label><br>" +
                 "<select name='first'>" +
                 "<option value='Java'>Java</option>" +
                 "<option value='JavaScript'>JavaScript</option>" +
                 "<option value='Python'>Python</option>" +
                 "</select><br>" +
                 "<label>My second favorite language</label><br>" +
                 "<select name='second'>" +
                 "<option value='Java'>Java</option>" +
                 "<option value='JavaScript'>JavaScript</option>" +
                 "<option value='Python'>Python</option>" +
                 "</select><br>" +
                 "<label>My third favorite language</label><br>" +
                 "<select name='third'>" +
                 "<option value='Java'>Java</option>" +
                 "<option value='JavaScript'>JavaScript</option>" +
                 "<option value='Python'>Python</option>" +
                 "</select><br>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
    }

    @PostMapping("hello")
    @ResponseBody
    public String formPost(@RequestParam String coder, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return "<html>" +
                "<body>" +
                "<h1>" + coder + "</h1>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</body>" +
                "</html";
    }
}
