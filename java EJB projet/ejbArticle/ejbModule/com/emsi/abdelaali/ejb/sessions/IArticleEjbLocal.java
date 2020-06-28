package com.emsi.abdelaali.ejb.sessions;

import java.util.List;

import javax.ejb.Local;

import com.emsi.abdelaali.ejb.entities.Article;

@Local
public interface IArticleEjbLocal {
	public void addArticle(Article article);
	public List<Article> articleList();
}
