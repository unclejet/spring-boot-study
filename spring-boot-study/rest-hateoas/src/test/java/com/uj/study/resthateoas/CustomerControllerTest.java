package com.uj.study.resthateoas;

import com.uj.study.resthateoas.application.service.CustomerService;
import com.uj.study.resthateoas.application.service.OrderService;
import com.uj.study.resthateoas.infrustructure.persistence.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author ：unclejet
 * @date ：Created in 2020/3/2 6:09
 * @description：
 * @modified By：
 * @version:
 */
@SpringBootTest
@AutoConfigureMockMvc
public class CustomerControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private CustomerService customerService;

    @MockBean
    private OrderService orderService;

    private static final String DEFAULT_CUSTOMER_ID = "customer1";
    private static final String DEFAULT_ORDER_ID = "order1";

    @Test
    public void givenExistingCustomer_whenCustomerRequested_thenResourceRetrieved() throws Exception {
        given(this.customerService.getCustomerDetail(DEFAULT_CUSTOMER_ID))
                .willReturn(new Customer(DEFAULT_CUSTOMER_ID, "customerJohn", "companyOne"));

        this.mvc.perform(get("/customers/" + DEFAULT_CUSTOMER_ID))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$._links").doesNotExist())
                .andExpect(jsonPath("$.customerId", is(DEFAULT_CUSTOMER_ID)));
    }
}
