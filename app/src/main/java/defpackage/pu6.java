package defpackage;

import com.google.android.gms.internal.ads.com5Fixed;
import com.google.android.gms.internal.ads.mw0t;
import com.google.android.gms.internal.ads.zzgon;
import com.google.android.gms.internal.ads.zzgox;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class pu6 {
    public static final pu6 c = new pu6();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final hu6 a = new hu6();

    public final wu6 a(Class cls) {
        mw0t mw0tVar;
        Class cls2;
        Charset charset = zzgox.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        wu6 wu6VarA = (wu6) concurrentHashMap.get(cls);
        if (wu6VarA == null) {
            hu6 hu6Var = this.a;
            hu6Var.getClass();
            Class cls3 = xu6.a;
            if (!zzgon.class.isAssignableFrom(cls) && (cls2 = xu6.a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            ku6 ku6VarA = hu6Var.a.a(cls);
            if (ku6VarA.zzb()) {
                if (zzgon.class.isAssignableFrom(cls)) {
                    mw0tVar = new mw0t(xu6.d, tt6.a, ku6VarA.zza());
                } else {
                    hv6 hv6Var = xu6.b;
                    st6 st6Var = tt6.b;
                    if (st6Var == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    mw0tVar = new mw0t(hv6Var, st6Var, ku6VarA.zza());
                }
                wu6VarA = mw0tVar;
            } else {
                if (zzgon.class.isAssignableFrom(cls)) {
                    if (ku6VarA.zzc() == 1) {
                        int i = nu6.a;
                        wu6VarA = com5Fixed.A(ku6VarA, du6.b, xu6.d, tt6.a, ju6.b);
                    } else {
                        int i2 = nu6.a;
                        wu6VarA = com5Fixed.A(ku6VarA, du6.b, xu6.d, null, ju6.b);
                    }
                } else {
                    if (ku6VarA.zzc() == 1) {
                        int i3 = nu6.a;
                        bu6 bu6Var = du6.a;
                        hv6 hv6Var2 = xu6.b;
                        st6 st6Var2 = tt6.b;
                        if (st6Var2 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                        wu6VarA = com5Fixed.A(ku6VarA, bu6Var, hv6Var2, st6Var2, ju6.a);
                    } else {
                        int i4 = nu6.a;
                        wu6VarA = com5Fixed.A(ku6VarA, du6.a, xu6.c, null, ju6.a);
                    }
                }
            }
            wu6 wu6Var = (wu6) concurrentHashMap.putIfAbsent(cls, wu6VarA);
            if (wu6Var != null) {
                return wu6Var;
            }
        }
        return wu6VarA;
    }
}
