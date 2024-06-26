package com.powernode.spring6.jdbc;
import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;
/**
 * packageName com.powernode.spring6.jdbc
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className MyDataSource
 * @date 2024/6/11
 * @description TODO
 */
public class MyDataSource implements DataSource {
    private String driver;
    private String url;
    private String username;
    private String password;

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "MyDataSource{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Connection getConnection() throws SQLException {
        return null;
    }
    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }
    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }
    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
    }
    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
    }
    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }
    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }
    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}