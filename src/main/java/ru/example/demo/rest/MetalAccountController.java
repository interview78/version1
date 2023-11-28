package ru.example.demo.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.example.demo.db.MetalAccountDb;

@Controller
@RequiredArgsConstructor
public class MetalAccountController {

    private final MetalAccountDb metalAccountDb;

    @GetMapping("/account/{id}")
    public MetalAccount getAccount(@PathVariable("id") int id) {
        return getAccountById(id);
    }

    private MetalAccount getAccountById(int id) {
        var metalAccountEntity = metalAccountDb.findById(id);
        if (metalAccountEntity.isPresent()) {
            var mapper = new MetalAccountMapper();
            var val = metalAccountEntity.get();
            return mapper.mapFrom(val);
        }
        return null;
    }
}
