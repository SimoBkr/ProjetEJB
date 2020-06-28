package com.emsi.abdelaali.ejb.sessions;

import java.util.List;

import javax.ejb.Remote;

import com.emsi.abdelaali.ejb.entities.Article;

@Remote
public interface IArticleEjbRemote {
	public void addArticle(Article article);
	public List<Article> articleList();
}
