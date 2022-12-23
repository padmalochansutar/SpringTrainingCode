package com.csmtech.service;

import java.util.List;

import com.csmtech.model.UserFormData;

public interface UserFormDataService {
 UserFormData saveUserFormData(UserFormData userFormData);
List<UserFormData> getAllData();
}
