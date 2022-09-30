package com.gh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface BaseController<T> {
    public ResponseEntity<List<T>> findAll();
    public ResponseEntity<Optional<T>> findById(@PathVariable(name = "id") Integer id);
    public ResponseEntity<T> create(@RequestBody T object);
    public ResponseEntity<T> update(@PathVariable(name = "id") Integer id, @RequestBody T object);
    public ResponseEntity<String> delete(@PathVariable(name = "id") Integer id);
}
