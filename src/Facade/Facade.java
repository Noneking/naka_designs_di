/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import DAOs.Basket_DAO;
import DAOs.Basket_IDAO;
import DAOs.Bookmark_DAO;
import DAOs.Bookmark_IDAO;
import DAOs.Category_DAO;
import DAOs.Category_IDAO;
import DAOs.Crew_DAO;
import DAOs.Crew_IDAO;
import DAOs.Material_DAO;
import DAOs.Material_IDAO;
import DAOs.ProductMaterial_DAO;
import DAOs.ProductMaterial_IDAO;
import DAOs.ProductRecord_DAO;
import DAOs.ProductRecord_IDAO;
import DAOs.Product_DAO;
import DAOs.Product_IDAO;
import DAOs.RecordUser_DAO;
import DAOs.RecordUser_IDAO;
import DAOs.Record_DAO;
import DAOs.Record_IDAO;
import DAOs.Turnover_DAO;
import DAOs.Turnover_IDAO;
import DAOs.User_DAO;
import DAOs.User_IDAO;
import Hibernate.POJOs.Basket;
import Hibernate.POJOs.Bookmark;
import Hibernate.POJOs.Category;
import Hibernate.POJOs.Crew;
import Hibernate.POJOs.Material;
import Hibernate.POJOs.Product;
import Hibernate.POJOs.ProductMaterial;
import Hibernate.POJOs.ProductRecord;
import Hibernate.POJOs.Record;
import Hibernate.POJOs.RecordUser;
import Hibernate.POJOs.Turnover;
import Hibernate.POJOs.User;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nonek
 */
public class Facade implements User_IDAO, Product_IDAO, ProductRecord_IDAO, Category_IDAO, Record_IDAO, RecordUser_IDAO, Basket_IDAO, Crew_IDAO, Bookmark_IDAO, Turnover_IDAO, Material_IDAO, ProductMaterial_IDAO{

    User_DAO user;
    Product_DAO product;
    ProductRecord_DAO productRecord;
    Category_DAO category;
    Record_DAO record;
    RecordUser_DAO recordUser;
    Basket_DAO basket;
    Crew_DAO crew;
    Bookmark_DAO bookmark;
    Turnover_DAO turnover;
    Material_DAO material;
    ProductMaterial_DAO productMaterial;
    
    public Facade(){
        this.user=new User_DAO();
        this.product=new Product_DAO();
        this.productRecord=new ProductRecord_DAO();
        this.category=new Category_DAO();
        this.record=new Record_DAO();
        this.recordUser=new RecordUser_DAO();
        this.basket=new Basket_DAO();
        this.crew=new Crew_DAO();
        this.bookmark=new Bookmark_DAO();
        this.turnover=new Turnover_DAO();
        this.material=new Material_DAO();
        this.productMaterial=new ProductMaterial_DAO();
    }
    
    /*
    ---User Operations---
    */
    
    @Override
    public User getUserByCod(int cod) {
        return this.user.getUserByCod(cod);
    }

    @Override
    public User getUserByNickname(String nickname) {
        return this.user.getUserByNickname(nickname);
    }

    @Override
    public ArrayList<User> getUsersByQuery(String question) {
        return this.user.getUsersByQuery(question);
    }

    @Override
    public ArrayList<User> getUsers() {
        return this.user.getUsers();
    }

    @Override
    public void insertUser(String nickname, String name, String surname, String email, String password) {
        this.user.insertUser(nickname, name, surname, email, password);
    }

    @Override
    public void modifyUser(int cod, String nickname, String name, String surname, String email, String password) {
        this.user.modifyUser(cod, nickname, name, surname, email, password);
    }

    @Override
    public void deleteUser(int cod) {
        this.user.deleteUser(cod);
    }

    @Override
    public void deleteUsers(ArrayList<User> users) {
        this.user.deleteUsers(users);
    }

    @Override
    public void deleteUsers() {
        this.user.deleteUsers();
    }

    @Override
    public DefaultTableModel getTableModelUser() {
        return this.user.getTableModelUser();
    }

    /*
    ---Product Operations---
    */

    @Override
    public Product getProductByCod(int cod) {
        return this.product.getProductByCod(cod);
    }

    @Override
    public Product getProductByName(String name) {
        return this.product.getProductByName(name);
    }

    @Override
    public ArrayList<Product> getProductsByQuery(String question) {
        return this.product.getProductsByQuery(question);
    }

    @Override
    public ArrayList<Product> getProducts() {
        return this.product.getProducts();
    }

    @Override
    public void insertProduct(String name, double price, String category) {
        this.product.insertProduct(name, price, category);
    }

    @Override
    public void modifyProduct(int cod, String name, double price, String category) {
        this.product.modifyProduct(cod, name, price, category);
    }

    @Override
    public void deleteProduct(int cod) {
        this.product.deleteProduct(cod);
    }

    @Override
    public void deleteProducts(ArrayList<Product> products) {
        this.product.deleteProducts(products);
    }

    @Override
    public void deleteProducts() {
        this.product.deleteProducts();
    }

    @Override
    public DefaultTableModel getTableModelProduct() {
        return this.product.getTableModelProduct();
    }

    /*
    ---ProductRecord Operations---
    */
    
    @Override
    public ProductRecord getProductRecordByCod(int cod) {
        return this.productRecord.getProductRecordByCod(cod);
    }

    @Override
    public ArrayList<ProductRecord> getProductsRecordsByQuery(int question) {
        return this.productRecord.getProductsRecordsByQuery(question);
    }

    @Override
    public ArrayList<ProductRecord> getProductsRecords() {
        return this.productRecord.getProductsRecords();
    }

    @Override
    public void insertProductRecord(int amount, int record, int product) {
        this.productRecord.insertProductRecord(amount, record, product);
    }

    @Override
    public void modifyProductRecord(int cod, int amount, Record record, Product product) {
        this.productRecord.modifyProductRecord(cod, amount, record, product);
    }

    @Override
    public void deleteProductRecord(int cod) {
        this.productRecord.deleteProductRecord(cod);
    }

    @Override
    public void deleteProductRecord(ArrayList<ProductRecord> product_record) {
        this.productRecord.deleteProductRecord(product_record);
    }

    @Override
    public void deleteProductsRecords() {
        this.productRecord.deleteProductsRecords();
    }

    @Override
    public DefaultTableModel getTableModelProductRecord() {
        return this.productRecord.getTableModelProductRecord();
    }

    /*
    ---Category Operations---
    */
    
    @Override
    public Category getCategoryByCod(int cod) {
        return this.category.getCategoryByCod(cod);
    }

    @Override
    public Category getCategoryByName(String name) {
        return this.category.getCategoryByName(name);
    }

    @Override
    public ArrayList<Category> getCategoriesByQuery(String question) {
        return this.category.getCategoriesByQuery(question);
    }

    @Override
    public ArrayList<Category> getCategories() {
        return this.category.getCategories();
    }

    @Override
    public void insertCategory(String name, String description) {
        this.category.insertCategory(name, description);
    }

    @Override
    public void modifyCategory(int cod, String name, String description) {
        this.category.modifyCategory(cod, name, description);
    }

    @Override
    public void deleteCategory(int cod) {
        this.category.deleteCategory(cod);
    }

    @Override
    public void deleteCategories(ArrayList<Category> categories) {
        this.category.deleteCategories(categories);
    }

    @Override
    public void deleteCategories() {
        this.category.deleteCategories();
    }

    @Override
    public DefaultTableModel getTableModelCategory() {
        return this.category.getTableModelCategory();
    }
    
    @Override /**Obtiene el modelo del ComboBox de Category*/
    public DefaultComboBoxModel getComboBoxModelCategory(){
        return this.category.getComboBoxModelCategory();
    }

    /*
    ---Record Operations---
    */
    
    @Override
    public Record getRecordByCod(int cod) {
        return this.record.getRecordByCod(cod);
    }

    @Override
    public ArrayList<Record> getRecordsByQuery(String question) {
        return this.record.getRecordsByQuery(question);
    }

    @Override
    public ArrayList<Record> getRecords() {
        return this.record.getRecords();
    }

    @Override
    public Record insertRecord(String date) {
        return this.record.insertRecord(date);
    }

    @Override
    public void modifyRecord(int cod, String date) {
        this.record.modifyRecord(cod, date);
    }

    @Override
    public void deleteRecord(int cod) {
        this.record.deleteRecord(cod);
    }

    @Override
    public void deleteRecords(ArrayList<Record> records) {
        this.record.deleteRecords(records);
    }

    @Override
    public void deleteRecords() {
        this.record.deleteRecords();
    }

    @Override
    public DefaultTableModel getTableModelRecord() {
        return this.record.getTableModelRecord();
    }

    /*
    ---RecordUser Operations---
    */
    
    @Override
    public RecordUser getRecordUserByCod(int cod) {
        return this.recordUser.getRecordUserByCod(cod);
    }

    @Override
    public ArrayList<RecordUser> getRecordUserByUser(int user) {
        return this.recordUser.getRecordUserByUser(user);
    }

    @Override
    public ArrayList<RecordUser> getRecordUserByRecord(int record) {
        return this.recordUser.getRecordUserByRecord(record);
    }

    @Override
    public ArrayList<RecordUser> getRecordsUsersByQuery(String question) {
        return this.recordUser.getRecordsUsersByQuery(question);
    }

    @Override
    public ArrayList<RecordUser> getRecordsUsers() {
        return this.recordUser.getRecordsUsers();
    }

    @Override
    public void insertRecordUser(int user, int record) {
        this.recordUser.insertRecordUser(user, record);
    }

    @Override
    public void modifyRecordUser(int cod, User user, Record record) {
        this.recordUser.modifyRecordUser(cod, user, record);
    }

    @Override
    public void deleteRecordUser(int cod) {
        this.recordUser.deleteRecordUser(cod);
    }

    @Override
    public void deleteRecordsUsers(ArrayList<RecordUser> records_users) {
        this.recordUser.deleteRecordsUsers(records_users);
    }

    @Override
    public void deleteRecordsUsers() {
        this.recordUser.deleteRecordsUsers();
    }

    @Override
    public DefaultTableModel getTableModelRecordUser() {
        return this.recordUser.getTableModelRecordUser();
    }

    /*
    ---Basket Operations---
    */
    
    @Override
    public Basket getBasketByCod(int cod) {
        return this.basket.getBasketByCod(cod);
    }

    @Override
    public Basket getBasketByUser(int user) {
        return this.basket.getBasketByUser(user);
    }

    @Override
    public ArrayList<Basket> getBasketByQuery(String question) {
        return this.basket.getBasketByQuery(question);
    }

    @Override
    public ArrayList<Basket> getBaskets() {
        return this.basket.getBaskets();
    }

    @Override
    public void insertBasket(int user, int product, int amount) {
        this.basket.insertBasket(user, product, amount);
    }

    @Override
    public void modifyBasket(int cod, User user, Product product) {
        this.basket.modifyBasket(cod, user, product);
    }

    @Override
    public void deleteBasket(int cod) {
        this.basket.deleteBasket(cod);
    }

    @Override
    public void deleteBaskets(ArrayList<Basket> baskets) {
        this.basket.deleteBaskets(baskets);
    }

    @Override
    public void deleteBaskets() {
        this.basket.deleteBaskets();
    }

    @Override
    public DefaultTableModel getTableModelBasket() {
        return this.basket.getTableModelBasket();
    }
    
    /*
    ---Crew Operations---
    */

    @Override
    public Crew getCrewByEmail(String email) {
        return this.crew.getCrewByEmail(email);
    }

    @Override
    public Crew getCrewByNickname(String nickname) {
        return this.crew.getCrewByNickname(nickname);
    }

    @Override
    public ArrayList<Crew> getCrewsByQuery(String question) {
        return this.crew.getCrewsByQuery(question);
    }

    @Override
    public ArrayList<Crew> getCrews() {
        return this.crew.getCrews();
    }

    @Override
    public void insertCrew(String email, String nickname, String password, String name, String surname, String phone_number, String role) {
        this.crew.insertCrew(email, nickname, password, name, surname, phone_number, role);
    }

    @Override
    public void modifyCrew(String email, String nickname, String password, String name, String surname, String phone_number, String role) {
        this.crew.modifyCrew(email, nickname, password, name, surname, phone_number, role);
    }

    @Override
    public void deleteCrew(String email) {
        this.crew.deleteCrew(email);
    }

    @Override
    public void deleteCrews(ArrayList<Crew> crews) {
        this.crew.deleteCrews(crews);
    }

    @Override
    public void deleteCrews() {
        this.crew.deleteCrews();
    }

    @Override
    public DefaultTableModel getTableModelCrew() {
        return this.crew.getTableModelCrew();
    }

    /*
    ---Bookmark Operations---
    */
    
    @Override
    public Bookmark getBookmarkByCod(int cod) {
        return this.bookmark.getBookmarkByCod(cod);
    }

    @Override
    public Bookmark getBookmarkByDescription(String description) {
        return this.bookmark.getBookmarkByDescription(description);
    }

    @Override
    public ArrayList<Bookmark> getBookmarksByQuery(String question) {
        return this.bookmark.getBookmarksByQuery(question);
    }

    @Override
    public ArrayList<Bookmark> getBookmarks() {
        return this.bookmark.getBookmarks();
    }

    @Override
    public void insertBookmark(String description, String date, String crew) {
        this.bookmark.insertBookmark(description, date, crew);
    }

    @Override
    public void modifyBookmark(int cod, String description, String date, Crew crew) {
        this.bookmark.modifyBookmark(cod, description, date, crew);
    }

    @Override
    public void deleteBookmark(int cod) {
        this.bookmark.deleteBookmark(cod);
    }

    @Override
    public void deleteBookmarks(ArrayList<Bookmark> bookmarks) {
        this.bookmark.deleteBookmarks(bookmarks);
    }

    @Override
    public void deleteBookmarks() {
        this.bookmark.deleteBookmarks();
    }

    @Override
    public DefaultTableModel getTableModelBookmark() {
        return this.bookmark.getTableModelBookmark();
    }

    /*
    ---Turnover Operations---
    */
    
    @Override
    public Turnover getTurnoverByCod(int cod) {
        return this.turnover.getTurnoverByCod(cod);
    }

    @Override
    public Turnover getTurnoverByNickname(int product_record) {
        return this.turnover.getTurnoverByNickname(product_record);
    }

    @Override
    public ArrayList<Turnover> getTurnoversByQuery(int question) {
        return this.turnover.getTurnoversByQuery(question);
    }

    @Override
    public ArrayList<Turnover> getTurnovers() {
        return this.turnover.getTurnovers();
    }

    @Override
    public void insertTurnover(int amount, double price, int product_record) {
        this.turnover.insertTurnover(amount, price, product_record);
    }

    @Override
    public void modifyTurnover(int cod, int amount, double price, ProductRecord product_record) {
        this.turnover.modifyTurnover(cod, amount, price, product_record);
    }

    @Override
    public void deleteTurnover(int cod) {
        this.turnover.deleteTurnover(cod);
    }

    @Override
    public void deleteTurnovers(ArrayList<Turnover> turnover) {
        this.turnover.deleteTurnovers(turnover);
    }

    @Override
    public void deleteTurnovers() {
        this.turnover.deleteTurnovers();
    }

    @Override
    public DefaultTableModel getTableModelTurnover() {
        return this.turnover.getTableModelTurnover();
    }

    /*
    ---Material Operations---
    */
    
    @Override
    public Material getMaterialByCod(int cod) {
        return this.material.getMaterialByCod(cod);
    }

    @Override
    public Material getMaterialByName(String name) {
        return this.material.getMaterialByName(name);
    }

    @Override
    public ArrayList<Material> getMaterialsByQuery(String question) {
        return this.material.getMaterialsByQuery(question);
    }

    @Override
    public ArrayList<Material> getMaterials() {
        return this.material.getMaterials();
    }

    @Override
    public void insertMaterial(String name, int amount) {
        this.material.insertMaterial(name, amount);
    }

    @Override
    public void modifyMaterial(int cod, String name, int amount) {
        this.material.modifyMaterial(cod, name, amount);
    }

    @Override
    public void deleteMaterial(int cod) {
        this.material.deleteMaterial(cod);
    }

    @Override
    public void deleteMaterials(ArrayList<Material> materials) {
        this.material.deleteMaterials(materials);
    }

    @Override
    public void deleteMaterials() {
        this.material.deleteMaterials();
    }

    @Override
    public DefaultTableModel getTableModelMaterial() {
        return this.material.getTableModelMaterial();
    }

    /*
    ---ProductMaterial Operations---
    */
    
    @Override
    public ProductMaterial getProductMaterialByCod(int cod) {
        return this.productMaterial.getProductMaterialByCod(cod);
    }

    @Override
    public ArrayList<ProductMaterial> getProductsMaterialsByQuery(int question) {
        return this.productMaterial.getProductsMaterialsByQuery(question);
    }

    @Override
    public ArrayList<ProductMaterial> getProductsMaterials() {
        return this.productMaterial.getProductsMaterials();
    }

    @Override
    public void insertProductMaterial(int amount, int product, int material) {
        this.productMaterial.insertProductMaterial(amount, product, material);
    }

    @Override
    public void modifyProductMaterial(int cod, int amount, Product product, Material material) {
        this.productMaterial.modifyProductMaterial(cod, amount, product, material);
    }

    @Override
    public void deleteProductMaterial(int cod) {
        this.productMaterial.deleteProductMaterial(cod);
    }

    @Override
    public void deleteProductsMaterials(ArrayList<ProductMaterial> products_materials) {
        this.productMaterial.deleteProductsMaterials(products_materials);
    }

    @Override
    public void deleteProductsMaterials() {
        this.productMaterial.deleteProductsMaterials();
    }

    @Override
    public DefaultTableModel getTableModelProductMaterial() {
        return this.productMaterial.getTableModelProductMaterial();
    }
    
}
