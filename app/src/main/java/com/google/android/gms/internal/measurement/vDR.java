package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.vDR;
import defpackage.a37;
import defpackage.b27;
import defpackage.d27;
import defpackage.e57;
import defpackage.n47;
import defpackage.p17;
import defpackage.v37;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vDR<MessageType extends vDR<MessageType, BuilderType>, BuilderType extends p17<MessageType, BuilderType>> extends com5Fixed<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected n47 zzc = n47.f;
    protected int zzd = -1;

    public static a37 j(b27 b27Var) {
        int size = b27Var.size();
        int i = size == 0 ? 10 : size + size;
        a37 a37Var = (a37) b27Var;
        if (i >= a37Var.y) {
            return new a37(Arrays.copyOf(a37Var.x, i), a37Var.y);
        }
        throw new IllegalArgumentException();
    }

    public static d27 k(d27 d27Var) {
        int size = d27Var.size();
        return d27Var.zzd(size == 0 ? 10 : size + size);
    }

    public static Object l(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void m(Class cls, vDR vdr) {
        zza.put(cls, vdr);
    }

    public static vDR p(Class cls) {
        Map map = zza;
        vDR vdr = (vDR) map.get(cls);
        if (vdr == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vdr = (vDR) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (vdr == null) {
            vdr = (vDR) ((vDR) e57.i(cls)).q(6);
            if (vdr == null) {
                throw new IllegalStateException();
            }
            map.put(cls, vdr);
        }
        return vdr;
    }

    @Override // com.google.android.gms.internal.measurement.com5Fixed
    public final int b() {
        return this.zzd;
    }

    @Override // defpackage.r37
    public final /* synthetic */ vDR c() {
        return (vDR) q(6);
    }

    @Override // defpackage.q37
    public final /* synthetic */ p17 d() {
        return (p17) q(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return v37.c.a(getClass()).c(this, (vDR) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.com5Fixed
    public final void f(int i) {
        this.zzd = i;
    }

    @Override // defpackage.q37
    public final /* synthetic */ p17 h() {
        p17 p17Var = (p17) q(5);
        p17Var.k(this);
        return p17Var;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int iZzb = v37.c.a(getClass()).zzb(this);
        this.zzb = iZzb;
        return iZzb;
    }

    @Override // defpackage.q37
    public final int i() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int iZza = v37.c.a(getClass()).zza(this);
        this.zzd = iZza;
        return iZza;
    }

    public final p17 n() {
        return (p17) q(5);
    }

    public final p17 o() {
        p17 p17Var = (p17) q(5);
        p17Var.k(this);
        return p17Var;
    }

    public abstract Object q(int i);

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        roZB.c(this, sb, 0);
        return sb.toString();
    }
}
