package kotlin.jvm.internal;

import defpackage.bl2;
import defpackage.hv1;
import defpackage.j91;
import defpackage.nl3;
import defpackage.ol3;
import defpackage.ox2;
import defpackage.ur1;
import defpackage.xl;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class QnHx implements j91, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QnHx(int i, Class cls, String str, String str2, int i2) {
        this(i, xl.QnHx.w, cls, str, str2, i2);
        int i3 = xl.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QnHx)) {
            return false;
        }
        QnHx qnHx = (QnHx) obj;
        return this.isTopLevel == qnHx.isTopLevel && this.arity == qnHx.arity && this.flags == qnHx.flags && ur1.a(this.receiver, qnHx.receiver) && ur1.a(this.owner, qnHx.owner) && this.name.equals(qnHx.name) && this.signature.equals(qnHx.signature);
    }

    @Override // defpackage.j91
    public int getArity() {
        return this.arity;
    }

    public hv1 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return nl3.a(cls);
        }
        nl3.a.getClass();
        return new ox2(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((bl2.a(this.signature, bl2.a(this.name, (iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31), 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        nl3.a.getClass();
        return ol3.a(this);
    }

    public QnHx(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
