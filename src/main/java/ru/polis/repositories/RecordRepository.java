package ru.polis.repositories;


import org.springframework.data.repository.CrudRepository;

import ru.polis.entities.Record;

public interface RecordRepository extends CrudRepository<Record, Integer> {

}
