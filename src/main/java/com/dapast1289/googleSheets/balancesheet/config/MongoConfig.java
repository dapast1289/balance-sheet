//package com.dapast1289.googleSheets.balancesheet.config;
//
//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.MongoDatabaseFactory;
//import org.springframework.data.mongodb.MongoTransactionManager;
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
//
//@Configuration
//public class MongoConfig extends AbstractMongoClientConfiguration {
//
//    @Value("${spring.data.mongodb.uri}")
//    private String mongoUri;
//
//    @Value("${spring.data.mongodb.database}")
//    private String mongoDatabase;
//
//    @Bean
//    MongoTransactionManager transactionManager(MongoDatabaseFactory mongoDatabaseFactory) {
//        return new MongoTransactionManager(mongoDatabaseFactory);
//    }
//
//    @Override
//    protected String getDatabaseName() {
//        return mongoDatabase;
//    }
//
//    @Bean
//    @Override
//    public MongoClient mongoClient() {
//        final ConnectionString connectionString = new ConnectionString(mongoUri);
//        final MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
//                .applyConnectionString(connectionString)
//                .build();
//        return MongoClients.create(mongoClientSettings);
//    }
//}