package defpackage;

import com.google.protobuf.LPt9Fixed;

/* JADX INFO: loaded from: classes3.dex */
public final class x91 implements id2 {
    public static final x91 a = new x91();

    @Override // defpackage.id2
    public final hd2 a(Class<?> cls) {
        if (!LPt9Fixed.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (hd2) LPt9Fixed.E(cls.asSubclass(LPt9Fixed.class)).D();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // defpackage.id2
    public final boolean b(Class<?> cls) {
        return LPt9Fixed.class.isAssignableFrom(cls);
    }
}
