package ru.polis.services;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.polis.entities.Record;

import ru.polis.repositories.RecordRepository;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repository;

    public Record save(Record record) {
         return repository.save(record);
    }

    public void delete(Record record) {repository.delete(record.getId());}

    public List<Record> getAll() {
        return StreamSupport
                .stream(
                        Spliterators.spliteratorUnknownSize(repository.findAll().iterator(), Spliterator.NONNULL),
                        false)
                .collect(Collectors.toList());
    }
}
