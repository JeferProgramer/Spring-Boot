package com.bolsaideas.springboot.webflux.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bolsaideas.springboot.webflux.app.models.documetns.Producto;

public interface ProductoDao extends ReactiveMongoRepository<Producto,String>{

}
