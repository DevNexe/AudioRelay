package defpackage;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class rw4 implements t52 {
    public ju0 A;
    public final Queue<tw4> B;
    public final boolean C;
    public final String w;
    public volatile t52 x;
    public Boolean y;
    public Method z;

    public rw4(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.w = str;
        this.B = linkedBlockingQueue;
        this.C = z;
    }

    @Override // defpackage.t52
    public final void a(String str) {
        t52 t52Var;
        if (this.x != null) {
            t52Var = this.x;
        } else if (this.C) {
            t52Var = dj2.w;
        } else {
            if (this.A == null) {
                this.A = new ju0(this, this.B);
            }
            t52Var = this.A;
        }
        t52Var.a(str);
    }

    public final boolean b() {
        Boolean bool = this.y;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.z = this.x.getClass().getMethod("log", z52.class);
            this.y = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.y = Boolean.FALSE;
        }
        return this.y.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rw4.class == obj.getClass() && this.w.equals(((rw4) obj).w);
    }

    @Override // defpackage.t52
    public final String getName() {
        return this.w;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
