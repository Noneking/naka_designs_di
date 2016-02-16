/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Bookmark;
import Hibernate.POJOs.Crew;
import java.util.ArrayList;

/**
 *
 * @author nonek
 */
public interface Bookmark_IDAO {
    
    public Bookmark getBookmarkByCod(int cod);
    public Bookmark getBookmarkByDescription(String description);
    public ArrayList<Bookmark> getBookmarksByQuery(String question);
    public ArrayList<Bookmark> getBookmarks();
    public void insertBookmark(String description, String date, String crew);
    public void modifyBookmark(int cod, String description, String date, Crew crew);
    public void deleteBookmark(int cod);
    public void deleteBookmarks(ArrayList<Bookmark> bookmarks);
    public void deleteBookmarks();
    
}
