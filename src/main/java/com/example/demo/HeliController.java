package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HeliController {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@RequestMapping("/test")
	public List<MyData> show() {
		List<MyData> list = jdbcTemplate.query("select * from recipes", new RowMapper<MyData>() {
			public MyData mapRow(ResultSet rs, int rowNum) throws SQLException {
				MyData data = new MyData();
				data.setId(rs.getInt("id"));
				data.setName(rs.getString("title"));
				data.setMaking_time(rs.getString("making_time"));
				data.setServes(rs.getString("serves"));
				data.setIngredients(rs.getString("ingredients"));
				data.setCost(rs.getInt("cost"));
				data.setCreated_at(rs.getString("created_at"));
				data.setUpdated_at(rs.getString("updated_at"));
				
			/*	strs[0] = rs.getString("id");
				strs[1] = rs.getString("title");
				strs[2] = rs.getString("making_time");
				strs[3] = rs.getString("serves");
				strs[4] = rs.getString("ingredients");
				strs[5] = rs.getString("cost");
				strs[6] = rs.getString("created_at");
				strs[7] = rs.getString("updated_at");*/
				return data;
			}
		});
		return list;
	}
}


