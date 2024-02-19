package sn.esmt.elearning.service;

import org.springframework.stereotype.Service;

@Service
public class EtudiantService {

  public boolean checkAge(int age){

    boolean value= (age<18)?true:false;
    return value;
  }
}
