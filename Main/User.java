public class User {
    private String userName;
    private String password;
    private Coop myCoop;
    // database entry for user

    public User( String name, String password)  {
        this.userName = name;
        this.password = password;
        this.myCoop = new Coop(name + "'s coop");
        // create database selection for user
    }

    // Methods

    /*
     * Set username
    */

    /*
     * Set password
    */  

    /*
     * Delete account
     */
}
