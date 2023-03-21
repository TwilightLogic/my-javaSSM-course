package com.itheima.mapper;

import com.itheima.pojo.Worker;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface WorkerMapper {
    @Select("select * from tb_worker where id = #{id}")
    Worker selectWorker(int id);

    @Insert("insert into tb_worker (name, age, sex, worker_id)" +
            "values(#{name}, #{age}, #{sex}, #{worker_id})")
    int insertWorker(Worker worker);
}
