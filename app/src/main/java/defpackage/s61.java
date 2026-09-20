package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s61 implements dx4 {
    public final Object A = new Object();
    public QnHx B;
    public boolean C;
    public final Context w;
    public final String x;
    public final dx4.QnHx y;
    public final boolean z;

    public static class QnHx extends SQLiteOpenHelper {
        public final r61[] w;
        public final dx4.QnHx x;
        public boolean y;

        /* JADX INFO: renamed from: s61$QnHx$QnHx, reason: collision with other inner class name */
        public class C0193QnHx implements DatabaseErrorHandler {
            public final /* synthetic */ dx4.QnHx a;
            public final /* synthetic */ r61[] b;

            public C0193QnHx(dx4.QnHx qnHx, r61[] r61VarArr) {
                this.a = qnHx;
                this.b = r61VarArr;
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0010  */
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                r61[] r61VarArr = this.b;
                r61 r61Var = r61VarArr[0];
                if (r61Var == null) {
                    r61VarArr[0] = new r61(sQLiteDatabase);
                } else {
                    if (!(r61Var.w == sQLiteDatabase)) {
                        r61VarArr[0] = new r61(sQLiteDatabase);
                    }
                }
                r61 r61Var2 = r61VarArr[0];
                this.a.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + r61Var2.w.getPath());
                SQLiteDatabase sQLiteDatabase2 = r61Var2.w;
                if (!sQLiteDatabase2.isOpen()) {
                    dx4.QnHx.a(sQLiteDatabase2.getPath());
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<Pair<String, String>> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                dx4.QnHx.a((String) it.next().second);
                            }
                        } else {
                            dx4.QnHx.a(sQLiteDatabase2.getPath());
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    r61Var2.close();
                } catch (IOException unused2) {
                }
            }
        }

        public QnHx(Context context, String str, r61[] r61VarArr, dx4.QnHx qnHx) {
            super(context, str, null, qnHx.a, new C0193QnHx(qnHx, r61VarArr));
            this.x = qnHx;
            this.w = r61VarArr;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0010  */
        public final r61 b(SQLiteDatabase sQLiteDatabase) {
            r61[] r61VarArr = this.w;
            r61 r61Var = r61VarArr[0];
            if (r61Var == null) {
                r61VarArr[0] = new r61(sQLiteDatabase);
            } else {
                if (!(r61Var.w == sQLiteDatabase)) {
                    r61VarArr[0] = new r61(sQLiteDatabase);
                }
            }
            return r61VarArr[0];
        }

        public final synchronized cx4 c() {
            this.y = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!this.y) {
                return b(writableDatabase);
            }
            close();
            return c();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final synchronized void close() {
            super.close();
            this.w[0] = null;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            b(sQLiteDatabase);
            this.x.getClass();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            r61 r61VarB = b(sQLiteDatabase);
            bt3 bt3Var = (bt3) this.x;
            bt3Var.getClass();
            Cursor cursorG = r61VarB.g("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = cursorG.moveToFirst() && cursorG.getInt(0) == 0;
                cursorG.close();
                bt3.QnHx qnHx = bt3Var.c;
                qnHx.a(r61VarB);
                if (!z) {
                    bt3.CQf cQfB = qnHx.b(r61VarB);
                    if (!cQfB.a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cQfB.b);
                    }
                }
                bt3Var.c(r61VarB);
                int i = WorkDatabase_Impl.s;
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                List<at3.CQf> list = workDatabase_Impl.g;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        workDatabase_Impl.g.get(i2).getClass();
                    }
                }
            } catch (Throwable th) {
                cursorG.close();
                throw th;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.y = true;
            ((bt3) this.x).b(b(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.y) {
                return;
            }
            dx4.QnHx qnHx = this.x;
            r61 r61VarB = b(sQLiteDatabase);
            bt3 bt3Var = (bt3) qnHx;
            bt3Var.getClass();
            Cursor cursorG = r61VarB.g("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z = cursorG.moveToFirst() && cursorG.getInt(0) != 0;
                cursorG.close();
                if (z) {
                    Cursor cursorF = r61VarB.f(new cq4("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                    try {
                        String string = cursorF.moveToFirst() ? cursorF.getString(0) : null;
                        cursorF.close();
                        if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                        }
                    } catch (Throwable th) {
                        cursorF.close();
                        throw th;
                    }
                } else {
                    bt3.CQf cQfB = bt3Var.c.b(r61VarB);
                    if (!cQfB.a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cQfB.b);
                    }
                    bt3Var.c(r61VarB);
                }
                WorkDatabase_Impl.QnHx qnHx2 = (WorkDatabase_Impl.QnHx) bt3Var.c;
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                int i = WorkDatabase_Impl.s;
                workDatabase_Impl.a = r61VarB;
                r61VarB.e("PRAGMA foreign_keys = ON");
                cs1 cs1Var = WorkDatabase_Impl.this.d;
                synchronized (cs1Var) {
                    if (cs1Var.f) {
                        Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    } else {
                        r61VarB.e("PRAGMA temp_store = MEMORY;");
                        r61VarB.e("PRAGMA recursive_triggers='ON';");
                        r61VarB.e("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                        cs1Var.c(r61VarB);
                        cs1Var.g = new v61(r61VarB.w.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                        cs1Var.f = true;
                    }
                }
                List<at3.CQf> list = WorkDatabase_Impl.this.g;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        WorkDatabase_Impl.this.g.get(i2).a(r61VarB);
                    }
                }
                bt3Var.b = null;
            } catch (Throwable th2) {
                cursorG.close();
                throw th2;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.y = true;
            this.x.b(b(sQLiteDatabase), i, i2);
        }
    }

    public s61(Context context, String str, dx4.QnHx qnHx, boolean z) {
        this.w = context;
        this.x = str;
        this.y = qnHx;
        this.z = z;
    }

    @Override // defpackage.dx4
    public final cx4 U() {
        return b().c();
    }

    public final QnHx b() {
        QnHx qnHx;
        synchronized (this.A) {
            if (this.B == null) {
                r61[] r61VarArr = new r61[1];
                if (Build.VERSION.SDK_INT < 23 || this.x == null || !this.z) {
                    this.B = new QnHx(this.w, this.x, r61VarArr, this.y);
                } else {
                    this.B = new QnHx(this.w, new File(this.w.getNoBackupFilesDir(), this.x).getAbsolutePath(), r61VarArr, this.y);
                }
                this.B.setWriteAheadLoggingEnabled(this.C);
            }
            qnHx = this.B;
        }
        return qnHx;
    }

    @Override // defpackage.dx4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b().close();
    }

    @Override // defpackage.dx4
    public final String getDatabaseName() {
        return this.x;
    }

    @Override // defpackage.dx4
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.A) {
            QnHx qnHx = this.B;
            if (qnHx != null) {
                qnHx.setWriteAheadLoggingEnabled(z);
            }
            this.C = z;
        }
    }
}
