package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    //    ModelAndView
    @RequestMapping("/sayHello.do")
    public ModelAndView sayHello() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "Hello World!");
        return mv;
    }
//    @RequestMapping(path="/sayHello.do" , method = RequestMethod.GET)
//    public ModelAndView add(@RequestParam("id") int id, @RequestParam("name") String name)
//    {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("success");
//        mv.addObject("id", id);
//        mv.addObject("name", name);
//        return mv;
//    }
    @RequestMapping("/sayHello/{id}")
    public ModelAndView path(@PathVariable("id") int id)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        mv.addObject("id", id);
        return mv;
    }
    @RequestMapping(path="/sayHello/core", method = RequestMethod.GET)
    public ModelAndView core(@RequestParam("id") int id, @RequestParam("name") String name)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("core");
        mv.addObject("id", id);
        mv.addObject("name", name);
        return mv;
    }
    @RequestMapping(path="/sayHello/sql", method = RequestMethod.GET)
    public ModelAndView sql(@RequestParam("id") int id, @RequestParam("name") String name)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sql");
        mv.addObject("id", id);
        mv.addObject("name", name);
        return mv;
    }
    @RequestMapping(path="/sayHello/spring", method = RequestMethod.GET)
    public ModelAndView spring(@RequestParam("id") int id, @RequestParam("name") String name)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("spring");
        mv.addObject("id", id);
        mv.addObject("name", name);
        return mv;
    }
}
