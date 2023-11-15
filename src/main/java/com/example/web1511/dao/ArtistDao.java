package com.example.web1511.dao;

import com.example.web1511.data.Artist;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class ArtistDao {

    @PersistenceContext
    private EntityManager em;

    public List<Artist> findAll() {
        return em.createNamedQuery("Artist.findAll", Artist.class).getResultList();
    }

    public void add(Artist artist) {
        em.persist(artist);
    }

    public void delete(int id) {
        Artist artist = em.find(Artist.class, id);
        em.remove(artist);
    }

    public Artist find(int id) {
        return em.find(Artist.class, id);
    }
}
