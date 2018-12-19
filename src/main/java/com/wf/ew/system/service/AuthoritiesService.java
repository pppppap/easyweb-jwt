package com.wf.ew.system.service;

import com.baomidou.mybatisplus.service.IService;
import com.wf.ew.system.model.Authorities;
import com.wf.ew.system.model.User;

import java.util.List;

public interface AuthoritiesService extends IService<Authorities> {
    List<String> listByUserId(String userId);

    List<String> listByRoleId(List<String> roleId);

    List<String> listByRoleId(String roleId);

   /*

    List<Authorities> list();





    boolean add(Authorities authorities);

    boolean add(List<Authorities> authorities);

    boolean addRoleAuth(String roleId, String authId);

    boolean deleteRoleAuth(String roleId, String authId);*/
}
