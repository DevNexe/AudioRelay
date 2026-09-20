package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* JADX INFO: loaded from: classes.dex */
public final class r61 implements cx4 {
    public static final String[] x = new String[0];
    public final SQLiteDatabase w;

    public class QnHx implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ ex4 a;

        public QnHx(ex4 ex4Var) {
            this.a = ex4Var;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.c(new u61(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public r61(SQLiteDatabase sQLiteDatabase) {
        this.w = sQLiteDatabase;
    }

    public final void b() {
        this.w.beginTransaction();
    }

    public final void c() {
        this.w.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.w.close();
    }

    public final void e(String str) {
        this.w.execSQL(str);
    }

    public final Cursor f(ex4 ex4Var) {
        return this.w.rawQueryWithFactory(new QnHx(ex4Var), ex4Var.b(), x, null);
    }

    public final Cursor g(String str) {
        return f(new cq4(str));
    }

    public final void h() {
        this.w.setTransactionSuccessful();
    }
}
