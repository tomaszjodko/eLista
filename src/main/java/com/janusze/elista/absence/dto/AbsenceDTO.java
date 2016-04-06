package com.janusze.elista.absence.dto;

import com.janusze.elista.user.ob.UserOB;
import com.janusze.elista.utils.enums.EAbsenceType;

import java.util.Date;

/**
 * Created by Tomasz Jodko on 2016-03-29.
 */
public class AbsenceDTO {
    private long id;
    private UserOB user;
    private EAbsenceType type;
    private Date date;
    private int hours;
    private Date techDate;
}