package com.uj.study.hystrix.controller;

import com.uj.study.hystrix.service.ICollapsingService;
import com.uj.study.provider.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/21 上午9:50
 * @description：
 */
@RestController
public class CollapsingController {

    @Autowired
    private ICollapsingService collapsingService;

    /**
     * 请求聚合/合并
     * @return
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @RequestMapping("/getAnimal")
    public String getAnimal() throws Exception {
        Future<Animal> user = collapsingService.collapsing(1);
        Future<Animal> user2 = collapsingService.collapsing(2);
        System.out.println(user.get().getName());
        System.out.println(user2.get().getName());
        return "Success";
    }

    /**
     * 返回值必须是Future，否则不会进行合并/聚合
     * @return
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @RequestMapping("/getAnimalSyn")
    public String getAnimalSyn() throws ExecutionException, InterruptedException {
        Animal user = collapsingService.collapsingSyn(1);
        Animal user2 = collapsingService.collapsingSyn(2);
        System.out.println(user.getName());
        System.out.println(user2.getName());
        return "Success";
    }


    /**
     * 请求聚合/合并,整个应用的
     * @return
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @RequestMapping("/getAnimalGolbal")
    public String getAnimalGolbal() throws Exception {
        Future<Animal> user = collapsingService.collapsingGlobal(1);
        Future<Animal> user2 = collapsingService.collapsingGlobal(2);
        System.out.println(user.get().getName());
        System.out.println(user2.get().getName());
        return "Success";
    }

}
