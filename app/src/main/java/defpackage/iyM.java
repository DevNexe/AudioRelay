package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class iyM implements dg3 {
    public final int a;

    public iyM(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return dg3.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg3)) {
            return false;
        }
        iyM iym = (iyM) ((dg3) obj);
        if (this.a == iym.a) {
            Object obj2 = dg3.QnHx.DEFAULT;
            iym.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.a) + (dg3.QnHx.DEFAULT.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + dg3.QnHx.DEFAULT + ')';
    }
}
