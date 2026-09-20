package defpackage;

import com.google.android.gms.internal.measurement.kK;
import com.google.android.gms.internal.measurement.vDR;
import com.google.android.gms.internal.measurement.z2n;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class v37 {
    public static final v37 c = new v37();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final g37 a = new g37();

    public final y37 a(Class cls) {
        z2n z2nVar;
        Class cls2;
        Charset charset = f27.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        y37 y37VarV = (y37) concurrentHashMap.get(cls);
        if (y37VarV == null) {
            g37 g37Var = this.a;
            g37Var.getClass();
            Class cls3 = z37.a;
            if (!vDR.class.isAssignableFrom(cls) && (cls2 = z37.a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            o37 o37VarA = g37Var.a.a(cls);
            if (o37VarA.zzb()) {
                if (vDR.class.isAssignableFrom(cls)) {
                    z2nVar = new z2n(z37.d, x07.a, o37VarA.zza());
                } else {
                    m47 m47Var = z37.b;
                    r07 r07Var = x07.b;
                    if (r07Var == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    z2nVar = new z2n(m47Var, r07Var, o37VarA.zza());
                }
                y37VarV = z2nVar;
            } else {
                if (vDR.class.isAssignableFrom(cls)) {
                    if (o37VarA.zzc() == 1) {
                        int i = t37.a;
                        y37VarV = kK.v(o37VarA, s27.b, z37.d, x07.a, n37.b);
                    } else {
                        int i2 = t37.a;
                        y37VarV = kK.v(o37VarA, s27.b, z37.d, null, n37.b);
                    }
                } else {
                    if (o37VarA.zzc() == 1) {
                        int i3 = t37.a;
                        n27 n27Var = s27.a;
                        m47 m47Var2 = z37.b;
                        r07 r07Var2 = x07.b;
                        if (r07Var2 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                        y37VarV = kK.v(o37VarA, n27Var, m47Var2, r07Var2, n37.a);
                    } else {
                        int i4 = t37.a;
                        y37VarV = kK.v(o37VarA, s27.a, z37.c, null, n37.a);
                    }
                }
            }
            y37 y37Var = (y37) concurrentHashMap.putIfAbsent(cls, y37VarV);
            if (y37Var != null) {
                return y37Var;
            }
        }
        return y37VarV;
    }
}
