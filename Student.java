/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisia;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jucarmonam
 */
public class Student {
    private int id;
    private String user;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private List<Group> groupsAttended;
    private List<Grade> gradesReceived;
    private Campus studyIn;
}
