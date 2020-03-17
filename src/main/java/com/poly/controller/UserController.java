package com.poly.controller;

import com.poly.example.Categories;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Transactional
@RequestMapping("user/")
public class UserController {

    @Autowired
    SessionFactory sessionFactory;

    @RequestMapping(value = "home")
    public ModelAndView homePage() {
        Session session = sessionFactory.getCurrentSession();
        ModelAndView modelAndView = new ModelAndView("home");
        Criteria criteria = session.createCriteria(Categories.class);
        modelAndView.addObject("listCategories", (List<Categories>) criteria.list());
        return modelAndView;
    }

}
