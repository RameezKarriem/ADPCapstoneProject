package za.ac.cput.domain;

import java.time.LocalDate;

public class Learner {
    private int learnerId;
    private String learnerNumber;
    private String licenseType;
    private LocalDate dateRegistered;
    private int userId;

    public Learner(){

    }

    public Learner(Builder builder){
        this.learnerId = builder.learnerId;
        this.learnerNumber = builder.learnerNumber;
        this.licenseType = builder.licenseType;
        this.dateRegistered = builder.dateRegistered;
        this.userId = builder.userId;
    }

    public int getLearnerId() {
        return learnerId;
    }

    public String getLearnerNumber() {
        return learnerNumber;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public LocalDate getDateRegistered() {
        return dateRegistered;
    }

    public int getUserId() {
        return userId;
    }

    public static class Builder{
        private int learnerId;
        private String learnerNumber;
        private String licenseType;
        private LocalDate dateRegistered;
        private int userId;

        public Builder setLearnerId(){
            this.learnerId=learnerId;
            return this;
        }
        public Builder setLearnerNumber(){
            this.learnerNumber=learnerNumber;
            return this;
        }
        public Builder setLicenseType(){
            this.licenseType=licenseType;
            return this;
        }
        public Builder setDateRegistered(){
            this.dateRegistered=dateRegistered;
            return this;
        }
        public Builder setUserId(){
            this.userId=userId;
            return this;
        }

        public Builder copy(Learner learner){
            this.learnerId=learner.learnerId;
            this.learnerNumber=learner.learnerNumber;
            this.licenseType=learner.licenseType;
            this.dateRegistered=learner.dateRegistered;
            this.userId=learner.userId;
            return this;
        }

        public Learner build(){return new Learner(this);}
    }
}

