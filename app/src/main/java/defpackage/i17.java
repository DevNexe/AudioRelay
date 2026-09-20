package defpackage;

import com.google.android.gms.internal.measurement.vDR;

/* JADX INFO: loaded from: classes3.dex */
public final class i17 implements p37 {
    public static final i17 a = new i17();

    @Override // defpackage.p37
    public final o37 a(Class cls) {
        if (!vDR.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (o37) vDR.p(cls.asSubclass(vDR.class)).q(3);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // defpackage.p37
    public final boolean b(Class cls) {
        return vDR.class.isAssignableFrom(cls);
    }
}
