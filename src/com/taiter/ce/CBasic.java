package com.taiter.ce;



/*
* This file is part of Custom Enchantments
* Copyright (C) Taiterio 2015
*
* This program is free software: you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as published by the
* Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
* FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
* for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;


public abstract class CBasic {
	
	
	
	
	protected Plugin	main	= Main.plugin;
	protected Tools		tools	= Main.tools;
	
	
	protected List<Player> 	cooldown = new ArrayList<Player>();
	protected List<Player> 	lockList = new ArrayList<Player>();
	protected String		displayName;
	protected String 		originalName;
	protected String 		typeString;
	
	
	protected List<String>	configEntries = new ArrayList<String>(Arrays.asList(new String[]{"Enabled: true"}));
	
	
	
	public Plugin	getPlugin()	{	return this.main;	}
	public Tools 	getTools()	{	return this.tools;	}
	
	public String	getDisplayName()		{	return this.displayName;	}
	
	public String	getOriginalName()		{	return this.originalName;	}

	public FileConfiguration	getConfig()	{	return Main.config;			}
	
	public String				getType()	{ return this.typeString;		}
		
	public abstract double		getCost();
	


}
