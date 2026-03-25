package za.ac.cput.domain;

public class Admin {
    private int adminId;
    private String department;
    private int accessLevel;
    private int userId;

    public Admin(){


    }
    public Admin(int adminId, String department, int accessLevel, int userId) {
        this.adminId = adminId;
        this.department = department;
        this.accessLevel = accessLevel;
        this.userId = userId;
    }
    public Admin (Builder builder){
        this.adminId= builder.adminId;
        this.department= builder.department;
        this.accessLevel= builder.accessLevel;
        this.userId= builder.userId;
    }

    public int getAdminId() {
        return adminId;
    }
    public String getDepartment(){
        return department;
    }
    public int getAccessLevel(){
        return accessLevel;
    }
    public int getUserId(){
        return userId;
    }

    public static class Builder{
        private int adminId;
        private String department;
        private int accessLevel;
        private int userId;

        public Builder setAdminId(){
            this.adminId = adminId;
            return this;
        }
        public Builder setDepartment(){
            this.department=department;
            return this;
        }
        public Builder setAccessLevel(){
            this.accessLevel=accessLevel;
            return this;
        }
        public Builder setUserId(){
            this.userId=userId;
            return this;
        }

        public Builder copy(Admin admin){
            this.adminId=admin.adminId;
            this.department=admin.department;
            this.accessLevel=admin.accessLevel;
            this.userId=admin.userId;
            return this;
        }

        public Admin build(){return new Admin(this);}

    }
}
