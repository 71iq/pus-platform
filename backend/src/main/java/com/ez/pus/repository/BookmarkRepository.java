package com.ez.pus.repository;

import com.ez.pus.model.Bookmark;
import com.ez.pus.model.Bookmark.BookmarkId;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, BookmarkId> {
    Optional<Bookmark> findByUserIdAndPostId(Long user_id, Long post_id);

    List<Bookmark> findAllByUserId(Long user_id, Pageable pageable);
}
