/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.LibraryAdminRole;
import Business.Role.Role;
import Business.Role.UniversityAdminRole;
import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public class LibraryAdminOrganization extends Organization{
    
    public LibraryAdminOrganization() {
        super(Organization.Type.LibraryAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LibraryAdminRole());
        return roles;
    }
    
}
