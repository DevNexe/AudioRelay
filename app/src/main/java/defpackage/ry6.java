package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ry6 implements Serializable, my6 {
    public final Object w;

    public ry6(Object obj) {
        this.w = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof ry6)) {
            return false;
        }
        Object obj2 = ((ry6) obj).w;
        Object obj3 = this.w;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.w + ")";
    }

    @Override // defpackage.my6
    public final Object zza() {
        return this.w;
    }
}
