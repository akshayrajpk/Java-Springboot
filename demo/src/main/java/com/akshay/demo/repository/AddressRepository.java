package com.akshay.demo.repository;

import com.akshay.demo.model.Address;
import com.akshay.demo.service.fetchEmps.AddressData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long>  {

    @Query(value = "SELECT a.add_id as AddId, a.address as Address FROM address a WHERE a.emp_id = :id",nativeQuery = true)
    List<AddressData> findAddressOfEmp(@Param("id") long id);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM address a WHERE a.emp_id = :id",nativeQuery = true)
    int deleteByEmpId(@Param("id") long id);

}
