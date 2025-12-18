package com.ecommerce.entity;
import java.time.LocalDateTime;
import org.springframework.security.core.userdetails.UserDetails;
import jakarta.persistence.Entity;
import jakarta.persistence.*;      
import jakarta.validation.constraints.*;

@entity                       // Entity annotation 
@Table(name = "users")
public class User implements UserDetails {  
  
    @id                      
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;            
    
    @NotBlank(message = "Username is mandatory")  
    @Size(min = 3, max =  = 50, message = "Username must be between 3 and 50 characters") 
    @Column( nullable = false, unique = true)    
    private String username; 
    
    @NotBlank(message = "Email is mandatory") //Validation annotation
    @Email(message = "Email should be valid") 
    @Column( nullable = false, unique = true) 
    private String email;
    
    @NotBlank(message = "Password is mandatory")   
    @Size(min = 6, message = "Password must be at least 6 characters long") 
    @Column( nullable = false)                    
    private String password;
    
    @NotBlank(message = "First name is mandatory")
    @Column( name="first-name" ,nullable = false)   
    private String firstName;

    @NotBlank(message = "Last name is mandatory") 
    @Column( name="last_name" ,nullable = false)   
    private String lastName;

    @Column( name="phone_number")   
    private String phoneNumber;   
    
    @Column(name = "created_at", nullable = false, updatable = false) 
    private LocalDateTime createdAt; 

    @Column(name = "updated_at") 
    private LocalDateTime updatedAt; 

    //constructor

    

    public

    private Role role = Role.USER; 
    public enum Role {  
        USER,
        ADMIN
    }   
}
