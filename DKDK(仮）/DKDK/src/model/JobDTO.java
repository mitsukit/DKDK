package model;

public class JobDTO
{
    private int job_id;
    private String job;


    public int getJobId()
    {
        return this.job_id;
    }
    public void setJobId(int job_id)
    {
        this.job_id = job_id;
    }

    public String getJob()
    {
        return this.job;
    }

    public void setJob(String job)
    {
        this.job = job;
    }
}
