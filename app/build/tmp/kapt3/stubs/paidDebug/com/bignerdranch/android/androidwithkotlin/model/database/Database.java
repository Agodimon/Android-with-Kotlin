package com.bignerdranch.android.androidwithkotlin.model.database;

import java.lang.System;

@androidx.room.Database(entities = {com.bignerdranch.android.androidwithkotlin.model.database.HistoryEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/bignerdranch/android/androidwithkotlin/model/database/Database;", "Landroidx/room/RoomDatabase;", "()V", "historyDao", "Lcom/bignerdranch/android/androidwithkotlin/model/database/HistoryDao;", "Companion", "app_paidDebug"})
public abstract class Database extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.bignerdranch.android.androidwithkotlin.model.database.Database.Companion Companion = null;
    private static final java.lang.String DB_NAME = "add_database.db";
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy db$delegate = null;
    
    public Database() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.bignerdranch.android.androidwithkotlin.model.database.HistoryDao historyDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/bignerdranch/android/androidwithkotlin/model/database/Database$Companion;", "", "()V", "DB_NAME", "", "db", "Lcom/bignerdranch/android/androidwithkotlin/model/database/Database;", "getDb", "()Lcom/bignerdranch/android/androidwithkotlin/model/database/Database;", "db$delegate", "Lkotlin/Lazy;", "app_paidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bignerdranch.android.androidwithkotlin.model.database.Database getDb() {
            return null;
        }
    }
}