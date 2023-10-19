package com.seb44main011.petplaylist.global.storage.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


public interface StorageService<T> {
    void saveUploadFile(List<MultipartFile> fileTypeData, T entity) throws IOException;

    void convertFileStatus(T entity);

}
