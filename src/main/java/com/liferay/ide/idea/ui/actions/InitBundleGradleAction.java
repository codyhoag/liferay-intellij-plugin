/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.ide.idea.ui.actions;

import com.liferay.ide.idea.util.LiferayWorkspaceUtil;
import com.liferay.ide.idea.util.ProjectConfigurationUtil;

import icons.LiferayIcons;

/**
 * @author Andy Wu
 * @author Simon Jiang
 */
public class InitBundleGradleAction extends AbstractLiferayGradleTaskAction {

	public InitBundleGradleAction() {
		super("InitBundle", "Run initBundle task", LiferayIcons.LIFERAY_ICON, "initBundle");
	}

	@Override
	protected void handleProcessTerminated() {
		super.handleProcessTerminated();

		String homeDir = LiferayWorkspaceUtil.getHomeDir(project.getBasePath());

		ProjectConfigurationUtil.configExcludedFolder(project, homeDir);
	}

}