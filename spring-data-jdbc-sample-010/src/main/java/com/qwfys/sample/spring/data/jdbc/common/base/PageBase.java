package com.qwfys.sample.spring.data.jdbc.common.base;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public abstract class PageBase {

    private Integer pageNo;

    private Integer pageSize;
}
