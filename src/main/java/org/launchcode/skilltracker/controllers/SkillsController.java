package org.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody

public class SkillsController {

    @GetMapping

    public String skillsTracker() {

        String html = "<html>" +
            "<Body>" +
            " <h1> Skills Tracker </h1>" +
            "<h2> We have some skills we would like to learn. " +
            "Here they are!! </h2>" +
            "<ol>" +
            "<li> Python </li>" +
            "<li> Ruby on Rails </li>" +
            "<li> SaaS </li>" +
                    "</ol>" +
                    "</html>";

        return html;
        }

    @GetMapping("form")
    public String skillsTrackerForm() {
        String html =  "<html>" +
                "<body>" +
                "<form method = 'post' action = 'form'>" +
                "<label> Name </label><br>" +
                "<input type = 'text' name = 'name'><br>" +
                "<label> Choose a Skill: </label><br>" +
                "<select name = languageOne>" +
                "<option language = '1'> Saas </option>" +
                "<option language = '2'> PHP </option>" +
                "<option language = '3'> Javascript </option>" +
                "</select>" +
                "<label> Choose a Skill: </label><br>" +
                "<select name = languageTwo>" +
                "<option language = '1'> Saas </option>" +
                "<option language = '2'> PHP </option>" +
                "<option language = '3'> Javascript </option>" +
                "</select>" +
                "<label> Choose a Skill: </label><br>" +
                "<select name = languageThree>" +
                "<option language = '1'> Saas </option>" +
                "<option language = '2'> PHP </option>" +
                "<option language = '3'> Javascript </option>" +
                "</select>" +
                "<br><button type = 'submit'> Submit! </button>" +
                "</form>" +
                "</body>" +
                "</html>";

        return html;
    }

@PostMapping("form")
    public String skillsTrackerSuccess(@RequestParam String name, String languageOne, String languageTwo, String languageThree) {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                        "<li>" + languageOne + "</li>" +
                        "<li>" + languageTwo + "</li>" +
                        "<li>" + languageThree + "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}