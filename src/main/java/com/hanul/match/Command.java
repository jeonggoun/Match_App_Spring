package com.hanul.match;

import org.springframework.ui.Model;

public interface Command {
	public void execute(Model model);
}
