package com.hendisantika.springbootbookrestsample.repository;

import com.hendisantika.springbootbookrestsample.model.Buku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-book-rest-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-27
 * Time: 21:37
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface BukuRepository extends JpaRepository<Buku, Long> {
    List<Buku> findByStatusPeminjaman(int statusPeminjaman);

    List<Buku> findByTitleBookContaining(String titleBook);

}