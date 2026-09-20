package defpackage;

import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class y60<T> implements a70<T> {
    public final ArrayList a = new ArrayList();
    public T b;
    public final c70<T> c;
    public QnHx d;

    public interface QnHx {
    }

    public y60(c70<T> c70Var) {
        this.c = c70Var;
    }

    @Override // defpackage.a70
    public final void a(T t) {
        this.b = t;
        e(this.d, t);
    }

    public abstract boolean b(WorkSpec workSpec);

    public abstract boolean c(T t);

    public final void d(Collection collection) {
        this.a.clear();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            WorkSpec workSpec = (WorkSpec) it.next();
            if (b(workSpec)) {
                this.a.add(workSpec.a);
            }
        }
        if (this.a.isEmpty()) {
            c70<T> c70Var = this.c;
            synchronized (c70Var.c) {
                if (c70Var.d.remove(this) && c70Var.d.isEmpty()) {
                    c70Var.d();
                }
            }
        } else {
            c70<T> c70Var2 = this.c;
            synchronized (c70Var2.c) {
                if (c70Var2.d.add(this)) {
                    if (c70Var2.d.size() == 1) {
                        c70Var2.e = c70Var2.a();
                        s52.c().a(c70.f, String.format("%s: initial state = %s", c70Var2.getClass().getSimpleName(), c70Var2.e), new Throwable[0]);
                        c70Var2.c();
                    }
                    a(c70Var2.e);
                }
            }
        }
        e(this.d, this.b);
    }

    public final void e(QnHx qnHx, T t) {
        if (this.a.isEmpty() || qnHx == null) {
            return;
        }
        if (t == null || c(t)) {
            ArrayList arrayList = this.a;
            cn5 cn5Var = (cn5) qnHx;
            synchronized (cn5Var.c) {
                bn5 bn5Var = cn5Var.a;
                if (bn5Var != null) {
                    bn5Var.e(arrayList);
                }
            }
            return;
        }
        ArrayList<String> arrayList2 = this.a;
        cn5 cn5Var2 = (cn5) qnHx;
        synchronized (cn5Var2.c) {
            ArrayList arrayList3 = new ArrayList();
            for (String str : arrayList2) {
                if (cn5Var2.a(str)) {
                    s52.c().a(cn5.d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList3.add(str);
                }
            }
            bn5 bn5Var2 = cn5Var2.a;
            if (bn5Var2 != null) {
                bn5Var2.f(arrayList3);
            }
        }
    }
}
