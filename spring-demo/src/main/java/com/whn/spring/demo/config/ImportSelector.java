package com.whn.spring.demo.config;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.AdviceModeImportSelector;
import org.springframework.scheduling.annotation.EnableAsync;


public class ImportSelector extends AdviceModeImportSelector<EnableAsync> {
	@Override
	protected String[] selectImports(AdviceMode adviceMode) {
		System.out.println(adviceMode.name());
		return new String[0];
	}
}
