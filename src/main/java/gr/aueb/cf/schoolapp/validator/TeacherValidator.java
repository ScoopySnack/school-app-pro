package gr.aueb.cf.schoolapp.validator;

import gr.aueb.cf.schoolapp.dto.BaseDTO;

import java.util.HashMap;
import java.util.Map;

public class TeacherValidator<T> {

    private TeacherValidator(){

    }

    public static <T extends BaseDTO>Map<String, String> validate(T dto){
        Map<String, String> errors = new HashMap<>();

        //length validation
        if (dto.getFirstname().length() < 2 || dto.getFirstname().length() > 32) {
            errors.put("firstname", "Firstname must be between 2 and 32 characters");
        }
        if (dto.getLastname().length() < 2 || dto.getLastname().length() > 32) {
            errors.put("lastname", "Lastname must be between 2 and 32 characters");
        }
        if (dto.getVat().length() != 9) {
            errors.put("vat", "VAT must be 9 characters");
        }
        if (dto.getPhoneNum().length() != 10) {
            errors.put("phone", "Phone must be 10 characters");
        }
        if (dto.getFathername() == null || dto.getFathername().length() < 2 || dto.getFathername().length() > 32) {
            errors.put("fathername", "Fathername must be between 2 and 32 characters");
        }
        if (dto.getEmail() == null || dto.getEmail().length() < 2 || dto.getEmail().length() > 32) {
            errors.put("email", "Email must be between 2 and 32 characters");
        }
        if (dto.getStreet() == null || dto.getStreet().length() < 2 || dto.getStreet().length() > 32) {
            errors.put("street", "Street must be between 2 and 32 characters");
        }
        if (dto.getStreetNum() == null || dto.getStreetNum().isEmpty() || dto.getStreetNum().length() > 5) {
            errors.put("streetNum", "Street number must be between 1 and 5 characters");
        }
        if (dto.getZipCode() == null || dto.getZipCode().length() != 5) {
            errors.put("zipCode", "Zip code must be 5 characters");
        }
        if (dto.getCityId() == null || dto.getCityId() < 1) {
            errors.put("cityId", "City must be selected");
        }


        //whitespace validation
        if (dto.getFirstname().matches(".*\\s+.*$")) {
            errors.put("firstname", "Firstname must not contain spaces");
        }

        if (dto.getLastname().matches(".*\\s+.*$")) {
            errors.put("lastname", "Lastname must not contain spaces");
        }
        //the same for the rest of the fields


        return errors;


    }
}
