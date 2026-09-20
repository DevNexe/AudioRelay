package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y14 implements mu0, qy4, fs {
    public static final os0 B = new os0("proto");
    public final pz1<String> A;
    public final r54 w;
    public final at x;
    public final at y;
    public final nu0 z;

    public static class CQf {
        public final String a;
        public final String b;

        public CQf(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public interface QnHx<T, U> {
        U apply(T t);
    }

    public y14(at atVar, at atVar2, nu0 nu0Var, r54 r54Var, pz1<String> pz1Var) {
        this.w = r54Var;
        this.x = atVar;
        this.y = atVar2;
        this.z = nu0Var;
        this.A = pz1Var;
    }

    public static Long h(SQLiteDatabase sQLiteDatabase, ua5 ua5Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(ua5Var.b(), String.valueOf(ke3.a(ua5Var.d()))));
        if (ua5Var.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(ua5Var.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new mk5(5));
    }

    public static String j(Iterable<v03> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<v03> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T m(Cursor cursor, QnHx<Cursor, T> qnHx) {
        try {
            return qnHx.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // defpackage.mu0
    public final Iterable<ua5> J() {
        return (Iterable) i(new n8V_(2));
    }

    @Override // defpackage.mu0
    public final long N(ua5 ua5Var) {
        return ((Long) m(g().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{ua5Var.b(), String.valueOf(ke3.a(ua5Var.d()))}), new n8V_(3))).longValue();
    }

    @Override // defpackage.fs
    public final void b() {
        i(new w14(this, 0));
    }

    @Override // defpackage.fs
    public final is c() {
        int i = is.e;
        is.QnHx qnHx = new is.QnHx();
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseG = g();
        sQLiteDatabaseG.beginTransaction();
        try {
            is isVar = (is) m(sQLiteDatabaseG.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new ph0(this, map, qnHx, 2));
            sQLiteDatabaseG.setTransactionSuccessful();
            return isVar;
        } finally {
            sQLiteDatabaseG.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.w.close();
    }

    @Override // defpackage.mu0
    public final void d0(long j, ua5 ua5Var) {
        i(new v14(j, ua5Var));
    }

    @Override // defpackage.qy4
    public final <T> T e(qy4.QnHx<T> qnHx) {
        SQLiteDatabase sQLiteDatabaseG = g();
        n8V_ n8v_ = new n8V_(4);
        at atVar = this.y;
        long jA = atVar.a();
        while (true) {
            try {
                sQLiteDatabaseG.beginTransaction();
                break;
            } catch (SQLiteDatabaseLockedException e) {
                if (atVar.a() >= ((long) this.z.a()) + jA) {
                    n8v_.apply(e);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        try {
            T tE = qnHx.e();
            sQLiteDatabaseG.setTransactionSuccessful();
            return tE;
        } finally {
            sQLiteDatabaseG.endTransaction();
        }
    }

    @Override // defpackage.fs
    public final void f(final long j, final l52.QnHx qnHx, final String str) {
        i(new QnHx() { // from class: u14
            @Override // y14.QnHx
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                String str2 = str;
                l52.QnHx qnHx2 = qnHx;
                boolean zBooleanValue = ((Boolean) y14.m(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(qnHx2.w)}), new n8V_(6))).booleanValue();
                long j2 = j;
                int i = qnHx2.w;
                if (zBooleanValue) {
                    sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(i)});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(i));
                    contentValues.put("events_dropped_count", Long.valueOf(j2));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // defpackage.mu0
    public final y3 f0(ua5 ua5Var, eu0 eu0Var) {
        Object[] objArr = {ua5Var.d(), eu0Var.g(), ua5Var.b()};
        String strC = y52.c("SQLiteEventStore");
        if (Log.isLoggable(strC, 3)) {
            Log.d(strC, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        long jLongValue = ((Long) i(new ph0(this, eu0Var, ua5Var))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new y3(jLongValue, ua5Var, eu0Var);
    }

    public final SQLiteDatabase g() {
        r54 r54Var = this.w;
        Objects.requireNonNull(r54Var);
        at atVar = this.y;
        long jA = atVar.a();
        while (true) {
            try {
                return r54Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (atVar.a() >= ((long) this.z.a()) + jA) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final <T> T i(QnHx<SQLiteDatabase, T> qnHx) {
        SQLiteDatabase sQLiteDatabaseG = g();
        sQLiteDatabaseG.beginTransaction();
        try {
            T tApply = qnHx.apply(sQLiteDatabaseG);
            sQLiteDatabaseG.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseG.endTransaction();
        }
    }

    @Override // defpackage.mu0
    public final boolean j0(ua5 ua5Var) {
        return ((Boolean) i(new Z7O(8, this, ua5Var))).booleanValue();
    }

    @Override // defpackage.mu0
    public final int l() {
        final long jA = this.x.a() - this.z.b();
        return ((Integer) i(new QnHx() { // from class: t14
            @Override // y14.QnHx
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                y14 y14Var = this.w;
                y14Var.getClass();
                String[] strArr = {String.valueOf(jA)};
                y14.m(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new sn1(y14Var, 7));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            }
        })).intValue();
    }

    @Override // defpackage.mu0
    public final void q(Iterable<v03> iterable) {
        if (iterable.iterator().hasNext()) {
            g().compileStatement("DELETE FROM events WHERE _id in " + j(iterable)).execute();
        }
    }

    @Override // defpackage.mu0
    public final Iterable<v03> t(ua5 ua5Var) {
        return (Iterable) i(new ke5(this, ua5Var));
    }

    @Override // defpackage.mu0
    public final void u0(Iterable<v03> iterable) {
        if (iterable.iterator().hasNext()) {
            i(new ph0(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + j(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", 1));
        }
    }
}
