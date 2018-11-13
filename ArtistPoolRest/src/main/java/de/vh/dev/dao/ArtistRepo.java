package de.vh.dev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.vh.dev.model.Artist;

@RepositoryRestResource(collectionResourceRel = "artists", path = "artists")
public interface ArtistRepo extends JpaRepository<Artist, Integer> {

}
