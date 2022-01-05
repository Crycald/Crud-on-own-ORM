package com.dybikowski.model;

import com.dybikowski.persistance.Persistable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Client implements Persistable {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
}
