package defpackage;

import com.google.android.gms.internal.ads.zzgon;

/* JADX INFO: loaded from: classes3.dex */
public final class xt6 implements lu6 {
    public static final xt6 a = new xt6();

    @Override // defpackage.lu6
    public final ku6 a(Class cls) {
        if (!zzgon.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (ku6) zzgon.e(cls.asSubclass(zzgon.class)).k(3, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // defpackage.lu6
    public final boolean b(Class cls) {
        return zzgon.class.isAssignableFrom(cls);
    }
}
