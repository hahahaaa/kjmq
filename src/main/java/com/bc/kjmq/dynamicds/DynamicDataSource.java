package com.bc.kjmq.dynamicds;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


public class DynamicDataSource extends AbstractRoutingDataSource {
    public static final Logger LOGGER = LoggerFactory.getLogger(DynamicDataSource.class);

    @Override
    public Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDB();
    }

}
