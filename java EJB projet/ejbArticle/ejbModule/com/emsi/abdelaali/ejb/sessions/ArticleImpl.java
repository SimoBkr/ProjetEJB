package com.emsi.abdelaali.ejb.sessions;

import com.emsi.abdelaali.ejb.entities.Article;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name="Art")
public class ArticleImpl implements IArticleEjbLocal, IArticleEjbRemote {
	@PersistenceContext(name="ejbArticle")
	private EntityManager entityManager;
    public ArticleImpl() {
        // TODO Auto-generated constructor stub
    }

    public void addArticle(Article article) {
        // TODO Auto-generated method stub
    	entityManager.persist(article);
    }

    public List<Article> articleList() {
        // TODO Auto-generated method stub
    	Query query = entityManager.createQuery("SELECT a FROM Article a",Article.class);
    	List<Article> result = query.getResultList();
		return result;
    }

}
