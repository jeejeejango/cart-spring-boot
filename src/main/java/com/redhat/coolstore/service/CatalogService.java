package com.redhat.coolstore.service;

import com.redhat.coolstore.model.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "catalogService", url = "${catalog.endpoint}")
interface CatalogService {
	@RequestMapping(method = RequestMethod.GET, value = "/api/catalog")
    List<Product> products();
}