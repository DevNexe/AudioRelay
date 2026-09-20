package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class cy5 extends SQLiteOpenHelper {
    public final /* synthetic */ iy5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy5(iy5 iy5Var, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.w = iy5Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        iy5 iy5Var = this.w;
        zk zkVar = iy5Var.e;
        dq6 dq6Var = iy5Var.a;
        dq6Var.getClass();
        if (!(zkVar.a == 0 || ((ft) zkVar.b).c() - zkVar.a >= 3600000)) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            zk zkVar2 = iy5Var.e;
            zkVar2.a = ((ft) zkVar2.b).c();
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.f.b("Opening the database failed, dropping and recreating it");
            dq6Var.getClass();
            if (!dq6Var.a.getDatabasePath("google_app_measurement.db").delete()) {
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.f.c("google_app_measurement.db", "Failed to delete corrupted db file");
            }
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                zkVar2.a = 0L;
                return writableDatabase;
            } catch (SQLiteException e) {
                bi6 bi6Var3 = dq6Var.i;
                dq6.h(bi6Var3);
                bi6Var3.f.c(e, "Failed to open freshly created database");
                throw e;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        bi6 bi6Var = this.w.a.i;
        dq6.h(bi6Var);
        py5.b(bi6Var, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        iy5 iy5Var = this.w;
        bi6 bi6Var = iy5Var.a.i;
        dq6.h(bi6Var);
        py5.a(bi6Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", iy5.f);
        bi6 bi6Var2 = iy5Var.a.i;
        dq6.h(bi6Var2);
        py5.a(bi6Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        bi6 bi6Var3 = iy5Var.a.i;
        dq6.h(bi6Var3);
        py5.a(bi6Var3, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", iy5.g);
        bi6 bi6Var4 = iy5Var.a.i;
        dq6.h(bi6Var4);
        py5.a(bi6Var4, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", iy5.h);
        bi6 bi6Var5 = iy5Var.a.i;
        dq6.h(bi6Var5);
        py5.a(bi6Var5, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", iy5.j);
        bi6 bi6Var6 = iy5Var.a.i;
        dq6.h(bi6Var6);
        py5.a(bi6Var6, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        bi6 bi6Var7 = iy5Var.a.i;
        dq6.h(bi6Var7);
        py5.a(bi6Var7, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", iy5.i);
        bi6 bi6Var8 = iy5Var.a.i;
        dq6.h(bi6Var8);
        py5.a(bi6Var8, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", iy5.k);
        bi6 bi6Var9 = iy5Var.a.i;
        dq6.h(bi6Var9);
        py5.a(bi6Var9, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", iy5.l);
        bi6 bi6Var10 = iy5Var.a.i;
        dq6.h(bi6Var10);
        py5.a(bi6Var10, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        bi6 bi6Var11 = iy5Var.a.i;
        dq6.h(bi6Var11);
        py5.a(bi6Var11, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", iy5.m);
        bi6 bi6Var12 = iy5Var.a.i;
        dq6.h(bi6Var12);
        py5.a(bi6Var12, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        bi6 bi6Var13 = iy5Var.a.i;
        dq6.h(bi6Var13);
        py5.a(bi6Var13, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        bi6 bi6Var14 = iy5Var.a.i;
        dq6.h(bi6Var14);
        py5.a(bi6Var14, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
