package com.hendisantika.springbootbookrestsample.controller;

import com.hendisantika.springbootbookrestsample.model.Buku;
import com.hendisantika.springbootbookrestsample.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-book-rest-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-27
 * Time: 21:39
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/buku")
public class BukuController {
    @Autowired
    BukuRepository bukuRepository;

    @GetMapping
    public List<Buku> getAll() {
        return bukuRepository.findAll();
    }
}
