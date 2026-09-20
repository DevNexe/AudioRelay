package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ej<T> extends fv2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(Ej.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = qLd.w;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fv2
    public final Object a(Object obj) {
        boolean z;
        Object obj2 = this._consensus;
        py4 py4Var = qLd.w;
        if (obj2 == py4Var) {
            py4 py4VarC = c(obj);
            obj2 = this._consensus;
            if (obj2 == py4Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, py4Var, py4VarC)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != py4Var) {
                        z = false;
                        break;
                    }
                }
                obj2 = z ? py4VarC : this._consensus;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t, Object obj);

    public abstract py4 c(Object obj);
}
