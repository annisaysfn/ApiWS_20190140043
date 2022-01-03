package com.example.datakaryawan.pws;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KaryawanController {
    @CrossOrigin
    @RequestMapping(value="/datakaryawanjson", produces={MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Karyawan> getJSONDatakaryawan(){
        KaryawanJpaController controller = new KaryawanJpaController();
        List<Karyawan> buffer = new ArrayList<>();
        try {
            buffer = controller.findKaryawanEntities();
        } catch (Exception e){}
        return buffer;
    }
    
    @CrossOrigin
    @RequestMapping(value="/datakaryawanxml", produces={MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public List<Karyawan> getXMLDatakaryawan(){
        KaryawanJpaController controller = new KaryawanJpaController();
        List<Karyawan> buffer = new ArrayList<>();
        try {
            buffer = controller.findKaryawanEntities();
        } catch (Exception e){}
        return buffer;
    }
}
