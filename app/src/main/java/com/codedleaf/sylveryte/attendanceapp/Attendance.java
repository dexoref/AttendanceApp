package com.codedleaf.sylveryte.attendanceapp;

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

    }

    public List<Student> getStudents() {
        return mStudents;
    }

    public UUID getId() {
        return mId;
    }

    public Date getDate() {
        return mDate;
    }


    public String getDateString ()
    {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM/dd/yyyy");
        return simpleDateFormat.format(mDate);
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
