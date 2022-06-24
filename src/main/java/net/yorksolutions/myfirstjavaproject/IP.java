package net.yorksolutions.myfirstjavaproject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IP {
    @JsonProperty("ip") // telling jackson, to map this field to a json field called "ip"
                        //     when jackson is parsing from json, then when the ip field appears, set this
                        //         field's value to the ip fields value
                        //     when jackson is serializing to json, then the json object shall have a field
                        //         called ip with a value of this field's value
    String ipAddress;
}
