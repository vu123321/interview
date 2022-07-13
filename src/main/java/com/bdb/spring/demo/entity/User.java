package com.bdb.spring.demo.entity;

import com.bdb.spring.demo.constant.Gender;
import com.bdb.spring.demo.constant.Permission;
import com.bdb.spring.demo.converter.GenderEnumConverter;
import com.bdb.spring.demo.converter.PermissionEnumConverter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Convert(converter = GenderEnumConverter.class)
    private Gender gender;


    // EAGER sẽ load list khi nạp db. LAZY sẽ không nhưng sẽ nạp khi bị gọi đến ?.getList->lazy sẽ nhẹ hơn
    @ElementCollection(targetClass = Permission.class, fetch = FetchType.EAGER) //Map class Enum vào
    @CollectionTable(name = "user_permission", joinColumns = @JoinColumn(name = "user_id"))//Tạo table với tên và trường tham chiếu
    @Convert(converter = PermissionEnumConverter.class)// sử dụng để convert data khi add vào DB từ entity và ngược lại
    @Column(name = "permission")
    private List<Permission> permissions;
}
