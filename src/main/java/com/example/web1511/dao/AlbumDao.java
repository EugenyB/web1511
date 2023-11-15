package com.example.web1511.dao;

import com.example.web1511.data.Album;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class AlbumDao {
    @PersistenceContext
    private EntityManager em;

    public List<Album> findAll() {
        return em.createNamedQuery("Album.findAll", Album.class).getResultList();
    }
}
