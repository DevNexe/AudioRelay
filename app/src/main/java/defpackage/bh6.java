package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class bh6 extends SQLiteOpenHelper {
    public final /* synthetic */ gh6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh6(gh6 gh6Var, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.w = gh6Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            gh6 gh6Var = this.w;
            bi6 bi6Var = gh6Var.a.i;
            dq6.h(bi6Var);
            bi6Var.f.b("Opening the local database failed, dropping and recreating it");
            gh6Var.a.getClass();
            if (!gh6Var.a.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                bi6 bi6Var2 = gh6Var.a.i;
                dq6.h(bi6Var2);
                bi6Var2.f.c("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                bi6 bi6Var3 = gh6Var.a.i;
                dq6.h(bi6Var3);
                bi6Var3.f.c(e2, "Failed to open local database. Events will bypass local storage");
                return null;
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
        bi6 bi6Var = this.w.a.i;
        dq6.h(bi6Var);
        py5.a(bi6Var, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
