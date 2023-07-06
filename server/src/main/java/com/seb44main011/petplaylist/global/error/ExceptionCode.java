package com.seb44main011.petplaylist.global.error;

import lombok.Getter;

public enum ExceptionCode {

    ACCESS_DENIED(401,"This account is inaccessible"),
    INVALID_TOKEN(401,"is not the same token as data"),
    UNAUTHORIZED(401,"invalid token Data"),
    EXPIRED_TOKEN(401,"Token has expired"),
    ACCOUNT_RESTRICTED(403,"oauth account Member"),
    MEMBER_NOT_FOUND(404, "Member not found"),
    MEMBER_EXISTS(409,"Member EXISTS"),
    MEMBER_MISMATCH(403,"The login Member and the author are different"),
    MEMBER_WITHDRAWN(409, "Already with drawn Member"),
    PASSWORD_MISMATCH(404, "Password is not Correct"),
    MUSIC_NOT_FOUND(404,"Music not found");

    @Getter
    private int status;

    @Getter
    private String message;

    ExceptionCode(int code, String message) {
        this.status = code;
        this.message = message;
    }
}