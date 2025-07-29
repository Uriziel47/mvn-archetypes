package de.drunkenmasters.simple;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder
@Getter
public class SimpleEntity {

    private String givenName;
    private String familyName;
    private int age;

    public String name() {
        log.atDebug().log("SimpleEntity#name(): {} {}", familyName, givenName);
        return givenName + " " + familyName;
    }
}
