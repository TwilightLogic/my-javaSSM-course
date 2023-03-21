package com.itheima.mapper;

import com.itheima.pojo.Worker;
import org.apache.ibatis.annotations.*;

public interface WorkerMapper {
    @Select("select * from tb_worker where id = #{id}")
    Worker selectWorker(int id);

    @Insert("insert into tb_worker (name, age, sex, worker_id)" +
            " values(#{name}, #{age}, #{sex}, #{worker_id})")
    int insertWorker(Worker worker);

    @Update("update tb_worker set name = #{name}, age = #{age}" +
            " where id = #{id}")
    int updateWorker(Worker worker);

    @Delete("delete from tb_worker where id = #{id}")
    int deleteWorker(int id);

    // Learn @Param()
    @Select("select * from tb_worker where id=#{id} and name=#{name}")
    Worker selectWorkerByIdAndName(@Param("id") int id, @Param("name") String name);
}
