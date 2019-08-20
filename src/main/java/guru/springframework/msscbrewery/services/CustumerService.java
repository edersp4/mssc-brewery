package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustumerDto;

import java.util.UUID;


public interface CustumerService {
    CustumerDto getCustomerById(UUID custumerId);

    CustumerDto save(CustumerDto custumerDto);

    void update(String custumerId, CustumerDto custumerDto);

    void delete(String custumerId);
}
