package pl.garusm.charitydonation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.garusm.charitydonation.service.DonationService;
import pl.garusm.charitydonation.service.InstitutionService;


@Controller
public class HomePageController {

    private final InstitutionService institutionService;
    private final DonationService donationService;

    public HomePageController(InstitutionService institutionService, DonationService donationService) {
        this.institutionService = institutionService;
        this.donationService = donationService;
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("institutions", institutionService.getInstitutions());
        model.addAttribute("sumOfDonations", donationService.sumOfDonations());
        model.addAttribute("sumOfBoxes", donationService.sumOfQuantity());
        return "index";
    }
}
