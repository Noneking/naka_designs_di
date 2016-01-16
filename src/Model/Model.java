/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author nonek
 */
public class Model extends Connection {
    
    public Model(){
        super();
    }
    
    /*
    ---User Operations---
    */
    
    public User getUserByCod(int cod){
        return (User) getSession().get(User.class, cod);
    }
    
    public User getUserByNickname(String nickname){
        Criteria c=getSession().createCriteria(User.class);
        return (User) c.add(Restrictions.like("nickname", nickname)).uniqueResult();
    }
    
    public ArrayList<User> getUsersByQuery(String question){
        Query query=getSession().createQuery("from User u where u.nickname like :query OR u.email like :query OR u.role like :query");
        ArrayList<User> list=(ArrayList<User>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<User> getUsers(){
        return (ArrayList<User>) getSession().createQuery("from User").list();
    }
    
    public void insertUser(String nickname, String name, String surname, String email, String password){
        User u=new User(nickname, name, surname, email, password);
        getSession().save(u);
        getTransaction().commit();
        System.err.println("User inserted succesfully.");
    }
    
    public void modifyUser(int cod, String nickname, String name, String surname, String email, String password){
        User u=getUserByCod(cod);
        u.setNickname(nickname);
        u.setName(name);
        u.setSurname(surname);
        u.setEmail(email);
        u.setPassword(password);
        getSession().update(u);
        getTransaction().commit();
        System.err.println("User modified succesfully.");
    }
    
    public void deleteUser(int cod){
        User u=getUserByCod(cod);
        getSession().delete(u);
        getTransaction().commit();
        System.err.println("User deleted succesfully.");
    }
    
    public void deleteUsers(ArrayList<User> users){
        Iterator it=users.iterator();
        while(it.hasNext()){
            User u=(User) it.next();
            getSession().delete(u);
        }
        getTransaction().commit();
        System.err.println("Users delete succesfully.");
    }
    
    public void deleteUsers(){
        Iterator it=getUsers().iterator();
        while(it.hasNext()){
            User u=(User) it.next();
            getSession().delete(u);
        }
        getTransaction().commit();
        System.err.println("Users deleted succesfully.");
    }
    
    /*
    ---Product Operations---
    */
    
    public Product getProductByCod(int cod){
        return (Product) getSession().get(Product.class, cod);
    }
    
    public Product getProductByName(String name){
        Criteria c=getSession().createCriteria(Product.class);
        return (Product) c.add(Restrictions.like("name", name)).uniqueResult();
    }
    
    public ArrayList<Product> getProductsByQuery(String question){
        Query query=getSession().createQuery("from Product p where p.name like :query OR p.price like :query OR p.category like :query");
        ArrayList<Product> list=(ArrayList<Product>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<Product> getProducts(){
        return (ArrayList<Product>) getSession().createQuery("from Product").list();
    }
    
    public void insertProduct(String name, double price, String category){
        Product p=new Product(getCategoryByName(category), name, price);
        getSession().save(p);
        getTransaction().commit();
        System.err.println("Product inserted succesfully.");
    }
    
    public void modifyProduct(int cod, String name, double price, String category){
        Product p=getProductByCod(cod);
        p.setName(name);
        p.setPrice(price);
        p.setCategory(getCategoryByName(category));
        getSession().update(p);
        getTransaction().commit();
        System.err.println("Product modified succesfully.");
    }
    
    public void deleteProduct(int cod){
        Product p=getProductByCod(cod);
        getSession().delete(p);
        getTransaction().commit();
        System.err.println("Product deleted succesfully.");
    }
    
    public void deleteProducts(ArrayList<Product> products){
        Iterator it=products.iterator();
        while(it.hasNext()){
            Product p=(Product) it.next();
            getSession().delete(p);
        }
        getTransaction().commit();
        System.err.println("Products deleted succesfully.");
    }
    
    public void deleteProducts(){
        Iterator it=getProducts().iterator();
        while(it.hasNext()){
            Product p=(Product) it.next();
            getSession().delete(p);
        }
        getTransaction().commit();
        System.err.println("Products delete succesfully.");
    }
    
    /*
    ---Products Operations---
    */
    
    public ProductRecord getProductRecordByCod(int cod){
        return (ProductRecord) getSession().get(ProductRecord.class, cod);
    }
    
    public ArrayList<ProductRecord> getProductsRecordsByQuery(int question){
        Query query=getSession().createQuery("from ProductRecord p where p.cod like :query OR p.amount like :query OR p.record like :query OR p.product like :query");
        ArrayList<ProductRecord> list=(ArrayList<ProductRecord>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<ProductRecord> getProductsRecords(){
        return (ArrayList<ProductRecord>) getSession().createQuery("from ProductRecord").list();
    }
    
    public void insertProductRecord(int amount, int record, int product){
        ProductRecord pr=new ProductRecord(getProductByCod(product), getRecordByCod(record), amount);
        getSession().save(pr);
        getTransaction().commit();
        System.err.println("Products inserted succesfully.");
    }
    
    public void modifyProductRecord(int cod, int amount, Record record, Product product){
        ProductRecord pr=getProductRecordByCod(cod);
        pr.setAmount(amount);
        pr.setRecord(record);
        pr.setProduct(product);
        getSession().update(pr);
        getTransaction().commit();
        System.err.println("Products modified succesfully.");
    }
    
    public void deleteProductRecord(int cod){
        ProductRecord pr=getProductRecordByCod(cod);
        getSession().delete(pr);
        getTransaction().commit();
        System.err.println("Products deleted succesfully.");
    }
    
    public void deleteProductRecord(ArrayList<ProductRecord> product_record){
        Iterator it=product_record.iterator();
        while(it.hasNext()){
            ProductRecord pr=(ProductRecord) it.next();
            getSession().delete(pr);
        }
        getTransaction().commit();
        System.err.println("Productss deleted succesfully.");
    }
    
    public void deleteProductsRecords(){
        Iterator it=getProductsRecords().iterator();
        while(it.hasNext()){
            ProductRecord pr=(ProductRecord) it.next();
            getSession().delete(pr);
        }
        getTransaction().commit();
        System.err.println("Productss deleted succesfully.");
    }
    
    /*
    ---Category Operations---
    */
    
    public Category getCategoryByCod(int cod){
        Category c=(Category) getSession().get(Category.class, cod);
        closeSession();
        return c;
    }
    
    public Category getCategoryByName(String name){
        Criteria cr=getSession().createCriteria(Category.class);
        Category c=(Category) cr.add(Restrictions.like("name", name)).uniqueResult();
        closeSession();
        return c;
    }
    
    public ArrayList<Category> getCategoriesByQuery(String question){
        Query query=getSession().createQuery("from Category c where c.name like :query OR c.description like :query");
        ArrayList<Category> list=(ArrayList<Category>) query.setParameter("query", "%"+question+"%").list();
        closeSession();
        return list;
    }
    
    public ArrayList<Category> getCategories(){
        ArrayList<Category> arrayList=(ArrayList<Category>) getSession().createQuery("from Category").list();
        closeSession();
        return arrayList;
    }
    
    public void insertCategory(String name, String description){
//        Category c=new Category(name, description);
        Category c=new Category(name);
        c.setDescription(description);
        getSession().save(c);
        getTransaction().commit();
        closeSession();
        System.err.println("Category inserted succesfully.");
    }
    
    public void modifyCategory(int cod, String name, String description){
        Category c=getCategoryByCod(cod);
        c.setName(name);
        c.setDescription(description);
        getSession().update(c);
        getTransaction().commit();
        closeSession();
        System.err.println("Category modified succesfully.");
    }
    
    public void deleteCategory(int cod){
        Category c=getCategoryByCod(cod);
        getSession().delete(c);
        getTransaction().commit();
        closeSession();
        System.err.println("Category deleted succesfully.");
    }
    
    public void deleteCategories(ArrayList<Category> categories){
        Iterator it=categories.iterator();
        while(it.hasNext()){
            Category c=(Category) it.next();
            getSession().delete(c);
            closeSession();
        }
        getTransaction().commit();
        closeSession();
        System.err.println("Categories deleted succesfully.");
    }
    
    public void deleteCategories(){
        Iterator it=getCategories().iterator();
        while(it.hasNext()){
            Category c=(Category) it.next();
            getSession().delete(c);
            closeSession();
        }
        getTransaction().commit();
        closeSession();
        System.err.println("Categories deleted succesfully.");
    }
    
    /*
    ---Record Operations---
    */
    
    public Record getRecordByCod(int cod){
        return (Record) getSession().get(Record.class, cod);
    }
    
    public ArrayList<Record> getRecordsByQuery(String question){
        Query query=getSession().createQuery("from Record r where r.date like :query");
        ArrayList<Record> list=(ArrayList<Record>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<Record> getRecords(){
        return (ArrayList<Record>) getSession().createQuery("from Record").list();
    }
    
    public void insertRecord(String date){
        Record r=new Record(date);
        getSession().save(r);
        getTransaction().commit();
        System.err.println("Record inserted succesfully.");
    }
    
    public void modifyRecord(int cod, String date){
        Record r=getRecordByCod(cod);
        r.setDate(date);
        getSession().update(r);
        getTransaction().commit();
        System.err.println("Record modified succesfully.");
    }
    
    public void deleteRecord(int cod){
        Record r=getRecordByCod(cod);
        getSession().delete(r);
        getTransaction().commit();
        System.err.println("Record deleted succesfully.");
    }
    
    public void deleteRecords(ArrayList<Record> records){
        Iterator it=records.iterator();
        while(it.hasNext()){
            Record r=(Record) it.next();
            getSession().delete(r);
        }
        getTransaction().commit();
        System.err.println("Records deleted succesfully.");
    }
    
    public void deleteRecords(){
        Iterator it=getRecords().iterator();
        while(it.hasNext()){
            Record r=(Record) it.next();
            getSession().delete(r);
        }
        getTransaction().commit();
        System.err.println("Records deleted succesfully.");
    }
    
    /*
    ---Records Operations---
    */
    
    public RecordUser getRecordUserByCod(int cod){
        return (RecordUser) getSession().get(RecordUser.class, cod);
    }
    
    public ArrayList<RecordUser> getRecordUserByUser(int user){
        Criteria c=getSession().createCriteria(RecordUser.class);
        return (ArrayList<RecordUser>) c.add(Restrictions.like("user", user)).list();
    }
    
    public ArrayList<RecordUser> getRecordUserByRecord(int record){
        Criteria c=getSession().createCriteria(RecordUser.class);
        return (ArrayList<RecordUser>) c.add(Restrictions.like("record", record)).list();
    }
    
    public ArrayList<RecordUser> getRecordsUsersByQuery(int question){
        Query query=getSession().createQuery("from RecordUser r where r.cod like :query OR r.user like :query OR r.record like :query");
        ArrayList<RecordUser> list=(ArrayList<RecordUser>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<RecordUser> getRecordsUsers(){
        return (ArrayList<RecordUser>) getSession().createQuery("from RecordUser").list();
    }
    
    public void insertRecordUser(int user, int record){
        RecordUser ru=new RecordUser(getRecordByCod(record), getUserByCod(user));
        getSession().save(ru);
        getTransaction().commit();
        System.err.println("Records inserted succesfully.");
    }
    
    public void modifyRecordUser(int cod, User user, Record record){
        RecordUser ru=getRecordUserByCod(cod);
        ru.setUser(user);
        ru.setRecord(record);
        getSession().update(ru);
        getTransaction().commit();
        System.err.println("Records modified succesfully.");
    }
    
    public void deleteRecordUser(int cod){
        RecordUser ru=getRecordUserByCod(cod);
        getSession().delete(ru);
        getTransaction().commit();
        System.err.println("Records deleted succesfully.");
    }
    
    public void deleteRecordsUsers(ArrayList<RecordUser> records_users){
        Iterator it=records_users.iterator();
        while(it.hasNext()){
            RecordUser ru=(RecordUser) it.next();
            getSession().delete(ru);
        }
        getTransaction().commit();
        System.err.println("Recordss deleted succesfully.");
    }
    
    public void deleteRecordsUsers(){
        Iterator it=getRecordsUsers().iterator();
        while(it.hasNext()){
            RecordUser ru=(RecordUser) it.next();
            getSession().delete(ru);
        }
        getTransaction().commit();
        System.err.println("Recordss deleted succesfully.");
    }
    
    /*
    ---Basket Operations---
    */
    
    public Basket getBasketByCod(int cod){
        return (Basket) getSession().get(Basket.class, cod);
    }
    
    public Basket getBasketByUser(int user){
        Criteria c=getSession().createCriteria(Basket.class);
        return (Basket) c.add(Restrictions.like("user", user)).uniqueResult();
    }
    
    public ArrayList<Basket> getBasketByQuery(int question){
        Query query=getSession().createQuery("from Basket b where b.cod like :query OR b.user like :query OR b.product like :query");
        ArrayList<Basket> list=(ArrayList<Basket>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<Basket> getBaskets(){
        return (ArrayList<Basket>) getSession().createQuery("from Basket").list();
    }
    
    public void insertBasket(int user, int product, int amount){
        Basket b=new Basket(getProductByCod(product), getUserByCod(user), amount);
        getSession().save(b);
        getTransaction().commit();
        System.err.println("Basket inserted succesfully.");
    }
    
    public void modifyBasket(int cod, User user, Product product){
        Basket b=getBasketByCod(cod);
        b.setUser(user);
        b.setProduct(product);
        getSession().update(b);
        getTransaction().commit();
        System.err.println("Basket modified succesfully.");
    }
    
    public void deleteBasket(int cod){
        Basket b=getBasketByCod(cod);
        getSession().delete(b);
        getTransaction().commit();
        System.err.println("Basket deleted succesfully.");
    }
    
    public void deleteBaskets(ArrayList<Basket> baskets){
        Iterator it=baskets.iterator();
        while(it.hasNext()){
            Basket b=(Basket) it.next();
            getSession().delete(b);
        }
        getTransaction().commit();
        System.err.println("Baskets deleted succesfully.");
    }
    
    public void deleteBaskets(){
        Iterator it=getBaskets().iterator();
        while(it.hasNext()){
            Basket b=(Basket) it.next();
            getSession().delete(b);
        }
        getTransaction().commit();
        System.err.println("Baskets deleted succesfully.");
    }
    
    /*
    ---Crew Operations---
    */
    
    public Crew getCrewByEmail(String email){
        return (Crew) getSession().get(Crew.class, email);
    }
    
    public Crew getCrewByNickname(String nickname){
        Criteria c=getSession().createCriteria(Crew.class);
        return (Crew) c.add(Restrictions.like("nickname", nickname)).uniqueResult();
    }
    
    public ArrayList<Crew> getCrewsByQuery(String question){
        Query query=getSession().createQuery("from Crew c where c.email like :query OR c.nickname like :query OR c.name like :query OR c.surname like :query OR c.phone_number like :query OR c.role like :query");
        ArrayList<Crew> list=(ArrayList<Crew>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<Crew> getCrews(){
        return (ArrayList<Crew>) getSession().createQuery("from Crew").list();
    }
    
    public void insertCrew(String email, String nickname, String password, String name, String surname, String phone_number, String role){
        Crew c=new Crew(email, nickname, password, name, surname, phone_number, role);
        getSession().save(c);
        getTransaction().commit();
        System.err.println("Crew inserted succesfully.");
    }
    
    public void modifyCrew(String email, String nickname, String password, String name, String surname, String phone_number, String role){
        Crew c=getCrewByEmail(email);
        c.setNickname(nickname);
        c.setPassword(password);
        c.setName(name);
        c.setSurname(surname);
        c.setPhoneNumber(phone_number);
        c.setRole(role);
        getSession().update(c);
        getTransaction().commit();
        System.err.println("Crew modified succesfully.");
    }
    
    public void deleteCrew(String email){
        Crew c=getCrewByEmail(email);
        getSession().delete(c);
        getTransaction().commit();
        System.err.println("Crew deleted succesfully.");
    }
    
    public void deleteCrews(ArrayList<Crew> crews){
        Iterator it=crews.iterator();
        while(it.hasNext()){
            Crew c=(Crew) it.next();
            getSession().delete(c);
        }
        getTransaction().commit();
        System.err.println("Crews deleted succesfully.");
    }
    
    public void deleteCrews(){
        Iterator it=getCrews().iterator();
        while(it.hasNext()){
            Crew c=(Crew) it.next();
            getSession().delete(c);
        }
        getTransaction().commit();
        System.err.println("Crews deleted succesfully.");
    }
    
    /*
    ---Bookmark Operations---
    */
    
    public Bookmark getBookmarkByCod(int cod){
        return (Bookmark) getSession().get(Bookmark.class, cod);
    }
    
    public Bookmark getBookmarkByDescription(String description){
        Criteria c=getSession().createCriteria(Bookmark.class);
        return (Bookmark) c.add(Restrictions.like("description", description)).uniqueResult();
    }
    
    public ArrayList<Bookmark> getBookmarksByQuery(String question){
        Query query=getSession().createQuery("from Bookmark b where b.description like :query OR b.date like :query OR b.crew like :query");
        ArrayList<Bookmark> list=(ArrayList<Bookmark>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<Bookmark> getBookmarks(){
        return (ArrayList<Bookmark>) getSession().createQuery("from Bookmark").list();
    }
    
    public void insertBookmark(String description, String date, String crew){
        Bookmark b=new Bookmark(getCrewByEmail(crew), description, date);
        getSession().save(b);
        getTransaction().commit();
        System.err.println("Bookmark inserted succesfully.");
    }
    
    public void modifyBookmark(int cod, String description, String date, Crew crew){
        Bookmark b=getBookmarkByCod(cod);
        b.setDescription(description);
        b.setDate(date);
        b.setCrew(crew);
        getSession().update(b);
        getTransaction().commit();
        System.err.println("Bookmark modified succesfully.");
    }
    
    public void deleteBookmark(int cod){
        Bookmark b=getBookmarkByCod(cod);
        getSession().delete(b);
        getTransaction().commit();
        System.err.println("Bookmark deleted succesfully.");
    }
    
    public void deleteBookmarks(ArrayList<Bookmark> bookmarks){
        Iterator it=bookmarks.iterator();
        while(it.hasNext()){
            Bookmark b=(Bookmark) it.next();
            getSession().delete(b);
        }
        getTransaction().commit();
        System.err.println("Bookmarks deleted succesfully.");
    }
    
    public void deleteBookmarks(){
        Iterator it=getBookmarks().iterator();
        while(it.hasNext()){
            Bookmark b=(Bookmark) it.next();
            getSession().delete(b);
        }
        getTransaction().commit();
        System.err.println("Bookmarks deleted succesfully.");
    }
    
    /*
    ---Turnover Operations---
    */
    
    public Turnover getTurnoverByCod(int cod){
        return (Turnover) getSession().get(Turnover.class, cod);
    }
    
    public Turnover getTurnoverByNickname(int product_record){
        Criteria c=getSession().createCriteria(Turnover.class);
        return (Turnover) c.add(Restrictions.like("product_record", product_record)).uniqueResult();
    }
    
    public ArrayList<Turnover> getTurnoversByQuery(int question){
        Query query=getSession().createQuery("from Turnover t where t.cod like :query OR t.amount like :query OR t.product_record like :query");
        ArrayList<Turnover> list=(ArrayList<Turnover>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<Turnover> getTurnovers(){
        return (ArrayList<Turnover>) getSession().createQuery("from Turnover").list();
    }
    
    public void insertTurnover(int amount, double price, int product_record){
        Turnover t=new Turnover(getProductRecordByCod(product_record), amount, price);
        getSession().save(t);
        getTransaction().commit();
        System.err.println("Turnover inserted succesfully.");
    }
    
    public void modifyTurnover(int cod, int amount, double price, ProductRecord product_record){
        Turnover t=getTurnoverByCod(cod);
        t.setAmount(amount);
        t.setPrice(price);
        t.setProductRecord(product_record);
        getSession().update(t);
        getTransaction().commit();
        System.err.println("Turnover modified succesfully.");
    }
    
    public void deleteTurnover(int cod){
        Turnover t=getTurnoverByCod(cod);
        getSession().delete(t);
        getTransaction().commit();
        System.err.println("Turnover deleted succesfully.");
    }
    
    public void deleteTurnovers(ArrayList<Turnover> turnover){
        Iterator it=turnover.iterator();
        while(it.hasNext()){
            Turnover t=(Turnover) it.next();
            getSession().delete(t);
        }
        getTransaction().commit();
        System.err.println("Turnovers delete succesfully.");
    }
    
    public void deleteTurnovers(){
        Iterator it=getTurnovers().iterator();
        while(it.hasNext()){
            Turnover t=(Turnover) it.next();
            getSession().delete(t);
        }
        getTransaction().commit();
        System.err.println("Turnovers deleted succesfully.");
    }
    
    /*
    ---Material Operations---
    */
    
    public Material getMaterialByCod(int cod){
        return (Material) getSession().get(Material.class, cod);
    }
    
    public Material getMaterialByName(String name){
        Criteria c=getSession().createCriteria(Material.class);
        return (Material) c.add(Restrictions.like("name", name)).uniqueResult();
    }
    
    public ArrayList<Material> getMaterialsByQuery(String question){
        Query query=getSession().createQuery("from Material m where m.name like :consulta");
        ArrayList<Material> list=(ArrayList<Material>) query.setParameter("consulta", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<Material> getMaterials(){
        return (ArrayList<Material>) getSession().createQuery("from Material").list();
    }
    
    public void insertMaterial(String name){
        Material m=new Material(name);
        getSession().save(m);
        getTransaction().commit();
        System.err.println("Material inserted succesfully.");
    }
    
    public void modifyMaterial(int cod, String name){
        Material m=getMaterialByCod(cod);
        m.setName(name);
        getSession().update(m);
        getTransaction().commit();
        System.err.println("Material modified succesfully.");
    }
    
    public void deleteMaterial(int cod){
        Material m=getMaterialByCod(cod);
        getSession().delete(m);
        getTransaction().commit();
        System.err.println("Material deleted succesfully.");
    }
    
    public void deleteMaterials(ArrayList<Material> materials){
        Iterator it=materials.iterator();
        while(it.hasNext()){
            Material m=(Material) it.next();
            getSession().delete(m);
        }
        getTransaction().commit();
        System.err.println("Materials delete succesfully.");
    }
    
    public void deleteMaterials(){
        Iterator it=getMaterials().iterator();
        while(it.hasNext()){
            Material m=(Material) it.next();
            getSession().delete(m);
        }
        getTransaction().commit();
        System.err.println("Materials deleted succesfully.");
    }
    
    /*
    ---ProductMaterial Operations---
    */
    
    public ProductMaterial getProductMaterialByCod(int cod){
        return (ProductMaterial) getSession().get(ProductMaterial.class, cod);
    }
    
    public ArrayList<ProductMaterial> getProductsMaterialsByQuery(int question){
        Query query=getSession().createQuery("from ProductMaterial pm where pm.cod like :query OR pm.amount like :query OR pm.product like :query OR pm.material like :query");
        ArrayList<ProductMaterial> list=(ArrayList<ProductMaterial>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<ProductMaterial> getProductsMaterials(){
        return (ArrayList<ProductMaterial>) getSession().createQuery("from ProductMaterial").list();
    }
    
    public void insertProductMaterial(int amount, int product, int material){
        ProductMaterial pm=new ProductMaterial(getMaterialByCod(material), getProductByCod(product), amount);
        getSession().save(pm);
        getTransaction().commit();
        System.err.println("ProductMaterial inserted succesfully.");
    }
    
    public void modifyProductMaterial(int cod, int amount, Product product, Material material){
        ProductMaterial pm=getProductMaterialByCod(cod);
        pm.setAmount(amount);
        pm.setProduct(product);
        pm.setMaterial(material);
        getSession().update(pm);
        getTransaction().commit();
        System.err.println("ProductMaterial modified succesfully.");
    }
    
    public void deleteProductMaterial(int cod){
        ProductMaterial pm=getProductMaterialByCod(cod);
        getSession().delete(pm);
        getTransaction().commit();
        System.err.println("ProductMaterial deleted succesfully.");
    }
    
    public void deleteProductsMaterials(ArrayList<ProductMaterial> products_materials){
        Iterator it=products_materials.iterator();
        while(it.hasNext()){
            ProductMaterial pm=(ProductMaterial) it.next();
            getSession().delete(pm);
        }
        getTransaction().commit();
        System.err.println("ProductsMaterials delete succesfully.");
    }
    
    public void deleteProductsMaterials(){
        Iterator it=getProductsMaterials().iterator();
        while(it.hasNext()){
            ProductMaterial pm=(ProductMaterial) it.next();
            getSession().delete(pm);
        }
        getTransaction().commit();
        System.err.println("ProductsMaterials deleted succesfully.");
    }
    
    /*
    ---General Operations---
    */
    
    public DefaultTableModel getTableModel(String table){
        DefaultTableModel dtm=new DefaultTableModel();
        Iterator it;
        Vector columns,row;
        
        String user[]={"COD","NICKNAME","NAME","SURNAME","EMAIL"};
        String crew[]={"EMAIL","NICKNAME","NAME","SURNAME","PHONE","ROLE"};
        String product[]={"COD","NAME","PRICE","CATEGORY"};
        String category[]={"COD","NAME","DESCRIPTION"};
        String record[]={"COD","DATE"};
        String material[]={"COD","NAME"};
        String basket[]={"COD","AMOUNT","USER","PRODUCT"};
        String bookmark[]={"COD","DESCRIPTION","DATE","CREW"};
        String turnover[]={"COD","AMOUNT","PRICE","PRODUCT_RECORD"};
        String record_user[]={"COD","USER","RECORD"};
        String product_record[]={"COD","AMOUNT","RECORD","PRODUCT"};
        String product_material[]={"COD","AMOUNT","PRODUCT","MATERIAL"};
        
        switch(table){
            case "USER":
                dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(user)));
                it=getUsers().iterator();
                while(it.hasNext()){
                    row=new Vector();
                    User u=(User) it.next();
                    row.add(u.getCod());
                    row.add(u.getNickname());
                    row.add(u.getName());
                    row.add(u.getSurname());
                    row.add(u.getEmail());
                    dtm.addRow(row);
                }
                break;
            case "CREW":
                dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(crew)));
                it=getCrews().iterator();
                while(it.hasNext()){
                    row=new Vector();
                    Crew c=(Crew) it.next();
                    row.add(c.getEmail());
                    row.add(c.getNickname());
                    row.add(c.getName());
                    row.add(c.getSurname());
                    row.add(c.getPhoneNumber());
                    row.add(c.getRole());
                    dtm.addRow(row);
                }
                break;
            case "PRODUCT":
                dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(product)));
                it=getProducts().iterator();
                while(it.hasNext()){
                    row=new Vector();
                    Product p=(Product) it.next();
                    row.add(p.getCod());
                    row.add(p.getName());
                    row.add(p.getPrice());
                    row.add(p.getCategory().getName());
                    dtm.addRow(row);
                }
                break;
            case "CATEGORY":
                dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(category)));
                it=getCategories().iterator();
                while(it.hasNext()){
                    row=new Vector();
                    Category c=(Category) it.next();
                    System.out.println("Codigo: "+c.getCod()+", Nombre: "+c.getName()+", Descripcion: "+c.getDescription());
                    row.add(c.getCod());
                    row.add(c.getName());
                    row.add(c.getDescription());
                    dtm.addRow(row);
                }
                break;
            case "RECORD":
                dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(record)));
                it=getRecords().iterator();
                while(it.hasNext()){
                    row=new Vector();
                    Record r=(Record) it.next();
                    row.add(r.getCod());
                    row.add(r.getDate());
                    dtm.addRow(row);
                }
                break;
            case "MATERIAL":
                dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(material)));
                it=getMaterials().iterator();
                while(it.hasNext()){
                    row=new Vector();
                    Material m=(Material) it.next();
                    row.add(m.getCod());
                    row.add(m.getName());
                    dtm.addRow(row);
                }
                break;
            case "BASKET":
                dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(basket)));
                it=getBaskets().iterator();
                while(it.hasNext()){
                    row=new Vector();
                    Basket b=(Basket) it.next();
                    row.add(b.getCod());
                    row.add(b.getAmount());
                    row.add(b.getUser().getNickname());
                    row.add(b.getProduct().getName());
                    dtm.addRow(row);
                }
                break;
            case "BOOKMARK":
                dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(bookmark)));
                it=getBookmarks().iterator();
                while(it.hasNext()){
                    row=new Vector();
                    Bookmark b=(Bookmark) it.next();
                    row.add(b.getCod());
                    row.add(b.getDescription());
                    row.add(b.getDate());
                    row.add(b.getCrew().getNickname());
                    dtm.addRow(row);
                }
                break;
            case "TURNOVER":
                dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(turnover)));
                it=getTurnovers().iterator();
                while(it.hasNext()){
                    row=new Vector();
                    Turnover t=(Turnover) it.next();
                    row.add(t.getCod());
                    row.add(t.getAmount());
                    row.add(t.getPrice());
                    row.add(t.getProductRecord().getCod());
                    dtm.addRow(row);
                }
                break;
            case "RECORD_USER":
                dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(record_user)));
                it=getRecordsUsers().iterator();
                while(it.hasNext()){
                    row=new Vector();
                    RecordUser ru=(RecordUser) it.next();
                    row.add(ru.getCod());
                    row.add(ru.getUser().getNickname());
                    row.add(ru.getRecord().getCod());
                    dtm.addRow(row);
                }
                break;
            case "PRODUCT_RECORD":
                dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(product_record)));
                it=getProductsRecords().iterator();
                while(it.hasNext()){
                    row=new Vector();
                    ProductRecord pr=(ProductRecord) it.next();
                    row.add(pr.getCod());
                    row.add(pr.getAmount());
                    row.add(pr.getRecord().getCod());
                    row.add(pr.getProduct().getName());
                    dtm.addRow(row);
                }
                break;
            case "PRODUCT_MATERIAL":
                dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(product_material)));
                it=getProductsMaterials().iterator();
                while(it.hasNext()){
                    row=new Vector();
                    ProductMaterial pm=(ProductMaterial) it.next();
                    row.add(pm.getCod());
                    row.add(pm.getAmount());
                    row.add(pm.getProduct().getName());
                    row.add(pm.getMaterial().getName());
                    dtm.addRow(row);
                }
                break;
        }
        
        return dtm;
    }
    
    public DefaultComboBoxModel getComboBoxModel(String field){
        DefaultComboBoxModel dcbm=new DefaultComboBoxModel();
        switch(field){
            case "CATEGORIA":
                Iterator it=getCategories().iterator();
                while(it.hasNext()){
                    dcbm.addElement(dcbm);
                }
                break;
        }
        return dcbm;
    }
    
}
