package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public final class z32 implements vl0, wl0 {
    public LinkedList w;
    public volatile boolean x;

    @Override // defpackage.vl0
    public final void a() {
        if (this.x) {
            return;
        }
        synchronized (this) {
            if (this.x) {
                return;
            }
            this.x = true;
            LinkedList linkedList = this.w;
            ArrayList arrayList = null;
            this.w = null;
            if (linkedList == null) {
                return;
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                try {
                    ((vl0) it.next()).a();
                } catch (Throwable th) {
                    XTd3.w(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList != null) {
                if (arrayList.size() != 1) {
                    throw new CompositeException(arrayList);
                }
                throw uu0.d((Throwable) arrayList.get(0));
            }
        }
    }

    @Override // defpackage.wl0
    public final boolean b(vl0 vl0Var) {
        if (!this.x) {
            synchronized (this) {
                if (!this.x) {
                    LinkedList linkedList = this.w;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.w = linkedList;
                    }
                    linkedList.add(vl0Var);
                    return true;
                }
            }
        }
        vl0Var.a();
        return false;
    }

    @Override // defpackage.wl0
    public final boolean c(vl0 vl0Var) {
        if (!d(vl0Var)) {
            return false;
        }
        ((a54) vl0Var).a();
        return true;
    }

    @Override // defpackage.wl0
    public final boolean d(vl0 vl0Var) {
        if (vl0Var == null) {
            throw new NullPointerException("Disposable item is null");
        }
        if (this.x) {
            return false;
        }
        synchronized (this) {
            if (this.x) {
                return false;
            }
            LinkedList linkedList = this.w;
            if (linkedList != null && linkedList.remove(vl0Var)) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return this.x;
    }
}
