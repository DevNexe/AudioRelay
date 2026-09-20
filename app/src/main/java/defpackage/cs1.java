package defpackage;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class cs1 {
    public static final String[] k = {"UPDATE", "DELETE", "INSERT"};
    public final String[] b;
    public final Map<String, Set<String>> c;
    public final at3 d;
    public volatile v61 g;
    public final CQf h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public volatile boolean f = false;

    @SuppressLint({"RestrictedApi"})
    public final e24<F1, LPt8Fixed> i = new e24<>();
    public final QnHx j = new QnHx();
    public final HashMap<String, Integer> a = new HashMap<>();

    public static class CQf {
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;
        public boolean e;

        public CQf(int i) {
            long[] jArr = new long[i];
            this.a = jArr;
            boolean[] zArr = new boolean[i];
            this.b = zArr;
            this.c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public final int[] a() {
            synchronized (this) {
                if (this.d && !this.e) {
                    int length = this.a.length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i >= length) {
                            this.e = true;
                            this.d = false;
                            return this.c;
                        }
                        boolean z = this.a[i] > 0;
                        boolean[] zArr = this.b;
                        if (z != zArr[i]) {
                            int[] iArr = this.c;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            this.c[i] = 0;
                        }
                        zArr[i] = z;
                        i++;
                    }
                }
                return null;
            }
        }
    }

    public static abstract class F1 {
        public abstract void a(Set<String> set);
    }

    public static class LPt8Fixed {
    }

    public class QnHx implements Runnable {
        public QnHx() {
        }

        public final HashSet a() {
            HashSet hashSet = new HashSet();
            Cursor cursorG = cs1.this.d.g(new cq4("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorG.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorG.getInt(0)));
                } catch (Throwable th) {
                    cursorG.close();
                    throw th;
                }
            }
            cursorG.close();
            if (!hashSet.isEmpty()) {
                cs1.this.g.h();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReentrantReadWriteLock.ReadLock lock = cs1.this.d.h.readLock();
            HashSet hashSetA = null;
            try {
                try {
                    lock.lock();
                    if (!cs1.this.a()) {
                        lock.unlock();
                        return;
                    }
                    if (!cs1.this.e.compareAndSet(true, false)) {
                        lock.unlock();
                        return;
                    }
                    if (((r61) cs1.this.d.c.U()).w.inTransaction()) {
                        lock.unlock();
                        return;
                    }
                    at3 at3Var = cs1.this.d;
                    if (at3Var.f) {
                        r61 r61Var = (r61) at3Var.c.U();
                        r61Var.b();
                        try {
                            hashSetA = a();
                            r61Var.h();
                            r61Var.c();
                        } catch (Throwable th) {
                            r61Var.c();
                            throw th;
                        }
                    } else {
                        hashSetA = a();
                    }
                    lock.unlock();
                    if (hashSetA == null || hashSetA.isEmpty()) {
                        return;
                    }
                    synchronized (cs1.this.i) {
                        e24.NUlFixed nUl = (e24.NUlFixed) cs1.this.i.iterator();
                        if (nUl.hasNext()) {
                            ((LPt8Fixed) ((Map.Entry) nUl.next()).getValue()).getClass();
                            throw null;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                } catch (IllegalStateException e2) {
                    e = e2;
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                }
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }
    }

    public cs1(at3 at3Var, HashMap map, HashMap map2, String... strArr) {
        this.d = at3Var;
        this.h = new CQf(strArr.length);
        this.c = map2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.a.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) map.get(strArr[i]);
            if (str2 != null) {
                this.b[i] = str2.toLowerCase(locale);
            } else {
                this.b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        cx4 cx4Var = this.d.a;
        if (!(cx4Var != null && ((r61) cx4Var).w.isOpen())) {
            return false;
        }
        if (!this.f) {
            this.d.c.U();
        }
        if (this.f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(cx4 cx4Var, int i) {
        r61 r61Var = (r61) cx4Var;
        r61Var.e(ex0.b("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i, ", 0)"));
        String str = this.b[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = k;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            r61Var.e(sb.toString());
        }
    }

    public final void c(cx4 cx4Var) {
        r61 r61Var = (r61) cx4Var;
        if (r61Var.w.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock lock = this.d.h.readLock();
                lock.lock();
                try {
                    int[] iArrA = this.h.a();
                    if (iArrA == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrA.length;
                    r61Var.b();
                    for (int i = 0; i < length; i++) {
                        try {
                            int i2 = iArrA[i];
                            if (i2 == 1) {
                                b(r61Var, i);
                            } else if (i2 == 2) {
                                String str = this.b[i];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = k;
                                for (int i3 = 0; i3 < 3; i3++) {
                                    String str2 = strArr[i3];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    r61Var.e(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            r61Var.c();
                            throw th;
                        }
                    }
                    r61Var.h();
                    r61Var.c();
                    CQf cQf = this.h;
                    synchronized (cQf) {
                        cQf.e = false;
                    }
                    lock.unlock();
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }
}
