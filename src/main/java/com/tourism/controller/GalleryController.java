package com.tourism.controller;

import com.tourism.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value="/gallery")
public class GalleryController extends BaseController {


    @RequestMapping(value="/view")
    public String view(HttpServletRequest request){
        //request.setAttribute("labelList",contentFlowService.getAllLabel());
        //request.setAttribute("clickId","label");
        return "/page/gallery";
    }


}
