package model;

public class Administrator {

    private String adminId;
    private String name;
    private String username;

    public Administrator(String adminId, String name, String username) {
        this.adminId = adminId;
        this.name = name;
        this.username = username;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
