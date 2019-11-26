package com.udemy;

import com.udemy.resources.HelloResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.forms.MultiPartBundle;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class DropBookmarksApplication extends Application<DropBookmarksConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropBookmarksApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropBookmarks";
    }

    @Override
    public void initialize(Bootstrap<DropBookmarksConfiguration> bootstrap) {
        bootstrap.addBundle(new MigrationsBundle<DropBookmarksConfiguration>(){
            @Override
            public DataSourceFactory getDataSourceFactory(final DropBookmarksConfiguration config) {
                return config.getDataSourceFactory();
            }
        });
        bootstrap.addBundle(new MultiPartBundle());
    }

    @Override
    public void run(final DropBookmarksConfiguration configuration, final Environment environment) throws ClassNotFoundException {
        final DBIFactory factory = new DBIFactory();
        final DBI db = factory.build(environment,configuration.getDataSourceFactory(),"mysql");

        environment.jersey().register(
                new HelloResource()
        );
        // TODO: implement application
    }

}
