package smg.Vsoapmac.controller;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import smg.Vsoapmac.service.cityService;

@Controller
public class indexController {

    @Autowired
    @Qualifier("cityImpl")
    private cityService cityService;

    @RequestMapping(value = "/index")
    public String index(){
        System.out.println("testing connection: city database size" + cityService.findAll().size());
        return "index";
    }

    @RequestMapping(value = "/json")
    public @ResponseBody String json(@RequestBody String id){
        JSONObject jo = new JSONObject();
        jo.put("country", cityService.find(Integer.parseInt(id)).getName());
        return jo.toString();
    }
}
