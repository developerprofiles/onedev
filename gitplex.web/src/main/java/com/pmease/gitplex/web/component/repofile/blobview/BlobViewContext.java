package com.pmease.gitplex.web.component.repofile.blobview;

import java.io.Serializable;
import java.util.List;

import org.apache.wicket.ajax.AjaxRequestTarget;

import com.pmease.commons.git.BlobIdent;
import com.pmease.commons.lang.extractors.TokenPosition;
import com.pmease.gitplex.core.model.PullRequest;
import com.pmease.gitplex.core.model.PullRequestComment;
import com.pmease.gitplex.core.model.Repository;
import com.pmease.gitplex.search.hit.QueryHit;

public interface BlobViewContext extends Serializable {
	
	Repository getRepository();
	
	PullRequest getPullRequest();
	
	PullRequestComment getComment();
	
	BlobIdent getBlobIdent();
	
	TokenPosition getTokenPos();
	
	boolean isBlame();
	
	void onSelect(AjaxRequestTarget target, BlobIdent blobIdent, TokenPosition tokenPos);
	
	void onSearchComplete(AjaxRequestTarget target, List<QueryHit> hits);
	
	void onBlameChange(AjaxRequestTarget target);
	
	void onDelete(AjaxRequestTarget target);
	
	void onEdit(AjaxRequestTarget target);

}