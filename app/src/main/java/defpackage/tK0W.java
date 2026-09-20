package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tK0W<T> {
    public final Object[] a;
    public Object[] b;
    public int c;

    public interface QnHx<T> extends pa3<T> {
        @Override // defpackage.pa3
        boolean test(T t);
    }

    public tK0W() {
        Object[] objArr = new Object[5];
        this.a = objArr;
        this.b = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0037 A[LOOP:1: B:6:0x0006->B:25:0x0037, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0036 A[SYNTHETIC] */
    public final <U> boolean a(gw4<? super U> gw4Var) {
        Object obj;
        boolean z;
        for (Object[] objArr = this.a; objArr != null; objArr = (Object[]) objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (obj == gq2.COMPLETE) {
                    gw4Var.b();
                } else {
                    if (obj instanceof gq2.CQf) {
                        gw4Var.onError(((gq2.CQf) obj).w);
                    } else {
                        if (obj instanceof gq2.F1) {
                            gw4Var.d(((gq2.F1) obj).w);
                        } else {
                            gw4Var.g(obj);
                        }
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                }
                z = true;
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(T t) {
        int i = this.c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.b[4] = objArr;
            this.b = objArr;
            i = 0;
        }
        this.b[i] = t;
        this.c = i + 1;
    }

    public final void c(QnHx<? super T> qnHx) {
        Object obj;
        for (Object[] objArr = this.a; objArr != null; objArr = (Object[]) objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (qnHx.test(obj)) {
                    return;
                }
            }
        }
    }
}
