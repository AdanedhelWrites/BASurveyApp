package com.bilgeadam.basurveyapp.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

/**
 * @author Eralp Nitelik
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionType {
    /*
        Unknown errors.
     */
    UNEXPECTED_ERROR(9000, "Unexpected Error! Please submit a report.", INTERNAL_SERVER_ERROR),
    RUNTIME_EXCEPTION(9001, "Unhandled runtime error occurred!", INTERNAL_SERVER_ERROR),

    /*
        General errors.
     */
    INTERNAL_ERROR(9002, "Internal Server Error", INTERNAL_SERVER_ERROR),
    BAD_REQUEST_ERROR(9003, "Invalid Parameter Error", BAD_REQUEST),
    RESOURCE_NOT_FOUND(9004, "Resource is not Found", NOT_FOUND),
    RESPONSE_NOT_FOUND(9005, "Response is not Found", NOT_FOUND),

    QUESTION_NOT_FOUND(9006, "Question is not Found", NOT_FOUND),
    QUESTION_ALREADY_EXISTS(9007, "Question with the same question string already exists.", BAD_REQUEST),
    CLASSROOM_NOT_FOUND(9008, "Classroom is not found", NOT_FOUND),
    CLASSROOM_ALREADY_EXISTS(9009, "Classroom is already exists", BAD_REQUEST),
    SURVEY_ALREADY_ANSWERED(9010, "This user already has answers for this survey.", BAD_REQUEST),
    USER_DOES_NOT_EXIST(9011, "No such user.", BAD_REQUEST),
    USER_INSUFFICIENT_ANSWER(9012, "User must answer all the questions.", BAD_REQUEST),
    QUESTIONS_AND_RESPONSES_DOES_NOT_MATCH(9013, "Questions and responses does not matches", BAD_REQUEST),
    QUESTION_TYPE_NOT_FOUND(9014, "Question type is not Found", NOT_FOUND),
    SURVEY_NOT_FOUND(9015, "Survey is not found", NOT_FOUND),
    ROLE_ALREADY_EXISTS(9016, "Role is already exists", BAD_REQUEST),
    ROLE_NOT_FOUND(9017, "Role is not found", NOT_FOUND),
    STUDENT_TAG_NOT_FOUND(9018, "Student Tag not found", NOT_FOUND),
    STUDENT_NOT_FOUND(9019, "Student not found", NOT_FOUND),
    TAG_ALREADY_ASSIGNED(9036, "Student Tag is already assigned to the student", BAD_REQUEST),

    STUDENT_TAG_ALREADY_EXISTS(9020, "Student Tag is already exists", BAD_REQUEST),
    QUESTION_TAG_ALREADY_EXISTS(9021, "Question Tag is already exists", BAD_REQUEST),
    TRAINER_TAG_ALREADY_EXISTS(9022, "Trainer Tag is already exists", BAD_REQUEST),
    SURVEY_TAG_ALREADY_EXISTS(9023, "Survey Tag is already exists", BAD_REQUEST),
    TRAINER_TAG_NOT_FOUND(9024, "Trainer Tag not found", NOT_FOUND),
    TRAINER_NOT_FOUND(9025, "Trainer not found", NOT_FOUND),
    SURVEY_TAG_NOT_FOUND(9026, "Survey Tag not found", NOT_FOUND),
    QUESTION_TAG_NOT_FOUND(9027, "Question Tag not found", NOT_FOUND),
    SURVEY_TITLE_ALREADY_EXISTS(9028, "Survey Title not found", BAD_REQUEST),
    SURVEY_HAS_NOT_ASSIGNED_CLASSROOM(9029, "Survey has not assigned to the classroom", INTERNAL_SERVER_ERROR),
    SURVEY_EXPIRED(9030, "Survey is Expired", INTERNAL_SERVER_ERROR),
    SURVEY_NOT_INITIATED(9031, "Survey has not initiated", INTERNAL_SERVER_ERROR),
    SURVEY_ALREADY_ASSIGN_TO_CLASS(9032,"Survey already assign to class",BAD_REQUEST),
    SURVEY_ASSIGN_INVALID_DATE(9033,"Date field can't containt past date",BAD_REQUEST),
    TAG_NOT_FOUND(9034,"Tag not found",NOT_FOUND),
    TAG_ALREADY_EXIST(9034,"Tag already exists",INTERNAL_SERVER_ERROR),
    SURVEY_ANSWERED(9034,"Survey answered. Can not deleted",BAD_REQUEST),
    QUESTION_ANSWERED(9035,"Question answered. Can not deleted",BAD_REQUEST),
    SURVEY_IN_USE(9036,"Survey is active. Cannot delete",BAD_REQUEST),
    BRANCH_NOT_FOUND(9037,"Branch not found", NOT_FOUND),
    COURSE_GROUP_NOT_FOUND(9039,"Course_Group not found", NOT_FOUND),
    BRANCH_ALREADY_EXIST(9038,"Branch alredy exist",BAD_REQUEST),
    COURSE_ALREADY_EXIST(9040,"Course already exist",BAD_REQUEST),
    COURSE_NOT_FOUND(9041,"Course not found", NOT_FOUND),
    BRANCH_IS_UP_TO_DATE(9042,"Branch is already updated", BAD_REQUEST),

    /*
        Validation errors.
     */
    DATA_NOT_VALID(1001, "Data does not meet requirements", BAD_REQUEST),

    /*
        Authentication errors.
     */
    ACCESS_DENIED(2000, "Access denied.", UNAUTHORIZED),
    LOGIN_ERROR_USERNAME_DOES_NOT_EXIST(2001, "Username does not exist.", NOT_FOUND),
    LOGIN_ERROR_WRONG_PASSWORD(2002, "Wrong password.", BAD_REQUEST),
    UNDEFINED_TOKEN(2003, "Token does not contain User Info", BAD_REQUEST),
    /*
        Register errors.
     */
    REGISTER_ERROR_DATA_EXISTS(3001, "Data already exists.", INTERNAL_SERVER_ERROR);

    private int code;
    private String message;
    private HttpStatus httpStatus;
}
