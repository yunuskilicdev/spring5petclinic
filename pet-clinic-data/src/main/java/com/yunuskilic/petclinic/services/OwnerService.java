package com.yunuskilic.petclinic.services;

import com.yunuskilic.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
