package com.learning.buisnessproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.buisnessproject.entities.Admin;
import com.learning.buisnessproject.repository.AdminRepository;

@Component
public class AdminServices {
    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAll(){
        List<Admin> admins=(List<Admin>)adminRepository.findAll();
        return admins;
    }
    public Admin getAdmin(int id){
        return adminRepository.findById(id).get();
    }
    public void update(Admin admin,int id){
        for(Admin ad:getAll()){
            if(ad.getAdminId()==id){
                adminRepository.save(admin);
            }
        }
    }
    public void delete(int id){
        adminRepository.deleteById(id);
    }
    public void addAdmin(Admin admin){
        adminRepository.save(admin);
    }
    //Validating Admin login
	public boolean validateAdminCredentials(String email,String password)
	{
		Admin admin=adminRepository.findByAdminEmail(email);
		if(admin!=null && admin.getAdminPassword().equals(password))
		{
			return true;
		}
		return false;
	}
}
