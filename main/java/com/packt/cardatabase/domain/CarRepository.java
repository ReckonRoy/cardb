package com.packt.cardatabase.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long>, PagingAndSortingRepository<Car, Long>{

	//fetch cars by brand
	List<Car> findByBrand(@Param("brand") String brand);

	// fetch cars by color
	List<Car> findByColor(@Param("color")String color);

	/*fetch cars by year
	List<Car> findCarByYear(int year);

	// fetch cars by brand and color
	List<Car> findByBrandAndModel(String brand, String model);

	// fetch cars by brand or color
	List<Car> findByBrandOrColor(String brand, String color);

	// Fetch cars by brand and sort by year
	List<Car> findByBrandOrderByYearAsc(String brand);

	//fetch cars by brand using sql
	@Query("select c from Car c where c.brand like %?1 ")
	List<Car> findByBrandEndsWith(String brand);
	*/
}
