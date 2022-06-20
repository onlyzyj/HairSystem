package com.hair.HairSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitController {

    @RequestMapping("index.html")
    public String indexHtml(Model model){
        return "init/index";
    }

    @RequestMapping("group.html")
    public String groupHtml(Model model){
        return "init/group";
    }
    
    @RequestMapping("lyear-config-system.html")
    public String lyearConfigSystem(Model model){
        return "init/lyear-config-system";
    }

    @RequestMapping("lyear-config-upload.html")
    public String lyearConfigUpload(Model model){
        return "init/lyear-config-upload";
    }

    @RequestMapping("lyear_forms_checkbox.html")
    public String lyear_forms_checkbox(Model model){
        return "init/lyear_forms_checkbox";
    }

    @RequestMapping("lyear_forms_elements.html")
    public String lyear_forms_elements(Model model){
        return "init/lyear_forms_elements";
    }

    @RequestMapping("lyear_forms_radio.html")
    public String lyear_forms_radio(Model model){
        return "init/lyear_forms_radio";
    }

    @RequestMapping("lyear_forms_switch.html")
    public String lyear_forms_switch(Model model){
        return "init/lyear_forms_switch";
    }

    @RequestMapping("lyear_js_chartjs.html")
    public String lyear_js_chartjs(Model model){
        return "init/lyear_js_chartjs";
    }

    @RequestMapping("lyear_js_colorpicker.html")
    public String lyear_js_colorpicker(Model model){
        return "init/lyear_js_colorpicker";
    }

    @RequestMapping("lyear_js_datepicker.html")
    public String lyear_js_datepicker(Model model){
        return "init/lyear_js_datepicker";
    }

    @RequestMapping("lyear_js_jconfirm.html")
    public String lyear_js_jconfirm(Model model){
        return "init/lyear_js_jconfirm";
    }

    @RequestMapping("lyear_js_notify.html")
    public String lyear_js_notify(Model model){
        return "init/lyear_js_notify";
    }

    @RequestMapping("lyear_js_sliders.html")
    public String lyear_js_sliders(Model model){
        return "init/lyear_js_sliders";
    }

    @RequestMapping("lyear_js_tags_input.html")
    public String lyear_js_tags_input(Model model){
        return "init/lyear_js_tags_input";
    }

    @RequestMapping("lyear_pages_add_doc.html")
    public String lyear_pages_add_doc(Model model){
        return "init/lyear_pages_add_doc";
    }

    @RequestMapping("lyear_pages_config.html")
    public String lyear_pages_config(Model model){
        return "init/lyear_pages_config";
    }

    @RequestMapping("lyear_pages_doc.html")
    public String lyear_pages_doc(Model model){
        return "init/lyear_pages_doc";
    }

    @RequestMapping("lyear_pages_edit_pwd.html")
    public String lyear_pages_edit_pwd(Model model){
        return "init/lyear_pages_edit_pwd";
    }

    @RequestMapping("lyear_pages_gallery.html")
    public String lyear_pages_gallery(Model model){
        return "init/lyear_pages_gallery";
    }

    @RequestMapping("lyear_pages_login.html")
    public String lyear_pages_login(Model model){
        return "init/lyear_pages_login";
    }

    @RequestMapping("lyear_pages_profile.html")
    public String lyear_pages_profile(Model model){
        return "init/lyear_pages_profile";
    }

    @RequestMapping("lyear_pages_rabc.html")
    public String lyear_pages_rabc(Model model){
        return "init/lyear_pages_rabc";
    }
    
    @RequestMapping("lyear_ui_alerts.html")
    public String lyear_ui_alerts(Model model){
        return "init/lyear_ui_alerts";
    }

    @RequestMapping("lyear_ui_buttons.html")
    public String lyear_ui_buttons(Model model){
        return "init/lyear_ui_buttons";
    }

    @RequestMapping("lyear_ui_cards.html")
    public String lyear_ui_cards(Model model){
        return "init/lyear_ui_cards";
    }

    @RequestMapping("lyear_ui_grid.html")
    public String lyear_ui_grid(Model model){
        return "init/lyear_ui_grid";
    }

    @RequestMapping("lyear_ui_icons.html")
    public String lyear_ui_icons(Model model){
        return "init/lyear_ui_icons";
    }

    @RequestMapping("lyear_ui_modals.html")
    public String lyear_ui_modals(Model model){
        return "init/lyear_ui_modals";
    }

    @RequestMapping("lyear_ui_other.html")
    public String lyear_ui_other(Model model){
        return "init/lyear_ui_other";
    }

    @RequestMapping("lyear_ui_pagination.html")
    public String lyear_ui_pagination(Model model){
        return "init/lyear_ui_pagination";
    }

    @RequestMapping("lyear_ui_progress.html")
    public String lyear_ui_progress(Model model){
        return "init/lyear_ui_progress";
    }

    @RequestMapping("lyear_ui_tables.html")
    public String lyear_ui_tables(Model model){
        return "init/lyear_ui_tables";
    }

    @RequestMapping("lyear_ui_tabs.html")
    public String lyear_ui_tabs(Model model){
        return "init/lyear_ui_tabs";
    }

    @RequestMapping("lyear_ui_tooltips_popover.html")
    public String lyear_ui_tooltips_popover(Model model){
        return "init/lyear_ui_tooltips_popover";
    }

    @RequestMapping("lyear_ui_typography.html")
    public String lyear_ui_typography(Model model){
        return "init/lyear_ui_typography";
    }

}
