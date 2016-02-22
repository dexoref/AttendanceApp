package com.codedleaf.sylveryte.attendanceapp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by sylveryte on 13/2/16.
 */
public class Attendance {

    private Lecture mLecture;
    private List<Student> mStudents;
    private UUID mId;
    private Date mDate;
    private static SimpleDateFormat sSimpleDateFormat;

    public Attendance(UUID lectureId)
    {
        this(lectureId,UUID.randomUUID(),new Date(),null);


    }

    //COnstructor for databaes

    public Attendance(UUID lectureId,UUID id, Date date,String presentString)
    {
        mLecture=LectureLab.get().getLectureById(lectureId);
        mStudents=mLecture.getKlass().getSpecificStudents(mLecture.getStudentStartingRollNo(),
                mLecture.getStudentLastRollNo());
        mId=id;
        mDate=date;

        sSimpleDateFormat=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");


    }

    public List<Student> getStudents() {
        return mStudents;
    }

    public UUID getId() {
        return mId;
    }

    public UUID getLectureId() {
        return mLecture.getId();
    }


    public Date getDate() {
        return mDate;
    }

    public static Date getDateByString(String  s) throws ParseException {
        return sSimpleDateFormat.parse(s);
    }

    public String getDateString ()
    {
        return sSimpleDateFormat.format(mDate);
    }

    public String getExtraInfo()
    {
        return "No of students "+mStudents.size()+"\nDate : "+getDateString();
    }

    public void setDate(Date date) {
        mDate = date;
    }


    public String getAttendanceName()
    {
        return mLecture.getLectureName();
    }

}
