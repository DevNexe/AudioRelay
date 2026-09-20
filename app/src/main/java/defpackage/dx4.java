package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public interface dx4 extends Closeable {

    public static class CQf {
        public final Context a;
        public final String b;
        public final QnHx c;
        public final boolean d;

        public CQf(Context context, String str, QnHx qnHx, boolean z) {
            this.a = context;
            this.b = str;
            this.c = qnHx;
            this.d = z;
        }
    }

    public interface F1 {
        dx4 a(CQf cQf);
    }

    public static abstract class QnHx {
        public final int a;

        public QnHx(int i) {
            this.a = i;
        }

        public static void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        public abstract void b(r61 r61Var, int i, int i2);
    }

    cx4 U();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
