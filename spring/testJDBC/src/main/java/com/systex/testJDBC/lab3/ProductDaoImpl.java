package com.systex.testJDBC.lab3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
@Component
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private ProductRowMapper productRowMapper;
	
	@Autowired
	private JdbcTemplate template;
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		SqlParameterSource nameParameterSource = new MapSqlParameterSource("productId",id);
		return (Product)this.namedParameterJdbcTemplate.query("SELECT * FROM product where id = :productId",nameParameterSource,this.productRowMapper).getFirst();
	}

	@Override
	public List<Product> gProducts() {
		// TODO Auto-generated method stub
		return (ArrayList<Product>)this.template.query("SELECT * FROM product", this.productRowMapper);
	}

	@Override
	public int insert(Product product) {
		// TODO Auto-generated method stub
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource params = new MapSqlParameterSource("name",product.getName()).addValue("desc", product.getDescription());
		this.namedParameterJdbcTemplate.update("insert into product (`name`,`desc`) values(:name,:desc)", params,keyHolder);
		return keyHolder.getKey().intValue();
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		SqlParameterSource parames= new MapSqlParameterSource("id",product.getProductId())
				.addValue("name", product.getName())
		        .addValue("desc", product.getDescription());
		this.namedParameterJdbcTemplate.update("update product set product.name =:name,product.desc=:desc where id=:id ;", parames);
	}

}
