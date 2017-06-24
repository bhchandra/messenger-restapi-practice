package com.messenger.model;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author MITRA
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@XmlRootElement
public class Message {

    private long id;
    private String author;
    private LocalDate dateCreated;
    private String message;
}
