package com.home.bluesky.processors;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.home.bluesky.beans.Emp;

@Repository
public interface EmpRepository extends CassandraRepository<Emp, String>{

}
