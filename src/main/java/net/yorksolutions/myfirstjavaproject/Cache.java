package net.yorksolutions.myfirstjavaproject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cache {
    @Id
    Long id;

    Integer input;
    String output;
}
