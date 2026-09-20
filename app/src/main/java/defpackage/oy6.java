package defpackage;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class oy6 implements Serializable, my6 {
    public final my6 w;
    public volatile transient boolean x;

    @CheckForNull
    public transient Object y;

    public oy6(my6 my6Var) {
        this.w = my6Var;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.x) {
            obj = "<supplier that returned " + this.y + ">";
        } else {
            obj = this.w;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.my6
    public final Object zza() {
        if (!this.x) {
            synchronized (this) {
                if (!this.x) {
                    Object objZza = this.w.zza();
                    this.y = objZza;
                    this.x = true;
                    return objZza;
                }
            }
        }
        return this.y;
    }
}
