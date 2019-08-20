package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.services.CustumerService;
import guru.springframework.msscbrewery.web.model.CustumerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/custumer")
@RestController
public class CustumerController {
    private final CustumerService custumerService;

    public CustumerController(CustumerService custumerService) {
        this.custumerService = custumerService;
    }

    @GetMapping("/{custumerId}")
    public ResponseEntity<CustumerDto> getCustumer(@PathVariable UUID custumerId) {
        return new ResponseEntity<>(custumerService.getCustomerById(custumerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CustumerDto custumerDto) {
        CustumerDto saved = custumerService.save(custumerDto);
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "/api/v1/custumer" + saved.getId()
                .toString());
        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{custumerId}")
    public ResponseEntity handleUpdate(@PathVariable("custumerId") String custumerId, @RequestBody CustumerDto custumerDto) {
        custumerService.update(custumerId, custumerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{custumerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable String custumerId) {
        custumerService.delete(custumerId);
    }
}
