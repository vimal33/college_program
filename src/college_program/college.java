/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college_program;

/**
 *
 * @author Vimal
 */
public class college {
    String collegename;
        String university;
            String address;
                String email;
                    String website;
                        String phonenumber;
                        static String dept_name;
                        int no_of_faculty;
                        int no_of_student;
                        void display_colege_name()
                        {
                            System.out.println("college name:"+collegename);
                        }
                                void display_total_strength()
                                {
                                    System.out.println("total strength"+(no_of_faculty+no_of_student));
                                }

static void display_defaultcollege()
{
    System.out.println("college name:USE");
}

      
    
}
