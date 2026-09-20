package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class at3 {

    @Deprecated
    public volatile cx4 a;
    public Executor b;
    public dx4 c;
    public final cs1 d;
    public boolean e;
    public boolean f;

    @Deprecated
    public List<CQf> g;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> i = new ThreadLocal<>();

    public static abstract class CQf {
        public void a(r61 r61Var) {
        }
    }

    public static class F1 {
        public final HashMap<Integer, TreeMap<Integer, lg2>> a = new HashMap<>();
    }

    public static class QnHx<T extends at3> {
        public final String b;
        public final Context c;
        public ArrayList<CQf> d;
        public Executor e;
        public Executor f;
        public dx4.F1 g;
        public boolean h;
        public boolean j;
        public HashSet l;
        public final Class<T> a = WorkDatabase.class;
        public boolean i = true;
        public final F1 k = new F1();

        public QnHx(Context context, String str) {
            this.c = context;
            this.b = str;
        }

        public final void a(lg2... lg2VarArr) {
            if (this.l == null) {
                this.l = new HashSet();
            }
            for (lg2 lg2Var : lg2VarArr) {
                this.l.add(Integer.valueOf(lg2Var.a));
                this.l.add(Integer.valueOf(lg2Var.b));
            }
            F1 f1 = this.k;
            f1.getClass();
            for (lg2 lg2Var2 : lg2VarArr) {
                int i = lg2Var2.a;
                HashMap<Integer, TreeMap<Integer, lg2>> map = f1.a;
                TreeMap<Integer, lg2> treeMap = map.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    map.put(Integer.valueOf(i), treeMap);
                }
                int i2 = lg2Var2.b;
                lg2 lg2Var3 = treeMap.get(Integer.valueOf(i2));
                if (lg2Var3 != null) {
                    Log.w("ROOM", "Overriding migration " + lg2Var3 + " with " + lg2Var2);
                }
                treeMap.put(Integer.valueOf(i2), lg2Var2);
            }
        }
    }

    public at3() {
        new ConcurrentHashMap();
        this.d = d();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((r61) this.c.U()).w.inTransaction() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public final void c() {
        a();
        cx4 cx4VarU = this.c.U();
        this.d.c(cx4VarU);
        ((r61) cx4VarU).b();
    }

    public abstract cs1 d();

    public abstract dx4 e(cf0 cf0Var);

    @Deprecated
    public final void f() {
        ((r61) this.c.U()).c();
        if (((r61) this.c.U()).w.inTransaction()) {
            return;
        }
        cs1 cs1Var = this.d;
        if (cs1Var.e.compareAndSet(false, true)) {
            cs1Var.d.b.execute(cs1Var.j);
        }
    }

    public final Cursor g(ex4 ex4Var) {
        a();
        b();
        return ((r61) this.c.U()).f(ex4Var);
    }

    @Deprecated
    public final void h() {
        ((r61) this.c.U()).h();
    }
}
