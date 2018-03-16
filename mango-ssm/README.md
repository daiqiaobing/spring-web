## Spring、SpringMVC、Mybatis中常见的知识点的实践操作


### Mybatis
#### 1.Mybatis插入单条数据并且返回自增主键？批量插入数据怎样返回主键列表？
*  1. 在insert标签中使用useGeneratedKeys以及keyProperty，代码如下所示：
	```xml
	<insert id="insertStudent" parameterType="com.soecode.lyf.entity.Student" useGeneratedKeys="true" keyProperty="student.id">
    </insert>
	```
    2. 使用selectKey标签，以及使用LAST_INSERT_ID()函数，如下代码所示：
    ```xml
    <insert id="insertStudent1" parameterType="com.soecode.lyf.entity.Student">
    		<selectKey keyProperty="student.id" resultType="int">
    			select LAST_INSERT_ID()
    		</selectKey>
    		insert into student (name, age) VALUE(#{student.name}, #{student.age})
    </insert>
    ```
* 批量插入数据返回主键列表，跟单条数据插入没有区别，注意：如果Mybatis版本为3.3.0则不行，需要将Mybatis版本升级到Mybatis3.3.1及其以上,Dao中不能使用@Param注解,Mapper.xml中使用list变量接收参数


