package clappapp.club.clapp.model;

import clappapp.club.clapp.R;

/**
 * Created by enver on 2.11.2017.
 */

public class DataTypeCheck {

    private static int MIN_NAME_LENGTH = 3;
    private static int MIN_PASSWORD_LENGTH = 6;

    public static int checkEmail(String email) {
        if (email.equals("")) {
            return R.string.no_email_error;
        } else if (!email.contains("@ku.edu.tr")) {
            return R.string.email_not_valid_error;
        } else {
            return 1;
        }
    }

    public static int checkName(String name) {
        if (name.length() == 0) {
            return R.string.no_name_error;
        } else if (name.length() < MIN_NAME_LENGTH) {
            return R.string.name_too_short_error;
        } else {
            return 1;
        }
    }

    public static int checkSurname(String surname) {
        if (surname.length() == 0) {
            return R.string.no_surname_error;
        } else if (surname.length() < MIN_NAME_LENGTH) {
            return R.string.surname_too_short_error;
        } else {
            return 1;
        }
    }

    public static int checkPassword(String password) {

        if (password.length() < MIN_PASSWORD_LENGTH) {
            return R.string.password_too_short_error;
        }

        return 1;
    }
}
