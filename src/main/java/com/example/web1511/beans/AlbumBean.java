package com.example.web1511.beans;

import com.example.web1511.dao.AlbumDao;
import com.example.web1511.data.Album;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class AlbumBean implements Serializable {

    @EJB
    private AlbumDao albumDao;

    public List<Album> getAlbumList() {
        return albumDao.findAll();
    }
}
