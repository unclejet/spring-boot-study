package com.uj.study.custom.media.type.controller;

import com.uj.study.custom.media.type.dto.BaeldungItem;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：unclejet
 * @date ：Created in 2020/2/26 6:14
 * @description：
 * @modified By：
 * @version:
 */
@RestController
//@RequestMapping(value = "/", produces = "application/vnd.baeldung.api.v1+json")
public class CustomMediaTypeController {
    @RequestMapping(method = RequestMethod.GET, value = "/public/api/items/{id}", produces = "application/vnd.baeldung.api.v1+json")
    public @ResponseBody
    BaeldungItem getItem(@PathVariable("id") String id) {
        return new BaeldungItem("itemId1");
    }

}
