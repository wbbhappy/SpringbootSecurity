package com.security.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "roles")
public class RoleEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "r_id")
	private Long id;
	@Column(name = "r_name")
	private String name;
	@Column(name = "r_flag")
	private String flag;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "role_resources", joinColumns = { @JoinColumn(name = "rr_role_id") }, inverseJoinColumns = {
			@JoinColumn(name = "rr_resource_id") })
	private List<ResourceEntity> resources;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public List<ResourceEntity> getResources() {
		return resources;
	}
	public void setResources(List<ResourceEntity> resources) {
		this.resources = resources;
	}
}
