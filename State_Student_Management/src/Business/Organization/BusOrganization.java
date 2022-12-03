/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.BooksManagerRole;
import Business.Role.LocoEngineerRole;
import Business.Role.Role;
import Business.Role.TransportAdminRole;
import java.util.ArrayList;

/**
 *
 * @author bhaveshraja
 */
public class BusOrganization extends Organization{
    
    public BusOrganization() {
        super(Organization.Type.Bus.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransportAdminRole());
        return roles;
    }
    
}
