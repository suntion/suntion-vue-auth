package com.pp.auth.model;

import com.pp.common.base.BaseEntity;
import lombok.Data;

/**
 * sys_dict_type 字典类型表
 *
 * @author Scott
 * @date   2020/11/18
 */
@Data
public class SysDictType extends BaseEntity {
    /**
     * 字典主键
     */
    private Integer dictId;

    /**
     * 字典名称
     */
    private String dictName;

    /**
     * 字典类型编码
     */
    private String dictType;
}
