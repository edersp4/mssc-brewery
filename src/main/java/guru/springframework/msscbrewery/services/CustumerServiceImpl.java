package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustumerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Slf4j
@Service
public class CustumerServiceImpl implements CustumerService {
    @Override
    public CustumerDto getCustomerById(UUID custumerId) {
        return CustumerDto.builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }

    @Override
    public CustumerDto save(CustumerDto custumerDto) {
        return CustumerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void update(String custumerId, CustumerDto custumerDto) {
        //todo miss implementation
    }

    @Override
    public void delete(String custumerId) {
        log.info("deleting .. ");
    }
}
