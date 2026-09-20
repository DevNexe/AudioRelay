package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xl implements ev1, Serializable {
    public static final /* synthetic */ int C = 0;
    public final String A;
    public final boolean B;
    public transient ev1 w;
    public final Object x;
    public final Class y;
    public final String z;

    public static class QnHx implements Serializable {
        public static final QnHx w = new QnHx();
    }

    public xl(Object obj, Class cls, String str, String str2, boolean z) {
        this.x = obj;
        this.y = cls;
        this.z = str;
        this.A = str2;
        this.B = z;
    }

    public final ev1 a() {
        ev1 ev1Var = this.w;
        if (ev1Var != null) {
            return ev1Var;
        }
        ev1 ev1VarB = b();
        this.w = ev1VarB;
        return ev1VarB;
    }

    public abstract ev1 b();

    public final hv1 c() {
        Class cls = this.y;
        if (cls == null) {
            return null;
        }
        if (!this.B) {
            return nl3.a(cls);
        }
        nl3.a.getClass();
        return new ox2(cls);
    }
}
