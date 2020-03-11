package com.taikang.jkx.service;

import com.taikang.jkx.model.HiomsProject;
import com.taikang.jkx.model.Page;

public interface ProjectService {

	void saveProject(HiomsProject hiomsProject);

	Page<HiomsProject> listProject(HiomsProject project, int page, int rows);

}
