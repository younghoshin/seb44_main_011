package com.seb44main011.petplaylist.global.storage.service;

import com.amazonaws.services.s3.AmazonS3;
import com.seb44main011.petplaylist.domain.music.entity.Music;
import com.seb44main011.petplaylist.domain.music.service.storageService.MusicS3Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class S3Service<T> implements StorageService<T> {


    private final MusicS3Service musicS3Service;

    public S3Service(MusicS3Service musicS3Service) {
        this.musicS3Service = musicS3Service;
    }

    @Override
    public void saveUploadFile(List<MultipartFile> fileTypeData, T entity){
        if (entity instanceof Music){
            musicS3Service.saveUploadFile(fileTypeData, (Music) entity);
        }
        else {
            throw new RuntimeException("no match provider");
        }
    }

    @Override
    public void convertFileStatus(T entity) {
        if (entity instanceof Music){
            musicS3Service.convertFileStatus((Music) entity);
        }
        else {
            throw new RuntimeException("no match provider");
        }

    }

}
