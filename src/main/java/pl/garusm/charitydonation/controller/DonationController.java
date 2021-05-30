package pl.garusm.charitydonation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.garusm.charitydonation.entity.Donation;
import pl.garusm.charitydonation.service.CategoryService;
import pl.garusm.charitydonation.service.DonationService;
import pl.garusm.charitydonation.service.InstitutionService;

import javax.validation.Valid;

@Controller
@RequestMapping("/donation")
public class DonationController {

    private final CategoryService categoryService;
    private final InstitutionService institutionService;
    private final DonationService donationService;

    public DonationController(CategoryService categoryService, InstitutionService institutionService, DonationService donationService) {
        this.categoryService = categoryService;
        this.institutionService = institutionService;
        this.donationService = donationService;
    }

    @GetMapping("/add")
    public String formAddDonation(Model model){
        model.addAttribute("donation", new Donation());
        model.addAttribute("allCategories", categoryService.getCategories());
        model.addAttribute("allInstitutions", institutionService.getInstitutions());
        return "donation/form";
    }

    @PostMapping("/add")
    public String processFormAddDonation(@ModelAttribute @Valid Donation donation) {
            donationService.addDonation(donation);
            return "donation/form-confirmation";

    }
}
