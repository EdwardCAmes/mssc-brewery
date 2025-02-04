package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(id)
                .name("Steve")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        log.debug("Created customer");
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("updated customer");
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("delete Customer");
    }
}
