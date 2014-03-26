package com.hortonworks.hbase.replication.bridge;

import org.apache.hadoop.hbase94.regionserver.wal.HLog;

import java.io.IOException;

/**
 * Created by jns on 26/03/14.
 */
public interface ReplicationSink {
    void replicateEntries(HLog.Entry[] entries) throws IOException;

    void stopReplicationSinkServices();
}
