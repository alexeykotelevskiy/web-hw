package ru.polis.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import ru.polis.entities.Record;
import ru.polis.services.RecordService;


@Controller
public class MainController {

    @Autowired
    RecordService recordService;

    @RequestMapping("/")
    public String mainPage(Model model)
    {
        List<Record>   list = recordService.getAll();
       model.addAttribute("todo_list", list);
        return "main";
    }


    @ResponseBody
    @RequestMapping(value = "/records", method = RequestMethod.POST)
    public Record addRecord(@RequestBody Record record, Model model){
        return recordService.save(record);
    }


    @ResponseBody
    @RequestMapping(value = "/records", method = RequestMethod.PUT)
    public Record updateRecord(@RequestBody Record record, Model model){
        return recordService.save(record);
    }

    @ResponseBody
    @RequestMapping(value = "/records", method = RequestMethod.DELETE)
    public void deleteRecord(@RequestBody Record record)
    {
        recordService.delete(record);
    }

}

