package com.yunuskilic.petclinic.service;

import com.yunuskilic.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
