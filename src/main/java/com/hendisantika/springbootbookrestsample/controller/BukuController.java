package com.hendisantika.springbootbookrestsample.controller;

import com.hendisantika.springbootbookrestsample.model.Buku;
import com.hendisantika.springbootbookrestsample.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

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


    @PostMapping("/")
    public Buku tambahBuku(@Valid @RequestBody Buku buku) {
        return bukuRepository.save(buku);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Buku> updateBuku(@PathVariable(value = "id") Long id, @Valid @RequestBody Buku detailBuku) {

        Optional<Buku> buku = bukuRepository.findById(id);

        if (buku.isPresent()) {

            Buku dataBuku = buku.get();
            dataBuku.setTitleBook(detailBuku.getTitleBook());

            dataBuku.setNamaDepanPengarang(detailBuku.getNamaDepanPengarang());

            dataBuku.setNamaBelakangPengarang(detailBuku.getNamaBelakangPengarang());

            dataBuku.setNamaPeminjam(detailBuku.getNamaPeminjam());

            dataBuku.setStatusPeminjaman(detailBuku.getStatusPeminjaman());

            Buku updatedBuku = bukuRepository.save(buku);

            return ResponseEntity.ok(updatedBuku);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
