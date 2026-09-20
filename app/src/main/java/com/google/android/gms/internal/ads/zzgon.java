package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgoj;
import com.google.android.gms.internal.ads.zzgon;
import defpackage.at6;
import defpackage.lt6;
import defpackage.nv6;
import defpackage.ot6;
import defpackage.pu6;
import defpackage.wu6;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgon<MessageType extends zzgon<MessageType, BuilderType>, BuilderType extends zzgoj<MessageType, BuilderType>> extends zzgmo<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzgri zzc = zzgri.zzc();
    protected int zzd = -1;

    public static void d(zzgon zzgonVar) {
        if (zzgonVar.zzaR()) {
            return;
        }
        zzgoz zzgozVarZza = new zzgrg(zzgonVar).zza();
        zzgozVarZza.zzh(zzgonVar);
        throw zzgozVarZza;
    }

    public static zzgon e(Class cls) {
        Map map = zzb;
        zzgon zzgonVar = (zzgon) map.get(cls);
        if (zzgonVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgonVar = (zzgon) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgonVar == null) {
            zzgonVar = (zzgon) ((zzgon) nv6.k(cls)).k(6, null);
            if (zzgonVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzgonVar);
        }
        return zzgonVar;
    }

    public static zzgon f(zzgon zzgonVar, zzgnf zzgnfVar, zzgnz zzgnzVar) throws zzgoz {
        zzgnn zzgnnVarZzl = zzgnfVar.zzl();
        zzgon zzgonVar2 = (zzgon) zzgonVar.k(4, null);
        try {
            wu6 wu6VarA = pu6.c.a(zzgonVar2.getClass());
            lt6 lt6Var = zzgnnVarZzl.b;
            if (lt6Var == null) {
                lt6Var = new lt6(zzgnnVarZzl);
            }
            wu6VarA.f(zzgonVar2, lt6Var, zzgnzVar);
            wu6VarA.zzf(zzgonVar2);
            try {
                zzgnnVarZzl.zzz(0);
                d(zzgonVar2);
                return zzgonVar2;
            } catch (zzgoz e) {
                e.zzh(zzgonVar2);
                throw e;
            }
        } catch (zzgoz e2) {
            e = e2;
            if (e.x) {
                e = new zzgoz(e);
            }
            e.zzh(zzgonVar2);
            throw e;
        } catch (zzgrg e3) {
            zzgoz zzgozVarZza = e3.zza();
            zzgozVarZza.zzh(zzgonVar2);
            throw zzgozVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgoz) {
                throw ((zzgoz) e4.getCause());
            }
            zzgoz zzgozVar = new zzgoz(e4);
            zzgozVar.zzh(zzgonVar2);
            throw zzgozVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgoz) {
                throw ((zzgoz) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzgow g(zzgow zzgowVar) {
        int size = zzgowVar.size();
        return zzgowVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object h(Object obj, Method method, Object... objArr) {
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

    public static void i(Class cls, zzgon zzgonVar) {
        zzb.put(cls, zzgonVar);
    }

    public static zzgon l(zzgon zzgonVar, byte[] bArr, int i, zzgnz zzgnzVar) {
        zzgon zzgonVar2 = (zzgon) zzgonVar.k(4, null);
        try {
            wu6 wu6VarA = pu6.c.a(zzgonVar2.getClass());
            wu6VarA.e(zzgonVar2, bArr, 0, i, new at6(zzgnzVar));
            wu6VarA.zzf(zzgonVar2);
            if (zzgonVar2.zza == 0) {
                return zzgonVar2;
            }
            throw new RuntimeException();
        } catch (zzgoz e) {
            e = e;
            if (e.x) {
                e = new zzgoz(e);
            }
            e.zzh(zzgonVar2);
            throw e;
        } catch (zzgrg e2) {
            zzgoz zzgozVarZza = e2.zza();
            zzgozVarZza.zzh(zzgonVar2);
            throw zzgozVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgoz) {
                throw ((zzgoz) e3.getCause());
            }
            zzgoz zzgozVar = new zzgoz(e3);
            zzgozVar.zzh(zzgonVar2);
            throw zzgozVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgoz zzgozVarF = zzgoz.f();
            zzgozVarF.zzh(zzgonVar2);
            throw zzgozVarF;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmo
    public final int a() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgmo
    public final void c(int i) {
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return pu6.c.a(getClass()).c(this, (zzgon) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzb = pu6.c.a(getClass()).zzb(this);
        this.zza = iZzb;
        return iZzb;
    }

    public final zzgoj j() {
        return (zzgoj) k(5, null);
    }

    public abstract Object k(int i, zzgon zzgonVar);

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        QX.c(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final /* synthetic */ zzgpw zzaL() {
        return (zzgoj) k(5, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final /* synthetic */ zzgpw zzaM() {
        zzgoj zzgojVar = (zzgoj) k(5, null);
        zzgojVar.zzaj(this);
        return zzgojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final void zzaQ(zzgnu zzgnuVar) {
        wu6 wu6VarA = pu6.c.a(getClass());
        ot6 ot6Var = zzgnuVar.a;
        if (ot6Var == null) {
            ot6Var = new ot6(zzgnuVar);
        }
        wu6VarA.d(this, ot6Var);
    }

    public final boolean zzaR() {
        byte bByteValue = ((Byte) k(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zA = pu6.c.a(getClass()).a(this);
        k(2, true == zA ? this : null);
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final int zzax() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int iZza = pu6.c.a(getClass()).zza(this);
        this.zzd = iZza;
        return iZza;
    }

    public final zzgoj zzaz() {
        zzgoj zzgojVar = (zzgoj) k(5, null);
        zzgojVar.zzaj(this);
        return zzgojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpy
    public final /* synthetic */ zzgpx zzbh() {
        return (zzgon) k(6, null);
    }
}
