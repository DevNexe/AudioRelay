package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c70<T> {
    public static final String f = s52.e("ConstraintTracker");
    public final c15 a;
    public final Context b;
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();
    public T e;

    public class QnHx implements Runnable {
        public final /* synthetic */ List w;

        public QnHx(ArrayList arrayList) {
            this.w = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                ((a70) it.next()).a(c70.this.e);
            }
        }
    }

    public c70(Context context, c15 c15Var) {
        this.b = context.getApplicationContext();
        this.a = c15Var;
    }

    public abstract T a();

    public final void b(T t) {
        synchronized (this.c) {
            T t2 = this.e;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.e = t;
                ((on5) this.a).c.execute(new QnHx(new ArrayList(this.d)));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
